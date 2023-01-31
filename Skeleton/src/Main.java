
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
        //Fill your code here
		ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
	
		Book b1 = (Book) context.getBean("book1");
		Book b2 = (Book) context.getBean("book2");
		Book b3 = (Book) context.getBean("book3");
		Book b4 = (Book) context.getBean("book4");
		Book b5 = (Book) context.getBean("book5");
		Book b6 = (Book) context.getBean("book6");
		Book b7 = (Book) context.getBean("book7");
		Book b8 = (Book) context.getBean("book8");
		Book b9 = (Book) context.getBean("book9");
		
		StandardPackage st1 = (StandardPackage) context.getBean("package1");
		StandardPackage st2 = (StandardPackage) context.getBean("package2");
		StandardPackage st3 = (StandardPackage) context.getBean("package3");
		st1.calculateCost();
		st2.calculateCost();
		st3.calculateCost();
		System.out.println("Package Details");
		System.out.println("Package-1");
		st1.display();
		System.out.println();
		System.out.println("Package-2");
		st2.display();
		System.out.println();
		System.out.println("Package-3");
		st3.display();
        
	}

}