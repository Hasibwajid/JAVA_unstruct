package JAVAFULL.STRINGS;

public class COMPARE_TO_AND_SUBSTRING {
    public static void main(String[] args) {
        String a = "curger";
        String b = "curger";

//        a > b : +ive
//        a == b : zer0 (0)
//        a < b : -ive
//        where a is first string and b is second

        int res = a.compareTo(b);
        if (res == 0)
            System.out.println("both are equal");
        else if(res > 0)
            System.out.println("first is grater than second");
        else
            System.out.println("first is less than second");

//        == function fails in some cases for compare two strings cause string are not like other primitive data types it is
//        work as a object so compare To() func is recommended to use.


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        SUBSTRING IN JAVA
        String full = "Hello ! where are you going";
        System.out.println(full.substring(6,21));//21 is excluded
        System.out.println(full.substring(6));//or you can only give start index if want to show till the end



    }
}
