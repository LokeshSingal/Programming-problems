/*
	Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, 
the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, 
there are at least 3 different ways to solve this problem. 

*/

class RotateArray
{

	public static void main(String[] args)
	{
		
		int k = 3;
		
		int[] arr = {1,2,3,4,5,6,7};
		
		int n = arr.length;
		reverse(arr,0,n);
		reverse(arr,0,k);
		reverse(arr,k,n);

		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

	static void reverse(int[] arr,int m,int n)
	{	
		int temp;
	    n=n-1;
	    while( m < n)
		{
			System.out.println("-- > " + n);
			temp = arr[m];
			arr[m] = arr[n];
			arr[n] = temp;
			n--;
			m++;
		}
	}
}