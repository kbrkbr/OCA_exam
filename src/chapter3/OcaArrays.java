package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OcaArrays {

    public static void perfomSOmething(LocalDate start, LocalDate end, Period period) {


        while (start.isBefore(end)) {
            System.out.println(start);
            start = start.plus(period);
        }

    }

    public static void main(String[] args) {

        int[] numbers = new int[3];
        int[] numbers2 = new int[]{1, 2};
        int[] numbers3 = {1, 2, 3, 4};

        System.out.println(numbers2[1]);

        String[] strings = {"bla", "blub", "blob"};

        System.out.println(java.util.Arrays.toString(strings));
        System.out.println(strings.length);

        // sorting
        Arrays.sort(strings);
        System.out.println(java.util.Arrays.toString(strings));

        for (int i = 0; i < strings.length; ++i) {
            System.out.println(strings[i]);
        }

        for (String s : strings) {
            System.out.println(s);
        }

        // searching, only possible in sorted arrays
        int[] numbers4 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.binarySearch(numbers4, 5));
        // return value: found ? index of match : index where it should be + 1 *
        // -1

        // varargs
        // String... x;

        // Multi D Arrays
        int[][] array1 = new int[2][];
        array1[0] = new int[2];
        array1[1] = new int[44];

        for (int[] outer : array1) {
            for (int inner : outer) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }

        // Arraylist
        ArrayList<String> listi = new ArrayList<String>();

        listi.add("blub");
        listi.add("blob");

        System.out.println(Arrays.toString(listi.toArray()));

        listi.set(0, "hello");

        System.out.println(Arrays.toString(listi.toArray()));

        // Wrapper classes
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        // Autoboxing
        List<String> listi0 = new ArrayList<String>();
        String[] strArray = listi0.toArray(new String[listi0.size()]);

        // asList returns a fixed size list, no structural operations allowed
        List<String> fixedSizeList = Arrays.asList(strArray);

        // Sorting
        List<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(99);
        numbers1.add(59);
        numbers1.add(999);
        numbers1.add(919);

        Collections.sort(numbers1);
        System.out.println(numbers1);

        System.out.println("-----------------------------------------");

        // Date and time
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        // !private constructors!
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().plusMonths(2);

        LocalDateTime datetime1 = LocalDateTime.now();
        System.out.println(datetime1);

        // date and time classes immutable!
        date1 = date1.plusMonths(1);
        // plusYears, plusMonths, ..., minusWeeks, ...
        System.out.println("-------------------");
        Period p1 = Period.ofDays(2);
        perfomSOmething(date1, date2, p1);
        System.out.println();
        System.out.println(date1);

        System.out.println("-------------------");

        // formatting
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println(datetime1.format(DateTimeFormatter.ofPattern("yyyy_MM_dd // hh:mm")));

        StringBuilder sb1 = new StringBuilder();
        String ccc = "";
        ccc += false;

        String java = "";

        char[] c = new char[2];

        ArrayList bb = new ArrayList();


    }
}
