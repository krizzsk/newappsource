package com.bumptech.glide;

import com.bumptech.glide.C2135k;
import p285v6.C6867c;
import p285v6.C6871e;

/* renamed from: com.bumptech.glide.k */
public abstract class C2135k<CHILD extends C2135k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: b */
    public C6871e<? super TranscodeType> f6951b = C6867c.f21225b;

    /* renamed from: f */
    public final CHILD clone() {
        try {
            return (C2135k) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
