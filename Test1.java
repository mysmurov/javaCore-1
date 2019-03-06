import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);


        int age = -1;
        while (true) {
            System.out.println("Возраст?");
            // вводим строку
            String line = myScanner.nextLine();
            try {
                // пробуем сконсертировать в число
                age = Integer.parseInt(line);
                // если не получится, мы вылетим в catch
                // проверяем значение
                if (age > 150)
                    System.out.println("Больше 150 не бывает!");
                else
                    break; // всё хорошо, завершаем цикл ввода
            } catch (NumberFormatException e) {
                // если введено не число, мы окажемся тут
                System.out.println("Это вообще не число");
            }
        }
    }
}

