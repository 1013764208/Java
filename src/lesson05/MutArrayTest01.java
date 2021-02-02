package lesson05;
/*
    二维数组的使用
    1. 理解：对于二维数组的理解，我们可以看成是一维数组array1又作为另一个数组array2的元素而存在
       其实，从数组底层的运行机制来看，其实没有多维数组

    2. 一维数组的使用?
    2.1 一维数组的声明和初始化
    2.2 如何调用数组的指定位置的元素
    2.3 如何获取数组的长度
    2.4 如何遍历数组
    2.5 数组元素的默认初始化值
    2.6 数组的内存解析
 */
public class MutArrayTest01 {
    public static void main(String[] args){
        // 1. 二维数组的声明和初始化
        // 静态初始化
        int[][] arr1 = new int[][]{{1,2},{4,5,6},{6,7,8}};
        // 动态初始化
        String[][] arr2 = new String[3][2];

        // 2. 如何调用数组的指定位置的元素
        System.out.println(arr1[0][1]);

        // 3. 获取数组长度
        System.out.println(arr1.length);    // 3
        System.out.println(arr1[0].length); // 2

        // 4. 如何遍历二维数组
        for(int i = 0; i < arr1.length; i++){

            for(int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        // 5. 数组元素的默认初始值
        // 情况1：外层元素的初始化值为：地址值
        //       内存元素的初始化值为：与一维数组初始化情况相同
        int[][] arr3 = new int[4][3];

    }
}

