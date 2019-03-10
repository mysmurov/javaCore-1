package ConsoleCalc;

import java.util.Scanner;

public class Calc {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите выражение");

        String calc = scan.nextLine();
        if (calc.contains("+")) {
            String[] calcMass = calc.split(" ");
            //System.out.println("получен массив" + Arrays.asList(calcMass));//только для проверки, выводим calcMass
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
            System.out.println("Такой операции нет, используйте только: +, -, /, *");
        }
    }


    private static int add(String... arr) {
        int sumNum = 0;
        try {
            sumNum = Integer.parseInt(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                if (!arr[i].equals("+")) {
                    sumNum += Integer.parseInt(arr[i]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка в выражении");
            System.exit(-1);

        }

        return sumNum;
    }




        private static int sub (String...arr){
                    int diffNum = 0;
                    try {
                        diffNum = Integer.parseInt(arr[0]);
                        for (int i = 1; i < arr.length; i++) {
                            if (!arr[i].equals("-")) {
                                diffNum -= Integer.parseInt(arr[i]);
                            }
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка в выражении");
                        System.exit(-1);

                    }
            return diffNum;
        }

        private static long mul (String...arr){
            long prodNum = 0;
            try{
            prodNum = Integer.parseInt(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                if (!arr[i].equals("*")) {
                    prodNum *= Integer.parseInt(arr[i]);}
            }
        } catch (NumberFormatException e) {
        System.out.println("Ошибка в выражении");
        System.exit(-1);

    }
            return (int) prodNum;
        }

        private static float div (String...arr){
            float divNum = 0;
            try{
            divNum = Float.parseFloat(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                if (!arr[i].equals("/")) {
                    divNum /= Float.parseFloat(arr[i]);}
            }
        } catch (NumberFormatException e) {
        System.out.println("Ошибка в выражении");
        System.exit(-1);

        }
            return (int) divNum;
        }

    }
