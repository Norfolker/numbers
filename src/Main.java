import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sortList = new ArrayList<>();
        intList.sort(Comparator.naturalOrder());
        for (Integer i : intList) {
            if (i % 2 == 0 && i > 0) {
                sortList.add(i);
            }
        }
        System.out.println(sortList);
    }
}
