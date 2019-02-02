class ExpInMeth{
 
 void f() throws inF 
 {
 	try
 	{
 		g();

 	}
 	catch(Exception e)
 	{
 		System.out.println("Exception in f method");
 		throw new inF("");

 	}
 }

void g() throws inG
	{
		throw new inG("Exception caught in method g");
	}
}


