/* given a sorted array and a target value, return the index if the target is found. If not,
return the index where it would be if it were inserted in order.*/

//You may assume no duplicates in the array.
package Samplecoding;

public class Searchposition{

	void position(int arr[],int target,int n)
	{
		for(int i=0;i<n;i++) {
			if(target==arr[i])
				System.out.println("Target found at" +(i+1)+ "index");
			}
		if(target>arr[n-1])
			System.out.println("Target is supposed to be inserted in the last");
		else {
		int l=0;
		for( l=0;l<n;l++) {
				if(target>arr[l] && target<arr[l+1])
					break;
				}
		System.out.println("The target should be inserted after "+(l+1)+ "nd element");
		
	}
	}
public static void main(String[] args) {
	Searchposition sp=new Searchposition();
	int arr[]= {5,15,20,25,35};
	sp.position(arr,17,5);
}

}
