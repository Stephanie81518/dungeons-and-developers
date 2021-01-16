package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.Models.Game;
import org.wecancodeit.reviews.Models.HashTag;
import org.wecancodeit.reviews.Models.Review;
import org.wecancodeit.reviews.Storage.GameStorage;
import org.wecancodeit.reviews.Storage.ReviewStorage;

@Component
public class GamePopulator implements CommandLineRunner {
    private GameStorage inGame;
    private ReviewStorage inReview;
    private HashTagRepository inHashTag;



    @Override
    public void run(String...args) throws Exception {

        Game dnd = new Game("DND", "RPG","An open world RPG game");
        inGame.addGame(dnd);

        Review dndReview = new Review("A fun interactive game that everyone should play with their friends.");
        inReview.addReview(dndReview);

        HashTag spooky = new HashTag("#Spooky");
        inHashTag.save(spooky);


    }
}
