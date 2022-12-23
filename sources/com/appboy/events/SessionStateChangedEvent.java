package com.appboy.events;

import androidx.annotation.Keep;

@Keep
public class SessionStateChangedEvent {
    public final String mSessionId;
    public final ChangeType mSessionStateChangeType;

    @Keep
    public enum ChangeType {
        SESSION_STARTED,
        SESSION_ENDED
    }

    public SessionStateChangedEvent(String str, ChangeType changeType) {
        this.mSessionId = str;
        this.mSessionStateChangeType = changeType;
    }

    public ChangeType getEventType() {
        return this.mSessionStateChangeType;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("SessionStateChangedEvent{mSessionId='");
        C25541a.m63890u(k, this.mSessionId, '\'', ", mSessionStateChangeType=");
        k.append(this.mSessionStateChangeType);
        k.append('}');
        return k.toString();
    }
}
