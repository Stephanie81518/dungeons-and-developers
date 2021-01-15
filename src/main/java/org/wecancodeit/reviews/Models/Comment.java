package org.wecancodeit.reviews.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.List;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private long id;
    private String comment;

    @ManyToMany
    private Collection<Game> gamesComment;

    public Comment(String comment, Game...games) {
        this.comment = comment;
        this.gamesComment = List.of(games);
    }

    public Comment() {
    }

    public String getComment() {
        return comment;
    }
}
