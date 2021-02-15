package lesson10.Project01;

public class Account {
    private int id;         // 账号
    double balance;         // 余额
    private double  annualInterestRate;  // 年利率

    public Account(int id, double balance, double  annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }



    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    public double getMonthlyInterest(){   // 返回月利率
        System.out.print("月利率为： ");
        return getAnnualInterestRate() / 12;
    }

    public void withdraw(double amount){   // 取款方法
        if(balance > amount){
            balance -= amount;
        }else {
            System.out.println("余额不足");
        }

        System.out.println("您的余额为：" + this.balance);

    }

    public void deposit(double amount){    // 存款方法
        balance += amount;
        System.out.println("您的余额为：" + this.balance);
    }

}
