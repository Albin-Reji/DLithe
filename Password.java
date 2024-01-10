package password;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String password="Albin45#reji";
//		System.out.println("Enter the password");
//		password=sc.nextLine();
		
		boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        
        boolean lencheck=lengthCheck(password);
        boolean checkWhitespace=checkWhitespace(password);
        
		for(char ch: password.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				hasUppercase=true;
			}
			else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
		}
		
		if(checkWhitespace==false&&lencheck==true&& hasDigit && hasLowercase && hasSpecialChar && hasSpecialChar) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid password");
		}
		
		
	}
	static boolean lengthCheck(String password) {
		if(password.length()>=8) {
			return true;
		}
		return false;
	}
	
	static boolean checkWhitespace(String password) {
		if(password.contains(" ")){
			return true;
		}
		return false;
	}
	
	

}
