import java.util.Scanner;

public class Main {
    static boolean isEven = true;
    static int num = 0;
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        UserNum();
    }

    public static void UserNum() {
        System.out.println("Введите число");
        num = new Scanner(System.in).nextInt();
        Even();

    }

    public static void Even() {
        if(num%2 == 0) {
            System.out.println(isEven);
        } else {
            System.out.println(!isEven);
        }
    }
}
