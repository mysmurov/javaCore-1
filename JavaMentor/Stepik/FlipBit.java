package JavaMentor.Stepik;

import static java.lang.Integer.toBinaryString;

public class FlipBit {
    public static void main(String[] args) {

        System.out.println(flipBit(0, 5));
    }

    public static int flipBit(int value, int bitIndex) {
        int bit = value^(1<<bitIndex - 1);
        return bit;
    }
}
