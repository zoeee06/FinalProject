import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class teacherGUI extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public teacherGUI(Class c) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStats = new JButton("Class Grade's Statistics");
		btnStats.setBounds(134, 30, 190, 29);
		contentPane.add(btnStats);
		
		JButton btnAdd = new JButton("Add Student Grade");
		btnAdd.setBounds(146, 95, 166, 29);
		contentPane.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit Student Grade");
		btnEdit.setBounds(146, 166, 166, 29);
		contentPane.add(btnEdit);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(176, 225, 117, 29);
		contentPane.add(btnExit);
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddGUI add = new AddGUI(c);
				add.show();
			}
		});
		
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditGUI edit = new EditGUI(c);
				edit.show();
			}
		});
		
		btnStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.Web();
				c.OOP();
				c.DS();
				StatsGUI stats = new StatsGUI(c);
				stats.show();
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		
		
		
		
	}

}
