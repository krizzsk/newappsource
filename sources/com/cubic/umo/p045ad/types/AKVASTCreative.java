package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import gj0.C23422a;
import gj0.C23424c;
import gj0.C23434m;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@C23434m(name = "Creative", strict = false)
@Keep
@Metadata(mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTCreative;", "", "()V", "creativeAdId", "", "getCreativeAdId", "()Ljava/lang/String;", "setCreativeAdId", "(Ljava/lang/String;)V", "creativeId", "getCreativeId", "setCreativeId", "linear", "Lcom/cubic/umo/ad/types/AKVASTLinear;", "getLinear", "()Lcom/cubic/umo/ad/types/AKVASTLinear;", "setLinear", "(Lcom/cubic/umo/ad/types/AKVASTLinear;)V", "sequence", "getSequence", "setSequence", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKVASTCreative */
public final class AKVASTCreative {
    @C23422a
    private String creativeAdId = "";
    @C23422a
    private String creativeId = "";
    @C23424c
    private AKVASTLinear linear;
    @C23422a
    private String sequence = "";

    public final String getCreativeAdId() {
        return this.creativeAdId;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final AKVASTLinear getLinear() {
        return this.linear;
    }

    public final String getSequence() {
        return this.sequence;
    }

    public final void setCreativeAdId(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.creativeAdId = str;
    }

    public final void setCreativeId(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.creativeId = str;
    }

    public final void setLinear(AKVASTLinear aKVASTLinear) {
        this.linear = aKVASTLinear;
    }

    public final void setSequence(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.sequence = str;
    }
}
