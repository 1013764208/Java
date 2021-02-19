package Test08;

import java.util.Calendar;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];

        Calendar instance = Calendar.getInstance( );
        int nowMonth = instance.get(Calendar.MONTH) + 1;

        emps[0] = new SalariedEmployee("AA",1002,new MyDate(1992,2,28),10000);
        emps[1] = new HourlyEmployee("BB",1002,new MyDate(2001,5,12),60,240);

        for(int i = 0 ; i < emps.length; i++){
            System.out.println(emps[i]);
            int salary = emps[i].earning();
            if (nowMonth == emps[i].getBirthday().getMonth()){
                System.out.println("happy birthday");
                salary += 1000;
            }

            System.out.println("月工资为：" + salary);
        }
    }
}
