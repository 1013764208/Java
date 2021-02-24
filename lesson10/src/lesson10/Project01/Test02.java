package lesson10.Project01;
/*
    写一个用户程序测试 CheckAccount 类。在用户程序中，创建一个账号为 1122、余
    额为 20000、年利率 4.5%，可透支限额为 5000 元的 CheckAccount 对象
    使用 withdraw 方法提款 5000 元，并打印账户余额和可透支额
    再使用 withdraw 方法提款 18000 元，并打印账户余额和可透支额
    再使用 withdraw 方法提款 3000 元，并打印账户余额和可透支额
 */
public class Test02 {
    public static void main(String[] args) {
        CheckAccount a1 = new CheckAccount(1122,20000,0.045,5000);

        a1.withdraw(5000);
        a1.withdraw(18000);
        a1.withdraw(3000);
    }
}
