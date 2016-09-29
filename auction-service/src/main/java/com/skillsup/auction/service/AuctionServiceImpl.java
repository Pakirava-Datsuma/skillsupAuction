package com.skillsup.auction.service;

import com.skillsup.auction.dao.api.LotDao;
import com.skillsup.auction.dao.api.UserDao;
import com.skillsup.auction.domain.Item;
import com.skillsup.auction.domain.Lot;
import com.skillsup.auction.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by swanta on 17.09.16.
 */

@Service
public class AuctionServiceImpl implements AuctionService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private LotDao lotDao;

    public Collection<User> getUsers() {
        return userDao.getAll();
    }

    public Collection<Lot> getActiveLots() {
        return lotDao.getAll().stream()
                .filter(lot -> lot.getEndDate() == null)
                .collect(Collectors.toList());
    }

    @Override
    public Lot createLot(Item item, User user, BigDecimal startPrice) {
        return null;
    }

    @Override
    public void placeBid(Lot lot) {

    }

    @Override
    public void placeBid(Lot lot, BigDecimal newPrice) {

    }

    @Override
    public Lot closeLot(Lot lot) {
        return null;
    }
}
