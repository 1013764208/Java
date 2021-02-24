package lesson04;

// 练习：100以内所有质数
public class ZhiShuTest {
    public static void main(String[] args){

        for(int number = 2; number < 100; number++){
            boolean flag = true;
            for(int i = 2;i < number; i++){
                if(number % i == 0){
                    flag = false;
                }
            }
            if(flag == true){  // 还是个处，没进去
                System.out.print(number+" ");
            }
        }
    }
}
