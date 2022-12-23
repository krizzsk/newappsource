package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import gj0.C23424c;
import gj0.C23426e;
import gj0.C23434m;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@C23434m(name = "InLine", strict = false)
@Keep
@Metadata(mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTInline;", "", "()V", "adDescription", "", "getAdDescription", "()Ljava/lang/String;", "setAdDescription", "(Ljava/lang/String;)V", "adSystem", "getAdSystem", "setAdSystem", "adTitle", "getAdTitle", "setAdTitle", "creatives", "Lcom/cubic/umo/ad/types/AKVASTCreatives;", "getCreatives", "()Lcom/cubic/umo/ad/types/AKVASTCreatives;", "setCreatives", "(Lcom/cubic/umo/ad/types/AKVASTCreatives;)V", "errorTrackerUrl", "getErrorTrackerUrl", "setErrorTrackerUrl", "extensions", "Lcom/cubic/umo/ad/types/AKVASTExtensions;", "getExtensions", "()Lcom/cubic/umo/ad/types/AKVASTExtensions;", "setExtensions", "(Lcom/cubic/umo/ad/types/AKVASTExtensions;)V", "impressionTrackers", "", "Lcom/cubic/umo/ad/types/AKVASTImpression;", "getImpressionTrackers", "()Ljava/util/List;", "setImpressionTrackers", "(Ljava/util/List;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKVASTInline */
public class AKVASTInline {
    @C23424c
    private String adDescription = "";
    @C23424c
    private String adSystem = "";
    @C23424c
    private String adTitle = "";
    @C23424c
    private AKVASTCreatives creatives;
    @C23424c
    private String errorTrackerUrl;
    @C23424c
    private AKVASTExtensions extensions;
    @C23426e
    private List<AKVASTImpression> impressionTrackers;

    public final String getAdDescription() {
        return this.adDescription;
    }

    public final String getAdSystem() {
        return this.adSystem;
    }

    public final String getAdTitle() {
        return this.adTitle;
    }

    public final AKVASTCreatives getCreatives() {
        return this.creatives;
    }

    public final String getErrorTrackerUrl() {
        return this.errorTrackerUrl;
    }

    public final AKVASTExtensions getExtensions() {
        return this.extensions;
    }

    public final List<AKVASTImpression> getImpressionTrackers() {
        return this.impressionTrackers;
    }

    public final void setAdDescription(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.adDescription = str;
    }

    public final void setAdSystem(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.adSystem = str;
    }

    public final void setAdTitle(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.adTitle = str;
    }

    public final void setCreatives(AKVASTCreatives aKVASTCreatives) {
        this.creatives = aKVASTCreatives;
    }

    public final void setErrorTrackerUrl(String str) {
        this.errorTrackerUrl = str;
    }

    public final void setExtensions(AKVASTExtensions aKVASTExtensions) {
        this.extensions = aKVASTExtensions;
    }

    public final void setImpressionTrackers(List<AKVASTImpression> list) {
        this.impressionTrackers = list;
    }
}
