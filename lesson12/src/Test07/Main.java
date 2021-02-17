package Test07;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            args[i] = "args " + i;
            System.out.println(args[i]);
        }
    }
}
