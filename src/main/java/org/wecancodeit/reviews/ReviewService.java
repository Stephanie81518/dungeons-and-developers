package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Models.Game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ReviewService {

    Map<Long, Game> games = new HashMap<>();


    public String category;

    public Collection<Game> getGames() {
        return games.values();
    }

    public Collection<Game> getGames(String category) {
        Map<Long, Game> gameSet = new HashMap<>();
        for (Game g : games.values()) {
            if (g.getCategory().equals(category)) {
                gameSet.put(g.getId(), g);
            }
        }
        return gameSet.values();
    }
}

/*    public ReviewService(){
    Game dnd = new Game(1, "An open world RPG game", this.category, "RPG", "Dungeons and Dragons");
    Game betrayal= new Game(2, "A Fun Party Game", this.category, "Party", "Betrayal on the house on Haunted Hill");
    Game monopoly = new Game(3, "Players collect rent from their opponents, with the goal being to drive them into bankruptcy", this.category, "Horror", "Monopoly"
    );
    Game mysterium = new Game(4, "Players are psychics who are trying to figure out a murder mystery in which a ghost gives out hints", this.category, "Horror", "Mysterium"
    );
    tableTopGames.put(dnd.getId(),dnd);
    tableTopGames.put(betrayal.getId(),betrayal);
    tableTopGames.put(monopoly.getId(),monopoly);
    tableTopGames.put(mysterium.getId(),mysterium);

    Game amongUs = new Game(4, "Find the imposter before they destroy your ship!", this.category, "Party", "Among Us");
    Game hades = new Game(5, "Destroy the Demons before they Destroy you!", this.category, "Exploration", "Hades");
    Game detroit = new Game(6, "A Choose your own adventure game.", this.category, "RPG", "Detroit Become Human");
    videoGames.put(amongUs.getId(),amongUs);
    videoGames.put(hades.getId(),hades);
    videoGames.put(detroit.getId(),detroit);

    Game cardsAgainst = new Game(7, "A Fun party game!", this.category, "Party", "Cards Against Humanity");
    Game superFights = new Game(8, "Fight your friends with cards!", this.category, "Action", "SuperFights");
    Game uno = new Game(9, "Ruin your friendships with UNO!", this.category, "Action", "Uno");

    cardGames.put(cardsAgainst.getId(),cardsAgainst);
    cardGames.put(superFights.getId(),superFights);
    cardGames.put(uno.getId(),uno);

}*/

/*@RequestMapping("Action")
public String actionTag(Model inModel){
    actionGames.clear();
    for(Game g: tableTopGames.values()){
        if(g.getHashtag().equals("Action")){
            actionGames.add(g);
        }
    }
    for(Game g: videoGames.values()){
        if(g.getHashtag().equals("Action")){
            actionGames.add(g);
        }
    }
    for(Game g: cardGames.values()){
        if(g.getHashtag().equals("Action")){
            actionGames.add(g);
        }
    }
    inModel.addAttribute("actionTags",actionGames);
return "Action-template";
}*/
/*
    @RequestMapping("RPG")
    public String rpgHashtag(Model inModel){
    //.clear will CLEAR out the array list. This way it won't build on top (aka doubles it) of things an old array list.
    rpg.clear();
        for(Game g: tableTopGames.values()){
            if(g.getHashtag().equals("RPG")){
                rpg.add(g);
            }
        }
        for(Game g: videoGames.values()){
            if(g.getHashtag().equals("RPG")){
                rpg.add(g);
            }
        }
        for(Game g: cardGames.values()){
            if(g.getHashtag().equals("RPG")){
                rpg.add(g);
            }
        }
        inModel.addAttribute("rpgTags",rpg);
        return "Rpg-template";
    }

    @RequestMapping("Party")
    public String partyHashtag(Model inModel){
        party.clear();
        for(Game g: tableTopGames.values()){
            if(g.getHashtag().equals("Party")){
                party.add(g);
            }
        }
        for(Game g: videoGames.values()){
            if(g.getHashtag().equals("Party")){
                party.add(g);
            }
        }
        for(Game g: cardGames.values()){
            if(g.getHashtag().equals("Party")){
                party.add(g);
            }
        }
        inModel.addAttribute("partyTags",party);
        return "Party-template";
    }

    @RequestMapping("Exploration")
    public String explorationHashtag(Model inModel){
        exploration.clear();
        for(Game g: tableTopGames.values()){
            if(g.getHashtag().equals("Exploration")){
                exploration.add(g);
            }
        }
        for(Game g: videoGames.values()){
            if(g.getHashtag().equals("Exploration")){
                exploration.add(g);
            }
        }
        for(Game g: cardGames.values()){
            if(g.getHashtag().equals("Exploration")){
                exploration.add(g);
            }
        }
        inModel.addAttribute("explorationTags",exploration);
        return "Exploration-template";
    }

    @RequestMapping("TableTopCategory")
    public String getTableTop(Model inModel) {
        this.category = "TableTop";
        inModel.addAttribute("category",this.category);
        inModel.addAttribute("games",tableTopGames.values());
        return "Review-template";

    }

    @RequestMapping("VideoGameCategory")
    public String getVideoGame(Model inModel){
        this.category = "VideoGame";
        inModel.addAttribute("Videogames",videoGames.values());
        inModel.addAttribute("category",this.category);
        return "VideoGame-template";

    }

    @RequestMapping("CardGameCategory")
    public String getCardGame(Model inModel){
        this.category = "CardGame";
        inModel.addAttribute("Cardgames",cardGames.values());
        inModel.addAttribute("category",this.category);
        return "CardGameCategory-template";
    }

    @RequestMapping("Horror")
    public String horrorHashtag(Model inModel){
        horror.clear();
        for(Game g: tableTopGames.values()){
            if(g.getHashtag().equals("Horror")){
                horror.add(g);
            }
        }
        for(Game g: videoGames.values()){
            if(g.getHashtag().equals("Horror")){
                horror.add(g);
            }
        }
        for(Game g: cardGames.values()){
            if(g.getHashtag().equals("Horror")){
                horror.add(g);
            }
        }
        inModel.addAttribute("horrorTags",horror);
        return "Horror-template";
    }
}*/
