package org.wecancodeit.reviews.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.ReviewService;
import org.wecancodeit.reviews.Storage.GameStorage;

@Controller
public class HashTagController {
    @Autowired
    private GameStorage gameStorage;

    @RequestMapping("HashTag/{id}")
    public String gHashTags (Model inModel, @PathVariable Long id){

        inModel.addAttribute("HashTags", gameStorage.getGameByID(id).getHashTags());
        return "HashTag-template";
    }
}
