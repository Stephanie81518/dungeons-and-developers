package org.wecancodeit.reviews;



public class HashTag {


    private long id;
    private String name;

    public HashTag(long id, String name) {
        this.id = id;
        this.name = name;
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
