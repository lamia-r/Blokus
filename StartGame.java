package Blokus;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class StartGame extends JFrame
{
      
	private JPanel tPanel,tPanel2;
    private JLabel topLabel;
    private JButton b1,b2;
    private ButtonGroup btnGroup;

    public StartGame()
{
    	super("Blokus");
    tPanel=new JPanel();
    tPanel2=new JPanel();
    tPanel.setLayout((new FlowLayout())); 
    tPanel2.setLayout((new GridLayout(1,2 )));
    topLabel=new JLabel("WELCOME TO BLOKUS ");
        b1=new JButton("START GAME");
        b2=new JButton("LOAD GAME");
       
        
        btnGroup=new ButtonGroup();
        btnGroup.add(b1);
        btnGroup.add(b2);
     
    tPanel.add(topLabel);
    tPanel2.add(b1);

   
    
    
    b1.addActionListener(event->{
    	
    	new Blokus();
    	setVisible(false);});
    b2.addActionListener(event->{
    	setVisible(false);
    	new Blokus();});
 
    
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(tPanel, BorderLayout.NORTH);
    getContentPane().add(tPanel2, BorderLayout.CENTER);
    
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
    
    pack();
    setLocationRelativeTo(null);
setResizable( true);
setSize(400,250);
setVisible( true);
	  
	}
}
