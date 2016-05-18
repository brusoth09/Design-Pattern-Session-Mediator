package com.zone.session.observer;

/**
 * Char room application by observer design pattern
 *
 */
public class CharRoomObserver {
    public static void main(String[] args) {
        User user1 = new UserImpl("peter",Language.ENGLISH);
        User user2 = new UserImpl("kevin",Language.FRENCH);

        user1.addObserver(user2);
        user2.addObserver(user2);

        user1.sendMessage("Hi all");
    }
}
