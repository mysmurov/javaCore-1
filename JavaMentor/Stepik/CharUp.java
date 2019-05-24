package JavaMentor.Stepik;

public class CharUp {
    public static void main(String[] args) {
        System.out.println(charExpression(32));

    }

    public static char charExpression(int a) {
        int b = '\\';
        char y = (char) (b + a);
        return y;
    }
}
