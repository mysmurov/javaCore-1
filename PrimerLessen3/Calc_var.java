package PrimerLessen3;

import java.util.Scanner;

public class Calc_var {
    static private Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        consoleCalculator();
    }

    private static void consoleCalculator() {

        String WRONGNUMBER = "Некорректное число - ";
        int result = 0;
        System.out.println("Введите выражение для вычисления");

        String[] line = in.nextLine().split(" ");

        if (line.length < 3 || wrongNumber(line[line.length - 1])) {
            System.out.println("Выражение некорректно");
            return;
        }

        switch (line[1]) {
            case "+":
                for (int i = 0; i < line.length; i += 2) {
                    if (wrongNumber(line[i])) {
                        System.out.println(WRONGNUMBER + line[i]);
                        return;
                    } else {
                        result += Integer.parseInt(line[i]);
                    }

                }
                break;
            case "-":
                if (wrongNumber(line[0])) {
                    System.out.println(WRONGNUMBER + line[0]);
                    return;
                }
                result = Integer.parseInt(line[0]);
                for (int i = 2; i < line.length; i += 2) {
                    if (wrongNumber(line[i])) {
                        System.out.println(WRONGNUMBER + line[i]);
                        return;
                    } else {
                        result -= Integer.parseInt(line[i]);
                    }

                }
                break;
            case "*":
                result = 1;
                for (int i = 0; i < line.length; i += 2) {
                    if (wrongNumber(line[i])) {
                        System.out.println(WRONGNUMBER + line[i]);
                        return;
                    } else {
                        result *= Integer.parseInt(line[i]);
                    }

                }
                break;

            case "/":
                if (wrongNumber(line[0])) {
                    System.out.println(WRONGNUMBER + line[0]);
                    return;
                }
                result = Integer.parseInt(line[0]);
                for (int i = 2; i < line.length; i += 2) {
                    if (wrongNumber(line[i]) || line[i].equals("0")) {
                        if (line[i].equals("0")) {
                            System.out.println("Деление на нуль");
                        } else {
                            System.out.println(WRONGNUMBER + line[i]);
                        }
                        return;
                    } else {
                        result /= Integer.parseInt(line[i]);
                    }

                }
                break;

            default:
                System.out.println("Некорректный знак операции - " + line[1]);

        } // switch
        System.out.println("Результат: " + result);

    }


    private static boolean wrongNumber(String s) {
        boolean res = false;
        boolean flgZnak = false;

        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            flgZnak = true;
        }

        for (int i = (flgZnak == true) ? 1 : 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                res = true;
                break;
            }

        }
        return res;
    }
}
