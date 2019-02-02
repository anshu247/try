package edu.ncu.main;
import edu.ncu.exception.*;
import edu.ncu.processor.*;
public class DriverClass{
	public static void main(String []args)
	{
		A a=new C();
		try{
			a.f();

		}
		catch(LevelThreeException e3){
			System.out.println("Caught e3");

		}
		catch(LevelTwoException e2){
			System.out.println("Caught e2");

		}
		
		catch(LevelOneException e1){
			System.out.println("Caught e1");

		}
		


	}
}