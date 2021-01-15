package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

@Service
public class UsernameService {
    public String username;

    public UsernameService(String username) {
        this.username = username;
    }

    public UsernameService() {
    }

    public String getUsername() {
        return username;
    }
}
