import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

    public static List<Integer> findModeNestedLoops(List<Integer> l) {
        List<Integer> dups = new ArrayList<Integer>();

        for (int i = 0; i < l.size(); i++) {
            int num = l.get(i);
            boolean duplicate = false;

            for (int j = i + 1; j < l.size(); j++) {
                if (num == l.get(j)) {
                    duplicate = true;
                    break;
                }
            }

            if ((duplicate == true) && (dups.contains(num) == false)) {
                dups.add(num);
            }
        }
        return dups;
    }

    public static void main(String[] args) {
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findModeNestedLoops(sample1));
        System.out.println("Sample 2: " + findModeNestedLoops(sample2));
        System.out.println("Sample 3: " + findModeNestedLoops(sample3));
        System.out.println("Sample 4: " + findModeNestedLoops(sample4));
    }

}
