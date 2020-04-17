import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Calculator
{
    private Jframe cFrame;
    private JLabel result;
    
    //Constructor
    public Calculator()
    {
        cFrame = new JFrame();
        cFrame.setLocation(100, 100);
        cFrame.setSize(400, 400);
        cFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cFrame.setTitle("Simple Calculator");
        
        initializeComponents();
        
        cFrame.pack();
        cFrame.setVisible(true);
    }
    
    public JFrame getFrame()
    {
        return cFrame;
    }
    
    public void initializeComponents()
    {
        //the panel for the buttons to go on
        JPanel jpButtons = new JPanel();
        
        //the buttons
        JButton addButton = new JButton("+");
        addButton.setName("addButton");
        JButton subButton = new JButton("-");
        subButton.setName("subButton");
        JButton multButton = new JButton("*");
        multButton.setName("multButton");
        JButton divButton = new JButton("/");
        divButton.setName("divButton");
        
        jpButtons.add(addButton);
        jpButtons.add(subButton);
        jpButtons.add(multButton);
        jpButtons.add(divButton);
        
        cFrame.add(jpButtons, BorderLayout.PAGE_END);
        
    }
    
    public static void main(String[] args)
    {
        
    }
}
