package lesson_1;

public class MainClass {
    public static void main(String[] args) {
     /*   System.out.println("Hello world!");
        System.out.println("Hello world!");

        System.out.print("Hello world!"); */

//        System.out.print("Hello world!");
//        System.out.print("Hello world!");
//        System.out.print("Hello world!");

//        byte b1 = 10; // -128 127
////
//////        b1 = b1 + 1;
//////        b1 += 1;
////
////        short s1 = 32000; // -32k 32k
////        int i1 = 20000000; // -2,1kkk 2,1kkk
////        long l1 = 12323423423423423L;
////
////        float f1 = 120.1f;
////        double d1 = 510.5;
////
////        boolean bool1 = true;
////        char c1 = 'a';
////
////        // ссылкой
////        String str = "Hello world";

//        int a = 10;
//        int b = 50;
//        if (a == 10) {
//
//            System.out.println("равно 10");
//
//        } else if(a > 10) {
//            b = 20;
//            System.out.println("больше");
//
//        } else if(a < 10) {
//
//            System.out.println("меньше");
//
//        } else {
//
//            System.out.println("Не известно!");
//
//        }

       //printMessage();


        //System.out.println(sumTwoNumbers(2,3));

//        printMessage(19);
//        int a = 20;
//        String b = "myNumber = ";
//        a *= a;


        //System.out.println(10 + 10 + " number " + 10 + 10);

//        int b = 10;
//
//        short c = (short) b;
//
//        System.out.println(c);
//        int a = 10;
//
//        boolean res = a == 10 ? true : false;
//
//        System.out.println(a == 10 ? "равно 10" : " ");
//
//        boolean res1;
//
//        if(a == 10) {
//            res1 = true;
//        } else {
//            res1 = false;
//        }
//
//        System.out.println(res);

        int res = 1 << 2;

        res++;

        System.out.println(res);

    }

    public static void printMessage(int years) {

        if (years < 18 || true) {
            System.out.println("Вы еще не доросли");
            return;
        }

        String str = "asd";

        System.out.println("Нехорошее слово!");
    }

    public static int sumTwoNumbers(short a, int b) {

        if (a > 10) {
            return a + b;
        } else if (b < 5) {
            return a - b;
        }

        return -1;
    }
}
