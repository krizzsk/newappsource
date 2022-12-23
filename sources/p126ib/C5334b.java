package p126ib;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import p137ja.C5415f;
import p137ja.C5417g;
import p583jk.C17875h;

/* renamed from: ib.b */
public abstract class C5334b extends C5417g<C5340g, C5341h, SubtitleDecoderException> implements C5337e {
    public C5334b() {
        super(new C5340g[2], new C5341h[2]);
        boolean z;
        if (this.f17784g == this.f17782e.length) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        for (I j : this.f17782e) {
            j.mo15950j(1024);
        }
    }

    /* renamed from: b */
    public final void mo21117b(long j) {
    }

    /* renamed from: e */
    public final SubtitleDecoderException mo21118e(DecoderInputBuffer decoderInputBuffer, C5415f fVar, boolean z) {
        C5340g gVar = (C5340g) decoderInputBuffer;
        C5341h hVar = (C5341h) fVar;
        try {
            ByteBuffer byteBuffer = gVar.f13647d;
            byteBuffer.getClass();
            hVar.mo21125i(gVar.f13649f, mo21119g(byteBuffer.array(), byteBuffer.limit(), z), gVar.f17625j);
            hVar.f17757b &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    /* renamed from: g */
    public abstract C5336d mo21119g(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;
}
