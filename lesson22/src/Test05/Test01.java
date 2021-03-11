package Test05;

/**
 * @author HXS
 * @create 2021-03-11 17:29
 */




interface ClothFactory{
    void productCloth();
}

// 代理类
class ProxyClothFactory implements  ClothFactory{

    private ClothFactory factory;  // 用被代理类对象进行实例化


    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void productCloth() {
        System.out.println("代理工厂进行一些准备工作");

        factory.productCloth();

        System.out.println("代理工厂进行一些后续的收尾工作");
    }
}

// 被代理伦类
class NikeClothFactory implements ClothFactory{

    @Override
    public void productCloth() {
        System.out.println("NIKE 工厂生成一批运动服");
    }
}

// 静态代理举例
public class Test01 {
    public static void main(String[] args) {
        // 创建被代理类的对象
        NikeClothFactory nike = new NikeClothFactory();

        // 创建代理类的对象
        ProxyClothFactory proxy = new ProxyClothFactory(nike);

        proxy.productCloth();

    }
}
