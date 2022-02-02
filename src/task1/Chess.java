package task1;
import java.util.Scanner;
/*
    Вывести шахматную доску с заданными размерами высоты и ширины, по принципу:
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
    Программа запускается через вызов главного класса с параметрами.
    */

    public class Chess {
        private int width;
        private int height;

        Chess(int height, int width) {
            this.width = width;
            this.height = height;

        }

        static void createChessboard(Chess chessboard) {
            for (int i = 0; i < chessboard.width; i++) {
                for (int j = 0; j < chessboard.height; j++) {
                    System.out.print(((i + j) % 2 == 0) ? "*" : " ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            System.out.print("Enter chessboard width and height: ");
            Scanner sc = new Scanner(System.in);
            int w = sc.nextInt();
            int h = sc.nextInt();

            Chess chessboard = new Chess(w,h);
            Chess.createChessboard(chessboard);
        }
    }
