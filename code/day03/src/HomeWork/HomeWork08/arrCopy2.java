package HomeWork.HomeWork08;

import java.util.Arrays;

/*
    需求：有以下数组：int[] arr = {55,77,0,88,22,44,33};

	     请编程实现：将后四个数字依次前移一位，移动后，最后一位置为0.

 */
public class arrCopy2 {
    public static void main(String[] args) {
        int[] arr = {55,77,0,88,22,44,33};

        System.arraycopy(arr,arr.length - 4, arr, 2, 4);
        arr[arr.length - 1] = 0;

        System.out.println(Arrays.toString(arr));
    }
}
