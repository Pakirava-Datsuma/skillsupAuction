package com.skillsup.auction.service;

import com.skillsup.auction.domain.Item;
import com.skillsup.auction.domain.User;

import java.util.Collection;

/**
 * Created by swanta on 29.09.16.
 */
public interface ItemService {
    Collection<Item> getAll();
    Item createItem(String title, String description, User user);
}
