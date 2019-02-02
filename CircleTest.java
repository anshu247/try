class CircleTest{
	public static void main(String[]args)
	{
		try
		{
			Circle c=null;
			System.out.println(c.findArea());

		}
		catch( NullPointerException e)
		{
			System.out.println(e);

		}
		System.out.println("Program run");
		
	}
}