package Test07;
import org.junit.Test;
import java.util.*;

/**
 * @author HXS
 * @create 2021-03-06 11:08
 */

/*
    // Map的实现类的结构

    /---- Map：双列数据，存储 key-value 对的数据   类似于高中的函数 y = f(x)
            /---- HashMap：作为Map的主要实现类：线程不安全，效率高；可以存储null的key和value
                    /---- LinkedHashMap：保证在遍历Map元素时，可以按照添加的顺序实现遍历
                                         原理：在原有的HashMap底层结构基本上，添加了一对指针，指向前一个和后一个元素
                                         对于频繁的遍历操作，此类执行效率高于HashMap
            /---- TreeMap：保证按照添加的key-value进行排序，实现排序遍历，按key排序
                           底层使用红黑树
            /---- Hashtable：作为古老实现类：线程安全，效率低；不能存储null的key和value
                    /---- Properties：常用来处理配置文件，key和value都是String类型


            HashMap的底层：数组 + 链表 JDK7及之前
                         数组 + 链表 + 红黑树JDK8

    面试题：
    1. HashMap 的底层实现原理 ?
    2. HashMap 和 HashTable 异同 ?
    3. CurrentHashMap 与 HashTable 的异同 ?


    // Map 结构的理解
       Map 中的Key：无序，不可重复，使用set存储所有的key  -> key所在的类要重写 equals和hashcode （以HashMap为例）
       Map 中的value：无序，可重复，使用collection存储所有的value -> value 所在类需要重写equals
       一个键值对：key-value 构成一个entry对象
       Map中的entry：无序，不可重复，使用set存储所有的entry


    // HashMap的底层实现原理 ?  以JDK7为例
       HashMap map = new HashMap()
       在实例化以后，底层创建了长度为16的一维数组Entry[] table
       ...可能已经执行过多次put...
       map.put(key1,value1)
        首先，计算调用key1所在类的hashcode()，计算key1哈希值，此哈希值经过某种算法计算以后，得到Entry数组中的存放位置
        若此位置上的数据为空，此时key1- value1（实际上是entry）添加成功             -> 情况 1
        若此位置上的数据不为空（意味着此位置上存在一个或多个数据（以链表形式存在）），比较key1和已经存在的一个或多个数据的哈希值：
            若key1的哈希值与已经存在的数据的哈希值都不相同，此时key1-value添加成功    -> 情况 2
            若key1的哈希值和已经存在的某一个数据（key2-value2）的哈希值，继续比较：调用key1所在类的equals（key2）方法：
                    若equals（）返回false：此时key1-value1添加成功              -> 情况 3
                    若equals（）返回true：使用value1替换相同key的value2值   # 说明可以修改value1


        补充：关于情况2和情况3：此时key1-value2和原来的数据以链表的方法存储
        在不断的添加过程中，会涉及扩容问题，当超出临界值（且要存放的位置非空时）默认的扩容方式：扩容为原来的2倍，并将原来的数据复制过来


        JDK8 相较于JDK7的底层实现方面的不同：
        1. new HashMap(): 底层没有创建一个长度为16的数组
        2. JDK 8底层的数组为：Node[]，而非Entry[]
        3. 首次调用put()方法时，底层创建长度为16的数组
        4. JDK7 底层结构只有：数组+链表，JDK8 中底层结构：数组+链表+红黑树
           当数组的某一个索引位置上的元素以链表形式存在的数据个数 > 8 且当前数组的长度 > 64，此时此索引位置上的所有数据改为红黑树

        DEFAULT_INITIAL_CAPACITY : HashMap的默认容量：16
        DEFAULT_LOAD_FACTOR：HashMap的默认加载因子： 0.75
        threshold：扩容的临界值，=容量*填充因子：16 * 0.75 = 12
        TREEIFY_THRESHOLD：Bucket中链表长度大于该默认值，转化为红黑树：8
        MIN_TREEIFY_CAPACITY：桶中的Node被树化时最小的hash表容量：64



    // LinkedHashMap 底层实现原理：源码
       static class Entry<K,V> extends HashMap.Node<K,V> {
            Entry<K,V> before, after;  // 能够记录添加的元素的先后顺序
            Entry(int hash, K key, V value, Node<K,V> next) {
                super(hash, key, value, next);
            }
        }



    // Map 中定义的方法
        总结：常用的方法
         增：put
         删：remove
         改：put
         查：get
         长度：size
         遍历：keySet / values / entrySet

 */
public class MapTest {

    @Test
    public void test1(){

        HashMap map = new HashMap();
        map.put(null, null);
    }

    @Test
    public void test2(){
        HashMap map = new HashMap();
        LinkedHashMap map1 = new LinkedHashMap();

        map1.put(123, "AA");
        map1.put(234, "BB");
        map1.put(1, "DD");

        System.out.println(map1);
    }


    /*
         添加、删除、修改操作：
         Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
         void putAll(Map m):将m中的所有key-value对存放到当前map中
         Object remove(Object key)：移除指定key的key-value对，并返回value
         void clear()：清空当前map中的所有数据
     */
    @Test
    public void test3(){
        HashMap map = new HashMap();
        // put(Object key,Object value)
        map.put("AA",123);  // 添加
        map.put(12,"BB");
        map.put("BB",123);
        map.put("CC",123);
        map.put("AA",999);  // 修改

        System.out.println(map);

        HashMap map1 = new HashMap();
        map1.put("CC",345);
        map1.put("DD",345);

        // putAll(Map m)
        map.putAll(map1);
        System.out.println(map);

        // remove(Object key)
        Object cc = map.remove("CC");
        System.out.println(cc);

        // clear()
        map.clear();        // 与map = null 不同，只是将map中的数据清空
        System.out.println(map.size());
    }


    /*
        元素查询的操作：
         Object get(Object key)：获取指定key对应的value
         boolean containsKey(Object key)：是否包含指定的key
         boolean containsValue(Object value)：是否包含指定的value
         int size()：返回map中key-value对的个数
         boolean isEmpty()：判断当前map是否为空
         boolean equals(Object obj)：判断当前map和参数对象obj是否相等
     */
    @Test
    public void test4(){
        HashMap map = new HashMap();
        map.put("AA",123);
        map.put(12,"BB");
        map.put("BB",123);
        map.put("CC",123);

        // get(Object key)
        System.out.println(map.get(12));

        // containsKey(Object key)
        System.out.println(map.containsKey("CC"));

        // containsValue(Object value)
        System.out.println(map.containsValue(123));

        // equals(Object obj)
        HashMap map1 = new HashMap();
        map1.put("AA", 123);
        System.out.println(map.equals(map1));
    }


    /*
        元视图操作的方法：  # 遍历
        Set keySet()：返回所有key构成的Set集合        # key 底层set存储
        Collection values()：返回所有value构成的Collection集      # values 底层collection 存储
        Set entrySet()：返回所有key-value对构成的Set集合
    */
    @Test
    public void test5(){
        HashMap map = new HashMap();
        map.put("AA",123);
        map.put(12,"BB");
        map.put("BB",123);
        map.put("CC",123);

        // 遍历所有key集合：keySet()
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 遍历所有的value集合：values()
        Collection values = map.values();
        for (Object obj : values) {
            System.out.println(obj);
        }

        // 遍历所有的key-value：entrySet()
        // entrySet集合中的元素都是entry
        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        // 方式2：也可以拼出来
    }
}
