package lesson05;

import java.util.Arrays;

class test{
    public static void quickSort(int[] arr, int low, int high){

        if(arr.length <= 0) return;
        if(low >= high) return;
        int left = low;
        int right = high;

        int temp = arr[left];   //挖坑1：保存基准的值
        while (left < right){
            //坑2：从后向前找到比基准小的元素，插入到基准位置坑1中
            while(left < right && arr[right] >= temp){
                right--;
            }
            arr[left] = arr[right];

            //坑3：从前往后找到比基准大的元素，放到刚才挖的坑2中
            while(left < right && arr[left] <= temp){
                left++;
            }
            arr[right] = arr[left];
        }

        arr[left] = temp;   //基准值填补到坑3中，准备分治递归快排
        System.out.println("Sorting: " + Arrays.toString(arr));
        quickSort(arr, low, left-1);
        quickSort(arr, left+1, high);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,7,11,2};
        quickSort(arr,0,5);

    }
}