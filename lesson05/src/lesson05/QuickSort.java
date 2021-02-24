package lesson05;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,7,11,2,20};
        quickSort(arr,0,arr.length-1);
        for(int value : arr){
            System.out.print(value+" ");
        }
    }

    public static void quickSort(int[] arr, int low, int high){
        if(arr.length <= 0) return;
        if(low >= high) return;

        int left = low;
        int right = high;
        int pivot = arr[left];

        while (left < right){
            while (left < right && arr[right] >= pivot){
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivot){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        quickSort(arr,low,left-1);
        quickSort(arr,left+1,high);
    }
}
