package task3;
/*Сортировка треугольников
Разработать консольную программу, выполняющую вывод треугольников в порядке убывания их площади. После добавления каждого нового треугольника программа спрашивает, хочет ли пользователь добавить ещё один. Если пользователь ответит “y” или “yes” (без учёта регистра), программа попросит ввести данные для ещё одного треугольника, в противном случае – выводит результат в консоль.

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
public class Triangle {
    double square;
    private String name;
    private double side1;
    private double side2;
    private double side3;
    private String description;

    Triangle() {
        this.name = "Empty triangle";
    }

    Triangle(String name, double side1, double side2, double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (!isTriangle(side1, side2, side3)) {
            this.description = "It isn`t triangle";
        } else {
            this.description = " ";
        }
        this.square = squareCalculation(side1, side2, side3);
    }

    private static boolean isTriangle(double side1, double side2, double side3) {
        return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1));
    }

    protected static double squareCalculation(double side1, double side2, double side3) {
        double sP = TrianglePerimeter(side1, side2, side3);
        return Math.sqrt(sP * (sP - side1) * (sP - side2) * (sP - side3));
    }

    private static double TrianglePerimeter(double side1, double side2, double side3) {
        return (side1 + side2 + side3) / 2;
    }

    @Override
    public String toString() {
        return "Triangle " + "name= " + name +
                " side1= " + side1 + " ,side2= " + side2 +
                " ,side3= " + side3 + " ,square= " + square + "|" + description;
    }
}