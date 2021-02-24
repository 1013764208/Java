package lesson04;

// 优化：100以内所有质数
public class ZhiShuTest1 {
    public static void main(String[] args){

        // 获取当前时间距离 1970-01-01 00：00：00 的毫秒数
        long start = System.currentTimeMillis();

        for(int number = 2; number < 100000; number++){ // 优化2：开方，m*n=o,只判断用n判别就可以了，n^2 = o
                                                        // 故用 根号
            boolean flag = true;
            for(int i = 2;i < Math.sqrt(i); i++){
                if(number % i == 0){
                    flag = false;
                    break;          // 优化1：只要进入一次，就不干净了
                }
            }
            if(flag == true){       // 还是个处，没进去
                System.out.println(number+" ");
            }
        }
        // 获取当前时间距离 1970-01-01 00：00：00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("spent time:"+(end-start));   // 未优化：spent time:20828
                                                         // 优化1：spent time：2078
                                                         // 优化2：spent time:960
    }
}
