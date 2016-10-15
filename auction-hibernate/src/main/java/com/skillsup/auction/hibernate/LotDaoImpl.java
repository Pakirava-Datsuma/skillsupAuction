package com.skillsup.auction.hibernate;

import com.skillsup.auction.dao.api.LotDao;
import com.skillsup.auction.domain.Lot;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

/**
 * Created by swanta on 15.10.16.
 */

@Repository("lotDao")
public class LotDaoImpl implements LotDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Collection<Lot> getAll() {
        return null;
    }

    @Override
    public void add(Lot entity) {

    }

    @Override
    public void remove(Lot entity) {

    }
}
