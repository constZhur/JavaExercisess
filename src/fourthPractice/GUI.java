package fourthPractice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private JButton buttonMilan = new JButton("AC Milan");
    private JButton buttonMadrid = new JButton("Real Madrid");

    public GUI(){
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));

    }
}
