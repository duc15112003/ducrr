package fromdangki;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import OOP.User;

import fromdangnhap.dangnhapnhanh;
public class xulidangki {
	String user;
	String pass;
	String loaitk;
	String nhaplaipass;
	List<User> list = new ArrayList<>();
	public void add() {
		JOptionPane.showMessageDialog(null,"Đăng Kí Thành Công");
		dangkinhanh.frame.setVisible(false);
		new dangnhapnhanh();
	}
	
}
https://github.com/duc15112003/ducdemo.git
	C:\Users\DUC\Desktop\eclipse java\demo01\src\demo01