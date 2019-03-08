package PrimerLessen3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class hw1 {
    static Scanner scn2 = new Scanner(System.in);

    public static void main(String[] args) {
            int res = readString();
    }

    private static int readString() {
        while (true)
        {
            try
            {
                return scn2.nextInt();
            }
            catch (InputMismatchException e)
            {
                scn2.next();
                System.out.print("Не число: ");
            }
        }
    }
}