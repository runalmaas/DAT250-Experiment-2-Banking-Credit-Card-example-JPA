package main;

import model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class main {
    private static final String PERSISTENCE_UNIT_NAME = "people";
    private static EntityManagerFactory factory;


    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select m from Person m");
        List<Person> personlist = q.getResultList();
        for (Person person : personlist) {
            System.out.println(person);
        }
        System.out.println("Size: " + personlist.size());

        em.getTransaction().begin();
        Person person = new Person();
        em.persist(person);
        em.getTransaction().commit();

        em.close();
    }
}
