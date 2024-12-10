package SWINGGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class currencyconvertor {
    public static void main(String[] args) {
        //calling class
        CC ComB=new CC();
    }
}
//class for JFrame
class CC extends JFrame{

    //initialization / Local varoiables
    JComboBox cb1,cb2;
    JLabel l,l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;

    //container
    public CC(){
        //Declaration
        cb1=new JComboBox();
        cb2=new JComboBox();
        l1=new JLabel(" Enter amount:");
        l2=new JLabel("From");
        l3=new JLabel("To");
//        l=new JLabel(" ###  WELCOME TO CURRENCY CONVERTOR  ###");
        t1=new JTextField(35);
        t2=new JTextField(40);
        b1=new JButton("Convert");
        l4=new JLabel();

        setLayout(new BorderLayout());
        l=new JLabel("   ###  WELCOME TO CURRENCY CONVERTOR  ###   ",SwingConstants.CENTER);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setOpaque(true);
        l.setBackground(Color.cyan);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel status = new JLabel("status", SwingConstants.SOUTH_EAST);
        status.setVerticalAlignment(SwingConstants.CENTER);
        Font font = new Font("SansSerif", Font.BOLD, 30);
        l.setFont(font);
        l1.setFont(new Font("sansSerif",Font.BOLD,20));
        l2.setFont(new Font("sansSerif",Font.BOLD,20));
        l3.setFont(new Font("sansSerif",Font.BOLD,20));

        //Add elements to the frame

        add(l);
        add(l1);
        add(t1);
        add(l4);
        add(l2);
        add(cb1);
        add(l3);
        add(cb2);
        add(t2);
        add(b1);


        //COlor add to textfields
        t1.setBackground(Color.gray);
        t2.setBackground(Color.GRAY);


        //Textfield 2 in which result will show
        t2.setEditable(false);

        //Array contain the currencies name in combobox1
        String[] CFrom={"Select one","Canadian dollar","European Euro","Japanies yen","Australian Dollar","INR","Mexican peso"};
        String[] Units={ "Units","canadian dollar","European euro","Japanies yen","Australian Dollar","INR","Maxican peso"};


        //Add currency name s to combobox 1 (cb1)
        for (String item:CFrom){
            cb1.addItem(item);
        }
        //combobox2 which only contain USD
        cb2.addItem("USD");

        //index of title name of comboBox 1
        cb1.setSelectedIndex(0);



        //action performed when user click on button(Convert)
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Double fd;
                Double tot=Double.parseDouble(t1.getText());

                if(cb1.getSelectedItem().toString()=="Canadian dollar" && cb2.getSelectedItem().toString()=="USD")
                {
                    fd = (double) (tot*0.82);
                    t2.setText(String.valueOf(fd+"USD"));

                }
                if(cb1.getSelectedItem().toString()=="European Euror" && cb2.getSelectedItem().toString()=="USD")
                {
                    fd = (double) (tot*1.21087);
                    t2.setText(String.valueOf(fd+"USD"));
                }
                if(cb1.getSelectedItem().toString()=="Japanies yen" && cb2.getSelectedItem().toString()=="USD")
                {
                    fd = (double) (tot*0.0091);
                    t2.setText(String.valueOf(fd+"USD"));
                }
                if(cb1.getSelectedItem().toString()=="Australian Dollar" && cb2.getSelectedItem().toString()=="USD")
                {
                    fd = (double) (tot*0.77);
                    t2.setText(String.valueOf(fd+"USD"));
                }
                if(cb1.getSelectedItem().toString()=="INR" && cb2.getSelectedItem().toString()=="USD")
                {
                    fd = (double) (tot*0.014);
                    t2.setText(String.valueOf(fd+"USD"));
                }
                if(cb1.getSelectedItem().toString()=="Mexican peso" && cb2.getSelectedItem().toString()=="USD")
                {
                    fd = (double) (tot*0.050);
                    t2.setText(String.valueOf(fd+"USD"));
                } }
        });


        //For Close the Frame on exit
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //size of Frame
        setSize(750,200);
        //Frame visibility
        setVisible(true);
        setLayout(new FlowLayout());
    }
}





