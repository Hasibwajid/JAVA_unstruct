package OOPS;
class A{
    public int haseeb(){
      return 2;
    }
    public void meth2(){
        System.out.println("I AM METHOD 2 of class A");
    }
}
class B extends A{
    public void meth3(){
        System.out.println("I AM METHOD 3 of class B");
    }
    public void meth2(){
        System.out.println("I AM METHOD 2 of class B");
    }
}

public class Method_overridding {
    public static void main(String[] args) {

        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();

    }
}
