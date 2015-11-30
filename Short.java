import java.util.Scanner;
import java.lang.Math;


public class Short {
	public int[] Series;
	public int head;
	public int high;
	public int low;
	public int n;
	public int j;
	public int[] flag;
	//public int head1;
	private Scanner in;
	private int j2;
	
	public Short(int high,int low,int head,int n){
		
		//int head=head;
		//int low1=low1;
		this.n=n;
		this.head=head;
		this.high=high;
		this.low=low;
		flag=new int[n];
		//int n =high-low;
		Series=new int[n];
				
	}
	public void setValues()
	{
		
		in = new Scanner(System.in);
		//int n=high-low;
		System.out.println("Get the input values");
		for(int i=0;i<n;i++)
	     {
            Series[i]=in.nextInt();
            flag[i]=0;
	     }
		
	}
	public void Disk()
	{
		System.out.println(head);
		int k=0;
		//int min=1000000;
		while(k==0)
		{
				int min=1000000;
				for(int i=0;i<n;i++)
				{
					//System.out.println(Series[i]-head);
					if(min>(Math.abs(Series[i]-head)))
					{	
						if(flag[i]==0)
						{
						//System.out.println(Math.abs(Series[i]-head));
						min=Math.abs(Series[i]-head);
						j2 = i;
						}
					}
					//System.out.println(min);
					
				}
			System.out.println(Series[j2]);
				head=Series[j2];
				flag[j2]=1;
			//System.out.println(j2);
				for(int i =0;i<n;i++)
				{
					if(flag[i]==0)
					{
						break;
					}
					k=1;
				}

		}
	}

}
