package lk.ijse.maven.hibernate.util;

import lk.ijse.maven.hibernate.entity.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Created by Ireshika Chamini on 6/14/2018.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                .configure( "org/hibernate/example-01/hibernate.cfg.xml" )
                .build();

        MetadataSources sources = new MetadataSources(standardServiceRegistry);
        sources.addAnnotatedClass(Customer.class);
        Metadata metadata = sources.buildMetadata();

        return metadata.getSessionFactoryBuilder().build();

    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
