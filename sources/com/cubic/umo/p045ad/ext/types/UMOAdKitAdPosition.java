package com.cubic.umo.p045ad.ext.types;

import kotlin.Metadata;

@Metadata(mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo59060d2 = {"Lcom/cubic/umo/ad/ext/types/UMOAdKitAdPosition;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "ABOVE_FOLD", "BELOW_FOLD", "HEADER", "FOOTER", "SIDEBAR", "FULL_SCREEN", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
/* renamed from: com.cubic.umo.ad.ext.types.UMOAdKitAdPosition */
public enum UMOAdKitAdPosition {
    UNKNOWN(0),
    ABOVE_FOLD(1),
    BELOW_FOLD(3),
    HEADER(4),
    FOOTER(5),
    SIDEBAR(6),
    FULL_SCREEN(7);
    
    private final int value;

    private UMOAdKitAdPosition(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
