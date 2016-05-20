package com.zone.session.langugae;

/**
 * Convert french to english language.
 *
 */
public class FrenchToEnglishConverter implements LanguageConverter {
    public String convert(String msg) {
        if("salut à tous".equalsIgnoreCase(msg)){
            return "Hi all";
        }

        return msg;
    }
}
