package task3;
import java.util.Comparator;

public class TriangleSquareComparator implements Comparator<Triangle> {
/*объекты Triangle можно было сравнить и сортировать,
 они должны применять интерфейс Comparable<Triangle>

 */
    @Override
    public int compare(Triangle o1, Triangle o2) {

        int i;
        if (o1.square > o2.square) i = -1;
        else i = o1.square == o2.square ? 0 : 1;
        return i;
    }
}
