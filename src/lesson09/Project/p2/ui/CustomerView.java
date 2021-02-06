package lesson09.Project.p2.ui;

import lesson06.Custom;
import lesson09.Project.p2.bean.Customer;
import lesson09.Project.p2.service.CustomerList;
import lesson09.Project.p2.util.CMUtility;

// CustomerView为主模块，负责菜单的显示和处理用户操作
public class CustomerView {

    CustomerList customerList = new CustomerList(10);

    public CustomerView(){
        Customer customer = new Customer("AA",'男',23,"132123431","AA@gmail.com");
        customerList.addCustomer(customer);
    }

    /**
     * 显示 "客户信息管理软件" 界面的方法
     */
    public void enterMainMenu() {
        boolean flag = true;
        while(flag){
            System.out.println("-----------------------客户信息管理软件-----------------------");
            System.out.println("                  1. 添加客户 ");
            System.out.println("                  2. 修改客户 ");
            System.out.println("                  3. 删除客户 ");
            System.out.println("                  4. 客户列表 ");
            System.out.println("                  5. 退   出 ");
            System.out.print("                  请选择 1-5 ： ");

            char menu = CMUtility.readMenuSelection();
            switch (menu){
                case '1' : addNewCustomer(); break;
                case '2' : modifyCustomer(); break;
                case '3' : deleteCustomer(); break;
                case '4' : listAllCustomers(); break;
                case '5' :
                    System.out.print("确认是否退出(Y/N): ");
                    char isExit = CMUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        flag = false;
                    }
            }
        }
    }

    /**
     * 显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理
     */
    private void addNewCustomer() {

        System.out.println("--------------------------添加客户--------------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);

        System.out.print("性别：");
        char gender = CMUtility.readChar();

        System.out.print("年龄：");
        int age = CMUtility.readInt();

        System.out.print("电话：");
        String phone = CMUtility.readString(13);

        System.out.print("邮箱：");
        String email = CMUtility.readString(30);

        // 将上述数据封装到对象中
        Customer customer = new Customer(name,gender,age,phone,email);

        boolean isSuccess = customerList.addCustomer(customer);
        if(isSuccess){
            System.out.println("success");
        }else System.out.println("false");
    }

    /**
     *  修改
     */
    private void modifyCustomer(){
        System.out.println("--------------------------修改客户--------------------------");
        boolean flag = true;
        while(flag){
            System.out.print("请选择待修改客户的编号（-1 退出）：");
            int number = CMUtility.readInt();
            if (number == -1){
                break;
            }
            Customer cust = customerList.getCustomer(number - 1);
            if(cust == null){
                System.out.println("invalid");
            }else{  // 找到了
                System.out.println("姓名: " + cust.getName());
                System.out.print("修改为: ");
                String name = CMUtility.readString(10,cust.getName());

                System.out.println("性别: " + cust.getGender());
                System.out.print("修改为: ");
                char gender = CMUtility.readChar(cust.getGender());

                System.out.println("年龄: " + cust.getAge());
                System.out.print("修改为: ");
                int age = CMUtility.readInt(cust.getAge());

                System.out.println("电话: " + cust.getPhone());
                System.out.print("修改为: ");
                String phone = CMUtility.readString(13,cust.getPhone());

                System.out.println("邮箱: " + cust.getEmail());
                System.out.print("修改为: ");
                String email = CMUtility.readString(15,cust.getEmail());

                Customer newCust = new Customer(name,gender,age,phone,email);
                boolean isRepalced = customerList.replaceCustomer(number-1,newCust);
                if (isRepalced){
                    System.out.println("success");
                }else{
                    System.out.println("false");
                }
                flag = false;
            }
        }
    }

    /**
     * 删除
     */
    private void deleteCustomer(){
        System.out.println("--------------------------删除客户--------------------------");
        boolean flag = true;
        while(flag){
            System.out.print("请选择待删除客户的编号（-1 退出）：");
            int number = CMUtility.readInt();
            if (number == -1){
                break;
            }
            Customer cust = customerList.getCustomer(number - 1);
            if(cust == null){
                System.out.println("invalid");
            }else{
                System.out.print("是否要确认删除（Y/N）：");
                char isDelete = CMUtility.readConfirmSelection();
                if (isDelete == 'Y'){
                    boolean delet = customerList.deleteCustomer(number - 1);
                    if(delet){
                        System.out.println("success");
                    }else System.out.println("false");
                    flag = false;
                }
            }
        }
    }

    /**1
     * 客户列表
     */
    private void listAllCustomers(){
        System.out.println("--------------------------客户列表--------------------------");
        if ( customerList.getTotal() == 0 ) {
            System.out.println("没有客户记录");
        }else{
            System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t邮箱");
            Customer[] cust = customerList.getAllCustomers();
            for(int i = 0; i < cust.length; i++){
                System.out.println((i + 1) + "\t\t" + cust[i].getName() + "\t\t" + cust[i].getGender() + "\t\t"
                        + cust[i].getAge() + "\t\t" + cust[i].getPhone() + "\t" + cust[i].getEmail());
            }
        }
        System.out.println("--------------------------客户列表--------------------------");

    }

    public static void main(String[] args) {

        CustomerView view = new CustomerView();
        view.enterMainMenu();

    }
}
