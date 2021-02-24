package lesson06.Test03;

public class Student {
    int number;      // 学号
    int state;       // 年级
    int score;       // 成绩

    // 显示学生信息的方法
    public String info(){
        return "number：" + number + " state："+ state + " scroe：" + score;
    }
}
