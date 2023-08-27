package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import module.Amigos;

public class Main {
    
        public static void main(String[] args) {
            

            Amigos p1 = new Amigos(null, "João", 20, "Joãozinho");
            Amigos p2 = new Amigos(null, "Maria", 20, "Mariazinha");

            EntityManagerFactory emf = 
                                        Persistence.createEntityManagerFactory("exemplo-jpa");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(p1);
            em.persist(p2);                      
            em.getTransaction().commit();

            System.out.println("Mal feito feito....");
            em.close();
            emf.close();
        }
}
