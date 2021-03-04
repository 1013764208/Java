package Test02;
import java.util.Arrays;

/**
 * @author HXS
 * @create 2021-03-03 19:51
 */

/*
    使用enum关键字定义枚举类
    说明：定义的枚举类默认继承于 java.lang.Enum 类

 */
enum season implements Info {

    // 1. 提供当前枚举类的对象，多个对象之间用 "," 末尾 ";"
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("夏天在哪里");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天在哪里");
        }
    },
    WINTER("冬天","冰天雪地"){
        @Override
        public void show() {
            System.out.println("冬天在哪里了");
        }
    };


    // 2. 声明Season 对象的属性
    private final String seasonName;
    private final String seasonDesc;


    // 3. 私有化类的构造器, 并给对象属性赋值
    private season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }


    // 4. 其他诉求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDesc() {
        return seasonDesc;
    }
}

interface Info{
    void show();
}

class test1 {
    public static void main(String[] args) {
        season summer = season.SUMMER;
        System.out.println(summer);

        // values()
        season[] values = season.values();
        System.out.println(Arrays.toString(values));

        // valuesOf(String objName)：返回枚举类中对象名是objName的对象
        // 如果没有objName的枚举类对象，则抛出异常
        season winter = season.valueOf("WINTER");
        System.out.println(winter);
    }
}
