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
        
        cFrame.pack();
        cFrame.setVisible(true);
    }
    
    public JFrame getFrame()
    {
        return cFrame;
    }
    
    
    
    public static void main(String[] args)
    {
        
    }
}
