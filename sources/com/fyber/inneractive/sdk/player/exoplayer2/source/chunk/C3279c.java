package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3091c;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;
import java.util.Arrays;
import p988j$.util.Spliterator;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.c */
public abstract class C3279c extends C3277a {

    /* renamed from: i */
    public byte[] f11786i;

    /* renamed from: j */
    public int f11787j;

    /* renamed from: k */
    public volatile boolean f11788k;

    public C3279c(C3353g gVar, C3357j jVar, int i, C3226i iVar, int i2, Object obj, byte[] bArr) {
        super(gVar, jVar, i, iVar, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f11786i = bArr;
    }

    /* renamed from: a */
    public final boolean mo14134a() {
        return this.f11788k;
    }

    /* renamed from: b */
    public final void mo14135b() {
        this.f11788k = true;
    }

    /* renamed from: c */
    public long mo14136c() {
        return (long) this.f11787j;
    }

    public final void load() throws IOException, InterruptedException {
        try {
            this.f11785h.mo13780a(this.f11778a);
            int i = 0;
            this.f11787j = 0;
            while (i != -1 && !this.f11788k) {
                byte[] bArr = this.f11786i;
                if (bArr == null) {
                    this.f11786i = new byte[Spliterator.SUBSIZED];
                } else if (bArr.length < this.f11787j + Spliterator.SUBSIZED) {
                    this.f11786i = Arrays.copyOf(bArr, bArr.length + Spliterator.SUBSIZED);
                }
                i = this.f11785h.mo13779a(this.f11786i, this.f11787j, Spliterator.SUBSIZED);
                if (i != -1) {
                    this.f11787j += i;
                }
            }
            if (!this.f11788k) {
                ((C3091c.C3092a) this).f10636m = Arrays.copyOf(this.f11786i, this.f11787j);
            }
        } finally {
            C3406u.m8593a(this.f11785h);
        }
    }
}
