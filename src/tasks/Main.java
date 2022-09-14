package tasks;

import jdk.jfr.StackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        getHello();
        getName();
        getNumber(getArrays(7));
        /*
        Задание 4
        Скобочная последовательность является правильной, если каждой
        открывающейся скобке есть закрывающая скобка того же вида.
        В данном задании указана неправильная скобочная последовательность
        Неправильная последовательность:
        [((())()(())]]
        Правильная последовательность:
        [[(())()(())]]
         */
    }

    // Задание 1
    public static void getHello() {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        try {
            int control = scanner.nextInt();
            if (control > 7) {
                System.out.println("Привет");
                System.out.println("---------------");
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число!");
        }
    }

    // Задание 2
    public static void getName() {
        System.out.println("Введите имя:");
        Scanner scanner = new Scanner(System.in);
        String control = scanner.nextLine();
        if (control.toLowerCase().equals("Вячеслав".toLowerCase())) {
            System.out.println("Привет, Вячеслав");
            System.out.println("---------------");
        } else {
            System.out.println("Нет такого имени");
            System.out.println("---------------");
        }
    }

    // Задание 3
    public static void getNumber(int[] a) {
        int b;
        System.out.println("Элементы массива кратные 3:");
        for (int i = 0; i < a.length; i++) {
            b = a[i];
            if (b % 3 == 0) {
                System.out.println(b);
            }
        }
        System.out.println("---------------");
    }

    public static int[] getArrays(int x) {
        int[] number = new int[x];
        System.out.println("Введите поочередно " + x + " чисел:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number.length; i++) {
            int control = scanner.nextInt();
            number[i] = control;
        }
        return number;
    }


}
