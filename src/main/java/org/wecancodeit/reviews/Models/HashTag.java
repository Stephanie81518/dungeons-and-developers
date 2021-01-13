package org.wecancodeit.reviews.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.List;

@Entity
public class HashTag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @ManyToMany
    private Collection<Game> games;


    public HashTag(String name, Game...games) {
        this.name = name;
        this.games = List.of(games);

    }

    public HashTag() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
