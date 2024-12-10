package ADVANCE_JAVA;

import java.util.Calendar;
import java.util.TimeZone;

public class CalanderClass_java {
    public static void main(String[] args) {

       /* //This is new
        //https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Calendar.html
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow.getTime());
        System.out.println(rightNow.getTimeZone());
        System.out.println(rightNow.getCalendarType());
        System.out.println(rightNow.getFirstDayOfWeek());
        */


    /*    //for getting timezone of different places/countries
        Calendar rightNow_Saudia = Calendar.getInstance(TimeZone.getTimeZone("Asia/Riyadh"));
        Calendar rightNow_India = Calendar.getInstance(TimeZone.getTimeZone("Asia/Calcutta"));
        Calendar rightNow = Calendar.getInstance();

        System.out.println("Id of india time zone is: "+rightNow_India.getTimeZone().getID());
        System.out.println("Id of saudia timZone : "+rightNow_Saudia.getTimeZone().getID());
        System.out.println("Id of pakistan timZone : "+rightNow.getTimeZone().getID());
*/
        //also gregorian calender class available in docs


/*//        All time zone id's are
        System.out.println(" All time zone id's are ");
        for (int i=0;i<TimeZone.getAvailableIDs().length;i++){
        System.out.println(TimeZone.getAvailableIDs()[i]);
    }*/




    }

}
