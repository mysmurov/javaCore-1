/*Задание:

Создайте метод static int getMinFromTwo(int x, int y), который принимает два целочисленных параметра и возвращает
наименьший из них.

Создайте метод static int getMinFromFour(int x, int y, int m, int n), который принимает четыре целочисленных
параметра и возвращает наименьший из них.

При том второй метод должен использовать первый.

        Условия:

Оба метода должны принимать целочисленные параметры
Оба метода должны возвращать целочисленные параметры
Второй метод должен использовать первый
Методы не должны ничего выводить в консоль*/

package JavaMentor.apr29052019;

public class task9 {
    public static void main(String[] args) {
        int min1 = getMinFromTwo(2, 1);
        int min2 = getMinFromFour(3, 12, 14, 16);
        System.out.println("метод 1 вернул: " + min1 + ", метод 2 вернул: " + min2);


    }

    static int getMinFromTwo(int x, int y) {
        return x > y ? y : x;
    }


    static int getMinFromFour(int x, int y, int m, int n) {
        return getMinFromTwo(getMinFromTwo(x, y), getMinFromTwo(m, n));
    }

}