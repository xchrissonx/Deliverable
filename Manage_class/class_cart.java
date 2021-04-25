import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.custom.ScrolledComposite;

public class class_cart {

	protected Shell shell;
	private Table table;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			class_cart window = new class_cart();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(666, 783);
		shell.setText("Class Cart");
		shell.setLayout(null);
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(118, 31, 427, 193);
		table.setToolTipText("");
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn course = new TableColumn(table, SWT.CENTER);
		course.setWidth(124);
		course.setText("Course");
		
		TableColumn schedule = new TableColumn(table, SWT.CENTER);
		schedule.setWidth(100);
		schedule.setText("Schedule");
		
		TableColumn professor = new TableColumn(table, SWT.CENTER);
		professor.setWidth(100);
		professor.setText("Professor");
		
		TableColumn units = new TableColumn(table, SWT.CENTER);
		units.setWidth(100);
		units.setText("Units");
		
		Label lblPhysa = new Label(shell, SWT.NONE);
		lblPhysa.setBounds(151, 99, 55, 15);
		lblPhysa.setText("PHYS 11A");
		
		Label lblMath = new Label(shell, SWT.NONE);
		lblMath.setBounds(151, 78, 55, 15);
		lblMath.setText("MATH 100");
		
		Label lblCsc = new Label(shell, SWT.NONE);
		lblCsc.setBounds(151, 117, 55, 15);
		lblCsc.setText("CSC 131");
		
		Label lblAccy = new Label(shell, SWT.NONE);
		lblAccy.setBounds(151, 138, 55, 15);
		lblAccy.setText("ACCY 1");
		
		Label lblPhil = new Label(shell, SWT.NONE);
		lblPhil.setBounds(151, 159, 55, 15);
		lblPhil.setText("PHIL 300");
		
		Label lblMwPm = new Label(shell, SWT.NONE);
		lblMwPm.setBounds(240, 99, 104, 15);
		lblMwPm.setText("M/W 4:00-5:15 P.M.");
		
		Button btnPayFees = new Button(shell, SWT.NONE);
		btnPayFees.setBounds(179, 295, 75, 25);
		btnPayFees.setText("Pay fees");
		
		Button btnReturnToHome = new Button(shell, SWT.NONE);
		btnReturnToHome.setBounds(338, 295, 139, 25);
		btnReturnToHome.setText("Return to home page");

	}
}
