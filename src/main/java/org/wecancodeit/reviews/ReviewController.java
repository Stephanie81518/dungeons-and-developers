package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ReviewController {
Map<Integer,Game> tableTopGames = new HashMap<>();
Map<Integer,Game> videoGames = new HashMap<>();
Map<Integer,Game> cardGames = new HashMap<>();

Collection<Game> actionGames = new ArrayList<>();
Collection<Game> rpg = new ArrayList<>();
Collection<Game> exploration = new ArrayList<>();
Collection<Game> party = new ArrayList<>();

public String category;

public ReviewController(){
    Game dnd = new Game("Dungeons and Dragons","An open world RPG game",this.category,"RPG",1);
    Game betrayal= new Game("Betrayal on the house on Haunted Hill","A Fun Party Game",this.category,"Party",2);
    Game monopoly = new Game("Monopoly", "Players collect rent from their opponents, with the goal being to drive them into bankruptcy",
            this.category,"Horror",3);
    tableTopGames.put(dnd.getId(),dnd);
    tableTopGames.put(betrayal.getId(),betrayal);
    tableTopGames.put(monopoly.getId(),monopoly);

    Game amongUs = new Game("Among Us", "Find the imposter before they destroy your ship!",this.category,"Party",4);
    Game hades = new Game("Hades", "Destroy the Demons before they Destroy you!",this.category,"Exploration",5);
    Game detroit = new Game("Detroit Become Human", "A Choose your own adventure game.",this.category,"RPG",6);
    videoGames.put(amongUs.getId(),amongUs);
    videoGames.put(hades.getId(),hades);
    videoGames.put(detroit.getId(),detroit);

    Game cardsAgainst = new Game("Cards Against Humanity", "A Fun party game!",this.category,"Party",7);
    Game superFights = new Game("SuperFights", "Fight your friends with cards!",this.category,"Action",8);
    Game uno = new Game("Uno", "Ruin your friendships with UNO!",this.category,"Action",9);

    cardGames.put(cardsAgainst.getId(),cardsAgainst);
    cardGames.put(superFights.getId(),superFights);
    cardGames.put(uno.getId(),uno);

}

@RequestMapping("Action")
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
}

    @RequestMapping("RPG")
    public String rpgHashtag(Model inModel){
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

}
