package task2;
import java.util.Scanner;

/*Анализ конвертов
Есть два конверта со сторонами (a,b) и (c,d) определить, можно ли один конверт вложить в другой. Программа должна
обрабатывать ввод чисел с плавающей точкой. Программа спрашивает у пользователя размеры конвертов по одному
параметру за раз. После каждого подсчёта программа спрашивает у пользователя хочет ли он продолжить.
Если пользователь ответит “y” или “yes” (без учёта регистра), программа продолжает работу сначала,
в противном случае – завершает выполнение.*/
public class Main {
    private static int switcher = 0;

    public static void main(String[] args) {
        System.out.println();
        nameEnvelope();
    }

    public static double a, b, c, d;

    public static double getSides() {
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();
        return side;
    }

    public static void nameEnvelope() {
        while (askUser()) {
            System.out.println("Length of side 'a':");
            double a = getSides();
            System.out.println("Length of side 'b':");
            double b = getSides();

            Envelope envelope1 = new Envelope(a, b);

            System.out.println("Length of side 'c':");
            double c = getSides();
            System.out.println("Length of side 'd':");
            double d = getSides();

            Envelope envelope2 = new Envelope(c, d);

            ifEnvelope(envelope1, envelope2);
        }
    }

    public static void ifEnvelope(Envelope envelope1, Envelope envelope2) {
        double a = envelope1.
                getSide1();
        double b = envelope1.getSide2();
        double c = envelope2.getSide1();
        double d = envelope2.getSide2();
        if (a < c && b < d || c < a && d < b) {
            System.out.println("You can put one envelope in another!");
        } else {
            System.out.println("You can't put one envelope in another");
        }
    }

    public static boolean askUser() {
        if (switcher > 0) {
            Scanner in = new Scanner(System.in);
            System.out.println("Do yo want to continue counting? " +
                    "Enter 'yes' if you want to continue counting, enter 'no' if not.");
            String ans = in.nextLine();
            boolean y = ans.equalsIgnoreCase("y");
            boolean yes = ans.equalsIgnoreCase("yes");
            if (y) {
                return true;
            }
            return false;
        } else {
            switcher++;
            return true;
        }
    }
}


