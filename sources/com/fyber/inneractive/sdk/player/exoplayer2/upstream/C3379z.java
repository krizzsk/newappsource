package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.z */
public final class C3379z implements C3353g {

    /* renamed from: a */
    public final C3353g f12084a;

    /* renamed from: b */
    public final C3351f f12085b;

    public C3379z(C3353g gVar, C3351f fVar) {
        this.f12084a = (C3353g) C3380a.m8503a(gVar);
        this.f12085b = (C3351f) C3380a.m8503a(fVar);
    }

    /* renamed from: a */
    public long mo13780a(C3357j jVar) throws IOException {
        long a = this.f12084a.mo13780a(jVar);
        if (jVar.f12008e == -1 && a != -1) {
            jVar = new C3357j(jVar.f12004a, (byte[]) null, jVar.f12006c, jVar.f12007d, a, jVar.f12009f, jVar.f12010g);
        }
        this.f12085b.mo14473a(jVar);
        return a;
    }

    public void close() throws IOException {
        try {
            this.f12084a.close();
        } finally {
            this.f12085b.close();
        }
    }

    /* renamed from: a */
    public int mo13779a(byte[] bArr, int i, int i2) throws IOException {
        int a = this.f12084a.mo13779a(bArr, i, i2);
        if (a > 0) {
            this.f12085b.mo14474a(bArr, i, a);
        }
        return a;
    }

    /* renamed from: a */
    public Uri mo13781a() {
        return this.f12084a.mo13781a();
    }
}
