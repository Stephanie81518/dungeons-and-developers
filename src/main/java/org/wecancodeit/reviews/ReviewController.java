package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ReviewController {

    public ReviewController() {

    }

    @Autowired
    private ReviewService reviewService;

    @RequestMapping("Action")
    public String actionTag(Model inModel) {

        inModel.addAttribute("actionTags", reviewService.getActionGames());
        return "Action-template";
    }

    @RequestMapping("RPG")
    public String rpgHashtag(Model inModel) {
        inModel.addAttribute("rpgTags", reviewService.getRpg());
        return "Rpg-template";
    }

    @RequestMapping("Party")
    public String partyHashtag(Model inModel) {
        inModel.addAttribute("partyTags", reviewService.getParty());
        return "Party-template";
    }

    @RequestMapping("Exploration")
    public String explorationHashtag(Model inModel) {
        inModel.addAttribute("explorationTags", reviewService.getExploration());
        return "Exploration-template";
    }

    @RequestMapping("TableTopCategory")
    public String getTableTop(Model inModel) {

        inModel.addAttribute("category", "Table Top");
        inModel.addAttribute("games", reviewService.getTableTopGames());
        return "Review-template";

    }

    @RequestMapping("VideoGameCategory")
    public String getVideoGame(Model inModel) {
        inModel.addAttribute("Videogames", reviewService.getVideoGames());
        inModel.addAttribute("category", "Video Games");
        return "VideoGame-template";

    }

    @RequestMapping("CardGameCategory")
    public String getCardGame(Model inModel) {

        inModel.addAttribute("Cardgames", reviewService.getCardGames());
        inModel.addAttribute("category", "Card Games");
        return "CardGameCategory-template";
    }

}
