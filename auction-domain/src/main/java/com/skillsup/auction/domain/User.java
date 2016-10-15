package com.skillsup.auction.domain;

import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by swanta on 17.09.16.
 */

@Data
public class User {

    @Id
    @GeneratedValue
    private long id;

    private final String login;
    private final String firstName;
    private final String lastName;

    @OneToMany(mappedBy = "Lot", fetch = FetchType.LAZY)
    private List<Lot> lots;


}
