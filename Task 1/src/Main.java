import java.util.Scanner;
public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        print();
        a = inputDouble();
        b = inputDouble();

        sum();      //Метод суммирования чисел
        multiply(); //Метод умножения чисел
        diff();     //Метод вычитания чисел
        divide();   //Метод деления чисел
    }

    private static void print() {

        System.out.println("Введите два числа: ");
    }

    private static void divide() {
        System.out.println("Деление:\n"  + a + " / " + b + " = " + (a / b));
    }

    private static void diff() {

        System.out.println("Вычитание:\n" + a + " - " + b + " = " + (a - b));
    }

    private static void multiply() {
        System.out.println("Умножение:\n" + a + " * " + b + " = " + (a * b));
    }

    private static void sum() {
        System.out.println("Сложение:\n" + a + " + " + b + " = " + (a + b));
    }

    private static double inputDouble() {
        return new Scanner(System.in).nextDouble();

    }
}
