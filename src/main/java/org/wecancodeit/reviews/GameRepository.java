package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Models.Game;

public interface GameRepository extends CrudRepository <Game, Long> {

}
