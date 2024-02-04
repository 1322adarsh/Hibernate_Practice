package com.tutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Let's do it !!!" );
        //-> created a session factory in a single line
//        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        // Creating  Student
        Student st = new Student();
        st.setId(103);
        st.setName("Nitish Singh");
        st.setCity("Prayagraj");
        
        System.out.println(st);
        
        Session session = factory.openSession(); // :- Open a session
//      Session session = factory.getCurrentSession(); // :- here factory will return a session  which is currently running
        
        Transaction tx = session.beginTransaction(); // :- here session starts a new transaction
        
        session.save(st); // :- save student object (this method is deprecated, it is similar to persist() method).
       
        tx.commit(); // :- Commit the current resource transaction, writing any unflushed changes to the database.
        session.close(); // :- it closes the opened session
        
       
    }
}
