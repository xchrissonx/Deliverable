import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
public class LoginScreen extends JFrame implements ActionListener {
	   JPanel panel;
	   JLabel user_label, password_label,message;
	   JTextField userName_text;
	   JPasswordField password_text;
	   JButton submit, cancel,Forgot;
	   private JButton btnNewButton;
	   private JButton btnNewButton_1;
	   LoginScreen() {
	      // Username Label
	      user_label = new JLabel();
	      user_label.setHorizontalAlignment(SwingConstants.CENTER);
	      user_label.setText("User Name :");
	      userName_text = new JTextField();
	      // Password Label
	      password_label = new JLabel();
	      password_label.setHorizontalAlignment(SwingConstants.CENTER);
	      password_label.setText("Password :");
	      password_text = new JPasswordField();
	      panel = new JPanel(new GridLayout(6, 3));
	      panel.add(user_label);
	      panel.add(userName_text);
	      panel.add(password_label);
	      panel.add(password_text);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      //forgot password
	      Forgot = new JButton("Forgot password");
	      Forgot.setHorizontalAlignment(SwingConstants.LEADING);
	      Forgot.setForeground(Color.RED);
	    // Forgot.setBounds(50,100,95,30);
	      
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    		  
	      getContentPane().add(panel, BorderLayout.CENTER);
	      
	      btnNewButton = new JButton("Forgot Password");
	      btnNewButton.setBackground(Color.LIGHT_GRAY);
	      btnNewButton.setForeground(UIManager.getColor("Button.light"));
	      btnNewButton.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		
	      		new ForgotPass();
	      	}
	      });
	      panel.add(btnNewButton);
	      // Submit
	      submit = new JButton("SUBMIT");
	      submit.setForeground(Color.RED);
	      submit.setBackground(Color.GREEN);
	      panel.add(submit);
	      panel.add(submit);
	      // Adding the listeners to components..
	      submit.addActionListener(this);
	      
	      btnNewButton_1 = new JButton("Create New Account");
	      btnNewButton_1.setBackground(Color.LIGHT_GRAY);
	      btnNewButton_1.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      	}
	      });
	      panel.add(btnNewButton_1);
	      message = new JLabel();
	      message.setForeground(Color.RED);
	      panel.add(message);
	    //  getContentPane().add(panel2, BorderLayout.SOUTH);
	      setTitle("Please Login Here !");
	      setSize(959,397);
	      setVisible(true);
	   }
	   public static void main(String[] args) {
	      new LoginScreen();
	      
	   }
	   @Override
	   public void actionPerformed(ActionEvent ae) {
	      String userName = userName_text.getText();
	      String password = password_text.getText();
	      if (userName.trim().equals("admin") && password.trim().equals("admin")) {
	         message.setText(" Hello " + userName + "");
	      } else {
	         message.setText(" Invalid user.. ");
	      }
	   }
	}