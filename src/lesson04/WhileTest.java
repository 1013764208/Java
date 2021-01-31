package lesson04;
/*
    while 循环
    1. 语法结构
        while( 布尔表达式 ) {
            //循环内容
        }

   说明： 1. 写while 循环时，注意写更新，避免死循环
         2. for循环和while循环可以相互转换

 */
public class WhileTest {
    public static void main(String[] args) {

        // 遍历100以内的所有的偶数
        int i = 2;
        while(i <= 100){
            if(i %2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
