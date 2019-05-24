package JavaMentor.Stepik;

import java.util.Arrays;

public class evArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenArray(6)));
    }
    private static int[] evenArray(int number) {
        // реализуйте метод здесь
        int[] arr = new int[number];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) continue;
            arr[i] = i;
            System.out.println(arr[i]);
        }

        return arr;
    }
}
