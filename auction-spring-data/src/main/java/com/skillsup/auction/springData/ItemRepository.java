package com.skillsup.auction.springData;

import com.skillsup.auction.domain.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by swanta on 15.10.16.
 */
public interface ItemRepository extends CrudRepository<Item, Long> {
}
