import java.util.Scanner;
import java.util.Arrays;


public class SCAN {

	public int[] Series;
	public int[] flag;
	public int high;
	public int low;
	public int head;
	public int n;
	public Scanner in;
	public SCAN(int head,int high,int low,int n){

		this.n=n;
		this.high=high;
		this.low=low;
		this.head=head;
		Series=new int[n];
		flag=new int[n];
	}
	
	public void setValues(){
		in = new Scanner(System.in);

		System.out.println("Get the input values");
		for(int i=0;i<n;i++)
	     {
            Series[i]=in.nextInt();
            flag[i]=0;
	     }
	}
	
	public void sort(){
		
		Arrays.sort(Series);
	}
	public void Disk()
	{
		int m = 0;
		for(int i=0;i<n;i++)
		{
			
			if((Series[i]>=head)&&(Series[i]<=head))
			{
				m=i;
			}
			
			
		}
		int k=high-low;
		if(m<(k/2))
		{
			for(int i=m;i>=0;i--)
			{
				System.out.println(Series[i]);
				flag[i]=1;
				//Converted head in terms of an index.
				head=i;
			}
			System.out.println(low);
			for(int i=m+1;i<n;i++)
			{
				System.out.println(Series[i]);
				flag[i]=1;
				head=i;
			}
			System.out.println(high);
			//Find the index where it is present.
			//Then go till low
			//In else condition, go till end.
			// Then return from there to the reverse order of pointers.
			//In cscan jump.
		}
		else
		{
			for(int i=m;i<n;i++)
			{
				System.out.println(Series[i]);
				flag[i]=1;
				//Converted head in terms of an index.
				head=i;
			}
			System.out.println(high);
			for(int i=m-1;i>=0;i--)
			{
				System.out.println(Series[i]);
				flag[i]=1;
				head=i;
			}
			System.out.println(low);
			//Find the index where it is present.
			//Then go till low
			//In else condition, go till end.
			// Then return from there to the reverse order of pointers.
			//In cscan jump.
		}
	}
}
