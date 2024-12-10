class LivingBeing{
    void breathing(){
        System.out.println("Breathing is necessary for all living Being");
    }
}

//Here Animal extends Living Being 
class Animal extends LivingBeing{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal{
//    void meon(){
//        System.out.println("cat says meon");
//    }

}


public class main {

    public static void main(String[] args) {
    Cat c=new Cat();
//    c.meon();
    c.eat();

    Dog d=new Dog();
    d.breathing();
    d.bark();
    d.eat();
    }

}
