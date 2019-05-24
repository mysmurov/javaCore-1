/*Тема: Создание и заполнение массива.
        Материалы:
        https://metanit.com/java/tutorial/2.4.php
        https://www.youtube.com/watch?v=i_IiGj65bJMC
        Задание:

            Cоздайте метод static int fillArray(int x), который принимает целое число и возвращает массив целых чисел,
        размером равный этому числу и заполненный числами от 0 до числа, меньшего на единицу, чем принятое.

        Условия:

        Метод должен принимать целое число
        Метод не должен ничего выводить в консоль
        Метод должен возвращать массив целых чисел*/

package JavaMentor.apr29052019;

import java.util.Arrays;

public class task10 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(fillArray(9))); //1-й вариант

//        for (int a : fillArray(9)) //2-й вариант
//            System.out.print(a + " ");

    }

    static int[] fillArray(int x) {

        int[] mass = new int[x];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
        }
        return mass;
    }
}


