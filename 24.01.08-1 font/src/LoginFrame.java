import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class LoginFrame extends JFrame {
	private JTextField tfID;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JLabel lblNewLabel;
	
	public LoginFrame() {
		initComponents();
		
		ActionListener l = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// deprecated - 해당 메소드는 더 이상 사용을 권장하지 않음.
				String id = tfID.getText();
				String password = passwordField.getText();
				
				if (id.equals("admin") && password.equals("1234")) {
					
					
				} else {
				lblNewLabel.setText("잘못된 입력입니다.");
				}
			}
		};
		tfID.addActionListener(l);
		passwordField.addActionListener(l);
		btnLogin.addActionListener(l);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void initComponents() {
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JLabel lblID = new JLabel("아이디");
		sl_panel.putConstraint(SpringLayout.NORTH, lblID, 65, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblID, 63, SpringLayout.WEST, panel);
		panel.add(lblID);

		tfID = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, tfID, -3, SpringLayout.NORTH, lblID);
		sl_panel.putConstraint(SpringLayout.WEST, tfID, 30, SpringLayout.EAST, lblID);
		panel.add(tfID);
		tfID.setColumns(10);

		JLabel lblPW = new JLabel("패스워드");
		sl_panel.putConstraint(SpringLayout.NORTH, lblPW, 67, SpringLayout.SOUTH, lblID);
		sl_panel.putConstraint(SpringLayout.WEST, lblPW, 0, SpringLayout.WEST, lblID);
		panel.add(lblPW);

		btnLogin = new JButton("로그인");
		sl_panel.putConstraint(SpringLayout.NORTH, btnLogin, 0, SpringLayout.NORTH, lblID);
		sl_panel.putConstraint(SpringLayout.WEST, btnLogin, 22, SpringLayout.EAST, tfID);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnLogin, 106, SpringLayout.NORTH, lblID);
		sl_panel.putConstraint(SpringLayout.EAST, btnLogin, -70, SpringLayout.EAST, panel);
		panel.add(btnLogin);

		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		sl_panel.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.WEST, tfID);
		sl_panel.putConstraint(SpringLayout.SOUTH, passwordField, 0, SpringLayout.SOUTH, lblPW);
		panel.add(passwordField);
		
		lblNewLabel = new JLabel("qwe");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 76, SpringLayout.SOUTH, passwordField);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 203, SpringLayout.WEST, panel);
		panel.add(lblNewLabel);
	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}
