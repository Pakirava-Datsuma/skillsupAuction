package com.skillsup.auction.service;

import com.skillsup.auction.domain.User;

import java.util.Collection;

/**
 * Created by swanta on 29.09.16.
 */
public interface UserService {
    Collection<User> getAll();

    User createUser(String login, String firstName, String lastName);
}
