package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import gj0.C23422a;
import gj0.C23424c;
import gj0.C23434m;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@C23434m(name = "Linear", strict = false)
@Keep
@Metadata(mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTLinear;", "", "()V", "adParameters", "", "getAdParameters", "()Ljava/lang/String;", "setAdParameters", "(Ljava/lang/String;)V", "duration", "getDuration", "setDuration", "mediaFiles", "Lcom/cubic/umo/ad/types/AKVASTMediaFiles;", "getMediaFiles", "()Lcom/cubic/umo/ad/types/AKVASTMediaFiles;", "setMediaFiles", "(Lcom/cubic/umo/ad/types/AKVASTMediaFiles;)V", "skipOffset", "getSkipOffset", "setSkipOffset", "trackingEvents", "Lcom/cubic/umo/ad/types/AKVASTTrackingEvents;", "getTrackingEvents", "()Lcom/cubic/umo/ad/types/AKVASTTrackingEvents;", "setTrackingEvents", "(Lcom/cubic/umo/ad/types/AKVASTTrackingEvents;)V", "videoClicks", "Lcom/cubic/umo/ad/types/AKVASTVideoClicks;", "getVideoClicks", "()Lcom/cubic/umo/ad/types/AKVASTVideoClicks;", "setVideoClicks", "(Lcom/cubic/umo/ad/types/AKVASTVideoClicks;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKVASTLinear */
public final class AKVASTLinear {
    @C23424c
    private String adParameters;
    @C23424c
    private String duration;
    @C23424c
    private AKVASTMediaFiles mediaFiles;
    @C23422a
    private String skipOffset = "";
    @C23424c
    private AKVASTTrackingEvents trackingEvents;
    @C23424c
    private AKVASTVideoClicks videoClicks;

    public final String getAdParameters() {
        return this.adParameters;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final AKVASTMediaFiles getMediaFiles() {
        return this.mediaFiles;
    }

    public final String getSkipOffset() {
        return this.skipOffset;
    }

    public final AKVASTTrackingEvents getTrackingEvents() {
        return this.trackingEvents;
    }

    public final AKVASTVideoClicks getVideoClicks() {
        return this.videoClicks;
    }

    public final void setAdParameters(String str) {
        this.adParameters = str;
    }

    public final void setDuration(String str) {
        this.duration = str;
    }

    public final void setMediaFiles(AKVASTMediaFiles aKVASTMediaFiles) {
        this.mediaFiles = aKVASTMediaFiles;
    }

    public final void setSkipOffset(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.skipOffset = str;
    }

    public final void setTrackingEvents(AKVASTTrackingEvents aKVASTTrackingEvents) {
        this.trackingEvents = aKVASTTrackingEvents;
    }

    public final void setVideoClicks(AKVASTVideoClicks aKVASTVideoClicks) {
        this.videoClicks = aKVASTVideoClicks;
    }
}
