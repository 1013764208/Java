package lesson10.Project01;
/*
    写一个用户程序测试 Account 类。在用户程序中，创建一个账号为 1122、余额为 20000、
    年利率 4.5%的 Account 对象。使用 withdraw 方法提款 30000 元，并打印余额。
    再使用 withdraw 方法提款 2500 元，使用 deposit 方法存款 3000 元，然后打印余额和月利率

 */
public class Test01 {
    public static void main(String[] args) {
        Account a1 = new Account(1122,20000,0.045);
        a1.withdraw(3000);
        a1.withdraw(2500);
        a1.deposit(3000);
        double MonthlyRate = a1.getAnnualInterestRate();
        System.out.println(MonthlyRate);
    }
}
