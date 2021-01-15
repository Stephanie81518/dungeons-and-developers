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

@Controller
public class HashTagController {
    @Autowired
    private GameStorage gameStorage;
    @Autowired
    private ReviewStorage reviewStorage;
    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping("Hashtags")
    public String hashtags(Model inModel){
        inModel.addAttribute("hashtags",gameStorage.retrieveAllHashtags());
        return "Hashtag-Template";
    }

    @RequestMapping("Hashtags/{id}")
    public String getGamesOnHashtag(Model inModel, @PathVariable Long id){
        inModel.addAttribute("hashtagGames",gameStorage.getGameByID(id).getHashTags());
        inModel.addAttribute("gameName",gameStorage.getGameByID(id).getName());

        return "Hgame-Template";
    }

    @PostMapping("/hashtag/{gameId}")
    public String addHashtag(@RequestParam String newHashtag,@PathVariable Long gameId){
        Game newGame = gameStorage.getGameByID(gameId);
        HashTag addHashtag = new HashTag(newHashtag,newGame);
        reviewStorage.addHashtag(addHashtag);
        return "redirect:/reviews/{gameId}";
    }

    @PostMapping("/comment/{gameId}")
    public String addComment(@RequestParam String newComment, @PathVariable Long gameId){
        Game newGame = gameStorage.getGameByID(gameId);
        Comment addComment = new Comment(newComment,newGame);
        commentRepository.save(addComment);

        return "redirect:/reviews/{gameId}";
    }
}
