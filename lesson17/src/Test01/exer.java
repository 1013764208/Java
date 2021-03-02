package Test01;

/**
 * @author HXS
 * @create 2021-03-02 9:38
 */
public class exer {

    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };

    public void change(String str, char ch[]) {
        str = "test ok";    // string 不可变
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        exer ex = new exer();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);     // good
        System.out.println(ex.ch);      // best
    }



}
