import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
public class ForgotPass extends JFrame implements ActionListener {
	   JPanel panel;
	   JLabel email_label, Cell_label,message;
	   JTextField Email_text,phone_text;

	   JButton sent, cancel,Forgot;
	   private JLabel email_label_1;
	   private JTextField Code_radom;
	   private JButton submit_1;
	   private JLabel message_1;
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
	      
	      email_label_1 = new JLabel();
	      email_label_1.setText("Enter Random Code");
	      email_label_1.setHorizontalAlignment(SwingConstants.CENTER);
	      panel.add(email_label_1);
	      
	      Code_radom = new JTextField();
	      panel.add(Code_radom);
	      
	      submit_1 = new JButton("SUBMIT");
	      submit_1.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      	}
	      });
	      
	      message_1 = new JLabel();
	      panel.add(message_1);
	      submit_1.setForeground(Color.RED);
	      submit_1.setBackground(Color.GREEN);
	      panel.add(submit_1);
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
	      if (Gmail.trim().equals("thanhthuongvn655@gmail.com") || password.trim().equals("2096707159")) {
	         message.setText(" valid ");
	      } else {
	         message.setText(" invalid ... ");
	      }
	      
	   }
	}