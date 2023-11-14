import java.util.Scanner;
public class NaturalNumbersSum {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		System.out.println("The First "+n+" natural numbers are:");
		for (int i=1;i<=n;i++) {
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("Sum="+sum);
	}
}
