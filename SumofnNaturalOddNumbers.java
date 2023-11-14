import java.util.Scanner;
public class SumofnNaturalOddNumbers {
	public static void main(String[] args) {
		int limit,res=0,j=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		limit = sc.nextInt();
		for(int i=0;i<limit;i++) {
			res=res+j;
			j+=2;
		}
		System.out.println("Sum of "+limit+" natural odd numbers:"+res);
	}
}
