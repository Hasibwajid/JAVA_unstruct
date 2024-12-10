///* Mouse listner will listen your mouse on JFrame when this program will execute and you
//click on anywhere on the Frame mouse listner will Listen the location of your cursor and
// give you the location of your mouse on the console.
//so let see the code.*/
//package SWINGGUI;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//public class MOUSELISTNER {
//    public static void main(String[] args) {
// //CALLING
//        Ml n=new Ml();
//    }
//}
//   class Ml extends JFrame {
//    public Ml() {
//        addMouseListener(new MouseAdapter() {
//             public void mousePressed(MouseEvent e){
//                //IT WILL GET X-AXIS LOCATION
//                 int x =e.getX();
//                 //IT'LL GET Y-AXIS LOCATION
//                 int y=getY();
//                 System.out.println(x+" , "+y);
//             }
//        });
//
//        //FOR VISIBILITY OF JFRAME
//        setVisible(true);
//        setLayout(new FlowLayout());
//        //SIZE OF FRAME
//        setSize(400,400);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//}
