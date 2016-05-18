package com.zone.session.observer;

/**
 * Process language conversion
 *
 */
class LanguageProcessor {
    public String convertLanguage(String msg,Language sender, Language receiver){
        if(sender == Language.ENGLISH){
            switch (receiver) {
                case FRENCH: {
                    if(msg.equalsIgnoreCase("Hi all")){
                        return "salut à tous";
                    }
                    break;
                }
            }
        } else if( sender == Language.FRENCH){
            switch (receiver) {
                case ENGLISH: {
                    if(msg.equalsIgnoreCase("salut à tous")){
                        return "Hi all";
                    }
                    break;
                }
            }
        } else{
            return msg;
        }
        return msg;
    }
}
