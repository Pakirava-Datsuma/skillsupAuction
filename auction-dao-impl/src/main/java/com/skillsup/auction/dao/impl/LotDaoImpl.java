package com.skillsup.auction.dao.impl;

import com.skillsup.auction.domain.Lot;
import com.skillsup.auction.dao.api.LotDao;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by swanta on 17.09.16.
 */

@Component
public class LotDaoImpl implements LotDao {
    private Collection<Lot> items = new ArrayList<Lot>();

    public Collection<Lot> getAll() {
        return items;
    }

    public void add(Lot entity) {
        items.add(entity);
    }

    public void remove(Lot entity) {
        items.remove(entity);
    }
}
