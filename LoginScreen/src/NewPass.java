    import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;
import java.util.Properties;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants; 
    public class NewPass {
    	JLabel lblNewLabel,code2313;
    	JPasswordField password_text;
    	String Newcode = GeneratingRandomString();
    	NewPass(){
            JFrame Newpassword = new JFrame("JFrame Example");  
            Newpassword.setTitle("Please Enter New Passord");
            
            JDesktopPane desktopPane = new JDesktopPane();
            desktopPane.setBackground(Color.LIGHT_GRAY);
            Newpassword.getContentPane().add(desktopPane, BorderLayout.CENTER);
            
            newPassword = new JPasswordField();
            newPassword.setBounds(171, 11, 191, 35);
            desktopPane.add(newPassword);
            JButton submit = new JButton();  
            submit.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
           		  String password = newPassword.getText();
        	      lblNewLabel.setText(password);
        	      code2313.setText("Change Password Successfully");
        	     // Newcode = password;
            	}
            });
            submit.setBounds(401, 9, 81, 39);
            desktopPane.add(submit);
            submit.setVerticalAlignment(SwingConstants.BOTTOM);
            submit.setText("Submit");
            
            JLabel NP = new JLabel();
            NP.setText("New Passord");
            NP.setHorizontalAlignment(SwingConstants.CENTER);
            NP.setBounds(0, 12, 167, 30);
            desktopPane.add(NP);
            
            
            lblNewLabel = new JLabel("");
            lblNewLabel.setBounds(352, 57, 130, 30);
            desktopPane.add(lblNewLabel);
            
            code2313 = new JLabel("");
            code2313.setBounds(29, 53, 217, 30);
            desktopPane.add(code2313);
            Newpassword.setSize(508, 174);  
            Newpassword.setLocationRelativeTo(null);  
            Newpassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            Newpassword.setVisible(true);  
    		
    	}

    	private static JPasswordField newPassword;
        public static void main(String s[]) {
         new NewPass();
         
    }  
        
 	   public String GeneratingRandomString() {
		    String generatedString = ("");
		    return generatedString;
		}

   
    }