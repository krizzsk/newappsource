package p276ua;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
import p173ma.C5732e;
import p173ma.C5737j;
import p173ma.C5750t;
import p173ma.C5754v;
import p276ua.C6761b;
import p277ub.C6803r;

/* renamed from: ua.h */
public abstract class C6768h {

    /* renamed from: a */
    public final C6764d f20934a = new C6764d();

    /* renamed from: b */
    public C5754v f20935b;

    /* renamed from: c */
    public C5737j f20936c;

    /* renamed from: d */
    public C6766f f20937d;

    /* renamed from: e */
    public long f20938e;

    /* renamed from: f */
    public long f20939f;

    /* renamed from: g */
    public long f20940g;

    /* renamed from: h */
    public int f20941h;

    /* renamed from: i */
    public int f20942i;

    /* renamed from: j */
    public C6769a f20943j = new C6769a();

    /* renamed from: k */
    public long f20944k;

    /* renamed from: l */
    public boolean f20945l;

    /* renamed from: m */
    public boolean f20946m;

    /* renamed from: ua.h$a */
    public static class C6769a {

        /* renamed from: a */
        public Format f20947a;

        /* renamed from: b */
        public C6761b.C6762a f20948b;
    }

    /* renamed from: ua.h$b */
    public static final class C6770b implements C6766f {
        /* renamed from: a */
        public final C5750t mo22931a() {
            return new C5750t.C5752b(-9223372036854775807L);
        }

        /* renamed from: b */
        public final long mo22932b(C5732e eVar) {
            return -1;
        }

        /* renamed from: c */
        public final void mo22933c(long j) {
        }
    }

    /* renamed from: a */
    public void mo22941a(long j) {
        this.f20940g = j;
    }

    /* renamed from: b */
    public abstract long mo22934b(C6803r rVar);

    /* renamed from: c */
    public abstract boolean mo22935c(C6803r rVar, long j, C6769a aVar) throws IOException;

    /* renamed from: d */
    public void mo22936d(boolean z) {
        if (z) {
            this.f20943j = new C6769a();
            this.f20939f = 0;
            this.f20941h = 0;
        } else {
            this.f20941h = 1;
        }
        this.f20938e = -1;
        this.f20940g = 0;
    }
}
