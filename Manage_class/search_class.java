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
public class search_class {
	private static JTextField fname_field;
	private static JTextField lname_field;
	private static JTextField subject_field;
	private static JTextField professor_field;
	private static JTextField units_field;
	private static JTextField schedule_field;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JTable search_class_table = new JTable();
		Object[] columns = {"Course", "Schedule", "Professor", "Units"};
		DefaultTableModel model = new DefaultTableModel();
		
		JFrame search_class_frame = new JFrame("Search class");
		search_class_frame.getContentPane().setBackground(Color.WHITE);
		search_class_frame.getContentPane().setForeground(Color.WHITE);
		search_class_frame.setBounds(100, 100, 962, 814);
		search_class_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		search_class_frame.getContentPane().setLayout(null);
		search_class_frame.setLocationRelativeTo(null);
		
		model.setColumnIdentifiers(columns);
		search_class_table.setModel(model);
		
		search_class_table.setBackground(Color.white);
		search_class_table.setForeground(Color.black);
		search_class_table.setGridColor(Color.gray);
		search_class_table.setSelectionForeground(Color.white);
		search_class_table.setRowHeight(30);
		search_class_table.setAutoCreateRowSorter(true);
		
		JScrollPane pane = new JScrollPane(search_class_table);
		pane.setForeground(Color.RED);
		pane.setBackground(Color.WHITE);
		pane.setBounds(202, 28, 553, 298);
		search_class_frame.getContentPane().add(pane);
		
		fname_field = new JTextField();
		fname_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				DefaultTableModel model =(DefaultTableModel)search_class_table.getModel();
				TableRowSorter<DefaultTableModel> table_row = new TableRowSorter<DefaultTableModel>(model);
				search_class_table.setRowSorter(table_row);
				table_row.setRowFilter(RowFilter.regexFilter(fname_field.getText().trim()));
				table_row.setRowFilter(RowFilter.regexFilter(lname_field.getText().trim()));
			}
		});
		fname_field.setBounds(708, 362, 131, 20);
		search_class_frame.getContentPane().add(fname_field);
		fname_field.setColumns(10);
		
		lname_field = new JTextField();
		lname_field.setBounds(708, 406, 131, 20);
		search_class_frame.getContentPane().add(lname_field);
		lname_field.setColumns(10);
		
		JLabel add_class_label = new JLabel("Add a class");
		add_class_label.setBounds(212, 336, 169, 14);
		search_class_frame.getContentPane().add(add_class_label);
		
		JComboBox comboBox = new JComboBox();
		/*
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				String query = comboBox.getSelectedItem().toString();
		
				filter (query);
			}
		});
		*/
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MATH", "CSC", "CHEM", "PHYS"}));
		comboBox.setBounds(248, 361, 150, 22);
		search_class_frame.getContentPane().add(comboBox);
		
		JLabel search_prof_label = new JLabel("Search by Professor");
		search_prof_label.setBounds(586, 337, 169, 14);
		search_class_frame.getContentPane().add(search_prof_label);
		
		JLabel first_name_label = new JLabel("Professor's first name");
		first_name_label.setBounds(467, 365, 168, 14);
		search_class_frame.getContentPane().add(first_name_label);
		
		JLabel last_name_label = new JLabel("Professor's last name");
		last_name_label.setBounds(467, 409, 168, 14);
		search_class_frame.getContentPane().add(last_name_label);
		
		Object[] row = new Object[4];
		
		JButton search_button = new JButton("Search");
		search_button.setBounds(407, 622, 89, 23);
		search_class_frame.getContentPane().add(search_button);
		
		JButton add_class_button = new JButton("Add class");
		add_class_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				row[0] = subject_field.getText();
				row[1] = schedule_field.getText();
				row[2] = professor_field.getText();
				row[3] = units_field.getText();
				
				model.addRow(row);
			}
		});
		add_class_button.setBounds(108, 622, 136, 23);
		search_class_frame.getContentPane().add(add_class_button);
		
		JButton delete_button = new JButton("Delete class");
		delete_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = search_class_table.getSelectedRow();
				
				if (i >= 0) {
					model.removeRow(i);	
				}
				
				else JOptionPane.showMessageDialog(search_class_frame, "Delete error");
			}
		});
		delete_button.setBounds(681, 622, 131, 23);
		search_class_frame.getContentPane().add(delete_button);
		
		subject_field = new JTextField();
		subject_field.setBounds(40, 406, 169, 20);
		search_class_frame.getContentPane().add(subject_field);
		subject_field.setColumns(10);
		
		professor_field = new JTextField();
		professor_field.setBounds(40, 516, 169, 20);
		search_class_frame.getContentPane().add(professor_field);
		professor_field.setColumns(10);
		
		units_field = new JTextField();
		units_field.setBounds(40, 572, 169, 20);
		search_class_frame.getContentPane().add(units_field);
		units_field.setColumns(10);
		
		JLabel enter_subject_label = new JLabel("Enter subject");
		enter_subject_label.setBounds(80, 378, 89, 14);
		search_class_frame.getContentPane().add(enter_subject_label);
		
		JLabel enter_professor_label = new JLabel("Enter professor");
		enter_professor_label.setBounds(80, 491, 115, 14);
		search_class_frame.getContentPane().add(enter_professor_label);
		
		JLabel enter_units_label = new JLabel("Enter units");
		enter_units_label.setBounds(80, 547, 103, 14);
		search_class_frame.getContentPane().add(enter_units_label);
		
		schedule_field = new JTextField();
		schedule_field.setBounds(40, 460, 169, 20);
		search_class_frame.getContentPane().add(schedule_field);
		schedule_field.setColumns(10);
		
		JLabel schedule_label = new JLabel("Enter schedule");
		schedule_label.setBounds(80, 435, 115, 14);
		search_class_frame.getContentPane().add(schedule_label);
		
		//Object[] row = new Object[4];
	
		
		/*
		public void populate(String subject, String schedule, String professor, String units) {
			
			String[] row_data = {subject, schedule, professor, units};
			model.addRow(row_data);
		}
		
		public void add_rows(java.awt.event.ActionEvent e) {
			populate(subject_text.getText(), schedule_text.getText(), professor_text.getText(), units_text.getText());
			
			subject_text.setText("");
			schedule_text.setText("");
			professor_text.setText("");
			units_text.setText("");
		}
		
		public void filter (String query) {
		
			TableRowSorter<DefaultTableModel> table_row = new TableRowSorter<DefaultTableModel>(model);
			search_class_table.setRowSorter(table_row);
			
		}
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				String query = comboBox.getSelectedItem().toString();
		
				filter (query);
			}
		});
*/		
		search_class_frame.revalidate();
		search_class_frame.setVisible(true);
		
	}
}
