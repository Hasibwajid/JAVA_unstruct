package OOPS;
class Thr1 extends Thread{

    public void run(){
        int i=0;
        while (i<4){
        System.out.println("Hello run");
        i++;
    }}
}
class Thr2 extends Thread{

    public void run(){

        int i=0;
        while (i<4){
        System.out.println("Hello run 222");
        i++;
    }}
}

public class Thread_Methods {
    public static void main(String[] args) {
        Thr1 t1=new Thr1();
        Thr2 t2=new Thr2();
        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t2.start();
        System.out.println(Thread.currentThread());
    }
}
