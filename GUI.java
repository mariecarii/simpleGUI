import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
   //declare counter variable
    private int count = 0;
    //label
    private JLabel label;

    //construcor
    public GUI() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Click me!");          //create button
        button.addActionListener(this);     //add listener to button object

        label = new JLabel("Number of clicks: 0");   //add label to button //"this" attaches it to this GUI class so then add 'implements actionlistener to class

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

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);

    }
}
