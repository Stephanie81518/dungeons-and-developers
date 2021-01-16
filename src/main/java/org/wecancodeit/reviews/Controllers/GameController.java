package org.wecancodeit.reviews.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Models.Game;
import org.wecancodeit.reviews.ReviewService;
import org.wecancodeit.reviews.Storage.GameStorage;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GameController {


@Autowired
private GameStorage gameStorage;


    @RequestMapping("Game/{id}")
    public String categories(Model inModel, @PathVariable Long id) {

        inModel.addAttribute("gameCategories", gameStorage.getGameByID(id));
        return "Game-template";
    }
}
