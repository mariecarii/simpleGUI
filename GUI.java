import javax.swing.*;
import java.awt.*;

public class GUI {

    //construcor
    public GUI() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Click me!");          //create button
        JLabel label = new JLabel("Number of clicks: 0");   //add label to button

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);      //add button to panel
        panel.add(label);       //add label to panel


        frame.add(panel, BorderLayout.CENTER);         //add panel to frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My First GUI");
        frame.pack();
        frame.setVisible(true);


    }
    public static void main(String[] args) {

        new GUI();

    }
}
