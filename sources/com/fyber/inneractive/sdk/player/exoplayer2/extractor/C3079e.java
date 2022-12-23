package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.e */
public final class C3079e implements C3161n {
    /* renamed from: a */
    public int mo14092a(C3087g gVar, int i, boolean z) throws IOException, InterruptedException {
        int b = ((C3072b) gVar).mo14086b(i);
        if (b != -1) {
            return b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public void mo14096a(long j, int i, int i2, int i3, byte[] bArr) {
    }

    /* renamed from: a */
    public void mo14098a(C3226i iVar) {
    }

    /* renamed from: a */
    public void mo14099a(C3393k kVar, int i) {
        kVar.mo14549e(kVar.f12122b + i);
    }
}
