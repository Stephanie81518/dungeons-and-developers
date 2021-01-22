package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.HashTagRepository;
import org.wecancodeit.reviews.Models.HashTag;

@Service
public class HashtagStorage {
    private HashTagRepository hashTagRepository;

    public HashtagStorage(HashTagRepository hashTagRepository) {
        this.hashTagRepository = hashTagRepository;
    }
}
