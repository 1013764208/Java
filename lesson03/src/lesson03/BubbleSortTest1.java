package lesson03;

public class BubbleSortTest1 {
    public static void main(String[] args){
        int[] arr = {3,2,6,7,5};
        int[] res = BubbleSort.bubbleSort(arr);

        for(int i :res){
            System.out.print(i+" ");
        }
    }
}

