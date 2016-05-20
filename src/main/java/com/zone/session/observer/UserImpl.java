package com.zone.session.observer;

import com.zone.session.langugae.Language;
import com.zone.session.langugae.LanguageFactory;

/**
 * concrete implementation of User interface
 *
 */
class UserImpl extends User {

    private LanguageFactory factory = new LanguageFactory();
    private static final String LANGUAGES = "[Languages :";

    public UserImpl(String name, Language lang) {
        super(name, lang);
    }

    public void getMessage(String msg, Language language) {
        System.out.println(this.name + LANGUAGES + lang + "]" + ": Receiving message= " + msg);
        if (lang != language) {
            System.out.println(this.name + LANGUAGES + lang + "]" + ": Translating message");
            System.out.println(this.name + LANGUAGES + lang + "] converted Message: " + factory.getLanguageProcessor(language,getLang()).convert(msg));
        }
    }
}
