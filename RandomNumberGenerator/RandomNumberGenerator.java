/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

//Import of all usefull classes for this project
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author Mtile
 */
public class RandomNumberGenerator extends JFrame implements ActionListener{

    JLabel lblNumber = new JLabel("Number of Random Digits: ");
    JTextField tfNumber = new JTextField(10);
    JLabel lblStart = new JLabel("Start Range: ");
    JTextField tfStart = new JTextField(10);
    JLabel lblEnd = new JLabel("End Range: ");
    JTextField tfEnd = new JTextField(10);
    JButton btnGenerate = new JButton("Generate");
    JButton btnClear = new JButton("Clear");
    JTextArea output = new JTextArea();
    JScrollPane pane = new JScrollPane(output);
    
    public RandomNumberGenerator(){
        
        setTitle("Random Number Generator");
        this.setSize(400, 400);
        
        //Construction of the content pane for components
        Container cont = getContentPane();
        cont.setLayout(new GridLayout(5,2));
        cont.setBackground(Color.CYAN);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //Add components to the content pane
        cont.add(lblNumber);
        cont.add(tfNumber);
        cont.add(lblStart);
        cont.add(tfStart);
        cont.add(lblEnd);
        cont.add(tfEnd);
        cont.add(btnGenerate);
        cont.add(btnClear);
        cont.add(pane);
        
        //Add ActionListeners to your buttons
        btnGenerate.addActionListener(this);
        btnClear.addActionListener(this);
    }
    
    //Action Listener method to perform action on the buttons
    public void actionPerformed(ActionEvent e){
        
        Object source = e.getSource();
        
        //When button Generate is clicked
        if(source.equals(btnGenerate)){
            
            if(tfNumber.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter a Valid Number of Random Digits.");
            } else if(tfStart.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter a Valid Start Range.");
            } else if(tfEnd.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter a Valid End Range.");
            } else {
                String numberOfTimes = tfNumber.getText();
                String startRange = tfStart.getText();
                String endRange = tfEnd.getText();
                
                int number = Integer.parseInt(numberOfTimes);
                int min = Integer.parseInt(startRange);
                int max = Integer.parseInt(endRange);
                int counter = 0;
                
                Random rndm = new Random();
                
                output.setText("The following " + numberOfTimes + " Random Numbers between " + startRange + " & " + endRange + " is: ");
                while(counter < number){
                    int random = (int)Math.floor(Math.random()*(max - min) + min);
                    output.append(String.valueOf(random) + ", ");
                    counter++;
                }    
                
            }
        }
        
        //When button Clear is clicked
        if(source.equals(btnClear)){
            output.setText("");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instantiating the class in the main method
        new RandomNumberGenerator();
    }
    
}
