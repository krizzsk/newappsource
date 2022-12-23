package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.a */
public final class C3055a {

    /* renamed from: a */
    public byte[] f10516a;

    /* renamed from: b */
    public byte[] f10517b;

    /* renamed from: c */
    public int f10518c;

    /* renamed from: d */
    public int[] f10519d;

    /* renamed from: e */
    public int[] f10520e;

    /* renamed from: f */
    public int f10521f;

    /* renamed from: g */
    public final MediaCodec.CryptoInfo f10522g;

    /* renamed from: h */
    public final C3057b f10523h;

    @TargetApi(24)
    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.a$b */
    public static final class C3057b {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f10524a;

        /* renamed from: b */
        public final MediaCodec$CryptoInfo$Pattern f10525b;

        public C3057b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f10524a = cryptoInfo;
            this.f10525b = new MediaCodec$CryptoInfo$Pattern(0, 0);
        }
    }

    public C3055a() {
        MediaCodec.CryptoInfo cryptoInfo;
        int i = C3406u.f12148a;
        C3057b bVar = null;
        if (i >= 16) {
            cryptoInfo = mo14055a();
        } else {
            cryptoInfo = null;
        }
        this.f10522g = cryptoInfo;
        this.f10523h = i >= 24 ? new C3057b(cryptoInfo) : bVar;
    }

    @TargetApi(16)
    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo14055a() {
        return new MediaCodec.CryptoInfo();
    }
}
