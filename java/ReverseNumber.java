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