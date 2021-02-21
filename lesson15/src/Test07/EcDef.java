package Test07;

// 自定义异常类
public class EcDef extends Exception {
    static final long serialVersionUID = -3387516993124229228L;

    public EcDef(){

    }

    public EcDef(String msg){
        super(msg);
    }
}
