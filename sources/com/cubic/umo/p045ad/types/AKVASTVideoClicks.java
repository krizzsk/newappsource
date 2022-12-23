package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import gj0.C23424c;
import gj0.C23426e;
import gj0.C23434m;
import java.util.List;
import kotlin.Metadata;
import nb0.C12944h;

@C23434m(name = "VideoClicks", strict = false)
@Keep
@Metadata(mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTVideoClicks;", "", "()V", "clickThrough", "Lcom/cubic/umo/ad/types/AKVASTClickThrough;", "getClickThrough", "()Lcom/cubic/umo/ad/types/AKVASTClickThrough;", "setClickThrough", "(Lcom/cubic/umo/ad/types/AKVASTClickThrough;)V", "clickTrackers", "", "Lcom/cubic/umo/ad/types/AKVASTClickTracking;", "getClickTrackers", "()Ljava/util/List;", "setClickTrackers", "(Ljava/util/List;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKVASTVideoClicks */
public final class AKVASTVideoClicks {
    @C23424c
    private AKVASTClickThrough clickThrough;
    @C23426e
    private List<AKVASTClickTracking> clickTrackers;

    public final AKVASTClickThrough getClickThrough() {
        return this.clickThrough;
    }

    public final List<AKVASTClickTracking> getClickTrackers() {
        return this.clickTrackers;
    }

    public final void setClickThrough(AKVASTClickThrough aKVASTClickThrough) {
        this.clickThrough = aKVASTClickThrough;
    }

    public final void setClickTrackers(List<AKVASTClickTracking> list) {
        this.clickTrackers = list;
    }
}
