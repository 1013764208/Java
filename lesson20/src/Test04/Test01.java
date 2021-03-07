package Test04;
import java.util.List;

/**
 * @author HXS
 * @create 2021-03-07 15:17
 */

/*
    创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
    使用 Junit 单元测试类进行测试。
 */
public class Test01 {

    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();

        dao.save("1001",new User(1001,34,"AA"));
        dao.save("1002",new User(1002,21,"BB"));
        dao.save("1003",new User(1003,54,"CC"));

        dao.update("1003",new User(1003,30,"方文山"));
        dao.delete("10002");

        List<User> list = dao.list();
        for (User user : list) {
            System.out.println(user);
        }




    }
}
