import java.util.*;
public class s {

	public static void main(String[] args) {
		
    Scanner in =new Scanner (System.in);
    System.out.println("Enter the age");
    int age =in.nextInt();
    try
    {
    	if(age<18)
    	throw new Exception("Not eligible");
    	else
    		System.out.println("eligible");
    	
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }
	}

}
