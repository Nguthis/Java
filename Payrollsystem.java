package payroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class Payroll_system {

	private JFrame frame;
	private JTextField textField;
	private JTextField textRate;
	private JTextField textHour;
	private JTextField textDays;
	private JTextField textGross;
	private JTextField textTax;
	private JTextField textPhilhealth;
	private JTextField textsss;
	private JTextField textTotDed;
	private JTextField textGrossSalary;
	private JTextField textDeduction;
	private JTextField textNet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payroll_system window = new Payroll_system();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payroll_system() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 200, 900, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(319, 11, 262, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbEmployeeName = new JLabel("Employee Name :");
		lbEmployeeName.setBounds(52, 49, 112, 14);
		frame.getContentPane().add(lbEmployeeName);
		
		JLabel lblRate = new JLabel("Rate per Hour:");
		lblRate.setBounds(65, 88, 99, 14);
		frame.getContentPane().add(lblRate);
		
		JLabel lbHour = new JLabel("Hour Per Day:");
		lbHour.setBounds(64, 113, 100, 14);
		frame.getContentPane().add(lbHour);
		
		JLabel lblDays = new JLabel("Number Of Days Worked:");
		lblDays.setBounds(10, 151, 154, 14);
		frame.getContentPane().add(lblDays);
		
		JLabel lblNewLabel_5 = new JLabel("GROSS SALARY:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_5.setBounds(53, 184, 82, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(174, 49, 136, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textRate = new JTextField();
		textRate.setBounds(174, 85, 86, 20);
		frame.getContentPane().add(textRate);
		textRate.setColumns(10);
		
		textHour = new JTextField();
		textHour.setBounds(174, 110, 86, 20);
		frame.getContentPane().add(textHour);
		textHour.setColumns(10);
		
		textDays = new JTextField();
		textDays.setBounds(174, 148, 86, 20);
		frame.getContentPane().add(textDays);
		textDays.setColumns(10);
		
		textGross = new JTextField();
		textGross.setEditable(false);
		textGross.setBounds(174, 181, 86, 20);
		frame.getContentPane().add(textGross);
		textGross.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(372, 49, 168, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("TAX 15% of Monthly Wage");
		lblNewLabel_6.setBounds(270, 88, 158, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textTax = new JTextField();
		textTax.setEditable(false);
		textTax.setBounds(454, 85, 86, 20);
		frame.getContentPane().add(textTax);
		textTax.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Philhealth 5%");
		lblNewLabel_7.setBounds(312, 116, 116, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("SSS 2%");
		lblNewLabel_8.setBounds(338, 151, 90, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("TOTAL DEDUCTION :");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(327, 184, 117, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		textPhilhealth = new JTextField();
		textPhilhealth.setEditable(false);
		textPhilhealth.setBounds(454, 110, 86, 20);
		frame.getContentPane().add(textPhilhealth);
		textPhilhealth.setColumns(10);
		
		textsss = new JTextField();
		textsss.setEditable(false);
		textsss.setBounds(454, 148, 86, 20);
		frame.getContentPane().add(textsss);
		textsss.setColumns(10);
		
		textTotDed = new JTextField();
		textTotDed.setEditable(false);
		textTotDed.setBounds(454, 181, 86, 20);
		frame.getContentPane().add(textTotDed);
		textTotDed.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Gross Salary");
		lblNewLabel_10.setBounds(588, 88, 110, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Deduction");
		lblNewLabel_11.setBounds(598, 113, 100, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		textGrossSalary = new JTextField();
		textGrossSalary.setEditable(false);
		textGrossSalary.setBounds(731, 85, 86, 20);
		frame.getContentPane().add(textGrossSalary);
		textGrossSalary.setColumns(10);
		
		textDeduction = new JTextField();
		textDeduction.setEditable(false);
		textDeduction.setBounds(731, 110, 86, 20);
		frame.getContentPane().add(textDeduction);
		textDeduction.setColumns(10);
		
		textNet = new JTextField();
		textNet.setEditable(false);
		textNet.setBounds(731, 181, 86, 20);
		frame.getContentPane().add(textNet);
		textNet.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("NET SALARY :");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(588, 184, 110, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rate, hour, days, grossSalary;
				double tax,philhealth, sss,deduction, netSalary;
				
				rate=Integer.valueOf(textRate.getText());
				hour=Integer.valueOf(textHour.getText());
				days=Integer.valueOf(textDays.getText());
				grossSalary=rate*hour*days;
				
				textGross.setText(String.valueOf(grossSalary));
				
				tax=0.15*grossSalary;
				textTax.setText(String.valueOf(tax));
				
				philhealth=0.05*grossSalary;
				textPhilhealth.setText(String.valueOf(philhealth));
				
				sss=0.02*grossSalary;
				textsss.setText(String.valueOf(sss));
				
				textGrossSalary.setText(String.valueOf(grossSalary));
				
				deduction=tax +philhealth+sss;
				textDeduction.setText(String.valueOf(deduction));
				textTotDed.setText(String.valueOf(deduction));
				
				netSalary=grossSalary-deduction;
				textNet.setText(String.valueOf(netSalary));
				
		}
		});
		btnCompute.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCompute.setForeground(new Color(0, 0, 0));
		btnCompute.setBackground(new Color(0, 128, 128));
		btnCompute.setBounds(445, 212, 95, 38);
		frame.getContentPane().add(btnCompute);
	}
}
