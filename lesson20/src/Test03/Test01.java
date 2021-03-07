package Test03;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author HXS
 * @create 2021-03-07 13:49
 */

//
public class Test01 {

    /*
        1. 泛型在继承方法的体现

           类A是类B的父类，G<A>，和G<B> 二者不具备子父类关系，二者是并列关系

           补充：类A是类B的父类，A<G> 是 B<G> 的父类，  泛型一致，才具备子父关系  # 类，接口都行

     */

    public void test01(){
        Object obj = null;
        String str = null;

        obj = str;      // 多态，子父类关系

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;    // 多态，子父类关系

        List<Object> list1 = null;
        List<String> list2 = null;

        // 此时的list1和list2的类型不具有子父类关系    # 泛型不一致
        // list1 = list2;    # 编译不通过



    }

    @Test
    public void test2(){
        List<String>  list1 = null;  // 接口可行
        ArrayList<String> list2 = null;

        // 泛型一致
        list1 = list2;
    }


    /*
        2. 通配符的使用
           通配符：?

           类A是类B的父类，G<A>和G<B>是没有关系的，二者共同的父类是：G<?>
     */

    @Test
    public void tess3(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;  // 通用父类

        list = list1;
        list = list2;



        List<String> list3 =  new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");

        // 添加（写入）： 对于List<?> 就不能向其内部添加数据，除了 null
        list.add(null);

        // 获取（读取）：允许读取数据，读取的数据类型为 Object
        Object o = list.get(0);
        System.out.println(o);  // NullPointerException



    }

    public void print(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    /*
        3. 有限制条件的通配符的使用
           ? extends Person：只允许泛型为Person及Person子类的引用调用  # <=  (无穷小，Person]
           ? super Person： 只允许泛型为Person及Person父类的引用调用  # >=  [Person，无穷大]
     */

    @Test
    public void test4(){

        List<? extends Person> list1 = null;   // (-?, A]
        List<? super Person> list2 = null;     // [A, ?)

        List<Student> list3 = new ArrayList<>();
        List<Person> list4 = new ArrayList<>();
        List<Object> list5 = new ArrayList<>();


        list1 = list3;
        list1 = list4;
        // list1 = list5;    error

        // list2 = list3;    error
        list2 = list4;
        list2 = list5;

        // 读取数据
        list1 = list4;
        Person person = list1.get(0);   // <=

        list2 = list4;
        Object object = list2.get(0);
    }
}
