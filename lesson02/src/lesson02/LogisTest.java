package lesson02;
/*
    运算符.逻辑运算符
    & && | || ! ^

    说明：1. 逻辑运算符操作都是boolean类型的变量

 */

public class LogisTest {
    public static void main(String[] args){
        // 区分 &：逻辑与 与 &&：短路与   （类似 且）
        // 相同点1：& 与 && 的运算结果相同
        // 相同点2：当符号左边为true时，二者都会执行符号右边的运算
        // 不同点：当符号左边为false时，&继续执行符号右边运算，&&不再执行符号右边的运算（短路与）
        // 开发中，优先短路与 &&
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("lm here Beijing");
        }else{
            System.out.println("ln here ShangHai");
        }
        System.out.println("num1 = " + num1);

        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if(b1 && (num2++ > 0)){
            System.out.println("lm here Beijing");
        }else{
            System.out.println("ln here ShangHai");
        }
        System.out.println("num2 = " + num2);


        // 区分：|：逻辑或 与 ||：短路或
        // 相同点1：| 与 || 的运算结果相同
        // 相同点2：当符号左边为false时，二者都会执行右边的运算
        // 不同点：当符号左边为true时，|继续执行符号右边的运算，而 || 不再执行符号右边的运算
        // 开发中优先使用 短路或 ||
        boolean b3 = false;
        b3 = true;
        int num3 = 10;
        if(b3 | (num3++ > 0)){
            System.out.println("lm here Beijing");
        }else{
            System.out.println("lm here Shanghai");
        }
        System.out.println("num3 = "+ num3);

        boolean b4 = false;
        b4 = true;
        int num4 = 10;
        if(b4 || (num4++ > 0)){
            System.out.println("lm here Beijing");
        }else{
            System.out.println("lm here Shanghai");
        }
        System.out.println("num4 = "+ num4);
    }
}
