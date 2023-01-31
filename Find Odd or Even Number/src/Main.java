import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the number:");
    	Integer n = Integer.parseInt(buff.readLine());
    	OddEvenBO boIns = new OddEvenBO();
    	System.out.println(n+" is an "+boIns.findOddEven(n)+" number");
    }
}