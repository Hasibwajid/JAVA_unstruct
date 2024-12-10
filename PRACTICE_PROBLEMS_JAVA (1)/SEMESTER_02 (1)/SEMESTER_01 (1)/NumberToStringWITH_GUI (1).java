package UniOneSemester;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
    class design implements ActionListener {
        JFrame f ;
        JButton b;
        JTextField tf1,tf2;

        design(){
            f= new JFrame("YOUR CONVERTER IS HERE.");
            f.setSize(500,200);
            f.setLocation(250,100);
            f.setLayout(null);
            f.setBackground(Color.pink);

            tf1 =new JTextField();
            tf1.setBounds(20,10,150,20);

            tf2 = new JTextField();
            tf2.setBounds(20,40,280,20);

            b = new JButton("Enter");
            b.setBounds(80,70,80,30);
            b.addActionListener(this);
            b.setBackground(Color.gray);


            f.add(tf1);f.add(tf2);f.add(b);
            f.setVisible(true);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Scanner s =new Scanner(System.in);
            String[] arrOne = {"zero","one","two","three","four","five","six","seven","eight","nine"};
            String[] arrTwo = {"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen",
                    "ninteen","twenty"};
            String[] arrTens = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty",
                    "ninty"};

            String str =tf1.getText();
            char[] chArr = str.toCharArray();

            int len = chArr.length;

            if (len>2){
                tf2.setText("System is not design for more than 2 digit num.");
            }

            if (len==0){
                tf2.setText("Empty.");
            }

            if (len==1){
                tf2.setText(arrOne[chArr[0] - '0']);
            }

            if (len==2){
                if (chArr[0] == '-') {
                    tf2.setText("Minus "+arrOne[chArr[1] - '0'] );
                }else {
                    if (chArr[0] -'0'  == 1){
                        int sum = chArr[0]-'0' + chArr[1]-'0';
                        tf2.setText(arrTwo[sum]);
                    }
                    if (chArr[0] -'0'  == 2 && chArr[1]-'0'==0){
                        tf2.setText("twenty");
                    }
                }
            }

        }
    }


class NumberToString {
    public static void main(String[] args) {
        new design();

//        Scanner s =new Scanner(System.in);
//        String[] arrOne = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//        String[] arrTwo = {"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen",
//                           "ninteen","twenty"};
//        String[] arrTens = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty",
//                           "ninty"};
//
//        System.out.println("Enter num: ");
//        int num = s.nextInt();
//        String str =String.valueOf(num);
//        char[] chArr = str.toCharArray();
//
//        int len = chArr.length;
//
//        if (len>2){
//            System.out.println("System is not design for more than 2 digit num.");
//
//        }
//
//        if (len==0){
//            System.out.println("Empty.");
//        }
//
//        if (len==1){
//            System.out.println(arrOne[chArr[0] - '0']);
//        }
//
//        if (len==2){
//            if (chArr[0] == '-') {
//                System.out.println("Minus "+arrOne[chArr[1] - '0'] );
//            }else {
//                if (chArr[0] -'0'  == 1){
//                    int sum = chArr[0]-'0' + chArr[1]-'0';
//                    System.out.println(arrTwo[sum]);
//                }
//            }
//        }

    }
}
