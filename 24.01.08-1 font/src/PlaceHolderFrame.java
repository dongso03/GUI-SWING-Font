import java.awt.BorderLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlaceHolderFrame extends JFrame {
	
	public PlaceHolderFrame() {
		JLabel lbl = new JLabel("아이디");
		JTextField tf = new JTextField(10);
		
		lbl.setLabelFor(tf);
	
		JLabel lblHint = new JLabel("아이디는 영문자이며 10자이내여야한다.");
		JPanel pnl = new JPanel();
		tf.setToolTipText("아이디는 영문자이며 10자이내여야한다.");

		tf.setLayout(new BorderLayout());
		JLabel lblPlaceHolder = new JLabel("예시) admin");
		tf.add(lblPlaceHolder);
		
		
		tf.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				lblPlaceHolder.setVisible(true);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				lblPlaceHolder.setVisible(false);
			}
		});
		JTextField temp = new JTextField(10);
		pnl.add(temp);
		pnl.add(lbl);
		pnl.add(tf);
		pnl.add(lblHint);
		add(pnl);
		showGUI();
		
		
	}
	
private void showGUI() {
	
	setSize(500, 500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
}
	public static void main(String[] args) {
		new PlaceHolderFrame();
	}
}
