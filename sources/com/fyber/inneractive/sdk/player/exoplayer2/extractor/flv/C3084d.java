package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d */
public abstract class C3084d {

    /* renamed from: a */
    public final C3161n f10608a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d$a */
    public static final class C3085a extends C3230l {
        public C3085a(String str) {
            super(str);
        }
    }

    public C3084d(C3161n nVar) {
        this.f10608a = nVar;
    }

    /* renamed from: a */
    public final void mo14121a(C3393k kVar, long j) throws C3230l {
        if (mo14117a(kVar)) {
            mo14118b(kVar, j);
        }
    }

    /* renamed from: a */
    public abstract boolean mo14117a(C3393k kVar) throws C3230l;

    /* renamed from: b */
    public abstract void mo14118b(C3393k kVar, long j) throws C3230l;
}
