//package SWINGGUI;
//import javax.swing.*;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class AddGui {
//    public static void main(String[] args) {
//        Addition obj=new Addition();
//    }
//}
////implements ActionListener
//class Addition extends JFrame  {
//    JTextField t1 = new JTextField(20);
//    JTextField t2 = new JTextField(20);
//    JButton b1 = new JButton("+");
//    JButton b2=new JButton("-");
//    JLabel l = new JLabel("Result");
//    JTextField t3 = new JTextField(20);
//    public Addition() {
//        add(t1);
//        add(t2);
//        add(b1);
//        add(b2);
//        add(l);
//        add(t3);
//        t3.setEditable(false);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new FlowLayout());
//        setSize(300, 300);
//        setVisible(true);
//
//
//
//
//
////        b1.addActionListener(this); //FIRST >> implement action listner + Create another action listner
////        and then create action performed method inside action listner
////        b1.addActionListener(e);//whenever anyone click on this button it wll call actionperformed method.
//
//
//
//
//
////THIS 2nd METHOD IS CALLED (ANYNOMUS CLASS) METHOD
////        b1.addActionListener(al);
//
//        //Bellow the (2nd) Another method of action performing if you dont want to create another public void and implement actionlistener then yoyu can directly
//        // create obj of Action listner here in main
////        ActionListener al=new ActionListener() {
////
////            public void actionPerformed(ActionEvent ee){
////                int num1=Integer.parseInt(t1.getText());
////                int num2=Integer.parseInt(t2.getText());
////                int value=num1+num2;
////                t3.setText(value+"");
////            }
////
////        };
//
//
//
//
//
//
//        //And the third method to do the same thing is to create obj dirrect in calling
////        b1.addActionListener(ActionListener al=new ActionListener() {
////
////            public void actionPerformed(ActionEvent ee){
////                int num1=Integer.parseInt(t1.getText());
////                int num2=Integer.parseInt(t2.getText());
////
////                int value=num1+num2;
////                t3.setText(value+"");
////            }
////
////        };);
//
//
//
//
//
//
//        //And (4th) on of thre other method is to do this thing is lamda expression:
//        b1.addActionListener(aa ->
//        {
//            int num1=Integer.parseInt(t1.getText());
//            int num2=Integer.parseInt(t2.getText());
//
//            int value=num1+num2;
//            t3.setText(value+"");
//        });
//
//        b2.addActionListener(ee->
//                {
//                    int num1=Integer.parseInt(t1.getText());
//                    int num2=Integer.parseInt(t2.getText());
//                    int value=num1-num2;
//                    t3.setText(value+"");
//
//                }
//
//
//
//        );
//
//
//    }
//
//
//
////This will need to add if use First method ::>>
////public void actionPerformed(ActionEvent ea){
////
////   int num1=Integer.parseInt(t1.getText());
////   int num2=Integer.parseInt(t2.getText());
////   int value=num1+num2;
////   t3.setText(value+"");
////
////}
//
//
//
//}
//
