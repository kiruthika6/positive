package positive;

import java.util.Scanner;

public class vowel {

	
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter the string");
		char A=a.next().charAt(0);
		switch(A){
		case 'A':
			System.out.println("vowel");
			break;
		case 'E':
			System.out.println("vowel");
			break;
		case 'I':
			System.out.println("vowel");
			break;
		case 'O':
			System.out.println("vowel");
			break;
		case 'U':
			System.out.println("vowel");
			break;
			default:
				System.out.println("constant");
				break;
		}
	}

}
