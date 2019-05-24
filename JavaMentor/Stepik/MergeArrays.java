/*Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке
 массив. Массивы могут быть любой длины, в том числе нулевой. Предполагается, что вы реализуете алгоритм слияния,
 имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий
  массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась. К сожалению,
  автоматически это не проверить, так что это остается на вашей совести :)
 */

package JavaMentor.Stepik;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(mergeArrays(new int[]{1}, new int[]{2, 8})));
    }

    private static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length + a2.length];
        int i = 0, j = 0;

        while (i < a1.length && j < a2.length) {
            a3[i + j] = (a1[i] <= a2[j]) ? a1[i++] : a2[j++];
        }
        while (i < a1.length) {
            a3[i + j] = a1[i++];
        }
        while (j < a2.length) {
            a3[i + j] = a2[j++];
        }

        return a3;
    }
}