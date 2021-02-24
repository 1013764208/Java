package lesson06.Test03;

/*
    定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
    score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定
    问题一：打印出3年级(state值为3）的学生信息
    问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */

public class StudentsTest {
    public static void main(String[] args) {

        // 声明student类型数组  / 对象数组
        Student[] stus = new Student[20];  // student 实体化


        StudentsTest test = new StudentsTest(); // studentTest 实体化

        // 初始化
        test.init(stus);
        // 问题1：打印3年级学生信息
        test.searchState(stus, 3);
        // 问题2：使用冒泡排序，遍历所有学生信息
        test.sort(stus);
        test.printStu(stus);
    }




    /**
     * 查找student 遍历数组
     *
     * @param stus
     */
    public void printStu(Student[] stus) {
        for (Student value : stus) {
            System.out.println(value.info());
        }
    }

    /**
     * 查找student 数组中指定年级的学生信息
     * @param stus
     * @param state
     */
    public void searchState(Student[] stus, int state) {
        for (Student value : stus) {
            if (value.state == state) {
                System.out.println(value.info());
            }
        }
    }

    /**
     * 冒泡 数组
     * @param stus
     */
    public void sort(Student[] stus){
        for(int i = 0;i < stus.length - 1; i++){
            for(int j = 0;j < stus.length - i - 1; j++){
                if(stus[j].score > stus[j + 1].score){
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] =  temp;
                }
            }
        }
    }

    /**
     * 初始化数组
     * @param stus
     */
    public void init(Student[] stus){
        for (int i = 0; i < stus.length; i++) {
            // 给数组元素赋值
            stus[i] = new Student();
            // 给Student对象的属性赋值
            stus[i].number = i + 1;
            // 年级：[1,6]
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            // 成绩：[0,100]
            stus[i].score = (int) (Math.random() * (100 - 0 + 1));
        }
    }
}