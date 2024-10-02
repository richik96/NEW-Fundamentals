package org.telusko;


import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {
    
    public static void main(String[] args) {
        
        Result res = new Result();

        res.setSid(101);
        res.setSname("Raj");
        res.setDiv("A");

        Configuration con = new Configuration().configure().addAnnotatedClass(Result.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        session.save(res);
    }
}
