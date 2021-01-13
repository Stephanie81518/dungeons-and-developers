package org.wecancodeit.reviews.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Models.Game;
import org.wecancodeit.reviews.ReviewService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GameController {


@Autowired
private ReviewService reviewService;


    @RequestMapping("Catagory/{type}")
    public String categories(Model inModel, @PathVariable String type) {

        inModel.addAttribute("gameCategories", reviewService.getGames(type));
        return "Category-template";
    }
}
