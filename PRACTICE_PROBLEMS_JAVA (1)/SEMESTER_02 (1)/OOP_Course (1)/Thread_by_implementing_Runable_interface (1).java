package OOPS;
class myclass1 implements Runnable{

    @Override
    public void run() {
        int i=0;
        while (i<4000)
        {System.out.println("I am method of runable interface in Myclass 1");
        i++;}
    }
}
class myclass2 implements Runnable{

    @Override
    public void run() {
        int i=0;
        while (i<4000)
        {System.out.println("I am method of runable interface in Myclass 2");
        i++;}
    }
}
public class Thread_by_implementing_Runable_interface {
    public static void main(String[] args) {
        myclass1 T1=new myclass1();
        Thread t1=new Thread(T1);
        myclass2 T2=new myclass2();
        Thread t2=new Thread(T2);
        t1.start();
        t2.start();

    }
}
