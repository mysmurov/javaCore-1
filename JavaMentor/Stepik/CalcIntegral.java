package JavaMentor.Stepik;

import java.util.function.DoubleUnaryOperator;

public class CalcIntegral {

//метод левых прямоугольников

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double s = 0;
        double x = 1e-6;
        double n = (b - a) / x;

//        while (a < b){
//            s += f.applyAsDouble(a += x)*x;


        for (; a < b; a += x) {
            s += f.applyAsDouble(a) * x;
        }
        return (int)s;
    }
}
