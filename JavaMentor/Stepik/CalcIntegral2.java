package JavaMentor.Stepik;

import java.util.function.DoubleUnaryOperator;

import static JavaMentor.Stepik.CalcIntegral.integrate;

public class CalcIntegral2 {

//метод левых прямоугольников

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        double result = 0;
        double h = 1e-6;
        double n = (b - a) / h;

        while (a < b){
            a += h;
            result += f.applyAsDouble(a) * h;
        }
        return result;
    }
}
