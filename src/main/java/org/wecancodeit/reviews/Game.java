package org.wecancodeit.reviews;

public class Game {

    private String name;
    private String description;
    private String category;
    private String hashtag;
    private Integer id;


    public Game(String name, String description, String category,String hashtag, Integer id) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.hashtag = hashtag;
        this.id = id;

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

    public Integer getId() {
        return id;
    }


}
