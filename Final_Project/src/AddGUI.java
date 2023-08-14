import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddGUI extends JFrame {

	private JPanel contentPane;
	private JTextField enterID;
	private JTextField enterName;
	private JTextField enterWeb;
	private JTextField enterOOP;
	private JTextField enterDS;
	private JButton btnReset;


	/**
	 * Create the frame.
	 */
	
	public AddGUI(Class c) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 471, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStuID = new JLabel("Student ID");
		lblStuID.setBounds(34, 23, 74, 16);
		contentPane.add(lblStuID);
		
		enterID = new JTextField();
		enterID.setBounds(227, 18, 130, 26);
		contentPane.add(enterID);
		enterID.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(34, 65, 61, 16);
		contentPane.add(lblName);
		
		enterName = new JTextField();
		enterName.setBounds(227, 60, 130, 26);
		contentPane.add(enterName);
		enterName.setColumns(10);
		
		JLabel lblWeb = new JLabel("Web Programming");
		lblWeb.setBounds(34, 111, 114, 16);
		contentPane.add(lblWeb);
		
		enterWeb = new JTextField();
		enterWeb.setBounds(227, 106, 130, 26);
		contentPane.add(enterWeb);
		enterWeb.setColumns(10);
		
		JLabel lblOOP = new JLabel("Object Oriented Programming");
		lblOOP.setBounds(34, 158, 198, 16);
		contentPane.add(lblOOP);
		
		JLabel lblDS = new JLabel("Data Structure");
		lblDS.setBounds(34, 206, 95, 16);
		contentPane.add(lblDS);
		
		enterOOP = new JTextField();
		enterOOP.setBounds(227, 153, 130, 26);
		contentPane.add(enterOOP);
		enterOOP.setColumns(10);
		
		enterDS = new JTextField();
		enterDS.setBounds(227, 201, 130, 26);
		contentPane.add(enterDS);
		enterDS.setColumns(10);
		
		JButton btnAddNew = new JButton("Add");
		btnAddNew.setBounds(88, 254, 117, 29);
		contentPane.add(btnAddNew);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setBounds(263, 254, 117, 29);
		contentPane.add(btnReset);
		
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID = enterID.getText();
				String Name = enterName.getText();
				int WebProgramming = Integer.parseInt(enterWeb.getText());
				int OOP = Integer.parseInt(enterOOP.getText());
				int DS = Integer.parseInt(enterDS.getText());
				student newStu = new student(ID,Name,WebProgramming,OOP,DS);
				c.addStudent(newStu);
			}

		});
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterID.setText("");
				enterName.setText("");
				enterWeb.setText("");
				enterOOP.setText("");
				enterDS.setText("");
			}
		});
		
		
	}

}
