package PrimerLessen3;

import java.util.Random;
import java.util.Scanner;

public class hw3 {

    private static void guessNumber() {

        // 1 создаем сканер и рандом
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // 2 загадываем число
        int tmp;
        int rand = random.nextInt(10);
        Boolean win = false;

        for(int i = 1; i < 4; i++)  {

            if(i == 1) System.out.println("Угадайте число, вам даётся 3 попытки.");
            // 3 считываем число
            tmp = sc.nextInt();

            if(tmp < rand) {
                System.out.println("Ваше число меньше загаданного числа.");
            } else if(tmp > rand) {
                System.out.println("Ваше число больше загаданного числа.");
            } else  {
                System.out.println("Вы угадали число!");
                System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");

                win = true;
                tmp = sc.nextInt();

                // 4  если играем повтрно, то флаг false, и загадываем новое число
                if(tmp == 1)    {
                    i = 0;
                    win = false;
                    rand = random.nextInt(10);
                }else if(tmp == 0)   {
                    break;
                }
            }

            // этот блок если не смогли угадать число
            if(!win && i == 3) {
                System.out.println("Вы не угадали число.");
                System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");

                tmp = sc.nextInt();

                if(tmp == 1)    {
                    i = 0;
                    win = false;
                    rand = random.nextInt(10);
                }else if(tmp == 0)   {
                    break;
                }
            }
        }

    }

    private static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        int rand = random.nextInt(words.length);
        String answer;
        Boolean win = false;

        System.out.println("Угадайте слово загаданное программой.");

        do {
            System.out.println("Введите ваше слово.");

            answer = sc.next();

            if(words[rand].equals(answer.toLowerCase()))    {
                win = true;
            }

            if(!win) {
                System.out.println("Не угадали, попробуйте ещё раз.");

                // если символ совпал с тем что ввели человек и мы не вышли за предел дилны то добаляем символ
                // если нет добавляем решетку
                for (int i = 0; i < words[rand].length(); i++) {
                    //answer.length() > i && words[rand].length() > i && answer.charAt(i) == words[rand].charAt(i)
                    if (answer.length() > i && answer.charAt(i) == words[rand].charAt(i)) {
                        sb.append("(" +answer.charAt(i) + ")");
                    } else sb.append("#");
                }

                System.out.println("Буквы которые вы угадали: " + "#####" + sb.toString() + "#####");
                sb.delete(0, sb.length());
                System.out.println();
            }

        }while (!words[rand].equals(answer.toLowerCase())); {
            System.out.println("Вы угадали слово!");
        }
    }

    public static void main(String[] args) {
       // guessNumber();
        guessWord();
    }

}



























//  while(!userOption.equals(wordOfWorld)){
//          if (userOption!=wordOfWorld){


//
//

//          /////////
//
//          if(game == 0) break;
//          if(game ==1){
//
//          ////////////////////////
//
//          String word = words[pos];
//
//          for(int i = 0; i< 28; i++) {
//
///////////
//
//
//
//        for (int i = 0; i < 3; i++) {
//        System.out.println("РџРѕРїС‹С‚РєР° " + (i + 1) + ": ");
//        a = in.nextInt();
//        if (a < n) System.out.println("Р§РёСЃР»Рѕ Р±РѕР»СЊС€Рµ!");
//        if (a > n) System.out.println("Р§РёСЃР»Рѕ РјРµРЅСЊС€Рµ!");
//        if (a == n) {
//        System.out.println("Р’С‹ СѓРіР°РґР°Р»Рё!");
//        System.out.println("РџРѕРІС‚РѕСЂРёС‚СЊ РёРіСЂСѓ РµС‰Рµ СЂР°Р·? 1 вЂ“ РґР° / 0 вЂ“ РЅРµС‚");
//        a = in.nextInt();
//        if (a == 1) GuessTheNumber();
//        else {
//        System.out.println("РЎРїР°СЃРёР±Рѕ Р·Р° РёРіСЂСѓ!");
//        break;
//        }
//        }
//        }
//
////////////////////
//
//
//        int b = 0;
//        input = scanner.nextLine();
//        while (!str.equals(input)) {
//        String answer_1 = "***************";
//        StringBuilder answer = new StringBuilder(answer_1);
//
//
/////////////////
//
//
//        if (otvet.length() <= words[numElem].length()) {
//        for (int i = 0; i < otvet.length(); i++) {
//        if (otvet.charAt(i) == words[numElem].charAt(i)) {
//        c[i] = otvet.charAt(i);
//        } else {
//        c[i] = '#';
//        }
//        }
//        for (int i = otvet.length(); i < 15; i++) {
//        c[i] = '#';
//        }
//        } else {
//        for (int i = 0; i < words[numElem].length(); i++) {
//        if (otvet.charAt(i) == words[numElem].charAt(i)) {
//        c[i] = otvet.charAt(i);
//        } else {
//        c[i] = '#';
//        }
//        }
//        for (int i = words[numElem].length(); i < 15; i++) {
//        c[i] = '#';
//        }
//
//
//        //////////////
//
//
//        for (int i = 0; i < input_word.length(); i++) {
//        for (int j = 0; j < words[pos].length(); j++) {
//        if (input_word.charAt(i) == words[pos].charAt(j)) {
//        System.out.print(words[pos].charAt(i));
//        }
//        }
//
//        }
//        System.out.println("###############");
