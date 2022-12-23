package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

public class FirebaseRemoteConfigException extends FirebaseException {
    public FirebaseRemoteConfigException(String str) {
        super(str);
    }

    public FirebaseRemoteConfigException(String str, Exception exc) {
        super(str, exc);
    }
}
