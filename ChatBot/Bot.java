
/**
 * Write a description of class Bot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Bot extends JFrame implements ActionListener
{
    private JTextArea chatArea = new JTextArea();
    private JTextField chatBox = new JTextField();
    Random rand = new Random();
    
    public Bot(){
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setTitle("ChatBot");
        chatArea.setEditable(false);
        frame.add(chatArea);
        frame.add(chatBox);
        //For TextArea
        chatArea.setSize(560, 460);
        chatArea.setLocation(10, 10);
        //For TextField
        chatBox.setSize(560, 30);
        chatBox.setLocation(10, 500);
        chatBox.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String userText = chatBox.getText().toLowerCase();
        chatArea.append("You -> " + userText + "\n");
        chatBox.setText("");
        
        if(userText.contains("hi") || userText.contains("hey") || userText.contains("hello")){
            int num = rand.nextInt(0, 3);
            switch(num){
                case 0: theBot("Hey, Whassup ?");
                    break;
                case 1: theBot("Hey there");
                    break;
                case 2: theBot("Hello :)");
                    break;
                default: theBot("Greetings");
                    break;
            }
            
        }else if(userText.contains("how are you") || userText.contains("are you") || userText.contains("and you?")){
            theBot("I'm a robot, I have no feelings. How are you though ?");
        }else if(userText.contains("good") || userText.contains("great") || userText.contains("fine") || userText.contains("well")){
            theBot("That's good to know.");
            if(userText.contains("how are you") || userText.contains("are you") || userText.contains("and you?")){
                theBot("I'm a robot, I have no feelings");
            }
        }else if(userText.contains("bye") || userText.contains("talk later") || userText.contains("see you soon")){
            theBot("Till next time. Goodbye.");
        }else{
            theBot("My appologies, I failed to understand you.");
        }
    }
    
    private void theBot(String s){
        chatArea.append("BOT -> " + s + "\n");
    }
    
    public static void main(String [] args){
        new Bot();
    }
}
