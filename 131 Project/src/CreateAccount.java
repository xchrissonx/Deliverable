import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;

public class CreateAccount {

	private JFrame frame;
	private JTextField txtCreateUsername;
	private JTextField txtCreatePassword;
	private JTextField textField;
	private JTextField textField_FirstName;
	private JTextField textField_LastName;
	private JTextField textField_BirthMonth;
	private JTextField textField_BirthDay;
	private JTextField textField_BirthYear;
	private JTextField textField_Address;
	private JTextField textField_Phone;
	private JTextField textField_Major;
	
	private JTextField textField_Email;
	private String userName, password, firstName, lastName, address, email, phone, birthday, major, term;
	private Student student;
	private JTextField textField_TermSemester;
	private JTextField textField_TermYear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount window = new CreateAccount();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelCreateAccount = new JPanel();
		frame.getContentPane().add(panelCreateAccount, "name_12362326773400");
		panelCreateAccount.setLayout(null);
		
		JPanel panelStudentInfo = new JPanel();
		frame.getContentPane().add(panelStudentInfo, "name_84822043345200");
		panelStudentInfo.setLayout(null);
		
		JPanel panelVerifyAccount = new JPanel();
		frame.getContentPane().add(panelVerifyAccount, "name_91381493339400");
		panelVerifyAccount.setLayout(null);
		
		txtCreateUsername = new JTextField();
		txtCreateUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtCreateUsername.setBounds(177, 108, 201, 20);
		panelCreateAccount.add(txtCreateUsername);
		txtCreateUsername.setColumns(10);
		
		txtCreatePassword = new JTextField();
		txtCreatePassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtCreatePassword.setBounds(177, 164, 201, 20);
		panelCreateAccount.add(txtCreatePassword);
		txtCreatePassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userName = txtCreateUsername.getText();
				password = txtCreatePassword.getText();
				
