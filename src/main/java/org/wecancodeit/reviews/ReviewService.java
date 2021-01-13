package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReviewService {

    Map<Long,Game> games = new HashMap<>();

    public Collection<Game> getGames() {
        return games.values();
    }

    public Collection<Game> getGames(String category) {
        Map<Long,Game> gameSet = new HashMap<>();

        for(Game g : games.values()){
            if(g.getCategory().equals(category)){
                gameSet.put(g.getId(),g);
            }
        }
        return gameSet.values();
    }

    public void addGame(Game game){
        games.put(game.getId(),game);
    }



}
