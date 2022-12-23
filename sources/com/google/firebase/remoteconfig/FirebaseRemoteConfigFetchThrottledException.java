package com.google.firebase.remoteconfig;

public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {
    private final long throttleEndTimeMillis;

    public FirebaseRemoteConfigFetchThrottledException(String str, long j) {
        super(str);
        this.throttleEndTimeMillis = j;
    }
}
