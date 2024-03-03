package Assignment_9;

import java.util.ArrayList;
import java.util.HashSet;

public class PerMutation_String {

	public static void main(String[] args) {
		
		String s="ABC";
		find_permutation(s.toCharArray(), 0);
		
	}
	
	static void swap(char s[], int i, int j) {
		char temp=s[i];
		s[i]=s[j];
		s[j]=temp;
	}
	
	static void find_permutation(char arr[],int fi) {
		if(fi==arr.length-1) {
			System.out.println(arr);
			return;
		}
		for(int i=fi;i<arr.length;i++) {
			swap(arr, i, fi);
			find_permutation(arr, fi+1);
			swap(arr, i, fi);
		}
		
		
	}
	
	
	
	
	

	

}
