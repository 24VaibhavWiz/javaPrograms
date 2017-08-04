package lab_test2;
import java.util.Scanner;
class players
{
	public static int score;
	public static String name;
	players link;
}
public class criketers {
	public static void add_players(players start)
	{   int score;String name;
		players q=start;
		name=q.name;
		score=q.score;
		players p=new players();
		while(q!=null)
		{
			q=q.link;
		}
		q.link=p;
	}
public static void display(players start)
{
	players q=start;
	while(q!=null)
	{
		System.out.println(q.name+" "+q.score+" "+q.link);
		q=q.link;
	}
}
public static int count1(players start,int count)
{
	players q=start;
    count =0;
	while(q!=null)
	{
		count++;
		q=q.link;
	}
	return count;
}
public static int total_score(players start,int sum)
{
    sum=0;
	players q=start;
	while(q!=null)
	{
		sum=sum+q.score;
		q=q.link;
	}
	return sum;
}
public static int max_score(players start,int max)
{   players q=start;
    max=q.score;
	while(q!=null)
	{
		if(q.score<q.link.score)
			max=q.link.score;
		else
			q=q.link;
	}
	return max;
}
public static void main(String []args)
{   Scanner sc=new Scanner (System.in);
	int choice ;int count=0;
	players start=null;players q=start;
	int score;String name;int sum=0;int max=q.score;
	while(true)
	{
		System.out.println("**************menu**************");
		System.out.println("0:exit");
		System.out.println("1:add players");
		System.out.println("2:display");
		System.out.println("3:no. of players");
		System.out.println("4:total score");
		System.out.println("5:max score");
		System.out.println("please enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 0:
			System.exit(0);
		case 1:
			System.out.println("please enter player name");
			 name=sc.nextLine();
			System.out.println("please enter the score");
			 q.score=sc.nextInt();
			add_players(start);
			break;
		case 2:
			display(start);
			break;
		case 3:
			count=count1(start,count);
			break;
		case 4:
			sum=total_score(start,sum);
			break;
		case 5:
			max=max_score(start,max);
			break;
			default:
				System.out.println("wrong choice");
		}
	}
}
}
