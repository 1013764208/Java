package lesson05;
/*
    算法：数组复制、反转、查找（线性查找、二分查找）
 */
public class ArrayTest04 {
    public static void main(String[] args) {

        // 数组复制
        int[] arr1 = {1,2,3};
        int[] arr2 = new int[arr1.length];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }

        // 数组反转
        // 方法1：
        String[] arr3 = new String[]{"AA","BB","CC"};
        for(int i = 0; i < arr3.length / 2; i++){
            String temp = arr3[i];
            arr3[i] = arr3[arr3.length - i - 1];
            arr3[arr3.length -i - 1] = temp;
        }

        // 方法2
        for(int i = 0,j =  arr1.length - 1; i < j; i++,j--){
            String temp = arr3[i];
            arr3[i] = arr3[j];
            arr3[j] = temp;
        }

        for(String value : arr3){
            System.out.print(value + " ");
        }

        // 查找. 线性查找
        String dest = "BB";
        boolean flag = true;
        for(int i = 0; i < arr3.length; i++){
            if(dest.equals(arr3[i])){
                System.out.println("找到了指定元素，位置："+i);
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("没找到");

        // 查找. 二分查找
        // 前提：数组有序
        int[] arr4 = new int[]{1,2,3,4,5,6,7,8,9};
        int dest1 = 10;
        int head = 0;
        int end = arr4.length-1;

        while(head <= end){
            int mid = (head + end)/2;
            if(dest1 == arr4[mid]){
                System.out.println("找到了指定元素，位置为："+mid);
                break;
            }else if(arr4[mid] > dest1){
                end = mid-1;
            }else{
                head = mid+1;
            }
        }
    }
}

