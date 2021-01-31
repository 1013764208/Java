package lesson04;
/*
                    使用范围                    作用
    break:          switch-case/循环结构        结束当前循环
    continue        循环结构                    结束当此循环
 */
public class BreakContinueTest {
    public static void main(String[] args){
        for(int i = 1;i < 10; i++){
            if(i % 4 == 0){
//                break;        // 123
                continue;       // 1235679
            }
            System.out.print(i);
        }
    }
}
