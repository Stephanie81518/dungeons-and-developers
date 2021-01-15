package org.wecancodeit.reviews.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.CommentRepository;
import org.wecancodeit.reviews.Models.Comment;
import org.wecancodeit.reviews.Models.Game;
import org.wecancodeit.reviews.Models.HashTag;
import org.wecancodeit.reviews.ReviewService;
import org.wecancodeit.reviews.Storage.GameStorage;
import org.wecancodeit.reviews.Storage.ReviewStorage;
import org.wecancodeit.reviews.UsernameService;

@Controller
public class HashTagController {
    @Autowired
    private GameStorage gameStorage;
    @Autowired
    private ReviewStorage reviewStorage;
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private UsernameService usernameService;

    @RequestMapping("Hashtags")
    public String hashtags(Model inModel){
        inModel.addAttribute("hashtags",gameStorage.retrieveAllHashtags());
        inModel.addAttribute("username",usernameService.getUsername());
        if(usernameService.isUserLoggedIn()){
            return "Hashtag-Template";
        }
        return "redirect:/";
    }

    @RequestMapping("Hashtags/{id}")
    public String getGamesOnHashtag(Model inModel, @PathVariable Long id){
        inModel.addAttribute("hashtagGames",gameStorage.getGameByID(id).getHashTags());
        inModel.addAttribute("gameName",gameStorage.getGameByID(id).getName());
        inModel.addAttribute("username",usernameService.getUsername());
        if(usernameService.isUserLoggedIn()){
            return "Hgame-Template";
        }
        return "redirect:/";
    }

    @PostMapping("/hashtag/{gameId}")
    public String addHashtag(Model inModel, @RequestParam String newHashtag,@PathVariable Long gameId){
        Game newGame = gameStorage.getGameByID(gameId);
        HashTag addHashtag = new HashTag(newHashtag,newGame);
        reviewStorage.addHashtag(addHashtag);
        inModel.addAttribute("username",usernameService.getUsername());
        if(usernameService.isUserLoggedIn()){
            return "redirect:/reviews/{gameId}";
        }
        return "redirect:/";
    }

    @PostMapping("/comment/{gameId}")
    public String addComment(Model inModel, @RequestParam String newComment, @PathVariable Long gameId){
        Game newGame = gameStorage.getGameByID(gameId);
        Comment addComment = new Comment(newComment,newGame);
        commentRepository.save(addComment);
        inModel.addAttribute("username",usernameService.getUsername());
        if(usernameService.isUserLoggedIn()){
            return "redirect:/reviews/{gameId}";
        }
        return "redirect:/";
    }
}
