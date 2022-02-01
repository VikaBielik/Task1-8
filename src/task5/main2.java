package task5;

import java.util.InputMismatchException;
import java.util.Scanner;


public class main2 {

    public static void main(String[] args) {
        long number;// введенное число

        Scanner in = new Scanner(System.in);
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                try {
                    number = Long.parseLong(args[i]);
                    System.out.println(NumberToText.WordsRus(number));
                } catch (InputMismatchException e) {
                    System.out.println("Не корректный ввод");
                }
            }
            System.out.println("Были переданны все параметры");
        } else {
            do {
                System.out.print("Введите целое число в диапазоне -999 999 999 999 до 999 999 999 999, для выхода введите 0: ");
                while (!in.hasNextDouble()) {
                    System.out.println("Вы ввели не число или дробь!");
                    in.next(); // this is important!
                }
                number = (long) in.nextDouble();
                System.out.println(NumberToText.WordsRus(number));

            } while (number != 0);
            System.out.println("Введено число /Ноль/ ");
        }
        System.out.println("Работа программы завершена");
    }
}
