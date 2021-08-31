package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class KthSmallest {
    public static void main(String[] args){
        int[] arr = {33,2,1,55,2};
        Arrays.sort(arr);
        System.out.println(arr[2]);

        //The Below solution also works
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        Collections.sort(list);
         for (int a : list){
        System.out.println(a);
         }
        System.out.println(list.get(2));


    }
}
