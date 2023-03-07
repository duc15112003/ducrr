package fromdangki;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.lang.foreign.Addressable;
import java.awt.event.ActionEvent;
import fromdangki.xulidangki;

public class dangkinhanh {
	
	
	public static JFrame frame;
	private JTextField user;
	private JTextField pass;
	private JTextField checkpass;
	
	public dangkinhanh() {
		quanlibuildframe();
	}
	private void quanlibuildframe() {
		frame = new JFrame("Đăng kí tốc hành");
		frame.setSize(471,300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đăng Kí Nhanh");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(168, 11, 195, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tên Đăng nhập");
		lblNewLabel_1.setBounds(10, 69, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(10, 113, 58, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Check Lại Pass");
		lblNewLabel_3.setBounds(10, 162, 86, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		user = new JTextField();
		user.setBounds(122, 66, 223, 17);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		pass = new JTextField();
		pass.setBounds(120, 110, 225, 20);
		frame.getContentPane().add(pass);
		pass.setColumns(10);
		
		checkpass = new JTextField();
		checkpass.setBounds(122, 159, 223, 20);
		frame.getContentPane().add(checkpass);
		checkpass.setColumns(10);
		
		JButton btnNewButton = new JButton("Đăng kí");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new xulidangki().add();
			}
		});
		btnNewButton.setBounds(122, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setBounds(256, 212, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new dangkinhanh();
	}
}
