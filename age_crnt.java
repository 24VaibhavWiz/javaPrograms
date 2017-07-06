package find_age;
import java.util.Scanner;
public class age_crnt {
static	int bd,bm,by,cd,cm,cy,td,tm,ty;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please input Birth Date");
		bd=sc.nextInt();
		bm=sc.nextInt();
		by=sc.nextInt();
		System.out.println("Please input Current Date");
		cd=sc.nextInt();
		cm=sc.nextInt();
		cy=sc.nextInt();
		if(cd>=bd)
		{
			td=cd-bd;
		}
	    if(cd<bd)
		{
			if((cm%2==0)&&(cm<=7)&&(cm!=2))
			{
				cd+=30;
				td=cd-bd;
				cm--;
			}
			if((cm%2!=0)&&(cm>7))
			{
				cd+=31;
				td=cd-bd;
				cm--;
			}
			if((cm==2)&&(cm%4==0))
			{
				cd+=28;
				td=cd-bd;
				cm--;
			}
			if((cm==2)&&(cm%4!=0))
			{
				cd+=29;
				td=cd-bd;
				cm--;
			}
		}
		if(cm>=bm)
		{
			tm=cm-bm;
		}
	    if(cm<bm)
		{
			cm+=12;
			tm=cm-bm;
		    ty=cy-by;
		    ty--;
		}
		
		else
		{
			ty=cy-by;
		}
	    if(cy<by)
	    {
	    	System.out.println("Sorry!!!! wrong input ,Please try again.");
	    }
	    else
	    {
            System.out.println("Your age is " +ty+" Years "+tm+" Months and "+td+" Days ");
        }

}
}
