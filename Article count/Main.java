import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//Your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n = sc.nextInt();
		int c = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("Enter line " + (i + 1));
			String str  = sc.nextLine();
			Article a = new Article(str,0);
			a.start();
			c += a.count;
		}
		System.out.println("There are " + c +" articles in the given input");
	
	}
}
