/*https://metanit.com/java/tutorial/3.1.php
        https://www.youtube.com/watch?v=ftDWs7ICBCw&list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX&index=4
        Задание:

        Создайте класс Human, содержащий поля String name и int age. У класса Human должен быть метод void sayHello(),
        который выводит в консоль, “Привет, меня зовут {name}, мне {age} лет.”. В методе main создайте объект класса
        Human, заполните его поля и вызовите метод sayHello().

        Условия:

        Класс Human должен иметь поля String name и int age
        Метод sayHello() не должен ничего возвращать
        В методе main должен быть создан объект класса Human
        Поля объекта должны быть заполнены
        У объекта класса human должен быть вызван метод sayHello()*/

package JavaMentor.apr29052019;

public class Human {

    String name;
    int age;

    void sayHello() {
        System.out.print("Привет, меня зовут" + name + ", мне " + age + "лет.");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}