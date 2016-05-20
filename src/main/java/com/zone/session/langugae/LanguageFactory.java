package com.zone.session.langugae;

/**
 * Factory method to get language converter
 *
 */
public class LanguageFactory {
    public LanguageConverter getLanguageProcessor(Language senderLanguage, Language receiverLanguage) {
        if (senderLanguage == Language.ENGLISH) {
            switch (receiverLanguage) {
                case FRENCH:
                    return new EnglishToFrenchConverter();
                default:
                    return new NullLanguageConverter();
            }
        } else if (senderLanguage == Language.FRENCH) {
            switch (receiverLanguage) {
                case ENGLISH:
                    return new FrenchToEnglishConverter();
                default:
                    return new NullLanguageConverter();
            }
        }

        return new NullLanguageConverter();
    }
}
