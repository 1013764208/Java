package Test03;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author HXS
 * @create 2021-03-05 14:40
 */
public class test02 {

    /*
        LinkedHashSet 的使用
        LinkedHashSet 作为HashSet的子类，在添加数据的同时，每个数据还维护了两个引用（指针），记录此数据前一个数据和后一个数据

        优点：对于频繁的遍历操作，LinkedHashSet效率高于HashSet


     */

    @Test
    public void test1(){
        Set set = new LinkedHashSet();
    }
}
