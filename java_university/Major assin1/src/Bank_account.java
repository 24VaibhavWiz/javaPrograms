import java.util.*;
class Current_account extends Bank_account
{

	Current_account(double w) {
		super(w);
		if (Acount_balance<=1000)
		{
			Acount_balance=(5*Acount_balance)/100;
			System.out.println("Withdraw is not possible");
		}
	}
	 
}
 class Saving_account extends Bank_account
{

	Saving_account(double w) {
		super(w);		
	}

	public void computeIntrest() {
		double s,p,j;
		int m,t;
		 Scanner sc =new Scanner (System.in);
	     System.out.println("Enter the values of value after time period");
	     s=sc.nextDouble();
	     System.out.println("Enter the values of value of principle");
	     p=sc.nextDouble();
	     System.out.println("Enter the values of value of annual nominal interest");
	     j=sc.nextDouble();
	     System.out.println("Enter the values of value of number of times the interest is compounded per year");
	     m=sc.nextInt();
	     System.out.println("Enter the values of value of number of years");
	     t=sc.nextInt();
	    s=p*(1+j*m)*Math.pow(m,t);
	}
}
	 class Acount_Detail
	{

	public static void main(String[] args) {
	
		
	}
	}
	
