package JavaMentor.Stepik.Task_531_3;

import java.util.function.DoubleUnaryOperator;

public class CalcIntegral_531 {

//метод левых прямоугольников

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double s = 0;
        double x = 1e-6;

        while (a < b){
            s += f.applyAsDouble(a += x)*x;

            // вариант через  for

//        for (; a < b; a += x) {
//            s += f.applyAsDouble(a) * x;
        }
        return s;
    }
}
