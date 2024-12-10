package ADVANCE_JAVA;

import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> Ad1=new ArrayDeque<>();
        Ad1.add(44);
        Ad1.add(45);
        Ad1.add(46);
        Ad1.add(47);
        Ad1.add(48);
        Ad1.add(49);
        Ad1.add(50);
        Ad1.addFirst(1);
        Ad1.addLast(100);
        System.out.println("Array's elements are : "+Ad1);
        System.out.println("Array's First elements is : "+Ad1.getFirst());
        System.out.println("Array's Last elements is : "+Ad1.getLast());
        System.out.println("OfferLast elements : "+Ad1.offerLast(300));
        System.out.println("Array's Last elements after offerlast is : "+Ad1.getLast());
    }
}
