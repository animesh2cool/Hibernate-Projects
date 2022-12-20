package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchBook {
    public static void main( String[] args )
    {
        //configuration - activate hibernate configuration
        //configure -read both cfg files and mapping details
        //buildsessionfactory -from cfg object it takes jdbc info and create a jdbc connection
        SessionFactory s = new Configuration().configure("com/hibernate.cfg.xml").buildSessionFactory();
        //opens and connection with db and session object perform CURD
        Session ses = s.openSession();
        //create object of persistent class and using load method to fetch data from database
        Library lib = ses.load(Library.class, "IKIGAI");
        //print information using get method
        System.out.println("Book Titale : "+lib.getBookTitle()+", Book Author : "+lib.getBookAuthor()+", Book Price : Rs:"+lib.getBookPrice());
        //close session
        ses.close();
    }
}
