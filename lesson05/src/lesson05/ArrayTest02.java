package lesson05;

/*
    算法考查：求数值型数组中元素的最大值、最小值、平均值、总和等

    定义 int 型的一维数组，包换10个元素。分别赋一些随机整数，求出所有元素的最大值、最小值、和值、平均值
    要求：所有随机数都是两位数

    [10,99]
    公式：(int)(math.random() * (99-10+1) + 10)
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * (99-10+1) + 10);
        }

        // 求数组元素的最大值
        int maxValue = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("最大值：" + maxValue);

        // 求数组元素的最小值
        int minValue = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        System.out.println("最小值："+minValue);

        // 求数组元素平均值
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println("avg: "+avg);

    }
}

