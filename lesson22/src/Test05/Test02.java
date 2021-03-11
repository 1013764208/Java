package Test05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author HXS
 * @create 2021-03-11 17:43
 */

// 动态代理
public class Test02 {
    public static void main(String[] args) {
        Superman superman = new Superman();
        // proxyInstance: 代理类的对象
        Human instance = (Human) ProxyFactory.getProxyInstance(superman);
        // 当通过代理类对象调用方法时，会自动的调用被代理类中同名的方法
        String belief = instance.getBelief();
        System.out.println(belief);
        instance.eat("四川麻辣烫");


    }
}

interface Human{
    String getBelief();

    void eat(String food);
}

// 被代理类
class Superman implements Human {


    @Override
    public String getBelief() {
        return "L believe l can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

/*
    要想实现动态代理，需要解决的问题?
    问题 1：如何根据加载到内存中的被代理的类，动态的创建一个代理类及其对象
    问题 2：将通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法
 */

class ProxyFactory{
    // 调用此方法，返回一个代理类的对象，解决问题1
    public static Object getProxyInstance(Object obj){  // obj: 被代理类的对象
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), myInvocationHandler);
    }
}

class  MyInvocationHandler implements InvocationHandler{
    private Object obj;   // 赋值时，也需要使用被代理被的对象进行赋值

    public void bind(Object obj){
        this.obj = obj;
    }


    // 当我们通过代理类的对象，调用方法a时，就会自动的调用如下的方法：invoke()
    // 将被代理类要执行的方法a的功能就生成在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // method: 即为代理类对象带调用的方法，此方法也作为被代理类要调用的方法
        // obj：被代理类的对象
        Object invoke = method.invoke(obj, args);
        // 上述方法的返回值就作为当前类invoke的返回值
        return invoke;
    }
}