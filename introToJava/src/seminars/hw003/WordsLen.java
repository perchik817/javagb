package seminars.hw003;

import java.util.Arrays;

public class WordsLen {
    public static void main(String[] args) {
        String[] arr = {"cat", "elephant", "dog", "giraffe"};
        String[] result = Arrays.stream(arr)
                .filter(el -> el.length() > 3)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(result));
    }
}
