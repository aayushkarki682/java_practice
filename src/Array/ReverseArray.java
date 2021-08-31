package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
    public static String reverse(String a){
       StringBuilder rev = new StringBuilder(a);
       return rev.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(ReverseArray.reverse("aayush"));


    }
}
