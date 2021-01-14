package org.wecancodeit.reviews.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.List;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private long id;
    private String review;
    @ManyToMany
    private Collection<Game> gamesRev;

    public Review(String review, Game...games) {
        this.review = review;
        this.gamesRev = List.of(games);
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
