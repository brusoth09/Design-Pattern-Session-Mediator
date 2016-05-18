package com.zone.session.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of Chat Room Mediator
 *
 */
class ChatRoomMediatorImpl implements ChatRoomMediator {
    private final List<User> users;
    private LanguageProcessor processor = new LanguageProcessor();

    public ChatRoomMediatorImpl() {
        this.users = new ArrayList();
    }

    public void sendMessage(String msg, User user) {
        for(User u:users){
            if(u != user){
                if(u.getLang() == user.getLang()) {
                    u.receive(msg);
                } else {
                    u.receive(processor.convertLanguage(msg,user.getLang(),u.getLang()));
                }
            }
        }
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
