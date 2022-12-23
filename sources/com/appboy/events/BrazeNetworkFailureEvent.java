package com.appboy.events;

import androidx.annotation.Keep;
import p030bo.app.C1577f3;
import p030bo.app.C1586g3;
import p030bo.app.C1620k3;

@Keep
public class BrazeNetworkFailureEvent {
    public final String mNetworkExceptionMessage;
    public final long mRequestInitiationTime;
    public final RequestType mRequestType;

    @Keep
    public enum RequestType {
        CONTENT_CARDS_SYNC,
        NEWS_FEED_SYNC,
        OTHER
    }

    public BrazeNetworkFailureEvent(Exception exc, C1620k3 k3Var) {
        if (k3Var instanceof C1577f3) {
            this.mRequestType = RequestType.CONTENT_CARDS_SYNC;
        } else if (k3Var instanceof C1586g3) {
            C1586g3 g3Var = (C1586g3) k3Var;
            if (g3Var.mo5971a() == null || !g3Var.mo5971a().mo6327w()) {
                this.mRequestType = RequestType.OTHER;
            } else {
                this.mRequestType = RequestType.NEWS_FEED_SYNC;
            }
        } else {
            this.mRequestType = RequestType.OTHER;
        }
        this.mNetworkExceptionMessage = exc.getMessage();
        this.mRequestInitiationTime = k3Var.mo5995h().longValue();
    }

    public String getNetworkExceptionMessage() {
        return this.mNetworkExceptionMessage;
    }

    public long getRequestInitiationTime() {
        return this.mRequestInitiationTime;
    }

    public RequestType getRequestType() {
        return this.mRequestType;
    }
}
