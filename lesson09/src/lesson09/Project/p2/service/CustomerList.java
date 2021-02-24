package lesson09.Project.p2.service;

import lesson09.Project.p2.bean.Customer;

/*
    CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法
    供CustomerView调用

 */
public class CustomerList {
    private Customer[] customers;  // 用来保存客户对象的数组
    private int total;                 // 记录已保存对象的数量


    /**
     * 用途：构造器，用来初始化customers数组
     * 参数：totalCustomer：指定customers数组的最大空间
     * @param totalCustomer
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     * 用途：将参数customer添加到数组中最后一个客户对象记录之后
     * 参数：customer指定要添加的客户对象
     * @param customer
     * @return 添加成功返回true；false表示数组已满，无法添加
     */
    public boolean addCustomer(Customer customer){
        if (total >= customers.length ) {
            return  false;
        } else {
//            customers[total] = customer;
//            total++;
            customers[total++] = customer;
            return true;
        }
    }

    /**
     * 用参数customer替换数组中由index指定的对象
     * 参数：customer指定替换的新客户对象
     * 		index指定所替换对象在数组中的位置，从0开始
     * @param index
     * @param cust
     * @return 替换成功返回true；false表示索引无效，无法替换
     */
    public boolean replaceCustomer(int index, Customer cust){
        if( 0 <= index || index < total ){
            customers[index] = cust;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 从数组中删除参数index指定索引位置的客户对象记录
     * 参数： index指定所删除对象在数组中的索引位置，从0开始
     * @param index
     * @return 删除成功返回true；false表示索引无效，无法删除
     */
    public boolean deleteCustomer(int index){
        if ( 0 <= index || index < total ){
            for ( int i = index; i < total - 1; i++ ) {
                customers[i] = customers[i + 1];
            }
            // 最后有数据的元素需要置空
//            customers[total-1] = null;
//            total--;
            customers[--total] = null;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 用途：返回参数index指定索引位置的客户对象记录
     * 参数： index指定所要获取的客户在数组中的索引位置，从0开始
     * @return 封装了客户信息的Customer对象
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for(int i = 0; i < total; i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 返回参数index指定索引位置的客户对象记录
     * 参数： index指定所要获取的客户在数组中的索引位置，从0开始
     * @param index
     * @return 封装了客户信息的Customer对象
     */
    public Customer getCustomer(int index){
        if( 0 <= index || index > total ){
            return customers[index];
        } return null;
    }

    /**
     * 获取存取客户的数量
     * @return
     */
    public int getTotal(){
        return total;
    }
}
