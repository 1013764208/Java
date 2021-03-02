package Test02;

import org.junit.Test;

/**
 * @author HXS
 * @create 2021-03-02 13:04
 */
public class StringBufferTest {

    /*
        StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
        StringBuffer delete(int start,int end)：删除指定位置的内容
        StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
        StringBuffer insert(int offset, xxx)：在指定位置插入xxx
        StringBuffer reverse() ：把当前字符序列逆转

        public int indexOf(String str)
        public String substring(int start,int end)  ：返回一个从 start 开始到 end 索引结束的左闭右开
        public int length()
        public char charAt(int n )
        public void setCharAt(int n ,char ch)

        总结：
            增：append(xxx)
            删：delete(int start,int end)
            改：setCharAt(int n,char ch) / replace(int start,int end,String str)
            查：charAt(int n)
            插：insert(int offset,xxx)
            长度：length
            遍历：for + charAt()

     */
    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.append(1);
        sb1.append("1");
        System.out.println(sb1);

        sb1.delete(2,3);
        System.out.println(sb1);

        sb1.replace(2,3,"hello");
        System.out.println(sb1);

        sb1.insert(3,"false");
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);
    }

    /*
        对比 string、stringBuffer、stringBuilder 三者的效率
        从高到低排序，stringBuilder > stringBuffer > string
     */
    @Test
    public void test2(){
        //初始设置
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

        //开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));
    }
}