				panelCreateAccount.setVisible(false);
				panelStudentInfo.setVisible(true);
			}
		});
		btnNewButton.setBounds(289, 265, 89, 23);
		panelCreateAccount.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Create username");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(177, 83, 201, 14);
		panelCreateAccount.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create password");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(177, 139, 201, 14);
		panelCreateAccount.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(177, 220, 201, 20);
		panelCreateAccount.add(textField);
		textField.setColumns(10);
		
		JLabel lblVerifyPassword = new JLabel("Verify password");
		lblVerifyPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerifyPassword.setBounds(177, 195, 201, 14);
		panelCreateAccount.add(lblVerifyPassword);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(177, 265, 89, 23);
		panelCreateAccount.add(btnCancel);
		
		textField_FirstName = new JTextField();
		textField_FirstName.setBounds(10, 42, 176, 20);
		panelStudentInfo.add(textField_FirstName);
		textField_FirstName.setColumns(10);
		
		textField_LastName = new JTextField();
		textField_LastName.setColumns(10);
		textField_LastName.setBounds(213, 42, 176, 20);
		panelStudentInfo.add(textField_LastName);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 17, 176, 14);
		panelStudentInfo.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Last Name");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(213, 17, 176, 14);
		panelStudentInfo.add(lblNewLabel_2_1);
		
		textField_BirthMonth = new JTextField();
		textField_BirthMonth.setBounds(416, 42, 43, 20);
		panelStudentInfo.add(textField_BirthMonth);
		textField_BirthMonth.setColumns(10);
		
		textField_BirthDay = new JTextField();
		textField_BirthDay.setColumns(10);
		textField_BirthDay.setBounds(469, 42, 43, 20);
		panelStudentInfo.add(textField_BirthDay);
		
		textField_BirthYear = new JTextField();
		textField_BirthYear.setColumns(10);
		textField_BirthYear.setBounds(522, 42, 43, 20);
		panelStudentInfo.add(textField_BirthYear);
		
		JLabel lblNewLabel_3 = new JLabel("Birthdate: mm-dd-yyyy");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(416, 17, 149, 14);
		panelStudentInfo.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Phone");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(282, 89, 46, 14);
		panelStudentInfo.add(lblNewLabel_4);
		
		textField_Address = new JTextField();
		textField_Address.setBounds(10, 114, 176, 20);
		panelStudentInfo.add(textField_Address);
		textField_Address.setColumns(10);
		
		textField_Phone = new JTextField();
		textField_Phone.setBounds(213, 114, 176, 20);
		panelStudentInfo.add(textField_Phone);
		textField_Phone.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Major");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(71, 177, 46, 14);
		panelStudentInfo.add(lblNewLabel_6);
		
		textField_Major = new JTextField();
		textField_Major.setBounds(10, 202, 176, 20);
		panelStudentInfo.add(textField_Major);
		textField_Major.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Term Applying For:");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(213, 162, 176, 14);
		panelStudentInfo.add(lblNewLabel_7);
		
		JLabel lblNewLabel_Name = new JLabel("Name: ");
		lblNewLabel_Name.setBounds(44, 52, 490, 14);
		panelVerifyAccount.add(lblNewLabel_Name);
		
		JLabel lblNewLabel_Birthday = new JLabel("Birthday:");
		lblNewLabel_Birthday.setBounds(44, 77, 132, 14);
		panelVerifyAccount.add(lblNewLabel_Birthday);
		
		JLabel lblNewLabel_Phone = new JLabel("Phone:");
		lblNewLabel_Phone.setBounds(216, 77, 145, 14);
		panelVerifyAccount.add(lblNewLabel_Phone);
		
		JLabel lblNewLabel_Email = new JLabel("Email: ");
		lblNewLabel_Email.setBounds(389, 77, 145, 14);
		panelVerifyAccount.add(lblNewLabel_Email);
		
		JLabel lblNewLabel_Address = new JLabel("Address: ");
		lblNewLabel_Address.setBounds(44, 108, 490, 14);
		panelVerifyAccount.add(lblNewLabel_Address);
		
		JLabel lblNewLabel_Major = new JLabel("Major: ");
		lblNewLabel_Major.setBounds(44, 133, 145, 14);
		panelVerifyAccount.add(lblNewLabel_Major);
		
		JLabel lblNewLabel_Term = new JLabel("Term applying for: ");
		lblNewLabel_Term.setBounds(244, 133, 266, 14);
		panelVerifyAccount.add(lblNewLabel_Term);
		
		JButton btnNewButton_1 = new JButton("Verify");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstName = textField_FirstName.getText();
				lastName = textField_LastName.getText();
				address = textField_Address.getText();
				email = textField_Email.getText();
				phone = textField_Phone.getText();
				birthday = textField_BirthMonth + "-" + textField_BirthDay + "-" + textField_BirthYear;
				major = textField_Major.getText();
				term = textField_TermSemester.getText() + " " + textField_TermYear.getText();
				
				lblNewLabel_Name.setText(lblNewLabel_Name.getText() + firstName + " " + lastName);
				lblNewLabel_Birthday.setText(lblNewLabel_Birthday.getText() + birthday);
				lblNewLabel_Phone.setText(lblNewLabel_Phone.getName() + phone);
				lblNewLabel_Email.setText(lblNewLabel_Email.getName() + email);
				lblNewLabel_Address.setText(lblNewLabel_Address.getText() + address);
				lblNewLabel_Major.setText(lblNewLabel_Major.getText() + major);
				lblNewLabel_Term.setText(lblNewLabel_Term.getText() + term);
				
				panelStudentInfo.setVisible(false);
				panelVerifyAccount.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(282, 278, 89, 23);
		panelStudentInfo.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelStudentInfo.setVisible(false);
				panelCreateAccount.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(155, 278, 89, 23);
		panelStudentInfo.add(btnNewButton_2);
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		textField_Email.setBounds(398, 114, 176, 20);
		panelStudentInfo.add(textField_Email);
		
		JLabel lblNewLabel_5_1 = new JLabel("Email");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setBounds(466, 89, 46, 14);
		panelStudentInfo.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Address");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(10, 89, 176, 14);
		panelStudentInfo.add(lblNewLabel_4_1);
		
		textField_TermSemester = new JTextField();
		textField_TermSemester.setBounds(213, 202, 86, 20);
		panelStudentInfo.add(textField_TermSemester);
		textField_TermSemester.setColumns(10);
		
		textField_TermYear = new JTextField();
		textField_TermYear.setColumns(10);
		textField_TermYear.setBounds(303, 202, 86, 20);
		panelStudentInfo.add(textField_TermYear);
		
		JLabel lblNewLabel_5 = new JLabel("Semester");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(213, 187, 86, 14);
		panelStudentInfo.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_2 = new JLabel("Year");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setBounds(303, 187, 86, 14);
		panelStudentInfo.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_8 = new JLabel("Is the following information correct?");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(69, 27, 441, 14);
		panelVerifyAccount.add(lblNewLabel_8);
		
		JButton btnNewButton_3 = new JButton("NO");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelVerifyAccount.setVisible(false);
				panelStudentInfo.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(173, 327, 89, 23);
		panelVerifyAccount.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("YES");
		btnNewButton_3_1.setBounds(272, 327, 89, 23);
		panelVerifyAccount.add(btnNewButton_3_1);
		
	}
}
