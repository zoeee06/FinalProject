import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EditGUI extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<String> myList;


	/**
	 * Create the frame.
	 */
	
	public void updateList(List<student> stu_list) {
		myList.clear();
		for(student s:stu_list) {
			myList.addElement(String.format("%-12s%-31d%-9d%-14d",s.getName(),s.getWebProgramming(),s.getOOP(),s.getDS()));
		}
		
	}
	public EditGUI(Class c) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		myList = new DefaultListModel<>();
		List<student> stu_list = c.getAllStudents();
		for(student s:stu_list) {
			myList.addElement(String.format("%-12s%-31d%-9d%-14d",s.getName(),s.getWebProgramming(),s.getOOP(),s.getDS()));
		}
		
		JList<String> list = new JList<>(myList);
		list.setBounds(53,26,337,187);
		
		getContentPane().add(list);
		
		this.setVisible(true);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(78, 237, 117, 29);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(230, 237, 117, 29);
		contentPane.add(btnDelete);
		
		String title = String.format("%-10s%-20s%-8s%-15s","Name","Web Programming","OOP","Data Structure");
		JLabel lblNewLabel = new JLabel(title);
		lblNewLabel.setBounds(53, 6, 359, 16);
		contentPane.add(lblNewLabel);
		
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedIndex()!=-1) {
					int index = list.getSelectedIndex();
					student selected = stu_list.get(index);
					ModifyGUI modify = new ModifyGUI(selected,c);
					
					modify.show();
				}
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedIndex()!=-1) {
					int index = list.getSelectedIndex();
					student selected = stu_list.get(index);
					c.deleteStudent(selected);
					updateList(stu_list);

				}
			}
		});
		
		
	}
}
