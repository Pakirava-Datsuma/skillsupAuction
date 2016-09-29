package com.skillsup.auction.service;

import com.skillsup.auction.dao.api.UserDao;
import com.skillsup.auction.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by swanta on 29.09.16.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao users;

    @Override
    public Collection<User> getAll() {
        return users.getAll();
    }

    @Override
    public User createUser(String login, String firstName, String lastName) {
        User user;
        if (users.getUser(login) != null) {
            user = new User(login, firstName, lastName);
            users.add(user);
            return user;
        } else {
            return null;
        }
    }
}
