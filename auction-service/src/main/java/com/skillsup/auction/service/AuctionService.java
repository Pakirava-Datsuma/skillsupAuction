package com.skillsup.auction.service;

import com.skillsup.auction.domain.Item;
import com.skillsup.auction.domain.Lot;
import com.skillsup.auction.domain.User;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by swanta on 17.09.16.
 */
public interface AuctionService {
    Collection<User> getUsers();
    Collection<Lot> getActiveLots();
    Lot createLot (Item item, User user, BigDecimal startPrice);
    void placeBid(Lot lot);
    void placeBid(Lot lot, BigDecimal newPrice);
    Lot closeLot(Lot lot);

}
