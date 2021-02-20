package Test03;

// 接口通过类去实现
public interface CompareObject {

    // 若返回值为0，代表相等 ; 若为正数，代表当前对象大 ; 负数代表当前对象小
    public int compareTo(Object object);

}
