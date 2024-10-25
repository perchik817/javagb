package seminars.hw003;

import java.util.ArrayList;
import java.util.List;

public class DelNegativeNums {
    public static void main(String[] args) {
        int[] a = new int[]{-1, 2, -3, 4, -5, 6};
        List<Integer> filteredList = new ArrayList<>();
//        for (int i = 0; i < a.length / 2 + 1; i++) {
//            if (a[i] >= 0) filteredList.add(a[i]);
//            else if (a[a.length - 1 - i] >= 0 && i != a.length - 1 - i) filteredList.add(a[a.length - 1 - i]);
//        }
        for (int num : a) {
            if (num >= 0) filteredList.add(num);
        }

        for (int i = 0; i < filteredList.size(); i++) {
            System.out.print(filteredList.get(i));
            if (i < filteredList.size() - 1) System.out.print(", ");
        }
    }
}
