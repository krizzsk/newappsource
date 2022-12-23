package com.appboy.events;

import androidx.annotation.Keep;
import p030bo.app.C1591h;

@Keep
public class BrazeSdkAuthenticationErrorEvent {
    public final C1591h mSdkAuthError;

    public BrazeSdkAuthenticationErrorEvent(C1591h hVar) {
        this.mSdkAuthError = hVar;
    }

    public int getErrorCode() {
        return this.mSdkAuthError.mo6127c();
    }

    public String getErrorReason() {
        return this.mSdkAuthError.mo6128d();
    }

    public long getRequestInitiationTime() {
        return this.mSdkAuthError.mo6126b().mo5995h().longValue();
    }

    public String getSignature() {
        return this.mSdkAuthError.mo6126b().mo6000m();
    }

    public String getUserId() {
        return this.mSdkAuthError.mo6126b().mo5986c();
    }

    public String toString() {
        return this.mSdkAuthError.toString();
    }
}
