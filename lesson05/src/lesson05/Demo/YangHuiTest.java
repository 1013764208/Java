package lesson05.Demo;

// 练习：使用二维数组打印10行杨辉三角
public class YangHuiTest {
    public static void main(String[] args) {
        // 1. 声明并初始化
        int [][] arr = new int[10][];

        // 2.赋值
        for(int i = 0; i < arr.length; i++){
            arr[i] = new int[i + 1];    // 框架搭建
            arr[i][0] = 1;              // 首末赋值
            arr[i][i] = 1;

            // 给每行的非首未元素赋值
            if(i > 1){
                for(int j =  1; j < arr[i].length-1; j++){
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }

        // 3. 遍历
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
