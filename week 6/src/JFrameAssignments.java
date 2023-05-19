import javax.swing.*;
import java.awt.*;

public class JFrameAssignments extends JFrame {

    JLabel myLabel;
    JLabel myLabel2;
    JTextField myText;
    JTextField myText2;
    JButton myButton;

    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 300;

    public JFrameAssignments() {
        setTitle("Login Account");

        //Centering window
        setLocation(500,200);

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        getContentPane().setBackground(Color.RED);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        myLabel = new JLabel("Enter your username:");
        myLabel.setBounds(80,20,200,25);
        //The font is Courier, the style is plain and the font size is 15.
        myLabel.setFont(new Font("Courier", Font.PLAIN, 15));
        add(myLabel);

        myText = new JTextField(20);
        myText.setBounds(80,50,165,25);
        add(myText);

        myLabel2 = new JLabel("Enter your password:");
        myLabel2.setBounds(80,80,200,25);
        //The font is Arial, the style is bold and the font size is 12.
        myLabel2.setFont(new Font("Arial", Font.BOLD, 12));
        add(myLabel2);

        myText2 = new JTextField(20);
        myText2.setBounds(80,110,165,25);
        add(myText2);

        myButton = new JButton("login");
        myButton.setBounds(120,160,80,25);
        add(myButton);


        setVisible(true);
    }



    public static void  main(String[] args) {

        new JFrameAssignments();
    }

}
