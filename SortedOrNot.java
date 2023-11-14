import java.util.Scanner;
public class SortedOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if (num1>num2 && num2>num3) {
			System.out.println("Descending order");
		}
		else if(num3>num2 && num2>num1) {
			System.out.println("Ascending order");
		}
		else {
			System.out.println("Neither Ascending nor Descending");
		}
	}
