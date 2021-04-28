import java.awt.*;
import java.awt.event.*;
import java.nio.charset.Charset;
import java.util.Random;

import javax.swing.*;
import java.awt.event.*;
public class ForgotPass extends JFrame implements ActionListener {
	   JPanel panel;
	   JLabel email_label, Cell_label,message;
	   JTextField Email_text,phone_text;

	   JButton sent, cancel,Forgot;
	   private JLabel generatedString;
	   ForgotPass() {
	      // Gmail Label
	      email_label = new JLabel();
	      email_label.setHorizontalAlignment(SwingConstants.CENTER);
	      email_label.setText("Email :");
	      Email_text = new JTextField();
	      // Password Label
	      Cell_label = new JLabel();
	      Cell_label.setHorizontalAlignment(SwingConstants.CENTER);
	      Cell_label.setText("Phone#");
	      phone_text = new JTextField();
	      panel = new JPanel(new GridLayout(6, 3));
	      panel.setBackground(Color.LIGHT_GRAY);
	      panel.setForeground(Color.LIGHT_GRAY);
	      panel.add(email_label);
	      panel.add(Email_text);
	      panel.add(Cell_label);
	      panel.add(phone_text);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      //forgot password
	      Forgot = new JButton("Forgot password");
	      Forgot.setHorizontalAlignment(SwingConstants.LEADING);
	      Forgot.setForeground(Color.RED);
	    // Forgot.setBounds(50,100,95,30);
	      
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    		  
	      getContentPane().add(panel, BorderLayout.CENTER);
	      message = new JLabel();
	      panel.add(message);
	      // Submit
	      sent = new JButton("SENT");
	      sent.setBackground(Color.GREEN);
	      sent.setForeground(Color.RED);
	      panel.add(sent);
	      panel.add(sent);
	      
	      generatedString = new JLabel();
	      panel.add(generatedString);
	      // Adding the listeners to components..
	      sent.addActionListener(this);
	    //  getContentPane().add(panel2, BorderLayout.SOUTH);
	      setTitle("Please Enter Email or Password here !");
	      setSize(564,172);
	      setVisible(true);
	   }
	   
	   public static void main(String[] args) {
	      new ForgotPass();
	      
	   }
	   @Override
	   public void actionPerformed(ActionEvent ae) {
	      String Gmail = Email_text.getText();
	      String password = phone_text.getText();
	      //String getCode = Code_radom.getText();
	      //String randcode = GeneratingRandomString();
	      if (Gmail.trim().equals("thanhthuongvn655@gmail.com") || password.trim().equals("2096707159")) {
	         message.setText(" valid" );
	         new randomCode();
	      } else {
	         message.setText(" invalid ... " );
	      } 
	      
	      
	//      if (getCode.trim().equals(randcode)) {
	 //   	  generatedString.setText(" valid");
		         
		//      } else {
		//    generatedString.setText(" invalid ... ");
		   //   }
	      
	    
	      
	   }

	   
	   
	}