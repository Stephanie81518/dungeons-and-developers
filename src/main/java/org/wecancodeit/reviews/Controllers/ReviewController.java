package org.wecancodeit.reviews.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.ReviewService;

@Controller
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

@RequestMapping ("gameReview, {type}")
    public String gameReview (Model inModel, @PathVariable String type){

    inModel.addAttribute("Reviews", reviewService.getReview(type));
    return "Category-template";
}
}
