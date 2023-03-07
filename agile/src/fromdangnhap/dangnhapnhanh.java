package fromdangnhap;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import fromdangki.dangkinhanh;
public class dangnhapnhanh {
	public JFrame frame;
	private JTextField user;
	private JTextField pass;
	
	public dangnhapnhanh() {
		quanlibuildframe();
	}
	private void quanlibuildframe() {
		frame = new JFrame("Đăng kí tốc hành");
		frame.setSize(468,244);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đăng Nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(168, 11, 195, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tên Đăng nhập");
		lblNewLabel_1.setBounds(10, 69, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(10, 113, 58, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		user = new JTextField();
		user.setBounds(122, 66, 223, 17);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		pass = new JTextField();
		pass.setBounds(120, 110, 225, 20);
		frame.getContentPane().add(pass);
		pass.setColumns(10);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.setBounds(117, 167, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Đăng Kí");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new dangkinhanh();
			}
		});
		btnNewButton_1.setBounds(256, 167, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
	}
}
