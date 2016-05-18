package com.zone.session.observer;

/**
 * concrete implementation of User interface
 */
class UserImpl extends User {

    private LanguageProcessor processor = new LanguageProcessor();

    public UserImpl(String name, Language lang) {
        super(name, lang);
    }

    public void getMessage(String msg, Language language) {
        System.out.println(this.name + "[Language :" + lang + "]" + ": Receiving message= " + msg);
        if (lang != language) {
            System.out.println(this.name + "[Language :" + lang + "]" + ": Translating message");
            System.out.println(this.name + "[Language :" + lang + "] converted Message: " + processor.convertLanguage(msg, language, getLang()));
        }
    }
}
