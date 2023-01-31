import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.io.IOException;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\n1.Current Account\n2.Savings Account");
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("Enter the account details(name,accountNumber,accountBalance,year)");
            String str = sc.next();
            String[] l = str.split(",");
            String a = l[0];
            String b = l[1];       
            Double c = Double.parseDouble(l[2]);
            int d = Integer.parseInt(l[3]);
             CurrentAccount AC = new CurrentAccount(a,b,c);
            System.out.println("Maintenance Charge For Current Account " +  String.format("%.0f", AC.computeMaintainanceCharge(d)) );
        }
        else if(n==2){
            System.out.println("Enter the account details(name,accountNumber,accountBalance,year)");
            String str = sc.next();
            String[] l = str.split(",");
            String a = l[0];
            String b = l[1];
            Double c = Double.parseDouble(l[2]);
            int d = Integer.parseInt(l[3]);
            SavingsAccount AC = new SavingsAccount(a,b,c);
            System.out.println("Maintenance Charge For Savings Account " + String.format("%.0f", AC.computeMaintainanceCharge(d)) );
        }
        else {
        	System.out.println("Invalid Input");
        }
    }
}