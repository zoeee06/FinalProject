import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public mainGUI(Class c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("School Grade Management System");
		lblTitle.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblTitle.setBounds(84, 6, 291, 42);
		contentPane.add(lblTitle);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.setBounds(159, 67, 117, 29);
		contentPane.add(btnStudent);
		
		JButton btnTeacher = new JButton("Teacher");
		btnTeacher.setBounds(159, 122, 117, 29);
		contentPane.add(btnTeacher);
		
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentGUI stu = new studentGUI(c);
				stu.show();
			}
		});
		
		btnTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherGUI teacher = new teacherGUI(c);
				teacher.show();
			}
		});
		
		
	}
	

}
