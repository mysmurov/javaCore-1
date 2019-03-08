package PrimerLessen3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main_l3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] mass = {6,4,8,1,88};
//        sortBubble(mass);
//        System.out.println(Arrays.toString(mass));
//        int a = 1 << 1;
//        System.out.println(a);

//        Scanner sc = new Scanner(System.in);
//
//
//
//
//        String str1 = sc.nextLine();
//
//        int a = Integer.parseInt(str1);
//
//
//        String srt2 = sc.next();
//
//        System.out.println(a + " " + str1 + "1" + " " + srt2);
        //System.out.println(getNumCheck("Введите число от 5 до 10", 5, 10));

       // System.out.printf("Слово %s  %.2f %c", "Java", 2.6f, 't');

//        String sql = String.format("SELECT * FROM table1 where id = %1.2s", 10.1234523423);
//        System.out.println(sql);

//        int a = random.nextInt(20) - 10;
//
//        System.out.println(a);

//        Random random = new Random();
//
//        String[] color = {"Red", "Green"};
//        int pos = random.nextInt(color.length);
//
//        System.out.println(color[pos]);

        System.out.println(Arrays.toString(getRandomNumber()));
    }

    public static int[] getRandomNumber() {
        Random random = new Random();
        int[] mass = new int[6];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(99) + 1;
        }
        return mass;
    }




//    public static int getNumCheck(String msg, int min, int max) {
//        int x;
//        do {
//            System.out.println(msg);
//            x = sc.nextInt();
//        } while ( x < min || x > max );
//        return x;
//    }


//    public static void sortBubble(int[] mass) {
//        for (int i = mass.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if(mass[j] > mass[j + 1]) {
//                    int tmp = mass[j];
//                    mass[j] = mass[j + 1];
//                    mass[j + 1] = tmp;
//                }
//            }
//        }
//    }
}
