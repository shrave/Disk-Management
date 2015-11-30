import java.util.Scanner;

public class DiskMn {

	public static Scanner in;
	public static int head;
	public static int high;
	public static int low;
	public static int n;

	public static void main(String args[]){
		
		System.out.println("Input");
		in = new Scanner(System.in);
		head = in.nextInt();
		in = new Scanner(System.in);
		low = in.nextInt();
		in = new Scanner(System.in);
		high = in.nextInt();
		in = new Scanner(System.in);
		n=in.nextInt();
		
		System.out.println("FCFS In Action");
		FCFS s1=new FCFS(head,low,high,n);
		s1.setValues();
		s1.Disk();
		
		System.out.println("SSTF in Action");
		Short s2=new Short(high,low,head,n);
		s2.setValues();
		s2.Disk();
		
		System.out.println("SCAN in Action");
		SCAN s6=new SCAN(head,high,low,n);
		s6.setValues();
		s6.sort();
		s6.Disk();
	
		System.out.println("LOOK in Action");
		LOOK s3=new LOOK(head,high,low,n);
		s3.setValues();
		s3.sort();
		s3.Disk();
	
		System.out.println("CSCAN in Action");
		CSCAN s4=new CSCAN(head,high,low,n);
		s4.setValues();
		s4.sort();
		s4.Disk();
		
		System.out.println("CSCAN in Action");
		CLOOK s5=new CLOOK(head,high,low,n);
		s5.setValues();
		s5.sort();
		s5.Disk();
		
	}
	
}
