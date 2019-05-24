package JavaMentor.apr29052019;

import java.util.Arrays;

import JavaMentor.apr29052019.Human;

public class test2 {
    public static void main(String[] args) {

        Human a = new Human();
        Human b = new Human();
        Human c = new Human();

        a.age = 1;
        b.age = 2;
        c.age = 3;

        Human[] mass = new Human[]{a, b, c };

        for (Human i : mass) {
//            System.out.println(i);
//            i = new Human();
            i.age = 30;
        }
        System.out.println(Arrays.toString(mass));
    }
}