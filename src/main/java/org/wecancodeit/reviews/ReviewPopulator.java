package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {

    private ReviewService reviewService;


    public ReviewPopulator(ReviewService reviewService) {
        this.reviewService = reviewService;
    }


    @Override
    public void run(String... args) throws Exception {
        Game dnd = new Game("Dungeons and Dragons", "An open world RPG game", "Table Top", "RPG", 1);
        Game betrayal = new Game("Betrayal on the house on Haunted Hill", "A Fun Party Game", "Table Top", "Party", 2);
        Game monopoly = new Game("Monopoly", "Players collect rent from their opponents, with the goal being to drive them into bankruptcy",
                "Table Top", "Horror", 3);
        reviewService.addTableTopGame(dnd);
        reviewService.addTableTopGame(betrayal);
        reviewService.addTableTopGame(monopoly);


        Game amongUs = new Game("Among Us", "Find the imposter before they destroy your ship!", "Video Game", "Party", 4);
        Game hades = new Game("Hades", "Destroy the Demons before they Destroy you!", "Video Game", "Exploration", 5);
        Game detroit = new Game("Detroit Become Human", "A Choose your own adventure game.", "Video Game", "RPG", 6);
        reviewService.addVideoGame(amongUs);
        reviewService.addVideoGame(hades);
        reviewService.addVideoGame(detroit);

        Game cardsAgainst = new Game("Cards Against Humanity", "A Fun party game!", "Card Game", "Party", 7);
        Game superFights = new Game("SuperFights", "Fight your friends with cards!", "Card Game", "Action", 8);
        Game uno = new Game("Uno", "Ruin your friendships with UNO!", "Card Game", "Action", 9);
        reviewService.addCardGame(cardsAgainst);
        reviewService.addCardGame(superFights);
        reviewService.addCardGame(uno);


    }


}
