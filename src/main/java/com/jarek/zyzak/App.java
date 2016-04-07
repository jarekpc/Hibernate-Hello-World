package com.jarek.zyzak;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jarek.model.Person;
import com.jarek.model.Phone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//zapis 
    	save();
    }
    
    
    public static void save(){
    	Session session = build().openSession();
    	Transaction transaction = session.beginTransaction();
    	Person p1 = new Person();
    	p1.setName("Jarek");
    	Person p2 = new Person();
    	p2.setName("User2");
    	//
    	Phone phone = new Phone();
    	phone.setNumber("11111111");
    	phone.setPerson(p1);
    	Phone phone2 = new Phone();
    	phone2.setNumber("222222");
    	phone2.setPerson(p1);
    	
    	session.save(phone);
    	session.save(phone2);
    	transaction.commit();
    	session.close();
    }
    
    public static SessionFactory build(){
    	SessionFactory sessionFactory;
    	sessionFactory = new Configuration().configure().buildSessionFactory();
    	return sessionFactory;
    }
}
