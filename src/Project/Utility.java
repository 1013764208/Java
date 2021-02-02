package Project;
import java.util.Scanner;

/*
    Utility 工具类
    将不同的功能封装为方法，就是可以直接通过调用方法使用它的功能，而无需考虑具体的功能实现细节
 */
public class Utility {
    private static Scanner sc = new Scanner(System.in);

    /*
        用于界面菜单的选择，该方法读取键盘数据，如果用户输入 1-4 中任意字符，则方法返回，返回值为用户输入字符
     */
    public static char readMenuSelection() {
        char c;
        while (true) {
            String str = readKeyboard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("非法数据，重新输入：");
            } else break;
        }
        return c;
    }

    /*
        用于收入和支出金额的输入
     */
    public static int readNumber(){
        int n;
        while(true){
            String str = readKeyboard(4);
            try{
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.print("NumberFormatException, 重新输入：");
            }
        }
        return  n;
    }

    /*
        用与收入和支出说明的输入，该方法从键盘读取一个不超过8位长度的字符，并将其作为方法的返回值
     */
    public static String readString(){
        String str = readKeyboard(8);
        return str;
    }

    /*
    用于确定选择的输入，该方法从键盘读取 ”Y“ 或 ”N“,并将其作为方法的返回值
     */
    public static char readConfirmSelection(){
        char c;
        while(true){
            String str = readKeyboard(1).toUpperCase();
            c = str.charAt(0);
            if(c == 'Y' || c == 'N'){
                break;
            }else{
                System.out.print("非法输入，重新输入：");
            }
        }
        return  c;
    }

    private static String readKeyboard(int limit){
        String line = "";
        while (sc.hasNext()){
            line = sc.nextLine();
            if(line.length() < 1 || line.length() > limit){
                System.out.print("输入长度（不大于）"+limit+"error，重新输入");
                continue;
            }
            break;
        }
        return line;
    }
}
