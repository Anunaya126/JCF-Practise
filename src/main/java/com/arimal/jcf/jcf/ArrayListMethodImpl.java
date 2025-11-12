package com.arimal.jcf.jcf;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListMethodImpl {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();
        Object cloneNumList;

        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);

        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("c");
        strList.add("a");
        strList.add("d");
        strList.add("a");
        strList.add("f");

        System.out.println(numList);

        // Clone an arrayList to object
        cloneNumList = numList.clone();
        System.out.println(cloneNumList);

        // .forEach examples in ArrayList
        // Printing elements using for each
        numList.forEach(System.out::print);
        System.out.println();

        // Using foreach to find the sum of the list elements
        int[] sum = {0};

        numList.forEach(n -> sum[0] += n);
        for(int n : sum){
            System.out.println("The sum of numlist elements are: "+n);
        }

        // Applying squares
        System.out.println("Squares values of numList elements");
        numList.forEach(n -> System.out.print(n*n+" "));
        System.out.println();

        // Collect all even numbers from the list
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        numList.forEach(n -> {if(n%2 == 0) evenList.add(n);});
        numList.forEach(n -> {if(n%2 != 0) oddList.add(n);});
        System.out.println(evenList);
        System.out.println(oddList);


        // hello method
        strList.forEach(n -> System.out.println("Hello "+ n));

        // Counting number of "a" in str list
        int[] count = {0};
        strList.forEach(str -> {if(str == "a") count[0] += 1 ;});
        System.out.println(strList);

        for(int i : count) {
            System.out.println("The count of a in strList is = " + i);
        }

        //Using removeIf() method on strList
        strList.removeIf(str-> str == "a");
        System.out.println(strList);

        // Create a sublist
        Object sublist;
        sublist = strList.subList(0,3);
        System.out.println(sublist);

        // ListIterator will be returned hence we can use the ListIterator methods
        ListIterator it = numList.listIterator();

        // Here we are traversing front and back using list iterator method
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        while(it.hasPrevious()){
            System.out.print(it.previous()+ " ");
        }
    }
}
