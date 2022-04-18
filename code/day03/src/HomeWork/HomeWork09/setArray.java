package HomeWork.HomeWork09;

import java.util.Arrays;

/*
    需求：	请打印数组所有元素
         	请对数组元素进行“升序”排序
         	请对排序后的数组再次打印。

 */
public class setArray {
    public static void main(String[] args) {
        int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
