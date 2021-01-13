package org.wecancodeit.reviews.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private long id;
    private String description;

    public Review(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Review() {

    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
