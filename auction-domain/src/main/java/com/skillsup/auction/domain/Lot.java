package com.skillsup.auction.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by swanta on 17.09.16.
 */

@Data
@AllArgsConstructor
@Entity
public class Lot {
    @Id
    @GeneratedValue
    private long id;


    private Date endDate;

    public Date getEndDate() {
        return endDate;
    }

    @ManyToOne
    @JoinColumn (name="user_id")
    private User user;

    @OneToOne
    @JoinColumn (name = "item_id")
    private Item item;
}
