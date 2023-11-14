import java.util.Scanner;
public class CubeofnNumbers {
	public static void main(String[] args) {
		int num,res=0;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt(); 
		for (int i=1;i<=num;i++) {
			res=i*i*i;
			System.out.println("Cube of "+i+" is "+res);
		}
	}
}
