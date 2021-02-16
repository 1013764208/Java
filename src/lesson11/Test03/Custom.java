package lesson11.Test03;

public class Custom {
    String name;
    int age;

    public Custom(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // 重写的原则，比较两个对象的实体内容是否相同  / 可 generate
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o instanceof Custom){
            Custom c = (Custom)o;
            // 比较两个对象的每个属性是否相同
            return this.age == c.age && this.name.equals(this.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
