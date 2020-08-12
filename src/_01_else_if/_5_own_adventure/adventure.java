package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class adventure {
private static String beach;
private static String park;




public static void main(String[] args) {
	String question1 = JOptionPane.showInputDialog("Do you want to go to the beach or the amusement park?");
	if(question1.equals("beach")) {
		beach = JOptionPane.showInputDialog("Do you want to go surfing or lay and tan on the sand?");
	}
	else {
		park = JOptionPane.showInputDialog("Do you want to go on the roller coaster or the ferris wheel?");
	}
	if(beach.equals("surfing")) {
		JOptionPane.showMessageDialog(null, "You caught an awesome barrel and had a great time!");
	}
	else {
		JOptionPane.showMessageDialog(null, "You forgot to put sunscreen on and got a horrible sunburn :(");
	}
	if(park.equals("roller coaster")) {
		JOptionPane.showMessageDialog(null, "The restraits weren't attached properly and you fell and had to go to the hospital");
	}
	else {
		JOptionPane.showMessageDialog(null, "The ferris wheel got stuck and you got to talking with the person next to you. Little do you know that they are the love of your life.");
	}
	
	
	
}
}
