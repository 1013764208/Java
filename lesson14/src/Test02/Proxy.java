package Test02;


// 代理类
public class Proxy implements NetWork {

    private NetWork work;

    public Proxy(NetWork work){
        this.work = work;
    }

    public Proxy() {

    }

    // 方法
    public void check(){
        System.out.println("联网前的检查工作");
    }

    @Override
    public void browse() {
        check();

        work.browse();
    }
}
