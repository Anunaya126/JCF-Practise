package com.arimal.jcf.jcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ListMethodImpl {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        List<String> strList = new ArrayList<>();
        List<Integer> addToNumList = new ArrayList<>();

        addToNumList.add(10);
        addToNumList.add(11);
        addToNumList.add(12);

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
        strList.add("d");
        strList.add("e");
        strList.add("f");

        System.out.println(numList);
        System.out.println(strList);

        // adding to an index
        numList.add(0,0);
        System.out.println(numList);

        // .addAll to list

        numList.addAll(4,addToNumList);
        System.out.println(numList);

        System.out.println(numList.size());

        // .clear() remove all elements of a list
        System.out.println(addToNumList);
        addToNumList.clear();
        System.out.println(addToNumList);

        // .remove from index
        numList.remove(4);
        System.out.println(numList);

        //.remove vvalue from numlist
        numList.remove(Integer.valueOf(11));
        numList.remove(Integer.valueOf(12));

        System.out.println(numList);

        // Accessing elements using .get method
        System.out.println(strList.get(3));

        // Update an item using .set() method
        numList.set(4,30);
        System.out.println(numList);

        // get index of
        System.out.println(numList.indexOf(30));

        //get hash code
        System.out.println(strList.hashCode());
        System.out.println(numList.hashCode());

        // check if two list are equal
        System.out.println(numList.equals(strList));

        // check if a list is empty
        System.out.println(numList.isEmpty());
        System.out.println(addToNumList.isEmpty());

        for(int i: numList){
            addToNumList.add(i);
        }

        System.out.println(addToNumList);
        System.out.println(numList.equals(addToNumList));

        // sort a list
        numList.sort(null);
        System.out.println(numList);

        // reverse sort list
        System.out.println(strList);
        strList.sort(Comparator.reverseOrder());
        System.out.println(strList);

        // check if contains
        System.out.println(numList.contains(30));
        System.out.println(numList.contains(31));
        System.out.println(numList.containsAll(addToNumList));
    }
}
