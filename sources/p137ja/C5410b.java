package p137ja;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import p277ub.C6774a0;

/* renamed from: ja.b */
public final class C5410b {

    /* renamed from: a */
    public byte[] f17758a;

    /* renamed from: b */
    public byte[] f17759b;

    /* renamed from: c */
    public int f17760c;

    /* renamed from: d */
    public int[] f17761d;

    /* renamed from: e */
    public int[] f17762e;

    /* renamed from: f */
    public int f17763f;

    /* renamed from: g */
    public int f17764g;

    /* renamed from: h */
    public int f17765h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f17766i;

    /* renamed from: j */
    public final C5411a f17767j;

    /* renamed from: ja.b$a */
    public static final class C5411a {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f17768a;

        /* renamed from: b */
        public final MediaCodec$CryptoInfo$Pattern f17769b = new MediaCodec$CryptoInfo$Pattern(0, 0);

        public C5411a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f17768a = cryptoInfo;
        }

        /* renamed from: a */
        public static void m13516a(C5411a aVar, int i, int i2) {
            aVar.f17769b.set(i, i2);
            aVar.f17768a.setPattern(aVar.f17769b);
        }
    }

    public C5410b() {
        C5411a aVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f17766i = cryptoInfo;
        if (C6774a0.f20959a >= 24) {
            aVar = new C5411a(cryptoInfo);
        } else {
            aVar = null;
        }
        this.f17767j = aVar;
    }
}
