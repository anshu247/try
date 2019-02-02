import java.util.*;
class ExceptionHandling
{
	public static void setTitle(String title){

		if(title==null){
			throw new   IllegalArgumentException("");

		}
		System.out.println(title);


	}

public static void main(String []args)
{

System.out.println("enter 1 for  ArithmeticException \t2- ArrayIndexOutOfBoundsException\t 3- NumberFormatException\t 4-  NullPointerException \t 5-IllegalArgumentException");
Scanner scan=new Scanner(System.in);
int ch=scan.nextInt();
switch(ch)
{
	case 1:


	try{
		int num1=100;
		int num2=0;
		int out=num1/num2;
		System.out.println("Result"+out);

	}
	catch(ArithmeticException e)
	{
		System.out.println(e);

	}
	break;

	case 2:
	try {
		int a[]=new int[10];
		a[11]=9;


	}
	catch(ArrayIndexOutOfBoundsException e)
	 {
	 	System.out.println(e);

	}
	break;
case 3:
try{ 
	int num =Integer.parseInt("ABC");
	System.out.println(num);


}
catch(NumberFormatException e)
{
	System.out.println(e);
}
break;


case 4:
try{
	 String str=null;
	 System.out.println(str.length());


}
catch(NullPointerException e)

{
	System.out.println(e);

}
break;

case 5:
try{
	String x=null;
	setTitle(x);


}
catch(NullPointerException e)
{
	System.out.println(e);

}

}
}
}