package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3111d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3372x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.y */
public final class C3377y<T> implements C3372x.C3375c {

    /* renamed from: a */
    public final C3357j f12078a;

    /* renamed from: b */
    public final C3353g f12079b;

    /* renamed from: c */
    public final C3378a<? extends T> f12080c;

    /* renamed from: d */
    public volatile T f12081d;

    /* renamed from: e */
    public volatile boolean f12082e;

    /* renamed from: f */
    public volatile long f12083f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.y$a */
    public interface C3378a<T> {
    }

    public C3377y(C3353g gVar, Uri uri, int i, C3378a<? extends T> aVar) {
        this.f12079b = gVar;
        this.f12078a = new C3357j(uri, 1);
        this.f12080c = aVar;
    }

    /* renamed from: a */
    public final boolean mo14134a() {
        return this.f12082e;
    }

    /* renamed from: b */
    public final void mo14135b() {
        this.f12082e = true;
    }

    public final void load() throws IOException, InterruptedException {
        C3356i iVar = new C3356i(this.f12079b, this.f12078a);
        try {
            if (!iVar.f12001d) {
                iVar.f11998a.mo13780a(iVar.f11999b);
                iVar.f12001d = true;
            }
            this.f12081d = ((C3111d) this.f12080c).mo14176a(this.f12079b.mo13781a(), (InputStream) iVar);
        } finally {
            this.f12083f = iVar.f12003f;
            C3406u.m8594a((Closeable) iVar);
        }
    }
}
