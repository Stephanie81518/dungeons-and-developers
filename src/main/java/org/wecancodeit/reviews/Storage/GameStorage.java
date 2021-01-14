package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.GameRepository;
import org.wecancodeit.reviews.HashTagRepository;
import org.wecancodeit.reviews.Models.Game;
import org.wecancodeit.reviews.Models.HashTag;
import org.wecancodeit.reviews.Models.Review;
import org.wecancodeit.reviews.ReviewRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class GameStorage {

    private GameRepository gameRepo;
    private HashTagRepository hashTagRepository;
    private ReviewRepository reviewRepository;

    public GameStorage(GameRepository gameRepo,HashTagRepository hashTagRepository,ReviewRepository reviewRepository) {
        this.gameRepo = gameRepo;
        this.hashTagRepository = hashTagRepository;
        this.reviewRepository = reviewRepository;
    }

  
    public void addGame(Game inGame){
        gameRepo.save(inGame);
    }

    public Iterable<Game> retrieveAllGames(){
        return gameRepo.findAll();
    }

    public Iterable<Review> retrieveAllReviews(){
        return reviewRepository.findAll();
    }
    public Iterable<HashTag> retrieveAllHashtags(){
        return hashTagRepository.findAll();
    }



    public Game getGameByID(long id){
        Optional<Game> retrievedGameOptional = gameRepo.findById(id);
        if(retrievedGameOptional.isPresent()){
            Game foundGame = retrievedGameOptional.get();
            return foundGame;
        }
        return null;
    }
}
