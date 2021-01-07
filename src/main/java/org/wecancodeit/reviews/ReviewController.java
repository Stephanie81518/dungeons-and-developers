package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

    @RequestMapping("TableTopCategory.html")
    public String getTableTop(Model inModel) {
        TableTopGame dnd = new TableTopGame("Dungeons & Dragons", "An open world Table top RPG game", "RPG");
        TableTopGame betrayal = new TableTopGame("Betrayal on the house on Haunted Hill", "A Fun Party Game", "Horror");
        TableTopGame monopoly = new TableTopGame("Monopoly", "Players collect rent from their opponents, with the goal being to drive them into bankruptcy", "Horror");
        inModel.addAttribute("TableTopGame1",dnd);
        inModel.addAttribute("TableTopGame2",betrayal);
        inModel.addAttribute("TableTopGame3",monopoly);
        return "TableTopCategory-template";
    }

    @RequestMapping("VideoGameCategory.html")
    public String getVideoGame(Model inModel){
        VideoGame amongUs = new VideoGame("Among Us", "Find the imposter before they destroy your ship!","Party");
        inModel.addAttribute("VideoGame",amongUs);
        return "VideoGame-template";
    }
    @RequestMapping("CardGameCategory.html")
    public String getCardGame(Model inModel){
        CardGame cardsAgainst = new CardGame("Cards Against Humanity", "A Fun party game!","Party");
        inModel.addAttribute("CardGame",cardsAgainst);
        return "CardGameCategory-template";
    }

}
