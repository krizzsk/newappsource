package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import gj0.C23422a;
import gj0.C23434m;
import gj0.C23435n;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@C23434m(name = "ClickThrough", strict = false)
@Keep
@Metadata(mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTClickThrough;", "", "()V", "clickUrl", "", "getClickUrl", "()Ljava/lang/String;", "setClickUrl", "(Ljava/lang/String;)V", "id", "getId", "setId", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKVASTClickThrough */
public final class AKVASTClickThrough {
    @C23435n
    private String clickUrl;
    @C23422a

    /* renamed from: id */
    private String f7627id = "";

    public final String getClickUrl() {
        return this.clickUrl;
    }

    public final String getId() {
        return this.f7627id;
    }

    public final void setClickUrl(String str) {
        this.clickUrl = str;
    }

    public final void setId(String str) {
        C24362h.m61211f(str, "<set-?>");
        this.f7627id = str;
    }
}
