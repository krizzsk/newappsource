package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import gj0.C23422a;
import gj0.C23424c;
import gj0.C23426e;
import gj0.C23434m;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@C23434m(name = "VAST", strict = false)
@Keep
@Metadata(mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTResponse;", "", "()V", "ads", "", "Lcom/cubic/umo/ad/types/AKVASTAd;", "getAds", "()Ljava/util/List;", "setAds", "(Ljava/util/List;)V", "noAdErrorTrackerUrl", "", "getNoAdErrorTrackerUrl", "()Ljava/lang/String;", "setNoAdErrorTrackerUrl", "(Ljava/lang/String;)V", "vastVersion", "getVastVersion$annotations", "getVastVersion", "setVastVersion", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKVASTResponse */
public final class AKVASTResponse {
    @C23426e
    private List<AKVASTAd> ads;
    @C23424c
    private String noAdErrorTrackerUrl;
    @C23422a
    private String vastVersion = "";

    public static /* synthetic */ void getVastVersion$annotations() {
    }

    public final List<AKVASTAd> getAds() {
        return this.ads;
    }

    public final String getNoAdErrorTrackerUrl() {
        return this.noAdErrorTrackerUrl;
    }

    public final String getVastVersion() {
        return this.vastVersion;
    }

    public final void setAds(List<AKVASTAd> list) {
        this.ads = list;
    }

    public final void setNoAdErrorTrackerUrl(String str) {
        this.noAdErrorTrackerUrl = str;
    }

    public final void setVastVersion(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.vastVersion = str;
    }
}
