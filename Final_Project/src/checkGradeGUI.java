import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class checkGradeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField enteredID;
	private JTextField resultOOP;
	private JTextField resultDS;
	private JTextField resultWeb;
	private JTextField resultName;


	/**
	 * Create the frame.
	 */
	public checkGradeGUI(Class c) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setBounds(68, 20, 72, 16);
		contentPane.add(lblNewLabel);
		
		enteredID = new JTextField();
		enteredID.setBounds(152, 15, 130, 26);
		contentPane.add(enteredID);
		enteredID.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(292, 15, 117, 29);
		contentPane.add(btnSearch);
		
		JPanel resultPanel = new JPanel();
		resultPanel.setBounds(34, 60, 389, 188);
		contentPane.add(resultPanel);
		resultPanel.setLayout(null);
		resultPanel.setVisible(false);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultPanel.setVisible(true);
				student result = c.search_id(enteredID.getText());
				resultName.setText(result.getName());
				resultWeb.setText(Integer.toString(result.getWebProgramming()));
				resultOOP.setText(Integer.toString(result.getOOP()));
				resultDS.setText(Integer.toString(result.getDS()));
			}
		});
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(37, 23, 36, 16);
		resultPanel.add(lblName);
		
		JLabel lblWeb = new JLabel("Web Programming");
		lblWeb.setBounds(39, 64, 114, 16);
		resultPanel.add(lblWeb);
		
		
		
		JLabel lblOOP = new JLabel("Object Oriented Programming");
		lblOOP.setBounds(37, 106, 187, 16);
		resultPanel.add(lblOOP);
		
		JLabel lblDS = new JLabel("Data Structure");
		lblDS.setBounds(37, 148, 90, 16);
		resultPanel.add(lblDS);
		
		resultOOP = new JTextField();
		resultOOP.setBounds(228, 101, 130, 26);
		resultPanel.add(resultOOP);
		resultOOP.setColumns(10);
		
		resultDS = new JTextField();
		resultDS.setBounds(228, 143, 130, 26);
		resultPanel.add(resultDS);
		resultDS.setColumns(10);
		
		resultWeb = new JTextField();
		resultWeb.setBounds(228, 59, 130, 26);
		resultPanel.add(resultWeb);
		resultWeb.setColumns(10);
		
		resultName = new JTextField();
		resultName.setBounds(228, 18, 130, 26);
		resultPanel.add(resultName);
		resultName.setColumns(10);
		
		
		
	}
}
