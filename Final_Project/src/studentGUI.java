import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class studentGUI extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public studentGUI(Class c) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGrades = new JButton("Check Grades");
		btnGrades.setBounds(162, 74, 117, 29);
		contentPane.add(btnGrades);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(162, 140, 117, 29);
		contentPane.add(btnExit);
		
		// Check Grade GUI 
		btnGrades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGradeGUI grade = new checkGradeGUI(c);
				grade.show();
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
	}

}
