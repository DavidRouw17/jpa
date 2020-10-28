package dao;

import objects.Fiets;

import javax.persistence.EntityManager;

public class FietsDao {

    private EntityManager em;

    public FietsDao() {
        this(null);
    }

    public FietsDao(EntityManager em) {
        this.em = em;
    }

    public void insert(Fiets f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }

    public Fiets find(long id) {
        return em.find(Fiets.class, id);
    }
}
