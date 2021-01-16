package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.GameRepository;
import org.wecancodeit.reviews.HashTagRepository;
import org.wecancodeit.reviews.Models.Game;
import org.wecancodeit.reviews.Models.HashTag;

import java.util.Optional;

@Service
public class GameStorage {

    private GameRepository gameRepo;
    private HashTagRepository hashTagRepository;

    public GameStorage(GameRepository gameRepo, HashTagRepository hashTagRepository) {
        this.gameRepo = gameRepo;
        this.hashTagRepository = hashTagRepository;
    }

  
    public void addGame(Game inGame){
        gameRepo.save(inGame);
    }

    public Iterable<Game> getGame(){
        return gameRepo.findAll();
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
