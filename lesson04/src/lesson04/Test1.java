package lesson04;

// 找出：1000以内的所有的完数    EX- 6=1+2+3
// 注：一个数如果恰好等于它的因子之和，这个数就称为 "完数"
// 注：因数：除去这个数本身的其他约数
public class Test1 {
    public static void main(String[] args){
        for(int i = 1 ; i <= 1000; i++){
            int factor = 0;
            for(int j = 1; j <= i/2;j++){
                if(i % j == 0){
                    factor += j;
                }
            }
            if(i == factor){
                System.out.println(i);
            }
            // 重置factor
            factor = 0;
        }
    }
}


