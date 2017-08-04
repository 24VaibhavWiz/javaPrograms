package assin3;

public class sum {
public static int sum_k(int k,int sum)
{
    sum=0;
	if(k>0)
	{
		sum_k(k-1,sum);
		System.out.println(k);
		sum=sum+k;
	
	}
	return sum;
}
	public static void main(String[] args) {
	int sum=0;
	sum_k(4,sum);
		System.out.println(sum);
	}

}
