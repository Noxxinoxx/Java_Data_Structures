package se.liu.noaan869.lab1;
import javax.swing.JOptionPane;
public class main8 {
	public static void main(String[] args) {
	//the right one to use is the one with double and signs because if the first one fails / returns false then the code will rerun
	//but if we go with the one with a single and sign then the program will go through both and then rerun the process.
		while(true) {
			if (askUser("Quit?") && askUser("Really?")) { 
				break;
			}
		}
		
	}
	
	public static boolean askUser(String data) {
		boolean d = JOptionPane.showConfirmDialog(null, data, "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
		
		if(d == true) {
			return true;
		}
		return false;
		
	}
}
