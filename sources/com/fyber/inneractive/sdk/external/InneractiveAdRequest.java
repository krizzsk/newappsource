package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.flow.C2761a0;

public class InneractiveAdRequest extends C2761a0 {

    /* renamed from: c */
    public String f9496c;

    /* renamed from: d */
    public C2703z f9497d;

    public InneractiveAdRequest(String str) {
        this.f9496c = str;
    }

    @Deprecated
    public String getKeywords() {
        return InneractiveAdManager.getKeywords();
    }

    @Deprecated
    public boolean getMuteVideo() {
        return InneractiveAdManager.getMuteVideo();
    }

    public C2703z getSelectedUnitConfig() {
        return this.f9497d;
    }

    public String getSpotId() {
        return this.f9496c;
    }

    @Deprecated
    public InneractiveUserConfig getUserParams() {
        return InneractiveAdManager.getUserParams();
    }

    @Deprecated
    public void setKeywords(String str) {
        InneractiveAdManager.setKeywords(str);
    }

    @Deprecated
    public void setMuteVideo(boolean z) {
        InneractiveAdManager.setMuteVideo(z);
    }

    public void setSelectedUnitConfig(C2703z zVar) {
        this.f9497d = zVar;
    }

    @Deprecated
    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
