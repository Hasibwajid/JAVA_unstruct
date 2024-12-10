package OOPS;
class rectangle{

    public double volume_of_rectangle(double length, double width, double height){
        return length*width*height;

    }


}
class square extends rectangle{

    public double volume_of_square(double side){
        return side*side*side;

    }

}
class circle extends square{

    public double volume_of_circle(double height, double radius){
        return Math.PI*radius*radius;

    }


}
class cylinder extends circle{

    public double volume_of_cylinder(double height, double radius){
        return Math.PI*radius*radius*height;

    }
}

public class Excercise5{
    public static void main(String[] args) {

        cylinder c1=new cylinder();
        c1.volume_of_circle(3,5);

    }}

