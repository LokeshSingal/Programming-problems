import java.util.*;

class LargestNumber
{
	public static void main(String[] args)
	{
		int[] arr = {3, 30, 34, 5, 9};
		int n = arr.length;

//		Array<String> data = new Array<String>;
		ArrayList<String> data = new ArrayList<String>();

		for(int i=0;i<n;i++)
		{	
			while (arr[i] != 0)
			{
				
			data.add(String.valueOf(arr[i]%10));			
			arr[i] = arr[i] - (arr[i]%10);
			arr[i] = arr[i]/10;
			}

	
		}
		Collections.sort(data);
		String result="";
		for(int i = data.size()-1;i>=0;i--)
			result += data.get(i);

	}

}
