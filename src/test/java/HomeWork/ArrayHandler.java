package HomeWork;

import java.util.Arrays;

public class ArrayHandler {
    int arrKey = 4;

    public int[] arrWork(int[] arr) {
        try {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == arrKey) {
                    arr = Arrays.copyOfRange(arr,i + 1,arr.length);
                    System.out.println(Arrays.toString(arr));
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return arr;
    }

}
