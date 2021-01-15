package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

@Service
public class UsernameService {
    public String username = null;
    public boolean isValidLogin = true;

//    public UsernameService(String username) {
//        this.username = username;
//    }

    public UsernameService() {
    }

    public String getUsername() {
        return username;
    }

    public boolean isValidLogin() {
        return isValidLogin;
    }
}
