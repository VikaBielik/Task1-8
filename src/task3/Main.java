package task3;
import java.util.ArrayList;
import java.util.Scanner;
/*Разработать консольную программу, выполняющую вывод треугольников в порядке убывания их площади.
 После добавления каждого нового треугольника программа спрашивает,
 хочет ли пользователь добавить ещё один. Если пользователь ответит “y” или “yes”
 (без учёта регистра), программа попросит ввести данные для ещё одного треугольника,
  в противном случае – выводит результат в консоль.

•	Расчёт площади треугольника должен производится по формуле Герона.
•	Каждый треугольник определяется именем и длинами его сторон.
Формат ввода (разделитель - запятая):
<имя>, <длина стороны>, <длина стороны>, <длина стороны>
•	Приложение должно обрабатывать ввод чисел с плавающей точкой.
•	Ввод должен быть нечувствителен к регистру, пробелам, табам.
•	Вывод данных должен быть следующем примере:
============= Triangles list: ===============
1. [Triangle first]: 17.23 сm
2. [Triangle 22]: 13 cm
3. [Triangle 1]: 1.5 cm
 */

    public class Main {

        public static void main(String[] args) throws Exception {

            Scanner in = new Scanner(System.in);
            ArrayList<Triangle> triangleList = new ArrayList<>();
            String answer = "yes";

            do {
                System.out.println("Enter the triangle:\n" +
                        "<name>, <side1>, <side2>, <side3>");
                triangleList.add(triangleCreator(input()));
                System.out.println("Do you want to input one more triangle?(y/yes)");
                answer = in.nextLine();
            } while ((answer.compareToIgnoreCase("y") == 0) | (answer.compareToIgnoreCase("yes") == 0));

            triangleList.sort(new TriangleSquareComparator());

            for (Triangle triangle : triangleList) System.out.println(triangle.toString());

        }

        private static String[] input() {
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();

            String[] strings;
            strings = line.split(","); //Метод split разделяет строку на подстроки,
            // используя разделитель,
            // который определяется с помощью регулярного выражения.

            return strings;
        }

      private static Triangle triangleCreator(String[] strings) {

            Triangle tr = new Triangle();
            try {
                tr = new Triangle(strings[0], Double.parseDouble(strings[1]),
                        //Метод parseDouble() используется для инициализации STRING
                        // возвращаемое значение имеет тип примитивных данных
                        Double.parseDouble(strings[2]), Double.parseDouble(strings[3]));
                return tr;
            } catch (ArrayIndexOutOfBoundsException e) {
                // если пользователь обратиться к элементу массива по отрицательному
                // или превышающему размер массива индексу
                System.out.println("Not all fields were filled");
            } catch (NumberFormatException e) { //eсли пользователь введет некорректные числовые данные
                System.out.println("Input wrong");
            }
            return tr;
        }
    }
