//package SWINGGUI;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//
//
//public class JradioButton {
//    public static void main(String[] args) {
//
//        //calling RadioDemo class
//        RadioDemo s =new RadioDemo();
//
//    }
//}
//class RadioDemo extends JFrame {
//    JTextField t1;
//    JButton b1;
//    JRadioButton r1, r2;
//    JLabel l1,l2;
//    //JCheckBox
//    JCheckBox c1,c2,c3;
//
//
//
//    //create a public constructor
//    public RadioDemo() {
//        t1 = new JTextField(15);
//        b1 = new JButton("Enter");
//        r1 = new JRadioButton("male");
//        r2 = new JRadioButton("female");
//        l1 = new JLabel("Result");
//        c1=new JCheckBox("Playing Football");
//        c2=new JCheckBox("Playing Cricket");
//        c3=new JCheckBox("Book Reading");
//        l2=new JLabel("Select Your Hobbies:");
//
//        //adding elements to the JFrame / sequence matter here
//        add(t1);
//        add(r1);
//        add(r2);
//        add(l2);
//        add(c1);
//        add(c2);
//        add(c3);
//        add(b1);
//        add(l1);
//
//
//        ButtonGroup bg=new ButtonGroup();//Is used if you want to select on;ly one JRadioBUtton
//        bg.add(r1);
//        bg.add(r2);
//
//
//
//        //anonymus class
//        b1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String name=t1.getText();
//                if (r1.isSelected()){
//                    name="Mr."+name;
//                }else {
//                    name="Ms."+name;
//                }
//                if (c1.isSelected()){
//                    name=name+"  Likes Playing Football";
//                }
//                if (c2.isSelected()){
//                    name=name+"  Likes playing Cricket";
//                }
//                if (c3.isSelected()){
//                    name=name+"  Likes Book Reading";
//                }
//                l1.setText(name);
//            }
//        });
//
//
//
//        setSize(400,400);
//        setLayout(new FlowLayout());
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setVisible(true);
//
//
//
//
//        //Event for checkbox is a little different from Event of Button,  writen as bellow
////            c1.addItemListener(new ItemListener() {
////
////                public void itemStateChanged(ItemEvent e) {
////                    System.out.println("footballer");
////                }
////            });
//
//
//    }
//}