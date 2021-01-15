package org.wecancodeit.reviews.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.ReviewService;
import org.wecancodeit.reviews.Storage.GameStorage;
import org.wecancodeit.reviews.Storage.ReviewStorage;

@Controller
public class ReviewController {


    @Autowired
    private GameStorage gameStorage;



@RequestMapping ("reviews/{id}")
    public String gameReview (Model inModel, @PathVariable Long id){

    inModel.addAttribute("review",gameStorage.getGameByID(id).getReviews());
    inModel.addAttribute("gameName",gameStorage.getGameByID(id).getName());
    inModel.addAttribute("hashtags",gameStorage.getGameByID(id).getHashTags());
    inModel.addAttribute("gameId",gameStorage.getGameByID(id).getId());
    return "Review-template";
}
}
