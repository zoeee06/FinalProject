import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StatsGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textOOPMin;
	private JTextField textOOPMax;
	private JTextField textOOPAverage;
	private JTextField textWebMin;
	private JTextField textWebMax;
	private JTextField textWebAverage;
	private JTextField textDSMin;
	private JTextField textDSMax;
	private JTextField textDSAverage;


	/**
	 * Create the frame.
	 */
	public StatsGUI(Class c) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setBounds(217, 22, 61, 16);
		contentPane.add(lblMin);
		
		JLabel lblMax = new JLabel("Max");
		lblMax.setBounds(299, 22, 61, 16);
		contentPane.add(lblMax);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setBounds(383, 22, 61, 16);
		contentPane.add(lblAverage);
		
		JLabel lblWeb = new JLabel("Web Programming");
		lblWeb.setBounds(17, 63, 114, 16);
		contentPane.add(lblWeb);
		
		JLabel lblOOP = new JLabel("Object Oriented Programming");
		lblOOP.setBounds(17, 129, 187, 16);
		contentPane.add(lblOOP);
		
		JLabel lblDS = new JLabel("Data Structure");
		lblDS.setBounds(19, 195, 103, 16);
		contentPane.add(lblDS);
		
		textOOPMin = new JTextField();
		textOOPMin.setBounds(214, 124, 64, 26);
		contentPane.add(textOOPMin);
		textOOPMin.setColumns(10);
		
		textOOPMax = new JTextField();
		textOOPMax.setColumns(10);
		textOOPMax.setBounds(296, 124, 64, 26);
		contentPane.add(textOOPMax);
		
		textOOPAverage = new JTextField();
		textOOPAverage.setColumns(10);
		textOOPAverage.setBounds(380, 124, 64, 26);
		contentPane.add(textOOPAverage);
		
		textWebMin = new JTextField();
		textWebMin.setColumns(10);
		textWebMin.setBounds(214, 58, 64, 26);
		contentPane.add(textWebMin);
		
		textWebMax = new JTextField();
		textWebMax.setColumns(10);
		textWebMax.setBounds(296, 58, 64, 26);
		contentPane.add(textWebMax);
		
		textWebAverage = new JTextField();
		textWebAverage.setColumns(10);
		textWebAverage.setBounds(380, 58, 64, 26);
		contentPane.add(textWebAverage);
		
		textDSMin = new JTextField();
		textDSMin.setColumns(10);
		textDSMin.setBounds(217, 190, 64, 26);
		contentPane.add(textDSMin);
		
		textDSMax = new JTextField();
		textDSMax.setColumns(10);
		textDSMax.setBounds(296, 190, 64, 26);
		contentPane.add(textDSMax);
		
		textDSAverage = new JTextField();
		textDSAverage.setColumns(10);
		textDSAverage.setBounds(380, 190, 64, 26);
		contentPane.add(textDSAverage);
		
		//display stats
		textWebMin.setText(Integer.toString(c.getWebMin()));
		textWebMax.setText(Integer.toString(c.getWebMax()));
		textWebAverage.setText(Integer.toString(c.getWebAvg()));
		
		textOOPMin.setText(Integer.toString(c.getOOPMin()));
		textOOPMax.setText(Integer.toString(c.getOOPMax()));
		textOOPAverage.setText(Integer.toString(c.getOOPAvg()));
		
		textDSMin.setText(Integer.toString(c.getDSMin()));
		textDSMax.setText(Integer.toString(c.getDSMax()));
		textDSAverage.setText(Integer.toString(c.getDSAvg()));
	}

}
