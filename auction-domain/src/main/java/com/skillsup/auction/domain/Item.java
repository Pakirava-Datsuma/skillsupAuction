package com.skillsup.auction.domain;

import lombok.Data;
import javax.persistence.entity;

/**
 * Created by swanta on 17.09.16.
 */

@Data
@Entity
public class Item {

    @Id
    private long id;

    private String title;
    private String description;
}
