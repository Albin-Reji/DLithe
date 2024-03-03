package Assignment_9;

import java.nio.channels.Channels;
import java.util.HashMap;

public class Non_Repeting_Character {

	public static void main(String[] args) {
		String s="zxvczbtxyzvy";
		System.out.println(returnNonReeatingChar(s));

	}
	static char returnNonReeatingChar(String s) {
		int cnt=0;
		HashMap<Character, Integer> stringMap=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(!stringMap.containsKey(s.charAt(i))) {
				stringMap.put(s.charAt(i), 1);
			}
			else {
				cnt=stringMap.get(s.charAt(i));
				stringMap.put(s.charAt(i), cnt+1);
			}
				
		}
		for(int i=0;i<s.length();i++) {
			if(stringMap.get(s.charAt(i))==1) {
				return s.charAt(i);
//				System.out.println(s.charAt(i));
			}
		}
		return ' ';
	}

}
