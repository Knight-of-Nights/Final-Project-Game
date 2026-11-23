/* Lab 5: Virtual Pet
Follow directions https://docs.google.com/document/d/1njWKrLrPgwlFMfuCwKDLN0HwWKERAwvD5ANb9dQAv0c/edit?usp=sharing
*/

import javax.swing.*;     // JComponents
import java.awt.event.*;  // click events
import java.awt.*;        // colors


public class MyGUI extends JFrame {
    // add GUI components as instance variables
    JLabel imageLabel = new JLabel("Dog");
    Pet p = new Pet();
    Food f = new Food();
    f.getFood();
    JButton button1 = new JButton("Feed");
    JLabel output1 = new JLabel("Hunger");
    //Create a timer to do something every x milliseconds 
    private Timer timer;
    // Call initTimer() from the constructor or main after creating obj
    public void initTimer() {
    ActionListener timerTick =new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        //  call some method to do something
       // if(work done)    timer.stop();   
       p.starve();
       output1.setText("Hunger" + p.getHunger());
       
    } };
    //create timer which calls the tick method each second (1000ms)
    timer=new Timer(1000,timerTick);
    timer.start(); //start the task
    };


    // Constructor sets up GUI
    public MyGUI() {
        // set up this inherited JFrame
        setSize(300, 300);
        setLayout(new FlowLayout()); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initTimer();
        
        
        // set up GUI

    JButton button1 = new JButton("Hunger");
    JLabel output1 = new JLabel("Feed");
    add(output1);
    add(button1);
    button1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)  {
        // what to do on click
        p.feed();
        output1.setText("Hunger" + p.getHunger());
    }
}); 
    JButton button2 = new JButton("Hunger");
    JLabel output2 = new JLabel("Feed");
    add(output2);
    add(button2);
    button2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)  {
        // what to do on click
        p.feed();
        output2.setText("Hunger" + p.getHunger());
    }
}); 
    JButton button3 = new JButton("Play");
    JLabel output3 = new JLabel("Joy");
    add(output3);
    add(button3);
    button3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)  {
        // what to do on click
        p.feed();
        output3.setText("Joy" + p.getHunger());
    }
});
    JButton button4 = new JButton("Sleep");
    JLabel output4 = new JLabel("Sleep");
    add(output4);
    add(button4);
    button3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)  {
        // what to do on click
        p.feed();
        output4.setText("Sleep" + p.getHunger());
    }
});



    // Scaled Image is better!
    ImageIcon img =  new ImageIcon("dog.png");
    Image scaledImg = img.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    imageLabel.setIcon(new ImageIcon(scaledImg));
    add(imageLabel);
    
    
        
    }
    
    public static void main(String[] args) {
         // call constructor to set up GUI
         MyGUI g = new MyGUI();
         g.setVisible(true);
    }
}