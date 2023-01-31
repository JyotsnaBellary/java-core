import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        int heroCount = 4;
        int villainCount = 50;
        
        Scanner scan = new Scanner(System.in);
        
        Hero hero = new Hero(5);
        Villain villain = new Villain(0);
        
        while (heroCount>=0 && villainCount<=100)
        {
                System.out.println("Enter who punches :\n1.Hero\n2.Villain");
                int n= scan.nextInt();
            
                if (n==1)
                {
                    //fill your code
                	villain.status();
                }
                else if (n==2)
                {
                    //fill your code
                	hero.status();
                	
                }
                else
                    System.out.println("Invalid Input");
            } 
           
    }
    
}