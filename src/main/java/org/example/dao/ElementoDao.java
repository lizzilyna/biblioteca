package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.example.entities.Elemento;

public class ElementoDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public ElementoDao() {
        emf = Persistence.createEntityManagerFactory("biblioteca");
        em= emf.createEntityManager();
    }

    public void inserisciElemento(Elemento e){
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(e);
        et.commit();
    }

    public Elemento getById (int id){
        return em.find(Elemento.class, id);

    }

    public void close (){
        em.close();
        emf.close();
    }

}


