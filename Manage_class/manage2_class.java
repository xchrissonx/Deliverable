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
public class manage2_class {
	private static JTextField fname_field;
	private static JTextField lname_field;
	private static JTextField subject_field;
   private static JTextField subject1_field;
	private static JTextField professor_field;
	private static JTextField units_field;
	private static JTextField schedule_field;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      //search class
		JTable manage2_class_table = new JTable();
		Object[] columns = {"Course", "Schedule", "Professor", "Units"};
		DefaultTableModel model = new DefaultTableModel();
      
      //pre-req
      JTable pre_req_table = new JTable();
		Object[] columns1 = {"Pre-req courses"};
		DefaultTableModel model1 = new DefaultTableModel();
		
      
      //search class
		JFrame manage2_class_frame = new JFrame("Manage class");
		manage2_class_frame.getContentPane().setBackground(Color.WHITE);
		manage2_class_frame.getContentPane().setForeground(Color.WHITE);
		manage2_class_frame.setBounds(100, 100, 962, 814);
		manage2_class_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		manage2_class_frame.getContentPane().setLayout(null);
		manage2_class_frame.setLocationRelativeTo(null);
      
      
		//search class
		model.setColumnIdentifiers(columns);
		manage2_class_table.setModel(model);
      
      //pre-req
      model1.setColumnIdentifiers(columns1);
      pre_req_table.setModel(model1);
		
      
      //search class
		manage2_class_table.setBackground(Color.white);
		manage2_class_table.setForeground(Color.black);
		manage2_class_table.setGridColor(Color.gray);
		manage2_class_table.setSelectionForeground(Color.white);
		manage2_class_table.setRowHeight(30);
		manage2_class_table.setAutoCreateRowSorter(true);
      
      
      //add pre-req table
      pre_req_table.setBackground(Color.white);
		pre_req_table.setForeground(Color.black);
		pre_req_table.setGridColor(Color.gray);
		pre_req_table.setSelectionForeground(Color.white);
		pre_req_table.setRowHeight(30);
		pre_req_table.setAutoCreateRowSorter(true);
      
      //pre-req
      JScrollPane paneee = new JScrollPane(pre_req_table);
		paneee.setForeground(Color.RED);
		paneee.setBackground(Color.WHITE);
		paneee.setBounds(580, 350, 200, 350);
		manage2_class_frame.getContentPane().add(paneee);
      
		
      //search class
		JScrollPane pane = new JScrollPane(manage2_class_table);
		pane.setForeground(Color.RED);
		pane.setBackground(Color.WHITE);
		pane.setBounds(202, 28, 553, 298);
		manage2_class_frame.getContentPane().add(pane);
		
