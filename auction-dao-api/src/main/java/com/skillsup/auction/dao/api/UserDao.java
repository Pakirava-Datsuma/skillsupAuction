package com.skillsup.auction.dao.api;

import com.skillsup.auction.domain.User;

/**
 * Created by swanta on 17.09.16.
 */
public interface UserDao extends GenericDao<User> {
    User getUser(String login);
}
