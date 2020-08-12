package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {
public static void main(String[] args) {
	String question1 = JOptionPane.showInputDialog("Are you happy?");
	if(question1.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
	}
	String question = JOptionPane.showInputDialog("Do you want to be happy?");
	if(question.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Change something");
	}
	else {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
