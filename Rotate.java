//Program to rotate d elements in an array
package Samplecoding;

/**
 * @author rishi
 *
 */
public class Rotate {
	
	void leftRotate(int arr[], int d, int n) 
    { 
        for (int i = 0; i < d; i++) 
            leftRotatebyOne(arr, n); 
    } 
	
	void leftRotatebyOne(int arr[],int n)
	{
		int i=0;
		int temp;
		temp= arr[0];
		for(i=0;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]= temp;
	}
	 void printArray(int arr[],int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(arr[i]+"");
		 }
	 }
  
	
	public static void main(String[] args) {
	   Rotate rt=new Rotate();
	  int arr[]= {2,3,4,5,6};
		rt.leftRotate(arr,2,5);
		rt.printArray(arr, 5);

	}

}
