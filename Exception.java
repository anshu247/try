class Exception{
	public static void main(String []args)
	{
		try{
			int a;
			int count=0;
			int sum=0;
			for(int i=0;i<args.length;i++)
			{
				a=Integer.parseInt(args[i]);
				count =count+1;
				sum=sum+a;

			}	
            if(count<5)
            {
            	throw new CheckArgumentException("Arguments less then 5");

            }
            else
            {
            	System.out.println(sum);

            }}

            catch(CheckArgumentException e)
            {
            	System.out.println("Caught the Exception");

            }
            finally
            {
            	System.out.println("i am always executed")
            }








				}
	}
