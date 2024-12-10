package OOPS;
class base{
    public base() {
        System.out.println("I am base class constructor");
    }
    public base(int a) {
        System.out.println("I am base class overloaded constructor with value of a "+a);
    }
}
class drived extends base{
    public drived() {
        System.out.println("I am drived class constructor");
    }
    public drived(int a,int b) {
        super(a);
        System.out.println("I am drived class overloaded constructor with value of a and b "+a+b);
    }
}
class child_of_drivedclass extends drived{
    public child_of_drivedclass() {
        System.out.println("I am child of drived class constructor");
    }
    public child_of_drivedclass(int a,int b,int c) {
        super(a,b);
        System.out.println("I am child of drived class overloaded constructor with values of a b and c"+ a+b+c);
    }
}
public class CONSTRUCTOR_IN_INHERITANCE {
    public static void main(String[] args) {
//        child_of_drivedclass c=new child_of_drivedclass();
        child_of_drivedclass c=new child_of_drivedclass(3,4,5);

    }
}
