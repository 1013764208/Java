package Test02;

import org.junit.Test;

import java.util.List;

/**
 * @author HXS
 * @create 2021-03-07 11:45
 */
public class test01 {

    @Test
    public void test1(){
        CustomerDAO dao = new CustomerDAO();

        dao.add(new Customer());    // 只能填入 customer 类
        List<Customer> forList = dao.getForList(10);

        StudentDAO studentDAO = new StudentDAO();
        studentDAO.add(new Student());  // 只能填入 student 类


    }
}
