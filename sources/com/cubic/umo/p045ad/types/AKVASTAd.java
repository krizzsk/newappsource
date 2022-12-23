package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import gj0.C23422a;
import gj0.C23424c;
import gj0.C23434m;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@C23434m(name = "Ad", strict = false)
@Keep
@Metadata(mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTAd;", "", "()V", "inline", "Lcom/cubic/umo/ad/types/AKVASTInline;", "getInline", "()Lcom/cubic/umo/ad/types/AKVASTInline;", "setInline", "(Lcom/cubic/umo/ad/types/AKVASTInline;)V", "vastAdId", "", "getVastAdId", "()Ljava/lang/String;", "setVastAdId", "(Ljava/lang/String;)V", "wrapper", "Lcom/cubic/umo/ad/types/AKVASTWrapper;", "getWrapper", "()Lcom/cubic/umo/ad/types/AKVASTWrapper;", "setWrapper", "(Lcom/cubic/umo/ad/types/AKVASTWrapper;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKVASTAd */
public final class AKVASTAd {
    @C23424c
    private AKVASTInline inline;
    @C23422a
    private String vastAdId = "";
    @C23424c
    private AKVASTWrapper wrapper;

    public final AKVASTInline getInline() {
        return this.inline;
    }

    public final String getVastAdId() {
        return this.vastAdId;
    }

    public final AKVASTWrapper getWrapper() {
        return this.wrapper;
    }

    public final void setInline(AKVASTInline aKVASTInline) {
        this.inline = aKVASTInline;
    }

    public final void setVastAdId(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.vastAdId = str;
    }

    public final void setWrapper(AKVASTWrapper aKVASTWrapper) {
        this.wrapper = aKVASTWrapper;
    }
}
