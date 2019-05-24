/*
 Реализуйте метод, вычисляющий факториал заданного натурального числа.

Факториал 𝑁 вычисляется как 1⋅2⋅...⋅𝑁.

Поскольку это очень быстро растущая функция, то даже для небольших 𝑁 вместимости типов int и long очень скоро не хватит.
 Поэтому будем использовать BigInteger. Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и
 обработку ввода-вывода добавит проверяющая система.
*/


package JavaMentor.Stepik;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int value) {

        BigInteger a = BigInteger.ONE;

        if(value < 0){
            System.out.println("Из отрицательного числа факториал не вычисляют.");
            return null;
        }
        if(value == 0) {
            return a;
        }
        return value == 1? BigInteger.valueOf(value): BigInteger.valueOf(value).multiply(factorial(value - 1));
    }
}


//        BigInteger a = BigInteger.ONE;
//
//        for (int i = 1; i <= value; i++) {
//            a = a.multiply(BigInteger.valueOf(i));
//        }
//        return a;