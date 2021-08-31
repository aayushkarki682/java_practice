package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println(max);
        System.out.println(min);
    }
}
