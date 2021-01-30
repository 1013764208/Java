package lesson03;
/*
    如果：成绩为100，奖励 BMW
         成绩为[80,99]，奖励 iphone xs max
         成绩为[60,79],奖励 iPad
         其他，None

    说明：1. else 结构是可选的
 */
import java.util.Scanner;
public class IfTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("score: ");
        int score = sc.nextInt();

        if(score == 100){
            System.out.println("BMW");
        }else if(80 < score && score < 99){
            System.out.println("iphone xs max");
        }else if(60 < score && score < 79){
            System.out.println("iPad");
        }else System.out.println("None");
    }
}

