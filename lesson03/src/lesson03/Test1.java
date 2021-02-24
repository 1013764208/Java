package lesson03;

public class Test1 {
    public static void main(String[] args){

        // 获取随机数 0 - 100
        double value = Math.random(); // 0-1
        int res = (int)(value * 100); // 配到 100
        System.out.println(res);
    }
}

