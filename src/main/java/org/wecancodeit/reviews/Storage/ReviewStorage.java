package org.wecancodeit.reviews.Storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.GameRepository;
import org.wecancodeit.reviews.Models.Game;
import org.wecancodeit.reviews.Models.Review;
import org.wecancodeit.reviews.ReviewRepository;

@Service
public class ReviewStorage {

    @Autowired
    private ReviewRepository reviewRepo;

    public void addReview(Review inReview){
        reviewRepo.save(inReview);
    }
}
