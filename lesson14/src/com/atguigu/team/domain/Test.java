package com.atguigu.team.domain;

/*
    接口的使用   / 体会
    1. 体现了接口的多态性
    2. 体现了接口的规范
    3. 开发中，体现面向接口编程
 */

public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();


        // 1. 创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        computer.transferData(flash);

        // 2. 创建了接口的非匿名实现类的匿名对象
        computer.transferData(new Printer());

        // 3. 创建了接口的匿名实现类的非匿名对象
        // 对象有名， USB 不能实例化 ，直接实现 USB 方法
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机启动");
            }

            @Override
            public void stop() {
                System.out.println("手机停止");
            }
        };
        computer.transferData(phone);


        // 4. 创建了接口的匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        });
    }

}
