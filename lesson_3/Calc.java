package lesson_3;

import java.util.Scanner;

public class Calc {

    static private Scanner in = new Scanner(System.in);

    private static void consoleCalc() {

        String[] line = in.nextLine().split(" ");

        switch (line[1]) {
            case "+":
                int count1 = Integer.parseInt(line[0]);
                int count2 = Integer.parseInt(line[2]);
                System.out.println(count1 + count2);
        }

    }

    public static void main(String[] args) {
        consoleCalc();
    }
}
