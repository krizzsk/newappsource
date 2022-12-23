package com.airbnb.lottie.model.content;

import p037c5.C1783d;
import p037c5.C1787h;

public final class Mask {

    /* renamed from: a */
    public final MaskMode f6539a;

    /* renamed from: b */
    public final C1787h f6540b;

    /* renamed from: c */
    public final C1783d f6541c;

    /* renamed from: d */
    public final boolean f6542d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, C1787h hVar, C1783d dVar, boolean z) {
        this.f6539a = maskMode;
        this.f6540b = hVar;
        this.f6541c = dVar;
        this.f6542d = z;
    }
}
