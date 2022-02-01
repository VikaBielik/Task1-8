package task6;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;




public class LuckyTickets {
    public static void main(String[] args) throws IOException {
    ArrayList<Integer> data = new ArrayList<>();
    String result;
    String str;
    FileReader file = new FileReader ("C:\\Users\\Vika Bielik\\IdeaProjects\\Elementery Task\\src\\task6\\input.txt");
    Scanner sc = new Scanner(file);
    str = sc.nextLine();
    char[] symbols = str.toCharArray();
    for (char symbol : symbols) {
        data.add(Character.getNumericValue(symbol));
    }
    result = (data.get(0) + data.get(1) + data.get(2) == data.get(3) + data.get(4) + data.get(5)) ? "YES" : "NO";
    FileWriter fileOut = new FileWriter("C:\\Users\\Vika Bielik\\IdeaProjects\\Elementery Task\\src\\task6\\input.txt");
    fileOut.write(result);
    fileOut.close();
}
}

/*public class isLucky {
    int isLucky(int n) {
        String s = n+"";
        int sum = 0;

        for(int i=0; i<s.length()/2; i++) {
            sum +=(s.charAt(i)-s.charAt(s.length()-1-i));
        }

        return sum==0;
    }
*/
