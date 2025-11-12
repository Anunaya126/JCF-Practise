package com.arimal.jcf.jcf;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethodImpl {

    public static void main(String[] args) {

        Collection<Integer> numList = new ArrayList<>();

        // Adding operations

        // .add() method will add a single element to the list
        numList.add(1);
        numList.add(2);

        Collection<Integer> addToNumList = new ArrayList<>();
        Collection<Integer> removeFromNumList = new ArrayList<>();

        addToNumList.add(9);
        addToNumList.add(3);
        addToNumList.add(4);
        removeFromNumList.add(3);
        removeFromNumList.add(4);

        // .addAll() method adds another collection to the collection
        numList.addAll(addToNumList);

        System.out.println(numList);

        // .remove() method removes a single element from the list
        numList.remove(2);

        System.out.println(numList);

        //.removeAll() will remove a collection from the list

        numList.removeAll(removeFromNumList);
        System.out.println(numList);

        // .clear() method flushes the all the elements from the list
        removeFromNumList.clear();
        System.out.println(removeFromNumList); // returns empty list

        // .contains() checks if an element is present in a list

        System.out.println(numList.contains(1));
        System.out.println(numList.contains(3));

        numList.addAll(addToNumList);

        // .containsAll() method checks if a collection is present in the list

        removeFromNumList.add(123);

        System.out.println(numList.containsAll(addToNumList));
        System.out.println(numList.containsAll(removeFromNumList));

        System.out.println(numList);

        // .retainAll() method retains the elements of passed collection, removes everything else
        numList.retainAll(addToNumList);
        System.out.println(numList);

        // .removeIf lets you pass a condition
        numList.removeIf(num -> num>5);
        System.out.println(numList);


        // .size() method will give the length or size of the list, returns int
        System.out.println(numList.size());

        // .isEmpty checks if list is empty

        System.out.println(numList.isEmpty());
        removeFromNumList.clear();
        System.out.println(removeFromNumList.isEmpty());

        // .iterator returns iterator object

        Iterator<Integer> itList = addToNumList.iterator();

        while(itList.hasNext()){
            System.out.print(itList.next() + " ");
        }
        System.out.println();

        // .stream returns a series stream

        addToNumList.stream().forEach(num -> System.out.println(num));

        System.out.println("===========");

        // .parallelStream() will allow streaming without any sequence
        addToNumList.parallelStream().forEach(num-> System.out.println(num));

        numList.toArray();
        System.out.println(numList.getClass());
        

        System.out.println(numList.equals(addToNumList));

        numList.clear();
        System.out.println(numList.equals(removeFromNumList));



    }

}
