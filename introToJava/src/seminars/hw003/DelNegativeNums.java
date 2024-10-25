package seminars.hw003;

import java.util.ArrayList;
import java.util.List;

public class DelNegativeNums {
    public static void main(String[] args) {
        int[] a = new int[]{-1, 2, -3, 4, -5, 6};
        List<Integer> positiveNums = delNegativeNums(a);
        printList(positiveNums);
    }
    public static List<Integer> delNegativeNums(int[] nums) {
        List<Integer> filteredList = new ArrayList<>();

//        for (int i = 0; i < a.length / 2 + 1; i++) {
//            if (a[i] >= 0) filteredList.add(a[i]);
//            else if (a[a.length - 1 - i] >= 0 && i != a.length - 1 - i) filteredList.add(a[a.length - 1 - i]);
//        }
        for (int num : nums) {
            if (num >= 0) filteredList.add(num);
        }
        return filteredList;
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(", ");
        }
    }
}
