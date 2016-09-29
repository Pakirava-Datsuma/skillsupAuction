package com.skillsup.auction.dao.api;

import java.util.Collection;

/**
 * Created by swanta on 17.09.16.
 */
public interface GenericDao<T> {
    public Collection<T> getAll();
    public void add(T entity);
    public void remove(T entity);
}
