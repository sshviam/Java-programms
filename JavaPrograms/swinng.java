package JavaPrograms;
import javax.swing.*;
public class swinng {
    public static void main(String[] args) {
        JLabel l1 = new JLabel();
        l1.setFont(new java.awt.Font("Verdana",0,12));
        l1.setText("First Name");

        JLabel l2 = new JLabel();
        l2.setFont(new java.awt.Font("Verdana",0,12));
        l2.setText("Last Name");

        JLabel l3 = new JLabel();
        l3.setFont(new java.awt.Font("Verdana",0,12));
        l3.setText("Reg Name");

        JTextField t1 = new JTextField("");
        t1.setBounds(50,100,200,30);

        JFrame frame = new JFrame();
        JButton button = new JButton("CLick Button");
        button.setBounds(150,200,220,50);

        frame.add(l1);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(t1);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(button);
        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setVisible(true);
    
}
}
