package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import gj0.C23426e;
import gj0.C23434m;
import java.util.List;
import kotlin.Metadata;
import nb0.C12944h;

@C23434m(name = "CustomTracking", strict = false)
@Keep
@Metadata(mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVASTExtensionCustomTracking;", "", "()V", "tracking", "", "Lcom/cubic/umo/ad/types/AKVASTTracking;", "getTracking", "()Ljava/util/List;", "setTracking", "(Ljava/util/List;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKVASTExtensionCustomTracking */
public final class AKVASTExtensionCustomTracking {
    @C23426e
    private List<AKVASTTracking> tracking;

    public final List<AKVASTTracking> getTracking() {
        return this.tracking;
    }

    public final void setTracking(List<AKVASTTracking> list) {
        this.tracking = list;
    }
}
