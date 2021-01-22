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
    public String name;
    private String description;
    private String category;
    @ManyToMany(mappedBy = "games")
    private Collection<HashTag> hashTags;
    @ManyToMany(mappedBy = "gamesRev")
    private Collection<Review> reviews;
    @ManyToMany(mappedBy = "gamesComment")
    private Collection<Comment> comments;


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

    public Collection<HashTag>getHashTags(){
        return hashTags;
    }
    public Collection<Review>getReviews(){
        return reviews;
    }

    public Collection<Comment> getComments(){
        return comments;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (id != game.id) return false;
        if (name != null ? !name.equals(game.name) : game.name != null) return false;
        if (description != null ? !description.equals(game.description) : game.description != null) return false;
        return category != null ? category.equals(game.category) : game.category == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }
}
