package lesson05;

import java.sql.SQLOutput;

/*
    练习：使用简单数组
    1. 创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，int[]类型
    2. 使用大括号，把array1初始化为8个素数：2，3，5，7，11，17，19
    3. 显示array1的内容
    4. 赋值array2变量等于array1,修改array2中偶索引元素，使其等于索引值 EX array[0] = 0

    思考：array1 和 array2 关系
    arr1 和 arr2 地址值相同，都指向堆空间唯一的一个数组实体


    }
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        int[] arr1,arr2;
        arr1 = new int[]{2,3,5,7,11,13,17,19};

        // 显示arr1的内容
        for (int value : arr1) {
            System.out.print(value+" ");
        }

        // 赋值arr2等于arr1
        arr2 = arr1;  // 赋值地址!

        // 修改arr2 中偶索引，使其等于索引值
        for(int i = 0; i < arr2.length; i++){
            if(i % 2 == 0){
                arr2[i] = i;
            }
        }
        System.out.println();
        for(int value : arr1){
            System.out.print(value+" ");
        }
    }
}
