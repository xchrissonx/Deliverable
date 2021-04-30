import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class class_cart {
	private static JTextField amount_field;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] columns = {"Course", "Schedule", "Professor", "Units"};
		Object[][] data = {
				{"MATH 102", "MONDAY", "KATHY ZHONG", "3"},
				{"CSC 131", "TUEDAY", "JAGAN CHIDELLA", "3"},
				{"CHEM 11A", "WEDNESDAY", "JOSH MOSS", "4"},
				{"CSC 130", "THURSDAY", "DEVIN COOK", "3"}
				};
		
		JTable class_cart_table = new JTable(data, columns);
		
		DefaultTableModel model = new DefaultTableModel();
		
		JFrame class_cart_frame = new JFrame("Class Cart");
		class_cart_frame.getContentPane().setBackground(Color.WHITE);
		class_cart_frame.getContentPane().setForeground(Color.WHITE);
		class_cart_frame.setBounds(100, 100, 962, 710);
		class_cart_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		class_cart_frame.getContentPane().setLayout(null);
		class_cart_frame.setLocationRelativeTo(null);
		
		
		class_cart_table.setBackground(Color.white);
		class_cart_table.setForeground(Color.black);
		class_cart_table.setGridColor(Color.gray);
		class_cart_table.setSelectionForeground(Color.white);
		class_cart_table.setRowHeight(30);
		class_cart_table.setAutoCreateRowSorter(true);
		
		JScrollPane pane = new JScrollPane(class_cart_table);
		pane.setForeground(Color.RED);
		pane.setBackground(Color.WHITE);
		pane.setBounds(128, 27, 667, 298);
		class_cart_frame.getContentPane().add(pane);
		
		JLabel units_label = new JLabel("Total units: 13");
		units_label.setBounds(669, 336, 126, 14);
		class_cart_frame.getContentPane().add(units_label);
		
		JLabel total_classes_label = new JLabel("Total classes: 4");
		total_classes_label.setBounds(498, 336, 109, 14);
		class_cart_frame.getContentPane().add(total_classes_label);
		
		JButton pay_button = new JButton("Pay fees");
		pay_button.setBounds(388, 543, 89, 23);
		class_cart_frame.getContentPane().add(pay_button);
		
		
		pay_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (amount_field.getText() == "3600" ) {
						
					JOptionPane.showMessageDialog(class_cart_frame, "Fees paid successfully. Thank you!");
				}
				
				else JOptionPane.showMessageDialog(class_cart_frame, "Payment error!");
			}
		});
		
		
		
		JLabel amount_label = new JLabel("Total amount: $3600");
		amount_label.setBounds(365, 389, 165, 14);
		class_cart_frame.getContentPane().add(amount_label);
		
		JLabel enter_amount_label = new JLabel("Enter amount to be paid:");
		enter_amount_label.setBounds(232, 443, 157, 14);
		class_cart_frame.getContentPane().add(enter_amount_label);
		
		amount_field = new JTextField();
		amount_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				amount_field.getText();
				
			}
		});
		amount_field.setBounds(425, 440, 182, 20);
		class_cart_frame.getContentPane().add(amount_field);
		amount_field.setColumns(10);
		
		Object[] row = new Object[4];
		
		
		class_cart_frame.revalidate();
		class_cart_frame.setVisible(true);
		
	}
}
