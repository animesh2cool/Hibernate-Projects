package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddBook {
    public static void main( String[] args )
    {
        //configuration - activate hibernate configuration
        //configure -read both cfg files and mapping details
        //buildsessionfactory -from cfg object it takes jdbc info and create a jdbc connection
        SessionFactory s = new Configuration().configure("com/hibernate.cfg.xml").buildSessionFactory();
        //opens and connection with db and session object perform CURD
        Session ses = s.openSession();
        //operation performed in db, save permenent
        Transaction t = ses.beginTransaction();
        //create object of persistent class
        Library l = new Library();
        //use object to enter data in tabel using setter method
        //l.setBookTitle("IKIGAI");
        //l.setBookAuthor("Hector Garcia");
        //l.setBookPrice(259.50);
        l.setBookTitle("The Psychology of Money");
        l.setBookAuthor("Morgan Housel");
        l.setBookPrice(182);
        //session boject is used to save the persistent object
        ses.save(l);
        //commit transaction
        t.commit();
        //close session
        ses.close();
    }
}
