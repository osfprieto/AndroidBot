package test;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Test {

	public static void main(String[] args) {
		JTextField text = new JTextField();
		JOptionPane.showMessageDialog(null, text);
		System.out.println(text.getText());
	}

}
