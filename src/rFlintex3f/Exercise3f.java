package rFlintex3f;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Exercise3f extends JFrame {

	private JPanel contentPane;
	private JTextField empIdTextField;
	private JTextField empNameTextField;
	private JLabel departmentLabel;
	private JLabel positionLabel;
	private JTextField positionTextField;
	private JList employeeList;
	private DefaultListModel employeeListModel;
	private JComboBox deptComboBox;
	private Object emp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise3f frame = new Exercise3f();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercise3f() {
		setTitle("Exercise 3F: Overloaded Constructors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 120);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel();     // added manually
		//employeeList = new JList();
		employeeList = new JList(employeeListModel);
		scrollPane.setViewportView(employeeList);
		
		JLabel EmployeeLabel = new JLabel("Employee ID:");
		EmployeeLabel.setBounds(10, 142, 77, 14);
		contentPane.add(EmployeeLabel);
		
		empIdTextField = new JTextField();
		EmployeeLabel.setLabelFor(empIdTextField);
		empIdTextField.setText("101");
		empIdTextField.setBounds(128, 142, 46, 20);
		contentPane.add(empIdTextField);
		empIdTextField.setColumns(10);
		
		JLabel EmployeeNameLabel = new JLabel("Employee name:");
		EmployeeNameLabel.setBounds(10, 167, 86, 14);
		contentPane.add(EmployeeNameLabel);
		
		empNameTextField = new JTextField();
		EmployeeNameLabel.setLabelFor(empNameTextField);
		empNameTextField.setText("Mark Swanson");
		empNameTextField.setBounds(128, 173, 104, 20);
		contentPane.add(empNameTextField);
		empNameTextField.setColumns(10);
		
		deptComboBox = new JComboBox();
		deptComboBox.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenance"}));
		deptComboBox.setBounds(128, 204, 142, 20);
		contentPane.add(deptComboBox);
		
		departmentLabel = new JLabel("Department:");
		departmentLabel.setLabelFor(deptComboBox);
		departmentLabel.setBounds(10, 203, 69, 14);
		contentPane.add(departmentLabel);
		
		positionLabel = new JLabel("Position:");
		positionLabel.setBounds(10, 242, 46, 14);
		contentPane.add(positionLabel);
		
		positionTextField = new JTextField();
		positionLabel.setLabelFor(positionTextField);
		positionTextField.setText("Software Engineer");
		positionTextField.setBounds(128, 239, 129, 20);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		JButton noArgConstructorButton = new JButton("No Arg");
		noArgConstructorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_noArgConstructorButton_actionPerformed(arg0);
			}
		});
		noArgConstructorButton.setBounds(52, 267, 89, 23);
		contentPane.add(noArgConstructorButton);
		
		JButton twoArgConstructorButton = new JButton("2 Arg");
		twoArgConstructorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_twoArgConstructorButton_actionPerformed(e);
			}
		});
		twoArgConstructorButton.setBounds(168, 267, 89, 23);
		contentPane.add(twoArgConstructorButton);
		
		JButton fourArgConstructorButton = new JButton("4 Arg");
		fourArgConstructorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_fourArgConstructorButton_actionPerformed(e);
			}
		});
		fourArgConstructorButton.setBounds(282, 267, 89, 23);
		contentPane.add(fourArgConstructorButton);
	}
	protected void do_noArgConstructorButton_actionPerformed(ActionEvent arg0) {
		// Call appropriate constructor
		 employeeListModel.addElement(emp);
	}
	protected void do_twoArgConstructorButton_actionPerformed(ActionEvent e) {
		// Get empID from empIdTextField, convert to int
		// Call appropriate constructor
		 employeeListModel.addElement(emp);
	}
	protected void do_fourArgConstructorButton_actionPerformed(ActionEvent e) {
		// Get empId from empIdTextField, convert to int
		// Get selected string from deptComboBox
		 String dept = (String) deptComboBox.getSelectedItem();
		// Call appropriate constructor
		 employeeListModel.addElement(emp);
	}
}
