package Assignment_9;

public class Return_MinSort {

	public static void main(String[] args) {
		int arr[] = {2, 8, 5, 4};
;
		System.out.println(swap(arr, 0, arr.length-1));

	}
	
	static int  swap(int arr[], int i, int j) {
		int cnt=0;
		while(i<=j) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;j--;
				cnt++;
			}
			else {
				i++;j--;
			}
		}
		return cnt;
	}

}
