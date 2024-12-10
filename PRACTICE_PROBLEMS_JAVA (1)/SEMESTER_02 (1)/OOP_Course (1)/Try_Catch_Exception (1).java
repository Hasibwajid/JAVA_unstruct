package OOPS;


public class Try_Catch_Exception {
    public static void main(String[] args) {
      int a =6;
      int b=0;
      try {
      int c =a/b;
          System.out.println(c);
      }catch (Exception e){
          System.out.println(e);
      }
        System.out.println("further program is running even you have exception");
        System.out.println("This is the beauty of exception handling it will not intrupt other part of program");


    }
}
