import java.util.Scanner;
//import java.lang.Math;

public class FCFS {
	public int[] Series;
	public int[] flag;
	public int head;
	public int high;
	public int low;
	public int n;
	//public int num;
	private Scanner in;
	public FCFS(int head,int high,int low,int n)
	{
		//n=Math.abs(high-low+1);
		this.n=n;
		this.high=high;
		this.low=low;
		this.head=head;
		
		Series=new int[n];
		flag=new int[n];
		
		//waitingTime=new int[n];		
	}
	public void setValues()
	{		
		System.out.println("Get the input values");
		for(int i=0;i<n;i++)
	     {
			in = new Scanner(System.in);
            Series[i]=in.nextInt();
            flag[i]=0;
	     }
		
	}
	/*public void averageWaitingTimeCalc()
	{
		waitingTime[0]=0;
		averageWaitingTime=0;
		//implement FCFS
		for(int i=1;i<num;i++)
		{
			waitingTime[i]=burstTime[i-1]+waitingTime[i-1];
			averageWaitingTime+=waitingTime[i];
		}
		averageWaitingTime=averageWaitingTime/num;
		System.out.println("Calculating Average Waiting Time");
	}*/
	public void Disk(){
		System.out.println("The disk Fragmentation");
		System.out.println(head);
		int k=0;
		while(k==0)
		{
			for(int i=0;i<n;i++)
			{
				if(flag[i]!=1)
				{
					System.out.println(Series[i]);
					flag[i]=1;
				}
			}
			
			for(int i=0;i<n;i++)
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