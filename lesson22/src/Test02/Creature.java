package Test02;

import java.io.Serializable;

/**
 * @author HXS
 * @create 2021-03-11 11:12
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }


}
