package Test04;

public class Test {
    public static void main(String[] args) {

        Account a1 = new Account();
        Account a2 = new Account("123456",2000);

        System.out.println(a1);
        System.out.println(a2);

        Account.setInterestRate(0.012);
        Account.setMinMoney(100);
    }
}
