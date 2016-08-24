package alpha;

import java.util.Scanner;

public class largeno {

	
	public static void main(String[] args) {
		int a,b,c;
		 Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b){
			System.out.println(a);
		}
		else if(b>c){
			System.out.println(b);
		}
		else{
			System.out.println(c);
		}
	}

}
