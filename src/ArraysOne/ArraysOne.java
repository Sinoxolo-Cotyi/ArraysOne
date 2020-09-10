package ArraysOne;

import java.util.Arrays;
public class ArraysOne {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                arr[i] = 0;
                System.out.println(Arrays.toString(arr));
            }
        }

    }
}
