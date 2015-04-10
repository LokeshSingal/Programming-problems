/*
	Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 
(represented in binary as 00000010100101000001111010011100), 
return 964176192 
(represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?



*/


class ReverseNumber
{
	// public int reverseBits(int n) throws IOException {
        

        public static void main (String[] args)
        {

	        double result = 0;
	        int res = 0;
			//BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
			//n = Integer.valueOf(br.readLine());
			int[] arr = new int[32];

			for(int i=31;i>=0;i--)
			{
				arr[i] = n & 1;
				n >>=1;
			}
			
			for(int i=0;i<32;i++)
			{
						//System.out.print(arr[i]);

				result =result + Math.pow((double)2,(double)i) * (double)arr[i];
			}
			
	        res = (int)result;
	        
	        //return res;
	        System.out.print(res);


        }
        
   // }
}