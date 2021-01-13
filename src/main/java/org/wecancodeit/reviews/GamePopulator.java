package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.Storage.GameStorage;
import org.wecancodeit.reviews.Storage.ReviewStorage;

@Component
public class GamePopulator implements CommandLineRunner {
    private GameStorage inGameStorage;
    private ReviewStorage inReviewStorage;


    @Override
    public void run(String...args) throws Exception {

    }
}
