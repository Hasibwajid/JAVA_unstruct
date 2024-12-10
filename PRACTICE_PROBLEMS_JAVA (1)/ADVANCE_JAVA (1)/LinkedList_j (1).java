package ADVANCE_JAVA;

import java.util.*;

public class LinkedList_j {
    public static void main(String[] args) {
       LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        LinkedList<Integer> l3=new LinkedList<>();

        l1.add(6);
        l1.add(7);
        l1.add(6);
        l1.add(4);
        l1.addLast(4444);
        l1.addFirst(11111);
        l1.add(0,3);
        l1.add(0,3);

        l2.add(33);
        l2.add(44);
        l2.add(65);
        l2.add(65);

        l3.add(635);
        l3.add(635);
        l3.add(635);
        l3.add(635);

        l1.addAll(l2);//Inserts all of the elements in the specified
//         collection into this list, starting at the specified position.

//        we can also add an another collection to our list using addALl()
//         method at specific position by pasing index in parameter

        l1.addAll(0,l3);

        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

    }
}
