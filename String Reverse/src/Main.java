import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String args[]) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string:");
		System.out.println("The reverse is " + new ReverseBO().reverseString(buff.readLine()));
	}
}