package lesson03;

public class BubbleSort {
    public static int[] bubbleSort(int[] array){
        int length = array.length;

        for(int i = 0; i < length; i++){  // 表示n次排序
            for(int j = 1; j < length - i; j++){
                if(array[j-1] > array[j]){
                    int temp = array[j-1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

