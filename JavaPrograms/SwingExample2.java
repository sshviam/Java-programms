package JavaPrograms;
import javax.swing.*;
import java.awt.*;

public class SwingExample2 extends JFrame {
    private JLabel label1, label2, label3;
    private JTextField textField1, textField2, textField3;
    private JButton button1, button2, button3;

    public SwingExample2() {
        setTitle("Swing Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create and add labels
        label1 = new JLabel("Label 1:");
        add(label1);
        textField1 = new JTextField(10);
        add(textField1);

        label2 = new JLabel("Label 2:");
        add(label2);
        textField2 = new JTextField(10);
        add(textField2);

        label3 = new JLabel("Label 3:");
        add(label3);
        textField3 = new JTextField(10);
        add(textField3);

        // Create and add buttons
        button1 = new JButton("Submit");
        add(button1);

        button2 = new JButton("Enter");
        add(button2);

        button3 = new JButton("Close");
        add(button3);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingExample2());
    }
}
