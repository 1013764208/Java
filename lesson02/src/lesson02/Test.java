package lesson02;
/*
    练习：随意给出一个三位数的整数，打印显示个位，十位，百位的值
 */
public class Test {
    public static void main(String[] args){
        int num = 539;
        System.out.println("百位："+num/100);
        System.out.println("十位："+num/10%10);
        System.out.println("个位："+num%10);
    }
}
