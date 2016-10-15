package com.skillsup.auction.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by swanta on 17.09.16.
 */

@Data
@AllArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue
    private long id;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
