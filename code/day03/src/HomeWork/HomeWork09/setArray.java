package HomeWork.HomeWork09;

import java.util.Arrays;

/*
    需求：	请打印数组所有元素
         	请对数组元素进行“升序”排序
         	请对排序后的数组再次打印。

 */
public class setArray {
    public static void main(String[] args) {

        //定义一字符串，并分割
        String s = "90 23 42 64 16 4";
        String[] arrayStr = s.split(" ");

        //定义一个int类型数组，将类型转换后存入
        int[] arr = new int[arrayStr.length];
        for (int i = 0; i < arr.length; i++) {
            //类型转换
            arr[i] = Integer.parseInt(arrayStr[i]);
        }

        //排序
        Arrays.sort(arr);
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 ) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println(" ]");

        //排序后的数组拼接成一个字符串，并输出
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                sb.append(arr[i] + " ");
            } else {
                sb.append(arr[i]);
            }
        }

        String result = sb.toString();
        System.out.println(result);


    }
}
