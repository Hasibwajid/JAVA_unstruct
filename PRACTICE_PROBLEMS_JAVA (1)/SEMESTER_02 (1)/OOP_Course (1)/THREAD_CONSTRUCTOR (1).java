//not cleared


package OOPS;

class myThread3 extends Thread{
    public myThread3(String name){
        super(name);
    }
    public void run(){
        System.out.println("Hello run");
    }
}




class myThread4 implements Runnable{
    public myThread4(Runnable r,String name){
    }
    public void run(){
        System.out.println("Hello run");
    }
}
public class THREAD_CONSTRUCTOR {
    public static void main(String[] args) {
        Thread t1=new myThread3("haseeb");
        System.out.println("name"+t1.getName());
        System.out.println("id"+t1.getId());

        Thread t2=new myThread3("muneeb");
        t2.start();
        System.out.println("name"+t2.getName());
        System.out.println("id"+t2.getId());








    }
}
