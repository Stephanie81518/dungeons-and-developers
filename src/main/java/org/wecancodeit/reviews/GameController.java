package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class GameController {



  @Autowired
    private ReviewService reviewService;


    @RequestMapping("Category/{type}")
    public String categories(Model inModel, @PathVariable String type) {
        inModel.addAttribute("gameCategories", reviewService.getGames(type));
        return "Category-Template";
    }


}
