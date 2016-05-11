package chapter3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArraysOca {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        int[] numbers2 = new int[] {1,2};
        int[] numbers3 = {1,2,3,4};

        System.out.println(numbers2[1]);


        String[] strings = {"bla", "blub", "blob"};
        
        System.out.println(java.util.Arrays.toString(strings));
        System.out.println(strings.length);

        // sorting
        Arrays.sort(strings);
        System.out.println(java.util.Arrays.toString(strings));

        for(int i = 0; i < strings.length; ++i) {
            System.out.println(strings[i]);
        }

        for(String s : strings) {
            System.out.println(s);
        }

        // searching, only possible in sorted arrays
        int[] numbers4 = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.binarySearch(numbers4, 5));
        // return value: found ? index of match : index where it should be + 1 * -1


        // varargs
        // String... x;

        // Multi D Arrays
        int[][] array1 = new int[2][];
        array1[0] = new int[2];
        array1[1] = new int[44];

        for(int[] outer : array1) {
            for(int inner : outer) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }


        // Arraylist
        ArrayList listi0 = new ArrayList();
        List<String> listi = new ArrayList<>();

        
    }
}
