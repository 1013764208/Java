package lesson08;

public class Marry{
    public static void main(String[] args) {
        Boy b1 = new Boy("Tom",22);
        Girl g1 = new Girl("lina",18);

        g1.marry(b1);
    }
}

class Boy {
    private String name;
    private int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void marry(Girl girl){
        System.out.println("l marry "+ girl.getName());
    }

    public void drink(){
        if(this.age >= 18){
            System.out.println("could drink");
        }
    }
}

class Girl{
    private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void marry(Boy boy){
        System.out.println("l marry " + boy.getName());
        boy.marry(this);
    }

    /**
     * 比较两个对象的大小
     * @param girl
     * @return 正数：当前对象大   负数：当前对象小  0：当前对象与形参对象相等
     */
    public int compare(Girl girl){
        return this.age - girl.age;
    }
}