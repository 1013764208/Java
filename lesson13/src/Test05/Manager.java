package Test05;

public class Manager extends Employee{

    private double bonus;


    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void wrok() {
        System.out.println("管理员工，提供公司运行的效率");
    }
}
