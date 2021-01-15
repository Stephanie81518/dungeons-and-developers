package org.wecancodeit.reviews.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.ReviewService;
import org.wecancodeit.reviews.Storage.GameStorage;
import org.wecancodeit.reviews.Storage.ReviewStorage;
import org.wecancodeit.reviews.UsernameService;

@Controller
public class ReviewController {


    @Autowired
    private GameStorage gameStorage;
    @Autowired
    private UsernameService usernameService;



@RequestMapping ("reviews/{id}")
    public String gameReview (Model inModel, @PathVariable Long id){

    inModel.addAttribute("review",gameStorage.getGameByID(id).getReviews());
    inModel.addAttribute("gameName",gameStorage.getGameByID(id).getName());
    inModel.addAttribute("hashtags",gameStorage.getGameByID(id).getHashTags());
    inModel.addAttribute("gameId",gameStorage.getGameByID(id).getId());
    inModel.addAttribute("comments",gameStorage.getGameByID(id).getComments());
    inModel.addAttribute("username",usernameService.getUsername());
    if(usernameService.isUserLoggedIn()){
        return "Review-template";
    }
    return "redirect:/";
}
}
