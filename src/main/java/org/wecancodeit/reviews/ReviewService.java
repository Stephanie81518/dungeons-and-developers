package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReviewService {
    Map<Integer, Game> tableTopGames = new HashMap<>();
    Map<Integer, Game> videoGames = new HashMap<>();
    Map<Integer, Game> cardGames = new HashMap<>();

    Collection<Game> actionGames = new ArrayList<>();
    Collection<Game> rpg = new ArrayList<>();
    Collection<Game> exploration = new ArrayList<>();
    Collection<Game> party = new ArrayList<>();


    public Collection<Game> getTableTopGames() {
        return tableTopGames.values();
    }

    public void addTableTopGame(Game game) {
        tableTopGames.put(game.getId(), game);
    }

    public Collection<Game> getVideoGames() {
        return videoGames.values();
    }

    public void addVideoGame(Game game) {
        videoGames.put(game.getId(), game);
    }


    public Collection<Game> getCardGames() {
        return cardGames.values();
    }

    public void addCardGame(Game game) {
        cardGames.put(game.getId(), game);
    }

    public Collection<Game> getActionGames() {

        actionGames.clear();
        for (Game g : tableTopGames.values()) {
            if (g.getHashtag().equals("Action")) {
                actionGames.add(g);
            }
        }
        for (Game g : videoGames.values()) {
            if (g.getHashtag().equals("Action")) {
                actionGames.add(g);
            }
        }
        for (Game g : cardGames.values()) {
            if (g.getHashtag().equals("Action")) {
                actionGames.add(g);
            }
        }
        return actionGames;
    }

    public Collection<Game> getRpg() {

        rpg.clear();
        for (Game g : tableTopGames.values()) {
            if (g.getHashtag().equals("RPG")) {
                rpg.add(g);
            }
        }
        for (Game g : videoGames.values()) {
            if (g.getHashtag().equals("RPG")) {
                rpg.add(g);
            }
        }
        for (Game g : cardGames.values()) {
            if (g.getHashtag().equals("RPG")) {
                rpg.add(g);
            }
        }
        return rpg;
    }

    public Collection<Game> getExploration() {
        exploration.clear();
        for (Game g : tableTopGames.values()) {
            if (g.getHashtag().equals("Exploration")) {
                exploration.add(g);
            }
        }
        for (Game g : videoGames.values()) {
            if (g.getHashtag().equals("Exploration")) {
                exploration.add(g);
            }
        }
        for (Game g : cardGames.values()) {
            if (g.getHashtag().equals("Exploration")) {
                exploration.add(g);
            }
        }
        return exploration;
    }

    public Collection<Game> getParty() {

        party.clear();
        for (Game g : tableTopGames.values()) {
            if (g.getHashtag().equals("Party")) {
                party.add(g);
            }
        }
        for (Game g : videoGames.values()) {
            if (g.getHashtag().equals("Party")) {
                party.add(g);
            }
        }
        for (Game g : cardGames.values()) {
            if (g.getHashtag().equals("Party")) {
                party.add(g);
            }
        }
        return party;
    }
}
