package seminars.hw003;

import java.util.Arrays;

public class ElsAvg {
    public static void main(String[] args) {
        int[] a = {4, 2, 7, 5, 1};
        int avg = (int) Math.round((double) Arrays.stream(a).sum() / a.length);
        System.out.println(avg);
    }
}
