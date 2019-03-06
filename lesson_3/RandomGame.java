package lesson_3;

import java.util.Random;
import java.util.Scanner;


public class RandomGame {
    public static void main(String[] args) {
        /*
         * Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается
         * 3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное
         * пользователем число чем загаданное, или меньше. После победы или проигрыша выводится запрос –
         * «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
         */

        boolean nextGame = true;

        while (nextGame) {
            Random ran = new Random();
            Scanner scan = new Scanner(System.in);
            int ranNum = ran.nextInt(10);

            System.out.println("Попробуйте угадать число от 0 до 9. Есть 3 попытки.");

            for (int i = 0; i < 3; i++) {
                int userNum;
                System.out.println("Попытка " + (i + 1) + " Ведите число: ");

                userNum = scan.nextInt();

                if (ranNum > userNum) {
                    System.out.println("Введенное число меньше загаданного");
                } else if (ranNum < userNum) {
                    System.out.println("Введенное число больше загаданного");
                } else {
                    System.out.println("Бинго! Вы угадали");
                    break;
                }
            }

            System.out.println("Сыграем еще? 1-ДА / 0-НЕТ");
            nextGame = scan.nextInt() == 1;

        }
    }
}
