package com.zone.session.mediator;

import com.zone.session.langugae.Language;

/**
 * Chat room client main method to execute chat room.
 *
 */
public class ChatRoomClient {
    private ChatRoomClient(){
        //private constructor added to hide the implicit public access
    }
    public static void main(String[] args) {
        ChatRoomMediator mediator = new ChatRoomMediatorImpl();

        User user1 = new UserImpl(mediator,"Peter", Language.ENGLISH);
        User user2 = new UserImpl(mediator,"Kevin",Language.FRENCH);

        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("Hi All");
        user2.send("salut à tous");
    }
}
