package OOPS_FreeCodeCamp.Advance.Collections;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {

        ArrayList<student> students_ =new ArrayList<>();
        students_.add(new student("Haseeb",3));
        students_.add(new student("muneeb",4));
        students_.add(new student("meisam",5));

        for (student s : students_) {
            System.out.println(s.getName());
        }



    }
}
