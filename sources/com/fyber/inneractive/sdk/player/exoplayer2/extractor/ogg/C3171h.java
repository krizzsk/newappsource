package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h */
public abstract class C3171h {

    /* renamed from: a */
    public C3167d f11249a;

    /* renamed from: b */
    public C3161n f11250b;

    /* renamed from: c */
    public C3088h f11251c;

    /* renamed from: d */
    public C3169f f11252d;

    /* renamed from: e */
    public long f11253e;

    /* renamed from: f */
    public long f11254f;

    /* renamed from: g */
    public long f11255g;

    /* renamed from: h */
    public int f11256h;

    /* renamed from: i */
    public int f11257i;

    /* renamed from: j */
    public C3172a f11258j;

    /* renamed from: k */
    public long f11259k;

    /* renamed from: l */
    public boolean f11260l;

    /* renamed from: m */
    public boolean f11261m;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h$a */
    public static class C3172a {

        /* renamed from: a */
        public C3226i f11262a;

        /* renamed from: b */
        public C3169f f11263b;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h$b */
    public static final class C3173b implements C3169f {
        /* renamed from: a */
        public long mo14225a(C3087g gVar) throws IOException, InterruptedException {
            return -1;
        }

        /* renamed from: b */
        public C3124m mo14227b() {
            return new C3124m.C3125a(-9223372036854775807L);
        }

        /* renamed from: c */
        public long mo14228c(long j) {
            return 0;
        }
    }

    /* renamed from: a */
    public abstract long mo14229a(C3393k kVar);

    /* renamed from: a */
    public void mo14230a(boolean z) {
        if (z) {
            this.f11258j = new C3172a();
            this.f11254f = 0;
            this.f11256h = 0;
        } else {
            this.f11256h = 1;
        }
        this.f11253e = -1;
        this.f11255g = 0;
    }

    /* renamed from: a */
    public abstract boolean mo14231a(C3393k kVar, long j, C3172a aVar) throws IOException, InterruptedException;

    /* renamed from: b */
    public void mo14238b(long j) {
        this.f11255g = j;
    }

    /* renamed from: a */
    public long mo14237a(long j) {
        return (((long) this.f11257i) * j) / 1000000;
    }
}
