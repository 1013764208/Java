package lesson05;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr1 = new int[]{3,2,5,8,10,1};

        for(int i = 1; i < arr1.length; i++){
            for(int j = 0; j < arr1.length - i; j++){
                if(arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        for(int value : arr1){
            System.out.print(value+" ");
        }
    }
}
