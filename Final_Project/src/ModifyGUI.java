import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ModifyGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textOOP;
	private JTextField textDS;
	private JTextField textWeb;
	private JTextField textName;
	private JTextField textId;
	private JButton btnSave;


	/**
	 * Create the frame.
	 */
	public ModifyGUI(student s,Class c) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 471, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStuID = new JLabel("Student ID");
		lblStuID.setBounds(34, 23, 74, 16);
		contentPane.add(lblStuID);
		
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(34, 65, 61, 16);
		contentPane.add(lblName);
		
		
		
		JLabel lblWeb = new JLabel("Web Programming");
		lblWeb.setBounds(34, 111, 114, 16);
		contentPane.add(lblWeb);
		
		
		
		JLabel lblOOP = new JLabel("Object Oriented Programming");
		lblOOP.setBounds(34, 158, 198, 16);
		contentPane.add(lblOOP);
		
		JLabel lblDS = new JLabel("Data Structure");
		lblDS.setBounds(34, 206, 95, 16);
		contentPane.add(lblDS);
		
		textOOP = new JTextField();
		textOOP.setBounds(230, 153, 130, 26);
		contentPane.add(textOOP);
		textOOP.setColumns(10);
		
		textDS = new JTextField();
		textDS.setBounds(230, 201, 130, 26);
		contentPane.add(textDS);
		textDS.setColumns(10);
		
		textWeb = new JTextField();
		textWeb.setBounds(230, 106, 130, 26);
		contentPane.add(textWeb);
		textWeb.setColumns(10);
		
		textName = new JTextField();
		textName.setBounds(230, 60, 130, 26);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textId = new JTextField();
		textId.setBounds(230, 18, 130, 26);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textOOP.setText(Integer.toString(s.getOOP()));
		textDS.setText(Integer.toString(s.getDS()));
		textWeb.setText(Integer.toString(s.getWebProgramming()));
		textName.setText(s.getName());
		textId.setText(s.getId());
		
		btnSave = new JButton("Save");
		btnSave.setBounds(157, 239, 117, 29);
		contentPane.add(btnSave);
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.setDS(Integer.parseInt(textDS.getText()));
				s.setOOP(Integer.parseInt(textOOP.getText()));
				s.setWebProgramming(Integer.parseInt(textWeb.getText()));
				s.setName(textName.getText());
				s.setId(textId.getText());
				

			}
		});
		
		
	}

}
