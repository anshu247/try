public class MyTime
{
	private int  hrs,min,sec;
	public MyTime()
	{
		this.hrs=0;
		this.min=0;
		this.sec=0;

	}
	
	public MyTime(int hrs,int min,int sec) throws IllegalArgumentException
	{   if((hrs>= 0 && hrs<=23) &&( min>=0 && min<60 )&&(sec>=0 && sec<60))
	      {
	      	setMyTime(hrs,min,sec);
           }
        else 
        {
	      throw new IllegalArgumentException("wrong MyTime");

          }

	}
	void setMyTime(int hrs,int min,int sec)
	{
		this.hrs=hrs;
		this.min=min;
		this.sec=sec;
	}
	int getHrs()
	{
		return hrs;

	}
	int getMin()
	{
		return min;

	}
	int getSec()
	{
		return sec;

	}
	void setHrs(int hrs){
		if(hrs>23)
		{
         this.hrs=0;
	    }
	    if (hrs<0) 
	    {
         this.hrs=23;

	    }
	    else
	    {
	    	this.hrs=hrs;

	    }

	}

	void setMin(int min)
	{  if(min>59)
		{
			this.min=0;
		}
		else if(min<0)

		{
			this.min=59;

		}
		else
		{

		this.min=min;
		}

	}
	void setSec(int sec)
	{
		if(sec>59)
			{ this.sec=0;

			}
		else if(sec<0)
				{
					this.sec=59;
				}
	    else
				{


			this.sec=sec;
		}

	}
	
	public String toString()
  {
  String s=String.format("%02d:%02d:%02d",hrs,min,sec);
  return s;


  }
  
  MyMyTime nextSec()
  { MyMyTime t=new MyMyTime();
  	if(getSec()==59&&getMin()==59)
  	{
  		t.setSec(getSec()+1);
  		t.setMin(getMin()+1);
  		t.setHrs(getHrs()+1);

  	}
  	else if (getSec()==59)
  	
  	{
  		t.setSec(getSec()+1);
  		t.setMin(getMin()+1);
  		t.setHrs(getHrs());

  	}
  	else{
  		t.setSec(getSec()+1);
  		t.setMin(getMin());
  		t.setSec(getHrs());

  	}
  	return t;

  	 
}

  
  MyTime nextMin()
  {
  	MyTime temp=new MyTime();
  	if(getMin()==59)
  	{
  	temp.setHrs(getHrs()+1);
  	temp.setMin(getMin()+1);
  	temp.setSec(getSec());
  }
  else
  {
    temp.setHrs(getHrs());
  	temp.setMin(getMin()+1);
  	temp.setSec(getSec());

  }
  	return temp;
  }



 
 MyTime nextHrs()
 {   MyTime temp=new MyTime();
 	temp.setHrs(getHrs()+1);
 	temp.setMin(getMin());
 	temp.setSec(getSec());
 	return temp;
 }
 MyTime PreHrs()
 {
 	MyTime temp1=new MyTime();
 	temp1.setHrs(getHrs()-1);
 	temp1.setMin(getMin());
 	temp1.setSec(getSec());
 	return temp1;

 }
 
}


 


