package com.zone.session.mediator;

/**
 * User contract for concrete implementations
 *
 */
abstract class User {
    protected final ChatRoomMediator mediator;
    protected final String name;
    protected final Language lang;

    public User(ChatRoomMediator mediator, String name, Language lang){
        this.mediator = mediator;
        this.name = name;
        this.lang = lang;
    }

    public Language getLang() {
        return lang;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
