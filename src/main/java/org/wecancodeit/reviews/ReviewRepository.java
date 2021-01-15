package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Models.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {
}
