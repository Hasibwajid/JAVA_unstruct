package ADVANCE_JAVA;

import java.util.Date;

public class Date_And_Time {
    public static void main(String[] args) {
//        System.out.println("Num of milliseconds since 1970 till now: "+System.currentTimeMillis());
//        System.out.println("Num of year since 1970 till now: "+System.currentTimeMillis()/1000/3600/24/365);


      //QUIZ
        /*//is it safe to store num of miliSecond in variable of type long?
        System.out.println(Long.MAX_VALUE);
        //it's preety safe you can check max value of long for this */



        //        Now there is a new data and time class which is in the next class ///

        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getDate());//deprecated therefor not recomended
        System.out.println(date.getDay());
        System.out.println(date.getYear());

//        These all are deprecated


        //*******
        // most of the java.util.Date's methods and constructor are deprecated but if you ever deal with old
        //application you my face them for that you can watch java docs for java/.util.Date()
        //*******

        //





     }


}
