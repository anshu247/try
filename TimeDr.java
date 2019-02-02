import java.util.*;

class MyTimeDr{
	public static void main(String [] args)
	{
		try
		{
			MyTime t=new MyTime();
			MyTime t1=t.nextHrs();
			System.out.println("MyTime in next hrs:"+t1.toString());
			MyTime t2=t.nextMin();
				System.out.println("MyTime in next Min:"+t2.toString());
					MyTime t3=t.nextSec();
					System.out.println("MyTime in next Min:"+t3.toString());

		}
		catch(IllegalArgumentException e){
			System.out.println(e);

		}











	}
}