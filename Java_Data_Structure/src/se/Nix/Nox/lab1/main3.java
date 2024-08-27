package se.liu.noaan869.lab1;

import javax.swing.JOptionPane;

public class main3 {
	
	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Please input a value");
		
		int TABELL = Integer.parseInt(input);
		
		
		for(int i = 0; i < TABELL; i++) {
			
			System.out.println(i * TABELL);
		}
		
		
	}
	
}
