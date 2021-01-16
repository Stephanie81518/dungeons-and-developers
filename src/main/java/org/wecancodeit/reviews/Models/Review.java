package org.wecancodeit.reviews.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private long id;
    private String review;

    public Review( String review) {
        this.review = review;
    }

    public Review() {

    }

    public long getId() {
        return id;
    }

    public String getReview() {
        return review;
    }
}
