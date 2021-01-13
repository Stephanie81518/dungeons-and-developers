package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.GameRepository;
import org.wecancodeit.reviews.Models.Game;

import java.util.Optional;

@Service
public class GameStorage {

    private GameRepository gameRepo;

    public GameStorage(GameRepository gameRepo) {
        this.gameRepo = gameRepo;
    }

  
    public void addGame(Game inGame){
        gameRepo.save(inGame);
    }

    public Iterable<Game> getGame(){
        return gameRepo.findAll();
    }

    public void getGameByID(long id){
        Optional<Game> retrievedGameOptional = gameRepo.findById(id);
        if(retrievedGameOptional.isPresent()){
            Game foundGame = retrievedGameOptional.get();

        }
    }
}
