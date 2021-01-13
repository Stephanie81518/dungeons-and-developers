package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {


    private ReviewService reviewService;

    @Autowired
    private GameRepository gameRepository;

    public ReviewPopulator(ReviewService reviewService) {
        this.reviewService = reviewService;
    }


    @Override
    public void run(String... args) throws Exception {
        HashTag spooky = new HashTag(1,"Spooky");
        HashTag superfun = new HashTag(2,"SuperFun");
        HashTag hard = new HashTag(3,"Hard");

        Game dnd = new Game("Dungeons and Dragons", "An open world RPG game", "RPG", "spooky", 1);
        Game betrayal = new Game("Betrayal on the house on Haunted Hill", "A Fun Party Game", "Exploration", "superfun", 2);
        Game monopoly = new Game("Monopoly", "Players collect rent from their opponents, with the goal being to drive them into bankruptcy",
                "Party", "hard", 3);
        reviewService.addGame(dnd);
        reviewService.addGame(betrayal);
        reviewService.addGame(monopoly);



        Game amongUs = new Game("Among Us", "Find the imposter before they destroy your ship!", "Action","spooky", 4);
        Game hades = new Game("Hades", "Destroy the Demons before they Destroy you!", "RPG", "superfun", 5);
        Game detroit = new Game("Detroit Become Human", "A Choose your own adventure game.", "", "hard", 6);
        reviewService.addGame(amongUs);
        reviewService.addGame(hades);
        reviewService.addGame(monopoly);

        Game cardsAgainst = new Game("Cards Against Humanity", "A Fun party game!", "Card Game", "spooky", 7);
        Game superFights = new Game("SuperFights", "Fight your friends with cards!", "Card Game", "superfun", 8);
        Game uno = new Game("Uno", "Ruin your friendships with UNO!", "Card Game", "hard", 9);
        reviewService.addGame(cardsAgainst);
        reviewService.addGame(superFights);
        reviewService.addGame(uno);

        gameRepository.save(dnd);
        gameRepository.save(betrayal);
        gameRepository.save(monopoly);

        gameRepository.save(amongUs);
        gameRepository.save(hades);
        gameRepository.save(detroit);

        gameRepository.save(cardsAgainst);
        gameRepository.save(superFights);
        gameRepository.save(uno);


    }


}
