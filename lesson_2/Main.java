package lesson_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) throws IOException {

        /*
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
         * [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */

//        int[] intArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//
//        for(int a = 0; a < intArray.length; a++)
//            if(intArray[a] == 1) {
//                intArray[a] = 0;
//            }else intArray[a] = 1;
//        for(int a = 0; a < intArray.length; a++){
//            System.out.print (intArray[a]+" ");
//        }

        /*
         * 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями
         * 0 3 6 9 12 15 18 21;
         */

//        int[] intMass = new int[8];
//        int b = 0;
//
//        for (int i = 0; i < intMass.length; i++, b += 3) {
//            intMass[i] = b;
//        }
//
//        for (int i = 0; i < intMass.length; i++) {
//            System.out.print(intMass[i] + " ");
//        }

        /*
         *  3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие
         *  6 умножить на 2;
         */

//        int[] intArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//
//        for (int a = 0; a < intArray.length; a++) {
//
//            if (intArray[a] < 6)
//                intArray[a] = intArray[a] * 2;
//        }
//        for(int a = 0; a<intArray.length; a++){
//
//            System.out.print(intArray[a] + " ");
//        }

        /*
         * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */

//        int[][] squareArray = new int[4][4];
//
//
//        for (int a = 0; a < squareArray.length / 2 + 1; a++) {
//            for (int b = a; b < squareArray.length - a; b++) {
//                squareArray[a][b] = 1;
//                squareArray[squareArray.length - a - 1][b] = 1;
//            }
//        }
//        for (int[] row : squareArray) {
//            for (int val : row) {
//                System.out.print(" " + val + " ");
//            }
//            System.out.println();
//        }



        /* 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи
         * интернета);
         */

//        int[] intArray = {18, 36, -250, 14, -3, 25, 800, -700};
//
//        int max = intArray[0];
//        int min = intArray[0];
//
//        for (int a = 0; a < intArray.length; a++) {
//            if (intArray[a] > max) {
//                max = intArray[a];
//            }
//            if (intArray[a] < min) {
//                min = intArray[a];
//            }
//        }
//        System.out.println("минимальный элемент: " + min + "\n" + "максимальный элемент: " + max);

        /* 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод
         * должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива
         * равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
         * checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
         * эти символы в массив не входят.
         */

//        System.out.println(checkArray(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
//        System.out.println(checkArray(new int[]{1, 1, 1, 2, 1}));
//
//    }
//
//    private static boolean checkArray(int[] array) {
//        for (int i = 0; i < array.length - 1; i++) {
//            if (sumArray(array, i, "left") == sumArray(array, i + 1, "right"))
//                return true;
//        }
//        return false;
//    }
//
//    private static int sumArray(int[] array, int index, String direction) {
//        if (direction.equals("left")) {
//            if (index == 0)
//                return array[index];
//            else
//                return array[index] + sumArray(array, index - 1, "left");
//
//        } else {
//            if (index == array.length - 1)
//                return array[index];
//            else
//                return array[index] + sumArray(array, index + 1, "right");
//        }


        /* 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть
         * положительным, или отрицательным), при этом метод должен сместить все элементымассива на n
         * позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число элементов массива: ");
        int volume = Integer.parseInt(reader.readLine());
        int[] array = new int[volume];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Создан массив: " + Arrays.toString(array));

        System.out.println();
        System.out.print("Введите величину \"n\" (величину смещения): ");
        int offset = Integer.parseInt(reader.readLine());
        offsetArray(array, offset);
        System.out.println();
        System.out.println("Результат после смещения: " + Arrays.toString(array));
    }

    private static void offsetArray(int[] array, int offset) {
        int size = array.length;
        for (int i = 0; i < offset; i++) {
            int temp = array[size - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = temp;
        }

        // Дополнительное ДЗ

        /*
         * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
         * (заполнить массив с помощью цикла)
         */

//        int leng = 0; //кол-во эл. в массиве
//
//        for (int a = 1; a <= 99; a++) {
//            if (a % 2 != 0) leng++;
//        }
//
//        int[] Array = new int[leng];
//        for(int i =1, b=0; i<=99; i++){
//            if(i%2!=0){
//                Array[b]=i;
//                System.out.print(Array[b] +" ");
//            }
//        }

        /*
         * Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько
         * в массиве чётных элементов и выведете это количество на экран на отдельной строке.
         */

//        int[] randomMass = new int[15];
//        int a = 0;
//
//        for (int i = 0; i < 15; i++) {
//            Random ran = new Random();
//            randomMass[i] = ran.nextInt(10);
//            System.out.print(randomMass[i] + " ");
//            if (randomMass[i] > 0 & randomMass[i] % 2 == 0) a++;
//        }
//        System.out.println();
//        System.out.println("Четных чисел в массиве: " + a);

        /*
         * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
         * выведите массивы на экран в двух отдельных строках. Посчитайте среднее
         * арифметическое элементов каждого массива и сообщите, для какого из массивов
         * это значение оказалось больше (либо сообщите, что их средние арифметические равны).
         */

//        double averageNum1 = 0;
//        double averageNum2 = 0;
//
//        int[] randomArray1 = new int[5];
//        int[] randomArray2 = new int[5];
//
//        for (int i = 0; i < randomArray1.length; i++) {
//            randomArray1[i] = (int) (Math.random() * 6);
//            System.out.print(randomArray1[i] + " ");
//            averageNum1 += (double) randomArray1[i] / randomArray1.length;
//        }
//        System.out.println("Среднее арифметическое: " + averageNum1 );
//
//        for (int i = 0; i < randomArray2.length; i++) {
//            randomArray2[i] = (int) (Math.random() * 6);
//            System.out.print(randomArray2[i] + " ");
//            averageNum2 += (double) randomArray2[i] / randomArray2.length;
//        }
//        System.out.println("Среднее арифметическое: " + averageNum2 );
//        if (averageNum1 == averageNum2) System.out.println("Средние арифметические значение массивов равны");
//        else {
//            if (averageNum1 > averageNum2)
//                System.out.println("Среднее арифметическое значение первого массива больше ");
//            else System.out.println("Среднее арифметическое значение второго массива больше ");
//
//        }

    }
}



