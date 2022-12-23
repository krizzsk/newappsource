package com.veriff.sdk.views.camera;

import com.veriff.sdk.internal.C21667gf;
import com.veriff.sdk.internal.C21716gg;

/* renamed from: com.veriff.sdk.views.camera.ag */
public enum C22832ag {
    LOW_LIGHT(C21716gg.m52862J(), C21716gg.m52863K()),
    MULTIPLE_PERSONS(C21716gg.m52864L()),
    NO_PERSON(C21716gg.m52865M());
    

    /* renamed from: d */
    private final C21667gf f57938d;

    /* renamed from: e */
    private final C21667gf f57939e;

    private C22832ag(C21667gf gfVar, C21667gf gfVar2) {
        this.f57938d = gfVar;
        this.f57939e = gfVar2;
    }

    /* renamed from: a */
    public C21667gf mo57637a() {
        return this.f57938d;
    }

    /* renamed from: b */
    public C21667gf mo57638b() {
        return this.f57939e;
    }

    private C22832ag(C21667gf gfVar) {
        this(r2, r3, gfVar, (C21667gf) null);
    }
}
