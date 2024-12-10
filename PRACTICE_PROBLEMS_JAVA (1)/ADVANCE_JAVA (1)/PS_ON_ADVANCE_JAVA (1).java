package ADVANCE_JAVA;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

import static java.util.Calendar.HOUR_OF_DAY;

public class PS_ON_ADVANCE_JAVA {
    public static void main(String[] args) {

       /* //QUESTION 1
        ArrayList<String> students=new ArrayList<>();
        students.add("s1");
        students.add("s2");
        students.add("s3");
        students.add("s4");
        students.add("s5");
        students.add("s6");
        students.add("s7");
        students.add("s8");
        students.add("s9");
        students.add("s10");

        for (String a:students){
            System.out.println(a);
        }
*/




        /*//QUESTION 2
        //Create set and store duplicate values and then varify that the set store duplicate values only once.

        HashSet<Integer> mySet=new HashSet<>();
        mySet.add(2);
        mySet.add(4);
        mySet.add(55);
        mySet.add(3);
        mySet.add(2);
        mySet.add(44);
        mySet.add(4);
        mySet.add(55);

        for (int s:mySet){
            System.out.println(s);
        }*/




//        QUESTION 3
//        Use Date class tpo print time in following format (22:44:02)/(hh:mm:ss)

        Date d =new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());



        //QUESTION 4
        //REPEATE 3 USING CALENDER CLASS
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));



        //QUESTION 5
        //REPEATE 3 USING Java.time API
        LocalDateTime ldt=LocalDateTime.now();

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("H:m:s");
        String myTime=ldt.format(dtf);
        System.out.println(myTime);



    }
}
