package Test04;

import org.junit.Test;

/**
 * @author HXS
 * @create 2021-03-03 9:10
 */
public class exer02 {
    // 获取一个字符串在另一个字符串中出现的次数。
    // 比如：获取 "ab" 在 "abkkcadkabkebfkaabkskab" 中出现的次数


    /**
     * 获取subStr在mainStr中出现的次数
     * @param mainStr
     * @param subStr
     * @return
     */

    // 方式 1
    public int getCount1(String mainStr, String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index;

        if (mainLength >= subLength){
            // indexOf 返回指定子字符串在此字符串中第一次出现的索引
            // 终止条件，被截取的主字符串中不再有子串与之匹配
            while ((index = mainStr.indexOf(subStr)) != -1){
                count++;
                // 再次查找, 截去已经匹配的字符串
                mainStr = mainStr.substring(index + subLength);
            } return count;
        } else {
            return 0;
        }
    }


    // 方式 2
    public int getCount2(String mainStr, String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;

        if (mainLength >= subLength){

            // 不要去截取，直接索引到需要重新匹配的位置
            while ((index = mainStr.indexOf(subStr,index)) != 1){
                count++;
                index += subLength;
            } return count;
        } else {
            return 0;
        }
    }

    @Test
    public void test1(){
        String mainStr = "abkkcadkabkebfkaabkskab";
        String subStr = "ab";
        int count = getCount2(mainStr,subStr);
        System.out.println(count);
    }
}
