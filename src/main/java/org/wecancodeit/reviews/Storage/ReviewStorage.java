package org.wecancodeit.reviews.Storage;


import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.HashTagRepository;
import org.wecancodeit.reviews.Models.Game;
import org.wecancodeit.reviews.Models.HashTag;
import org.wecancodeit.reviews.Models.Review;
import org.wecancodeit.reviews.ReviewRepository;

import java.util.Optional;

@Service
public class ReviewStorage {
    private ReviewRepository reviewRepository;
    private HashTagRepository hashTagRepository;

    public ReviewStorage(ReviewRepository reviewRepository,HashTagRepository hashTagRepository) {
        this.reviewRepository = reviewRepository;
        this.hashTagRepository = hashTagRepository;
    }
    public void addReview(Review review){
        reviewRepository.save(review);
    }
    public void addHashtag(HashTag hashtag){
        hashTagRepository.save(hashtag);
    }

    public Iterable<Review> retrieveAllReviews(){
        return reviewRepository.findAll();
    }

    public Review getReviewByID(long id){
        Optional<Review> retrievedReviewOptional = reviewRepository.findById(id);
        if(retrievedReviewOptional.isPresent()){
            Review foundReview = retrievedReviewOptional.get();
            return foundReview;
        }
        return null;
    }
}
