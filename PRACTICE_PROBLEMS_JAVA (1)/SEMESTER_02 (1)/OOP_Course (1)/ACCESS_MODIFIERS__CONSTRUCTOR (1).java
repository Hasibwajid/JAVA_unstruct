package OOPS;
//IF WE DECLARE PROPERTIES OR ATTRIBUTES AS PRIVATE THEN WE CAN"T ACCESS WITH (.) SO WE USE SETTER AND GETTER
class mycircle{
    //PRIVATE ATTRIBUTES
    private double pi;
    private int r;
    //SETTER FOR RADIUS AND PI
    public void setr(int radius,double p){
        this.r=radius;
        this.pi=p;
    }
    //GETTER
    public int getr(){
        return r;
    }
    //GETTER
    public double getPi(){
        return pi;
    }
}
public class ACCESS_MODIFIERS__CONSTRUCTOR {
    public static void main(String[] args) {
        mycircle a=new mycircle();
        a.setr(2,3.14);//SET VALUES
        System.out.println(a.getr());//PRINT RADIUS USING FUNCTION CALL
        System.out.println();//PRINT PI USING FUNCTION CALL
    }
}
