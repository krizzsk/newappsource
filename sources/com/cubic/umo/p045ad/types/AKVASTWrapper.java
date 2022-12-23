package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import gj0.C23424c;
import gj0.C23434m;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@C23434m(name = "Wrapper", strict = false)
@Keep
@Metadata(mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTWrapper;", "Lcom/cubic/umo/ad/types/AKVASTInline;", "()V", "vastAdTagUri", "", "getVastAdTagUri", "()Ljava/lang/String;", "setVastAdTagUri", "(Ljava/lang/String;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKVASTWrapper */
public final class AKVASTWrapper extends AKVASTInline {
    @C23424c
    private String vastAdTagUri = "";

    public final String getVastAdTagUri() {
        return this.vastAdTagUri;
    }

    public final void setVastAdTagUri(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.vastAdTagUri = str;
    }
}
