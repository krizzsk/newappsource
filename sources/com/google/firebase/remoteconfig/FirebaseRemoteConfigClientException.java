package com.google.firebase.remoteconfig;

public class FirebaseRemoteConfigClientException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigClientException(String str) {
        super(str);
    }

    public FirebaseRemoteConfigClientException(String str, Exception exc) {
        super(str, exc);
    }
}
