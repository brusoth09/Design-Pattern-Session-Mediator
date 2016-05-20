package com.zone.session.observer;

import com.zone.session.langugae.Language;

import java.util.ArrayList;
import java.util.List;

/**
 * User contract for concrete implementations
 *
 */
abstract class User implements Observer{

    private List<Observer> observerList = new ArrayList();

    protected final String name;
    protected final Language lang;

    public User(String name, Language lang){
        this.name = name;
        this.lang = lang;
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public Language getLang() {
        return lang;
    }

    public void sendMessage(String msg){
        System.out.println(this.name+"[Languagesss :"+lang+"]"+
                ": Sending message = "+msg);
        notifyAllObservers(msg);
    }

    public void notifyAllObservers(String msg){
        for(Observer observer:observerList){
            observer.getMessage(msg,lang);
        }
    }
}
