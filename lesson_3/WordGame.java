package lesson_3;

import java.util.Random;
import java.util.Scanner;

/* Создать массив из слов
 * String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
 * "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
 * "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
 *
 * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
 * сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не
 * угадано, компьютер показывает буквы которые стоят на своих местах.
 * apple – загаданное
 * apricot - ответ игрока
 * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
 * Для сравнения двух слов посимвольно, можно пользоваться:
 * String str = "apple";
 * str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
 * Играем до тех пор, пока игрок не отгадает слово
 * Используем только маленькие буквы
 */
public class WordGame {
    public static void main(String[] args) {

        String[] list = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Я загадаю одно из этих слов:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(list[i * 5 + j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nУгадай слово :)");

        String pcWord = list[new Random().nextInt(25)];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Твой ответ: ");
        String answerWord = scanner.nextLine().toLowerCase();
        char[] maskWord = "###############".toCharArray();
        int answerLength;

        while (!answerWord.equals(pcWord)) {
            System.out.println();
            answerLength = pcWord.length() < answerWord.length() ? pcWord.length() : answerWord.length();
            for (int i = 0; i < answerLength; i++) {
                maskWord[i] = (answerWord.charAt(i) == pcWord.charAt(i)) ? answerWord.charAt(i) : '#';
            }
            System.out.println(String.valueOf(maskWord));

            System.out.print("Попробуй еще раз: ");
            answerWord = scanner.nextLine().toLowerCase();
        }

        System.out.println("Ура! Ты выиграл!!!");
        scanner.close();


    }

}
