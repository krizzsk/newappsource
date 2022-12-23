package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.n */
public final class C3361n implements C3353g.C3354a {

    /* renamed from: a */
    public final Context f12031a;

    /* renamed from: b */
    public final C3327a0<? super C3353g> f12032b;

    /* renamed from: c */
    public final C3353g.C3354a f12033c;

    public C3361n(Context context, C3327a0<? super C3353g> a0Var, C3353g.C3354a aVar) {
        this.f12031a = context.getApplicationContext();
        this.f12032b = a0Var;
        this.f12033c = aVar;
    }

    /* renamed from: a */
    public C3353g mo13785a() {
        return new C3360m(this.f12031a, this.f12032b, this.f12033c.mo13785a());
    }
}
