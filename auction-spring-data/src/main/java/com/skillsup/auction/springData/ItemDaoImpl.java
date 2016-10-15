package com.skillsup.auction.springData;

import com.skillsup.auction.dao.api.ItemDao;
import com.skillsup.auction.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created by swanta on 15.10.16.
 */
public class ItemDaoImpl implements ItemDao {
    @Autowired
    private ItemRepository repository;

    public Collection<Item> getAll(){
        return null;
    }

    public void add(Item item) {
        repository.save(item);
    }

    public void remove(Item item) {
        repository.delete(item);
    }
}
