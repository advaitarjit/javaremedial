import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		int n,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		System.out.println("Multiplication Table of "+n+" is :");
		for (int i=1;i<=10;i++) {
			res=n*i;
			System.out.println(n+" * "+i+" = "+res);
		}
	}
}
