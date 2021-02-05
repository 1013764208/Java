package lesson08.Test2;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Tom","Smith");

        bank.getCustomer(0).setAccount(new Account(2000));

        bank.getCustomer(0).getAccount().withdraw(500);

        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println(balance);

        bank.addCustomer("Jack","Lina");

        System.out.println("bank number：" + bank.getNumberOfCustomer());
    }
}
