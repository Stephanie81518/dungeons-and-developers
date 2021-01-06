package org.wecancodeit.reviews;

public class TableTopGame {
    private String name;
    private String description;
    private String hashtag;

    public TableTopGame(String name, String description, String hashtag) {
        this.name = name;
        this.description = description;
        this.hashtag = hashtag;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getHashtag() {
        return hashtag;
    }
}
