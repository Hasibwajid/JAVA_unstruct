package OOPS;
/*
Question 1:
abstract class pen{
     abstract void write();
     abstract void re_fill();
}
class fountain extends pen{
    @Override
    void write() {
        System.out.println("Writing");
    }

    @Override
    void re_fill() {
        System.out.println("Re_filling");
    }
    void change_nib(){
        System.out.println("Changing nib of pen");
    }
}*/


//Question 2
/*class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}
interface diet{
    void eat();
}
interface health_care{
    void sleep();
}
class human extends Monkey implements diet, health_care{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}*/


/*
Question 3
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconect();
}

class Smart_Telephone extends Telephone {
    public void ring(){
        System.out.println("Ringing");
    }
    public void lift(){
        System.out.println("Lifting");

    }
    public void disconect(){
        System.out.println("Disconnecting");
    }
}*/


//Question 4
/*interface TV_remote{
   void change_chennal();
}
interface Smart_TV_remote extends TV_remote{
    void Multi_task();
}
class Remote implements Smart_TV_remote{
    @Override
    public void Multi_task() {
        System.out.println("Multi tasking");
    }

    @Override
    public void change_chennal() {
        System.out.println("Changing channel");
    }
    public void meth(){
        System.out.println("Nothing");
    }
}*/

public class PS_ON_ABSTRACT_CLASS_AND_INTERFACES {
    public static void main(String[] args){
    /*
        Question 1:
        fountain pen=new fountain();
        pen.change_nib();
        pen.write();
        pen.re_fill();
*/

/*//Question 2
        human obj1=new human();
        obj1.eat();
        health_care h1=new human();//this obj can only have areference of healthcare interface
        // it cannot access any other
        h1.sleep();
        Monkey m1=new human();//this is the object of human but created with reference of monkey
        // so can access only methods which are available in monkey class
        m1.bite();
        m1.jump();*/



/*
Question 3
        Telephone n=new Smart_Telephone();
        n.disconect();*/



}
}
