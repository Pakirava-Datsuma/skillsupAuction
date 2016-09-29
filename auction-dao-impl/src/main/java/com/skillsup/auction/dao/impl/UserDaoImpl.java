package com.skillsup.auction.dao.impl;

import com.skillsup.auction.dao.api.UserDao;
import com.skillsup.auction.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by swanta on 17.09.16.
 */

@Component
public class UserDaoImpl implements UserDao {

    private Collection<User> items = new ArrayList<User>();

    public Collection<User> getAll() {
        return items;
    }

    public void add(User entity) {
        items.add(entity);
    }

    public void remove(User entity) {
        items.remove(entity);
    }

    @Override
    public User getUser(String login) {
        for (User user :
                items) {
            if (user.getLogin().equals(login)) return user;
        }
        return null;
    }

}
