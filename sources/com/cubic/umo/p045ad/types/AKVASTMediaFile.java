package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import gj0.C23422a;
import gj0.C23434m;
import gj0.C23435n;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@C23434m(name = "MediaFile", strict = false)
@Keep
@Metadata(mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001e\u0010'\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\b¨\u0006-"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTMediaFile;", "", "()V", "apiFramework", "", "getApiFramework", "()Ljava/lang/String;", "setApiFramework", "(Ljava/lang/String;)V", "bitrate", "getBitrate", "setBitrate", "codec", "getCodec", "setCodec", "delivery", "getDelivery", "setDelivery", "height", "getHeight", "setHeight", "id", "getId", "setId", "maintainAspectRatio", "getMaintainAspectRatio", "setMaintainAspectRatio", "maxBitrate", "getMaxBitrate", "setMaxBitrate", "mediaUrl", "getMediaUrl", "setMediaUrl", "minBitrate", "getMinBitrate", "setMinBitrate", "scalable", "getScalable", "setScalable", "type", "getType", "setType", "width", "getWidth", "setWidth", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKVASTMediaFile */
public final class AKVASTMediaFile {
    @C23422a
    private String apiFramework = "";
    @C23422a
    private String bitrate = "";
    @C23422a
    private String codec = "";
    @C23422a
    private String delivery = "";
    @C23422a
    private String height = "";
    @C23422a

    /* renamed from: id */
    private String f7664id = "";
    @C23422a
    private String maintainAspectRatio = "";
    @C23422a
    private String maxBitrate = "";
    @C23435n
    private String mediaUrl;
    @C23422a
    private String minBitrate = "";
    @C23422a
    private String scalable = "";
    @C23422a
    private String type = "";
    @C23422a
    private String width = "";

    public final String getApiFramework() {
        return this.apiFramework;
    }

    public final String getBitrate() {
        return this.bitrate;
    }

    public final String getCodec() {
        return this.codec;
    }

    public final String getDelivery() {
        return this.delivery;
    }

    public final String getHeight() {
        return this.height;
    }

    public final String getId() {
        return this.f7664id;
    }

    public final String getMaintainAspectRatio() {
        return this.maintainAspectRatio;
    }

    public final String getMaxBitrate() {
        return this.maxBitrate;
    }

    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    public final String getMinBitrate() {
        return this.minBitrate;
    }

    public final String getScalable() {
        return this.scalable;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWidth() {
        return this.width;
    }

    public final void setApiFramework(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.apiFramework = str;
    }

    public final void setBitrate(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.bitrate = str;
    }

    public final void setCodec(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.codec = str;
    }

    public final void setDelivery(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.delivery = str;
    }

    public final void setHeight(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.height = str;
    }

    public final void setId(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.f7664id = str;
    }

    public final void setMaintainAspectRatio(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.maintainAspectRatio = str;
    }

    public final void setMaxBitrate(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.maxBitrate = str;
    }

    public final void setMediaUrl(String str) {
        this.mediaUrl = str;
    }

    public final void setMinBitrate(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.minBitrate = str;
    }

    public final void setScalable(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.scalable = str;
    }

    public final void setType(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.type = str;
    }

    public final void setWidth(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.width = str;
    }
}
