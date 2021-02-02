package Project;

public class FamilyAccount {
    public static void main(String[] args){

        boolean flag = true;
        String details = "收  支\t\t账户金额\t\t收支金额\t\t说  明\n";
        // 初始金额
        int balance = 10000;

        while(flag){
            System.out.println("---------------"+"家庭收支记账软件"+"---------------");
            System.out.println("                    1. 收支明细");
            System.out.println("                    2. 登记收入");
            System.out.println("                    3. 登记支出");
            System.out.println("                    4. 退   出");
            System.out.print("                    请输入(1-4): ");

            // 获取用户的选择
            char selection = Utility.readMenuSelection();

            switch (selection){
                case '1':
//                    System.out.println("收支明细");
                    System.out.println("---------------"+"当前收支明细记录"+"---------------");
                    System.out.println(details);
                    System.out.println("-------------------------------------------");


                    break;
                case '2':
//                    System.out.println("登记收入");
                    System.out.print("本次收入金额：");
                    int money = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String info = Utility.readString();
                    System.out.println("------------------"+"登记完成"+"-------------------");

                    // 处理 balance
                    balance += money;

                    // 处理details
                    details += ("收  入\t\t" + balance + "\t\t" + money  + "\t\t\t" + info+"\n");

                    break;
                case '3':
//                    System.out.println("登记支出");
                    System.out.println("本次支出金额：");
                    int money1 = Utility.readNumber();
                    System.out.println("本次支出说明：");
                    String info1 = Utility.readString();

                    // 处理balance
                    if (balance >= money1){
                        balance -= money1;
                        // 处理details
                        details += ("支  出" + "\t\t" + balance + "\t\t" + money1  + "\t\t\t" + info1+"\n");
                    }else{
                        System.out.println("透支");
                    }
                    System.out.println("------------------"+"登记完成"+"-------------------");

                    break;
                case '4':
//                    System.out.println("退   出");
                    System.out.println("确认是否退出（Y/N）:");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        flag = false;
                    }

            }
        }
    }
}
