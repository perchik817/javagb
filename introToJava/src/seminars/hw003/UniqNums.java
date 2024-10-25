package seminars.hw003;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqNums {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 3, 4, 4, 5};
        Set<Integer> uniqueNums = Arrays.stream(a).boxed().collect(Collectors.toSet());
        System.out.println(uniqueNums);
    }
}
