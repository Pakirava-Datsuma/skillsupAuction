package com.skillsup.auction.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by swanta on 17.09.16.
 */

@Data
@javax.persistence.Entity
public class Lot {
    @Id
    private long id;


    private Date endDate;

    public Date getEndDate() {
        return endDate;
    }
}
