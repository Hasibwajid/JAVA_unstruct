package OOPS;

import java.awt.*;

class myEmployee{
    private String name;
    private int id;

    public myEmployee(int idd,String na){
        name="predefine";
        id=33;
    }
    
    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
    public void setid(int myid){
        id=myid;
    }
    public int getid(){
        return id;
    }


}
public class CONSTRUCTORS {
    public static void main(String[] args) {
        myEmployee first_emp = new myEmployee(22,"haseeb");
//        first_emp.setname("haseeb");
        first_emp.getname();
    }
}
