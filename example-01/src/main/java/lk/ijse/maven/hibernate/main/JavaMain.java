package lk.ijse.maven.hibernate.main;

import lk.ijse.maven.hibernate.entity.Customer;
import lk.ijse.maven.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by Ireshika Chamini on 6/14/2018.
 */
public class JavaMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tc = session.getTransaction();
        tc.begin();

        Customer customer=new Customer("C001","Kasun","143");
        session.save(customer);
        tc.commit();
        sessionFactory.close();

    }
}
