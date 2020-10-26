import java.io.*;

class buffrd
{
	public static void main(String args[]) throws IOException
	{
		int a = 0, n = 0, m = 0;
		String str = "";
		System.out.println();
		System.out.println("Welcom to BufferedReader Class Tester");
      		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			System.out.println("Test 1");
			System.out.println("Enter an Integer");
			n = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			a += 1;
//			System.out.println("Unsuccessfull");
             		}

		try
		{
			System.out.println("Test 2");
			System.out.println("Enter a String");
			str = br.readLine();
		} catch (Exception e) {
			a += 1;
//			System.out.println("Unsuccessfull");
			}
		
		try
		{
			System.out.println("Test 3");
			System.out.println("Enter an Integer");
			m = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			a += 1;
//			System.out.println("Unsuccessfull");
			 }
		
		System.out.println();
		System.out.println("Output");
		System.out.println();

		if(a == 1)
			System.out.println("Test 1 status: Unsuccessfull");

		else 
		{
			System.out.println("Test 1 status: Successfull");
			System.out.println("Output: "+n);
		}

		if (a == 2)
			System.out.println("Test 2 status: Unsuccessfull");
		else 
		{
			System.out.println("Test 2 status: Successfull");
			System.out.println("Output: "+str);		
		}

		if (a == 3)	
			System.out.println("Test 3 status: Unsuccessfull");
		else
		{
			System.out.println("Test 3 status: Successfull");
			System.out.println("Output: "+m);
		}	
	
	}
}
