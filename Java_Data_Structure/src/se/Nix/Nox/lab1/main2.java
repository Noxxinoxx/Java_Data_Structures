package se.liu.noaan869.lab1;

import javax.swing.JOptionPane;

public class main2 {
	public static void main(String[] args) {
		
		final int min = 10; 
		final int max = 20;
		String input = JOptionPane.showInputDialog("Please input a value");
		
		switch(input) {
		case "while": 
			System.out.println(sumWhile(min, max));
			break;
		case "for":
			System.out.println(sumFor(min, max));
			break;
		default: 
			System.out.println(sumFor(min, max));
			break;
		}
	}
	
	public static int sumFor(int min, int max) {
		for (int i = min; i < max; i++) {
			min = min + i + 1;
		}
		return min;
	}
	
	public static int sumWhile(int min, int max) {
		int i = min;
		while(i < max) {
			i = i + 1; 
			min = min + i;
			
		}
		return min;
	}
	
}
