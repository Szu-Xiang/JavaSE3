package HomeWork.HomeWork08;

import java.util.Arrays;

public class arrCopy1 {
    public static void main(String[] args) {

        int[] arr = {10,27,8,5,2,1,3,55,88};

        int[] arrNew = new int[5];

        //srcPos:原数组起始位置
        //destPos：新数组的起始位置
        //length：复制过去的长度
        System.arraycopy(arr,2, arrNew,0,5);

        System.out.println(Arrays.toString(arrNew));
    }
}
