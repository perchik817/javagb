package seminars.hw003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqNums {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 3, 4, 4, 5};
        Set<Integer> uniqueNums = Arrays.stream(a).boxed().collect(Collectors.toSet());
        System.out.println(uniqueNums);
        //second variant
        int[] result = getUniqueElements(a);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getUniqueElements(int[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

}
