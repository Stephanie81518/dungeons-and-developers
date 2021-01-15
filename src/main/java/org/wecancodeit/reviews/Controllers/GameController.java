package org.wecancodeit.reviews.Controllers;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.Models.Game;
import org.wecancodeit.reviews.ReviewService;
import org.wecancodeit.reviews.Storage.GameStorage;
import org.wecancodeit.reviews.UsernameService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GameController {


@Autowired
private GameStorage gameStorage;
@Autowired
public UsernameService usernameService;


    @RequestMapping("/")
    public String username(Model inModel){
        usernameService.isValidLogin = true;
        inModel.addAttribute("isValid",usernameService.isValidLogin());
        usernameService.username=null;
        return "Username-Template";
    }


    @RequestMapping("/setusername")
    public String home(Model inModel, @RequestParam String newUsername){
        usernameService.username = newUsername;

//        should put this code in the UsernameService
        if(newUsername.equals("")){
            usernameService.isValidLogin = false;
            inModel.addAttribute("isValid",usernameService.isValidLogin());

            return "Username-Template";
        } else {
            return "redirect:/Home";
        }

    }


    @RequestMapping("Games")
    public String games(Model inModel){
        inModel.addAttribute("games",gameStorage.retrieveAllGames());
        inModel.addAttribute("username",usernameService.getUsername());
        if(usernameService.isUserLoggedIn()){
            return "Games-Template";
        }
        return "redirect:/";
    }

    @RequestMapping("/Home")
    public String goHome(Model inModel){
        usernameService.isUserLoggedIn = true;
        inModel.addAttribute("username",usernameService.getUsername());
        return "Home-Template";
    }

    @RequestMapping("/logout")
    public String logout(){
        usernameService.username.equals("");
        usernameService.isValidLogin = true;
        usernameService.isUserLoggedIn = false;
        return "redirect:/";
    }


}
