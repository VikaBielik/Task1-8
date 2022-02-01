package task8;

import java.util.Scanner;

/* Программа позволяет вывести все числа Фибоначчи,
которые находятся в указанном диапазоне. Диапазон
задаётся двумя аргументами при вызове главного класса.
Числа выводятся через запятую по возрастанию.
 */
    public class Main {
        public static void main(String[] args){
            int number, x = 0, y = 0, z = 1;
            Scanner scanner = new Scanner(System.in );

            System.out.print("Enter number of values: ");
            number = Integer.parseInt(scanner.nextLine());


            for(int i = 0; i <= number; i++){
                x = y;
                y = z;
                z = x + y;

                System.out.print(x+", ");
            }
        }
    }

