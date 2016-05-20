package com.zone.session.observer;

import com.zone.session.langugae.Language;

/**
 * Observer interface
 *
 */
interface Observer {
    void getMessage(String msg,Language language);
}
