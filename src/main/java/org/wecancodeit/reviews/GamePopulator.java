package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.Models.Game;
import org.wecancodeit.reviews.Models.HashTag;
import org.wecancodeit.reviews.Models.Review;
import org.wecancodeit.reviews.Storage.GameStorage;
import org.wecancodeit.reviews.Storage.ReviewStorage;

@Component
public class GamePopulator implements CommandLineRunner {
    private GameStorage inGameStorage;
    private ReviewStorage inReviewStorage;

    @Autowired
    private HashTagRepository hashtagRepo;
    @Autowired
    private GameRepository gameRepository;

    public GamePopulator(GameStorage inGameStorage,ReviewStorage inReviewStorage) {
        this.inGameStorage = inGameStorage;
        this.inReviewStorage = inReviewStorage;
    }

    @Override
    public void run(String...args) throws Exception {

        Game dnd = new Game("Dungeons and Dragons", "An open world RPG game", "RPG");
        Game betrayal = new Game("Betrayal on the house on Haunted Hill", "A Fun Party Game", "Exploration");
        Game monopoly = new Game("Monopoly", "Players collect rent from their opponents, with the goal being to drive them into bankruptcy",
                "Party");
        Game amongUs = new Game("Among Us", "Find the imposter before they destroy your ship!", "Action");
        Game hades = new Game("Hades", "Destroy the Demons before they Destroy you!", "RPG");
        Game detroit = new Game("Detroit Become Human", "A Choose your own adventure game.", "RPG");
        inGameStorage.addGame(dnd);
        inGameStorage.addGame(betrayal);
        inGameStorage.addGame(monopoly);
        inGameStorage.addGame(amongUs);
        inGameStorage.addGame(hades);
        inGameStorage.addGame(detroit);

        HashTag spooky = new HashTag("#spooky",betrayal,hades);
        HashTag nice = new HashTag("#nice",monopoly,dnd);
        HashTag wicked = new HashTag("#wicked",detroit,dnd);
        hashtagRepo.save(spooky);
        hashtagRepo.save(nice);
        hashtagRepo.save(wicked);

        Review dndReview = new Review("No matter your edition or specific RPG of choice, today D&D continues " +
                "to be the measuring stick by which other pen-and-paper games.",dnd);
        Review betralReview = new Review("An Amazing Table Top game where you haunt your enemies",betrayal);
        inReviewStorage.addReview(dndReview);
        inReviewStorage.addReview(betralReview);


//        Game retrievedGame = gameRepository.findById(dnd.getId()).get();
//        retrievedGame.getHashTags();

    }
}
