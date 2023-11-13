package payroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;

public class Georgetown extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JPanel panel_2;
	private JButton btnNewButton;
	private JTextField textField_16;
	private JTextField textField_17;
	private JLabel lblHours;
	private JLabel lblRegular;
	private JLabel lblOvertime;
	private JLabel lblAmount;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JLabel lblNetPay;
	private JButton btnClose;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Georgetown frame = new Georgetown();
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
	public Georgetown() {
		setBackground(new Color(192, 192, 192));
		setForeground(new Color(0, 0, 0));
		setTitle("Georgetown cleaning services-Employee Payroll");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setName("Employee identification");
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 44, 1015, 98);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(28, 40, 140, 23);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(175, 36, 264, 31);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(612, 32, 122, 31);
		panel.add(textField_1);
		
		JLabel lblHourlySalary = new JLabel("Hourly Salary:");
		lblHourlySalary.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHourlySalary.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblHourlySalary.setBounds(488, 36, 117, 23);
		panel.add(lblHourlySalary);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setName("Employee identification");
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 165, 1015, 171);
		contentPane.add(panel_1);
		
		JLabel lblFirstWeek = new JLabel("First Week:");
		lblFirstWeek.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstWeek.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFirstWeek.setBounds(25, 55, 97, 23);
		panel_1.add(lblFirstWeek);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setBounds(155, 54, 97, 31);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_3.setBounds(155, 105, 97, 31);
		panel_1.add(textField_3);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMonday.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMonday.setBounds(163, 20, 73, 23);
		panel_1.add(lblMonday);
		
		JLabel lblSecondWeek = new JLabel("Second Week:");
		lblSecondWeek.setHorizontalAlignment(SwingConstants.LEFT);
		lblSecondWeek.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSecondWeek.setBounds(25, 109, 109, 23);
		panel_1.add(lblSecondWeek);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTuesday.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTuesday.setBounds(288, 20, 73, 23);
		panel_1.add(lblTuesday);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_4.setBounds(280, 54, 97, 31);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.setColumns(10);
		textField_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_5.setBounds(280, 105, 97, 31);
		panel_1.add(textField_5);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWednesday.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblWednesday.setBounds(410, 20, 89, 23);
		panel_1.add(lblWednesday);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_6.setBounds(410, 54, 97, 31);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_7.setColumns(10);
		textField_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_7.setBounds(410, 105, 97, 31);
		panel_1.add(textField_7);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setHorizontalAlignment(SwingConstants.RIGHT);
		lblThursday.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblThursday.setBounds(550, 20, 73, 23);
		panel_1.add(lblThursday);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_8.setBounds(542, 54, 97, 31);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_9.setColumns(10);
		textField_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_9.setBounds(542, 105, 97, 31);
		panel_1.add(textField_9);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFriday.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFriday.setBounds(670, 20, 73, 23);
		panel_1.add(lblFriday);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_10.setBounds(662, 54, 97, 31);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_11.setColumns(10);
		textField_11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_11.setBounds(662, 105, 97, 31);
		panel_1.add(textField_11);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSaturday.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSaturday.setBounds(793, 20, 73, 23);
		panel_1.add(lblSaturday);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_12.setBounds(785, 54, 97, 31);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_13.setColumns(10);
		textField_13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_13.setBounds(785, 105, 97, 31);
		panel_1.add(textField_13);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSunday.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSunday.setBounds(916, 20, 73, 23);
		panel_1.add(lblSunday);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_14.setBounds(908, 54, 97, 31);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_15.setColumns(10);
		textField_15.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_15.setBounds(908, 105, 97, 31);
		panel_1.add(textField_15);
		
		panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setLayout(null);
		panel_2.setName("Employee identification");
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 367, 1015, 161);
		contentPane.add(panel_2);
		
		btnNewButton = new JButton("Process It");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
		btnNewButton.setBounds(27, 30, 132, 107);
		panel_2.add(btnNewButton);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_16.setColumns(10);
		textField_16.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_16.setBounds(286, 68, 97, 31);
		panel_2.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_17.setColumns(10);
		textField_17.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_17.setBounds(286, 119, 97, 31);
		panel_2.add(textField_17);
		
		lblHours = new JLabel("Hours");
		lblHours.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblHours.setBounds(294, 34, 53, 23);
		panel_2.add(lblHours);
		
		lblRegular = new JLabel("Regular:");
		lblRegular.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRegular.setBounds(191, 69, 73, 23);
		panel_2.add(lblRegular);
		
		lblOvertime = new JLabel("Overtime:");
		lblOvertime.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblOvertime.setBounds(191, 127, 82, 23);
		panel_2.add(lblOvertime);
		
		lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAmount.setBounds(441, 34, 73, 23);
		panel_2.add(lblAmount);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_18.setColumns(10);
		textField_18.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_18.setBounds(433, 68, 97, 31);
		panel_2.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_19.setColumns(10);
		textField_19.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_19.setBounds(433, 119, 97, 31);
		panel_2.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_20.setColumns(10);
		textField_20.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_20.setBounds(671, 70, 97, 31);
		panel_2.add(textField_20);
		
		lblNetPay = new JLabel("Net Pay:");
		lblNetPay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNetPay.setBounds(599, 69, 73, 23);
		panel_2.add(lblNetPay);
		
		btnClose = new JButton("Close");
		btnClose.setBackground(new Color(192, 192, 192));
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClose.setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
		btnClose.setBounds(862, 37, 118, 100);
		panel_2.add(btnClose);
	}
}