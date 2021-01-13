package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Game {

    private String name;
    private String description;
    private String category;
    private String hashtag;

    @Id
    @GeneratedValue
    private long id;


    public Game(String name, String description, String category,String hashtag, long id) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.hashtag = hashtag;
        this.id = id;

    }

    public Game() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getHashtag() {
        return hashtag;
    }

    public long getId() {
        return id;
    }




}
