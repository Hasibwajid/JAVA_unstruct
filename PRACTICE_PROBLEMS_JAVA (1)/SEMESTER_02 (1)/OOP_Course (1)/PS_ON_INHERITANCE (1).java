/*

package OOPS;

//QUESTION 1
*/
/*
class circle{
int radius;
 public circle(int r){
     System.out.println("i am circle class constructor with one parameter.");
   radius=r;
 }
    public circle(){
        System.out.println("i am circle class constructor without parameters.");
    }
 public double Area(){
     return Math.PI*this.radius*this.radius;
 }
}
class cylinder extends circle{
int height;
public cylinder(int r,int h){
    super(r);
    this.height=h;
}
public double volume(){
    return (Math.PI*super.radius*super.radius*this.height);
}
}
public class PS_ON_INHERITANCE {
    public static void main(String[] args) {
        cylinder obj=new cylinder(22,33);
    }
}
*//*



//QUESTION 2
class Rectangle{
int height;

public Rectangle(int h){
    this.height=h;
    System.out.println("I AM CONSTRUCTER OF RECTANGLE CLASS With h="+height);
}

}
class cuboid extends Rectangle{
    int width;

    public cuboid(int h,int w){
        super(h);
        this.width=w;
        System.out.println("I AM CONSTRUCTER OF CUBOID CLASS with h and w = "+super.height+" "+this.width);
    }

}
public class PS_ON_INHERITANCE {
    public static void main(String[] args) {
        cuboid obj=new cuboid(22,33);

    }}*/
