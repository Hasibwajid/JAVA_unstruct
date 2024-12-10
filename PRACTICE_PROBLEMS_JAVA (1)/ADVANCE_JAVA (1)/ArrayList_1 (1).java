package ADVANCE_JAVA;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {

        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);
        ArrayList<Integer> l3=new ArrayList<>(5);
        l1.add(6);
        l1.add(7);
        l1.add(6);
        l1.add(4);
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
        // collection into this list, starting at the specified position.

        //we can also add an another collection to our list using addALl()
        // method at specific position by pasing index in parameter

//        l1.addAll(0,l3);
//
//        for(int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }


//        l1.clear();
//        System.out.println(l1); //Removes all of the elements from this list.

//        l1.clone();//Returns a shallow copy of this ArrayList instance.
//        System.out.println(l1);

        System.out.println(l1.contains(3));//Returns true if this list contains the specified element.

        l2.add(22);
        l2.add(22);
        l2.add(22);
        l2.add(22);
        System.out.println(l2);

        System.out.println(l2.equals(2));//Compares the specified object with this list for equality.


        System.out.println(l1.indexOf(3));//Returns the index of the first occurrence of the specified
        //element in this list, or -1 if this list does not contain the element.
        System.out.println(l1.indexOf(100));//it'll print -1 if array not contain that element
        System.out.println(l1);
        System.out.println("last index of 6 in l1 : "+l1.lastIndexOf(6));//Returns the index of the last occurrence of
        // the specified element in this list, or -1 if this list does not contain the element.

//        System.out.println(l1.hashCode());//Returns the hash code value for this list.
//
//        System.out.println(l1.isEmpty());//Returns true if this list contains no elements.


        l1.set(5,0);//Replaces the element at the specified position in this list with the specified element.
        System.out.println(l1);



    }
}
