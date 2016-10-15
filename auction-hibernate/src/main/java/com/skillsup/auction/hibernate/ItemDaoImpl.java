package com.skillsup.auction.hibernate;

import com.skillsup.auction.dao.api.ItemDao;
import com.skillsup.auction.domain.Item;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

/**
 * Created by swanta on 15.10.16.
 */
@org.springframework.stereotype.Component("itemDao")
public class ItemDaoImpl implements ItemDao {
    @org.springframework.beans.factory.annotation.Autowired
    private EntityManagerFactory emf;

    @Override
    public List<Item> getAll() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("select i from Item i").getResultList();
    }

    @Override
    public void add(Item entity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(entity);

        transaction.commit();

    }

    @Override
    public void remove(Item entity) {

    }
}
