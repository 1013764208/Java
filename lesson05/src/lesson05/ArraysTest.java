package lesson05;

import java.util.Arrays;

/*
    java.util.Arrays   // 操作数组的工具类，里面定义了很多操作数组的方法
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{3,2,1};
        // boolean equals(int[] a,int[] b)  # 判断两个数组是否相等
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        // String toString(int [] a)       # 输出数组信息
        System.out.println(Arrays.toString(arr1));

        // void fill(int[] a,int val)       # 将指定值填充到数组之中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        // void sort(int[] a)               # 排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // int binarySearch(int[] a,int key) # 二分查找
        int[] arr3 = new int[]{-89,32,23,41,-23,0,213,4,31};
        int index = Arrays.binarySearch(arr3,0);
        System.out.println(index);
    }
}
