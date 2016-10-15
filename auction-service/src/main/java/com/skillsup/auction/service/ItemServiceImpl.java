package com.skillsup.auction.service;

import com.skillsup.auction.dao.api.ItemDao;
import com.skillsup.auction.domain.Item;
import com.skillsup.auction.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by swanta on 29.09.16.
 */

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao items;

    @Override
    public Collection<Item> getAll() {
        return items.getAll();
    }

    @Override
    public Item createItem(String title, String description, User user) {
        Item item = new Item(0, title, description, user);
        items.add(item);
        return item;
    }
}
