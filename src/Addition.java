import java.util.Scanner;

public class Additon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int a,b,sum;
		
		System.out.println("enter numbers to perform addition");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		
		System.out.println("addition of given numbers is = "+sum);
	}

}
