package com.basics;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class Test {
    public static void main(String[] args) {


 

            StandardServiceRegistry ssr = 
    new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

 

     

 

            Metadata data = new MetadataSources(ssr).getMetadataBuilder().build();

 

            SessionFactory factory =data.getSessionFactoryBuilder().build();

 

            Session session = factory.openSession();

 

            Transaction t = session.beginTransaction();

 

            //life cycle
            //Transient state

 


            Employee emp = new Employee();
            emp.setId(1);
            emp.setFname("Anee");

 

            //Persistant state
            session.save(emp);
            t.commit();
            System.out.println("successfully saved to the db");

 

            //detached state
            factory.close();
            session.close();

    }

 

}