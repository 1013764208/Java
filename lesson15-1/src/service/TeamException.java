package service;

/**
 *  自定义异常类
 */
public class TeamException extends Exception {
    static final long serialVersionUID = -3387321993124229948L;

    public TeamException(){
        super();
    }

    public TeamException(String msg){
        super(msg);
    }


    public void printStackTrace(String message) {
    }
}
