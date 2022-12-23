package p290vb;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import p099ga.C4865c1;
import p137ja.C5413d;
import p137ja.C5414e;

/* renamed from: vb.n */
public interface C6953n {

    /* renamed from: vb.n$a */
    public static final class C6954a {

        /* renamed from: a */
        public final Handler f21702a;

        /* renamed from: b */
        public final C6953n f21703b;

        public C6954a(Handler handler, C4865c1.C4867b bVar) {
            this.f21702a = handler;
            this.f21703b = bVar;
        }
    }

    /* renamed from: C */
    void mo20408C(Format format, C5414e eVar);

    /* renamed from: F */
    void mo20409F(Exception exc);

    /* renamed from: H */
    void mo20410H(long j, Object obj);

    /* renamed from: J */
    void mo20411J(int i, long j);

    /* renamed from: a */
    void mo20412a(String str);

    /* renamed from: j */
    void mo20414j(C6955o oVar);

    @Deprecated
    /* renamed from: k */
    void mo20415k();

    /* renamed from: m */
    void mo20416m(C5413d dVar);

    void onDroppedFrames(int i, long j);

    void onVideoDecoderInitialized(String str, long j, long j2);

    /* renamed from: q */
    void mo20424q(C5413d dVar);
}
