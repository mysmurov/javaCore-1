//Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
//        Допустимая погрешность – 0.0001 (1E-4)

package JavaMentor.Stepik;

public class SumABC {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
        System.out.println(0b1100100);

    }

    public static boolean doubleExpression(double a, double b, double c) {

        return Math.abs((a + b) - c) < 1e-4;
    }
}

