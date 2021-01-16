package org.wecancodeit.reviews.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

//Model
@Entity
public class Game {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    private String category;
    @ManyToMany(mappedBy = "games")
    private Collection<HashTag> hashTags;


    public Game(String name, String category, String description) {
        this.name = name;
        this.description = description;
        this.category = category;
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

    public long getId() {
        return id;
    }

    public Collection<HashTag> getHashTags(){
        return hashTags;
    }
}
