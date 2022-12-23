package com.cubic.umo.p045ad.ext.types;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo59060d2 = {"Lcom/cubic/umo/ad/ext/types/UMOAdKitAdOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "UNSPECIFIED", "PORTRAIT", "LANDSCAPE", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.ext.types.UMOAdKitAdOrientation */
public enum UMOAdKitAdOrientation {
    UNSPECIFIED,
    PORTRAIT,
    LANDSCAPE;
    
    public static final C2222a Companion = null;
    /* access modifiers changed from: private */
    public static final Map<String, UMOAdKitAdOrientation> map = null;

    /* renamed from: com.cubic.umo.ad.ext.types.UMOAdKitAdOrientation$a */
    public static final class C2222a {
    }

    /* access modifiers changed from: public */
    static {
        int i;
        Companion = new C2222a();
        map = new HashMap();
        UMOAdKitAdOrientation[] values = values();
        int length = values.length;
        while (i < length) {
            UMOAdKitAdOrientation uMOAdKitAdOrientation = values[i];
            i++;
            map.put(uMOAdKitAdOrientation.name(), uMOAdKitAdOrientation);
        }
    }
}
