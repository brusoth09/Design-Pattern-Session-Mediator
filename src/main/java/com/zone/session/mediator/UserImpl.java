package com.zone.session.mediator;

import com.zone.session.langugae.Language;

/**
 * concrete implementation of User interface
 *
 */
class UserImpl extends User{

    public UserImpl(ChatRoomMediator mediator, String name, Language lang) {
        super(mediator, name, lang);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name+"[Language :"+lang+"]"+
                ": Sending message= "+msg);
        mediator.sendMessage(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+"[Language :"+lang+"]"+ ": Receiving message= "+msg);
    }
}
