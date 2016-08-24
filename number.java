package alpha;

import java.util.Scanner;

public class number {

	
	public static void main(String[] args) {
 int i,n = 10,s1 = 0,s;
Scanner s2=new Scanner(System.in);
System.out.println("enter the number");
s=s2.nextInt();
 for(i=0;i<n;i++){
	 n=s2.nextInt();
	 s=s1+n;
	 
 }
 System.out.println("sum of numbers:"+s);
	}

}
