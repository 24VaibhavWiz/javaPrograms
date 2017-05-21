package assin3;

public class gen_2 {

	public static void main(String[] args) {
		Integer A[]={1,2,3,4,5,6,7,8};
		Double B[]={1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9};
		String C[]={"Baibhab","Nikhil","BobNik"};
		print_Array(A);
		print_Array(B);
		print_Array(C);
	}
    public static <E> void print_Array(E[] inputarray)
    {
    	System.out.println("the elements are ");
    	for(int i=0;i<inputarray.length;i++)
    	{
    		System.out.println(inputarray[i]);
    	}
    }
}