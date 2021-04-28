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
    public class randomCode {
    	JLabel lblNewLabel,code2313;
    	JPasswordField password_text;
    	String Newcode = GeneratingRandomString();
    	randomCode(){
            JFrame frmPleaseEnterThe = new JFrame("JFrame Example");  
            frmPleaseEnterThe.setTitle("Please enter the temporary code ");
            
            JDesktopPane desktopPane = new JDesktopPane();
            desktopPane.setBackground(Color.LIGHT_GRAY);
            frmPleaseEnterThe.getContentPane().add(desktopPane, BorderLayout.CENTER);
            
            randCode = new JPasswordField();
            randCode.setBounds(171, 11, 191, 35);
            desktopPane.add(randCode);
            JButton submit = new JButton();  
            submit.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
           		  String password = randCode.getText();
        	      if (password.equals(Newcode)) {
        	      lblNewLabel.setText(" valid");
        	     new NewPass();
        	      } else {
        	    	  lblNewLabel.setText(" Invalid ");
        		      }	
            		
            	}
            });
            submit.setBounds(401, 9, 81, 39);
            desktopPane.add(submit);
            submit.setVerticalAlignment(SwingConstants.BOTTOM);
            submit.setText("Submit");
            
            JLabel radomCode_label = new JLabel();
            radomCode_label.setText("Enter Random Code");
            radomCode_label.setHorizontalAlignment(SwingConstants.CENTER);
            radomCode_label.setBounds(0, 12, 167, 30);
            desktopPane.add(radomCode_label);
            
            
            lblNewLabel = new JLabel("");
            lblNewLabel.setBounds(352, 57, 130, 30);
            desktopPane.add(lblNewLabel);
            
            JLabel code2313 = new JLabel(Newcode);
            code2313.setBounds(29, 53, 130, 30);
            desktopPane.add(code2313);
            frmPleaseEnterThe.setSize(508, 174);  
            frmPleaseEnterThe.setLocationRelativeTo(null);  
            frmPleaseEnterThe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            frmPleaseEnterThe.setVisible(true);  
    		
    	}

    	private static JPasswordField randCode;
        public static void main(String s[]) {
         new randomCode();
         
    }  
        
 	   public String GeneratingRandomString() {

		    int leftLimit = 97; // letter 'a'
		    int rightLimit = 122; // letter 'z'
		    int targetStringLength = 6;
		    Random random = new Random();
		    StringBuilder buffer = new StringBuilder(targetStringLength);
		    for (int i = 0; i < targetStringLength; i++) {
		        int randomLimitedInt = leftLimit + (int) 
		          (random.nextFloat() * (rightLimit - leftLimit + 1));
		        buffer.append((char) randomLimitedInt);
		    }
		    String generatedString = buffer.toString();
		    return generatedString;
		}

   
    }