		fname_field = new JTextField();
		fname_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				DefaultTableModel model =(DefaultTableModel)manage2_class_table.getModel();
				TableRowSorter<DefaultTableModel> table_row = new TableRowSorter<DefaultTableModel>(model);
				manage2_class_table.setRowSorter(table_row);
				table_row.setRowFilter(RowFilter.regexFilter(fname_field.getText().trim()));
				table_row.setRowFilter(RowFilter.regexFilter(lname_field.getText().trim()));
			}
		});/*
		fname_field.setBounds(708, 362, 131, 20);
		manage2_class_frame.getContentPane().add(fname_field);
		fname_field.setColumns(10);
		
		lname_field = new JTextField();
		lname_field.setBounds(708, 406, 131, 20);
		manage2_class_frame.getContentPane().add(lname_field);
		lname_field.setColumns(10);
		*/
		JLabel add_class_label = new JLabel("Add a class");
		add_class_label.setBounds(212, 336, 169, 14);
		manage2_class_frame.getContentPane().add(add_class_label);
		
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
		manage2_class_frame.getContentPane().add(comboBox);
		/*
		JLabel search_prof_label = new JLabel("Search by Professor");
		search_prof_label.setBounds(586, 337, 169, 14);
		manage2_class_frame.getContentPane().add(search_prof_label);
		
		JLabel first_name_label = new JLabel("Professor's first name");
		first_name_label.setBounds(467, 365, 168, 14);
		manage2_class_frame.getContentPane().add(first_name_label);
		
		JLabel last_name_label = new JLabel("Professor's last name");
		last_name_label.setBounds(467, 409, 168, 14);
		manage2_class_frame.getContentPane().add(last_name_label);
		*/
      Object[] row1 = new Object[20];
      
		Object[] row = new Object[4];
		/*
		JButton search_button = new JButton("Search");
		search_button.setBounds(407, 622, 89, 23);
		manage2_class_frame.getContentPane().add(search_button);
		*/
		JButton add_class_button = new JButton("Add class");
		add_class_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				row[0] = subject_field.getText();
				row[1] = schedule_field.getText();
				row[2] = professor_field.getText();
				row[3] = units_field.getText();
            
            row1[0] = subject_field.getText();
				
				model.addRow(row);
            model1.addRow(row1);
			}
		});
		add_class_button.setBounds(108, 622, 136, 23);
		manage2_class_frame.getContentPane().add(add_class_button);
		
		JButton delete_button = new JButton("Delete class");
		delete_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = manage2_class_table.getSelectedRow();
				
				if (i >= 0) {
					model.removeRow(i);	
				}
				
				else JOptionPane.showMessageDialog(manage2_class_frame, "Delete error");
			}
		});
		delete_button.setBounds(108, 650, 136, 23);
		manage2_class_frame.getContentPane().add(delete_button);
		
		subject_field = new JTextField();
		subject_field.setBounds(40, 406, 169, 20);
		manage2_class_frame.getContentPane().add(subject_field);
		subject_field.setColumns(10);
		
		professor_field = new JTextField();
		professor_field.setBounds(40, 516, 169, 20);
		manage2_class_frame.getContentPane().add(professor_field);
		professor_field.setColumns(10);
		
		units_field = new JTextField();
		units_field.setBounds(40, 572, 169, 20);
		manage2_class_frame.getContentPane().add(units_field);
		units_field.setColumns(10);
		
		JLabel enter_subject_label = new JLabel("Enter subject");
		enter_subject_label.setBounds(80, 378, 89, 14);
		manage2_class_frame.getContentPane().add(enter_subject_label);
		
		JLabel enter_professor_label = new JLabel("Enter professor");
		enter_professor_label.setBounds(80, 491, 115, 14);
		manage2_class_frame.getContentPane().add(enter_professor_label);
		
		JLabel enter_units_label = new JLabel("Enter units");
		enter_units_label.setBounds(80, 547, 103, 14);
		manage2_class_frame.getContentPane().add(enter_units_label);
		
		schedule_field = new JTextField();
		schedule_field.setBounds(40, 460, 169, 20);
		manage2_class_frame.getContentPane().add(schedule_field);
		schedule_field.setColumns(10);
		
		JLabel schedule_label = new JLabel("Enter schedule");
		schedule_label.setBounds(80, 435, 115, 14);
		manage2_class_frame.getContentPane().add(schedule_label);
      
      
      
      //Check pre-req
      JButton pre_req_button = new JButton("Check Pre-req");
      pre_req_button.setBounds(540, 710, 136, 23);
		manage2_class_frame.getContentPane().add(pre_req_button);
      
      //empty place to write 
      JLabel enter1_subject1_label = new JLabel("Enter Subject");
		enter1_subject1_label.setBounds(712, 730, 136, 23);
		manage2_class_frame.getContentPane().add(enter1_subject1_label);
      
      subject1_field = new JTextField();
		subject1_field.setBounds(700, 712, 100, 20);
		manage2_class_frame.getContentPane().add(subject1_field);
		subject1_field.setColumns(10);
      
      
		pre_req_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
            //student schedule
				row1[0] = subject_field.getText();
				
				//subject1_field.getText();
				//model1.addRow(row1);
            

            System.out.println(subject1_field.getText());
            System.out.println(subject_field.getText());
            System.out.println(pre_req_table.getRowCount());	
            
            for(int i = 0; i <= pre_req_table.getRowCount(); i++) {
               if (row[i].equals(subject_field.getText())) {
					JOptionPane.showMessageDialog(manage2_class_frame, "can't add this class");
               System.out.println(row1[i]);

				}
            
            }
            
            
				
            
			}
		});
      
      

      
		manage2_class_frame.revalidate();
		manage2_class_frame.setVisible(true);
		
	}
}
