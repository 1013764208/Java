package Test05;

import Test06.MyException;

public class Student {

    private int id;

    public void regist(int id){
        if (id > 0){
            this.id = id;
        }else{
//            System.out.println("非法数据");

            // 手动抛出异常
            // throw new RuntimeException("非法数据"); // 运行时异常
            throw new MyException("非法数据");  // 自定义异常
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
