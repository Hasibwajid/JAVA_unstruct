package ADVANCE_JAVA;

interface myInterface{
    void meth1();
    void meth2();
}

@FunctionalInterface
interface DemoAno{
    void meth1_D(int a);

}
public class AnonymousClass_AND_Lamda {

    public static void main(String[] args) {
//        myInterface obj=new myInterface() {

            //Anonymous class is useful when we need some class only for onece and we dont want to use it further then we use anonymous class concept to create and use class to minimize our code
    /*        @Override
            public void meth1() {
                System.out.println("i am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("i am meth2");
            }
        };
*/




        //LAMBDA EXPRESION NOT NECESSARY IF YOU WANT TO USE THESE TWO THEN CAN OTHERWISE 100% OK
        DemoAno obj1 = (a)->{System.out.println("I am method 1 from this lambda " + a);};
        obj1.meth1_D(6);

    }
}
