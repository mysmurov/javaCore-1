package lesson_3;

import java.util.Scanner;

public class Calc {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String calc = scan.nextLine();
        if (calc.contains("+")) {
            String[] calcMass = calc.split(" ");
            System.out.println("Результат = " + add(calcMass));
        } else if (calc.contains("-")) {
            String[] calcMass = calc.split(" ");
            System.out.println("Результат = " + sub(calcMass));
        } else if (calc.contains("*")) {
            String[] calcMass = calc.split(" ");
            System.out.println("Результат = " + mul(calcMass));
        } else if (calc.contains("/")) {
            String[] calcMass = calc.split(" ");
            System.out.println("Результат = " + div(calcMass));
        } else {
            System.out.println("Такой операции нет");
        }
    }


    private static int add(String... arr) {
        int sumNum = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals("+")) {
                sumNum += Integer.parseInt(arr[i]);
            }
        }
        return sumNum;
    }

    private static int sub(String... arr) {
        int diffNum = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals("-")) {
                diffNum -= Integer.parseInt(arr[i]);
            }
        }
        return diffNum;
    }

    private static long mul(String... arr) {
        long prodNum = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals("*")) {
                prodNum *= Integer.parseInt(arr[i]);
            }
        }
        return prodNum;
    }

    private static float div(String... arr) {
        float divNum = Float.parseFloat(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals("/")) {
                divNum /= Float.parseFloat(arr[i]);
            }
        }
        return divNum;
    }

}


