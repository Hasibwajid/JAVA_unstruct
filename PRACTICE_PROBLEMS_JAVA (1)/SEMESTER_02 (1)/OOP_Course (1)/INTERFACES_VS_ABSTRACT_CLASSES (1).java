//MAIN DIFFERENCE B/W ABSTRACT CLASSES AND INTERFACES?
//Abstract classes can only extent for 1 and cannt be extended more than one
// ,but multiple interfaces can be implemented in one class
package OOPS;
//CREATING INTERFACE
interface Bicycle{
    void Applay_Brake(int decrement);
    void Speed_Up(int increment);
    void turn(String side);
}
//CLASS THAT IMPLEMENT INTERFACE BICYCLE
class Avone_Cycle implements Bicycle{
    void blow_horn(){
        System.out.println("peeep");
    }
    public void Applay_Brake(int decrement){
        System.out.println("decrease speed upto "+decrement);
    };
    public void Speed_Up(int increment){
        System.out.println("increase speed upto "+increment);
    };
    public void turn(String side){
        System.out.println("Turn to "+side);
    };
}

public class INTERFACES_VS_ABSTRACT_CLASSES {
    public static void main(String[] args) {
        Avone_Cycle my_cycle=new Avone_Cycle();
        my_cycle.Speed_Up(5);
        my_cycle.Applay_Brake(3);
        my_cycle.turn("Right");
        my_cycle.turn("Left");

    }
}
