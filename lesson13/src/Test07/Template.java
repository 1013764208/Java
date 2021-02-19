package Test07;

/*
    抽象类的应用：模板方法的设计模式
 */
public abstract class Template {
    public void spendTime(){
        long start = System.currentTimeMillis();

        code(); // 不确定的部分、易变的部分

        long end = System.currentTimeMillis();

        System.out.println("spent time:" + (end - start));

    }

    public abstract void code();
}
