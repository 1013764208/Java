package lesson10.Project01;

public class CheckAccount extends Account{

    private double overdraw;

    public CheckAccount(int id, double balance, double annualInterestRate,double overdraw) {
        super(id, balance, annualInterestRate);
        this.overdraw = overdraw;
    }

    public double getOverdraw() {
        return overdraw;
    }

    public void setOverdraw(double overdraw) {
        this.overdraw = overdraw;
    }

    @Override
    public void withdraw(double amount) {
        if(balance + overdraw  > amount){

//            balance -= amount;
            if (balance > amount){
                balance -= amount;
            }else{
                overdraw = overdraw - (amount - balance);
                balance = 0;
            }
        }else {
            System.out.println("余额与可透支额不足");
        }

        System.out.println("您的余额为：" + this.balance);
        System.out.println("您的可透支额为：" + overdraw);
    }

    @Override
    public void deposit(double amount) {
        if(this.overdraw >= overdraw){
            balance += amount;
        }else{
            this.overdraw = overdraw;
            balance = balance + (overdraw - this.overdraw);
        }
        System.out.println("您的余额为：" + this.balance);
        System.out.println("您的可透支额为：" + overdraw);
    }
}
