package com.skillsup.auction.dao.impl;

import com.skillsup.auction.domain.Item;
import com.skillsup.auction.dao.api.ItemDao;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by swanta on 17.09.16.
 */

@Component("itemDao")
public class ItemDaoImpl implements ItemDao {

    private Collection<Item> items = new ArrayList<Item>();

    public Collection<Item> getAll() {
        return items;
    }

    public void add(Item entity) {
        items.add(entity);
    }

    public void remove(Item entity) {
        items.remove(entity);
    }
}
