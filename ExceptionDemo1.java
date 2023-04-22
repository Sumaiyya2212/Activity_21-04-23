package exception;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//java nested try block
		try(Scanner sc = new Scanner(System.in))//try with resource
		//the scanner object will get closed automatically
		{
			try {
				int a=30,b=0;
				System.out.println("division :"+(a/b));
			}
			catch(ArithmeticException e) {
				System.out.println("cannot be divided by zero");
			}
			int arr[]=new int[5];
			arr[5]=78;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception occured : Array index out of Bounds!!");
		}
		finally {
			//sc.close();//closing the scanner object
			System.out.println("Finally block always gets executed");
		}

	}

}
