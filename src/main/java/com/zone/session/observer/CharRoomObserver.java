package com.zone.session.observer;

import com.zone.session.langugae.Language;

/**
 * Char room application by observer design pattern
 *
 */
public class CharRoomObserver {

    private CharRoomObserver(){
        //private constructor added to hide the implicit public access
    }

    public static void main(String[] args) {
        User user1 = new UserImpl("peter", Language.ENGLISH);
        User user2 = new UserImpl("kevin", Language.FRENCH);

        user1.addObserver(user2);
        user2.addObserver(user2);

        user1.sendMessage("Hi all");
    }
}
