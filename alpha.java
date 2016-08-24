package alpha;

import java.util.Scanner;

public class alpha {

	
	public static void main(String[] args) {
		char a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character:");
		a=s.next().charAt(0);
		if((a>='a'&&a<='z')||(a>='A'&& a<='Z')){
			System.out.println("alphat"+a);
		}
		else{
			System.out.println("not alphat"+a);
			
		}
	}

}
