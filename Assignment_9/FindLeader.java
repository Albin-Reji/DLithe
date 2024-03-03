package Assignment_9;

import java.util.ArrayList;
import java.util.Collections;

public class FindLeader {

	public static void main(String[] args) {
		int arr[]=  {1,2,3,4,0};
		ArrayList< Integer> leaders=getLeader(arr);
		Collections.sort(leaders, Collections.reverseOrder());
		for(Integer leader :leaders) {
			System.out.println(leader);
		}
		

	}
	static ArrayList<Integer> getLeader(int[] arr) {
		int leader=0;
		ArrayList<Integer> leaders=new ArrayList<>();
		leaders.add(arr[arr.length-1]);
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>leader) {
				leader=arr[i];
				leaders.add(arr[i]);
			}
		}
		return leaders;
		
	}

}
