import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
    	System.out.println("Enter the ratings");
        //Fill your code here
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the ratings");
    	String str = sc.next();
    	MovieRating movieRating = new MovieRating(str);
    	movieRating.start();
    }
}