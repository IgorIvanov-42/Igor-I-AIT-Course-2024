package classWork.treeSet;

import java.util.*;

public class TreeSetInteger {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>(Arrays.asList(10, 20, 30, -80, -230, 0));

        TreeSet<Integer> numbers = new TreeSet<>(num);
        System.out.println(numbers);
        System.out.println(numbers.size());

        numbers.add(13);
        numbers.add(100500);
        System.out.println(numbers);
        System.out.println(numbers.size());

        for (Integer n : numbers) {
            System.out.print(n + " ");

        }
        System.out.println();

        System.out.println(numbers.first());
        System.out.println(numbers.last());

        System.out.println(numbers.ceiling(5));
        System.out.println(numbers.contains(5));
        System.out.println(numbers.floor(5));

        System.out.println(numbers.tailSet(5));

        System.out.println(numbers.subSet(-50,true, 30, true));



    }// end of main

}// end of class
