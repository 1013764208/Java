package Test04;

import org.junit.Test;

/**
 * @author HXS
 * @create 2021-03-02 15:58
 */

/*
    将一个字符串进行反转。将字符串中指定部分进行反转。比如 “abcdefg” 反转为 ”abfedcg”
 */


public class exer01 {

    // 方式 1: 转化为 char[]
    public String reverse1(String str,int startIndex,int endIndex){

        if(str != null){
            char[] arr = str.toCharArray();
            for(int x = startIndex, y = endIndex-1; x < y; x++, y--){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    // 方式 2： 使用String 拼接
    public String reverse2(String str,int startIndex,int endIndex) {
        String reverseStr = str.substring(0,startIndex);
        for(int i = endIndex; i >= startIndex; i--){
            reverseStr += str.charAt(i);
        }
        reverseStr += str.substring(endIndex+1);

        return reverseStr;
    }

    // 方式 3：使用 stringBuffer / stringBuilder
    public String reverse3(String str,int startIndex,int endIndex) {
        StringBuilder builder = new StringBuilder(str.length());

        builder.append(str.substring(0,startIndex));

        for(int i = endIndex; i >= startIndex; i--){
            builder.append(str.charAt(i));
        }

        builder.append(str.substring(endIndex));

        return builder.toString();
    }



    @Test
    public void test1(){
        String str = "abcdefg";
        String reverse1 = reverse1(str,1,6);
        String reverse2 = reverse2(str,1,6);
        String reverse3 = reverse3(str,1,6);

        System.out.println(reverse3);
    }
}
