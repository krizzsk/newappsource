package p099ga;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;
import java.util.List;
import p125ia.C5319f;
import p126ib.C5332a;
import p126ib.C5342i;
import p150ka.C5534b;
import p252sb.C6505e;
import p277ub.C6780f;
import p290vb.C6948i;
import p326ya.C7358d;
import p583jk.C17875h;

/* renamed from: ga.u0 */
public interface C4936u0 {

    /* renamed from: ga.u0$a */
    public static final class C4937a {

        /* renamed from: a */
        public final C6780f f16702a;

        static {
            new C6780f.C6781a().mo22954b();
        }

        public C4937a(C6780f fVar) {
            this.f16702a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4937a)) {
                return false;
            }
            return this.f16702a.equals(((C4937a) obj).f16702a);
        }

        public final int hashCode() {
            return this.f16702a.hashCode();
        }
    }

    @Deprecated
    /* renamed from: ga.u0$b */
    public interface C4938b {
        /* renamed from: K */
        void mo16423K(ExoPlaybackException exoPlaybackException);

        /* renamed from: L */
        void mo16424L(boolean z);

        /* renamed from: M */
        void mo16425M(int i, boolean z);

        /* renamed from: P */
        void mo16426P(C4901j0 j0Var, int i);

        /* renamed from: Q */
        void mo16427Q(TrackGroupArray trackGroupArray, C6505e eVar);

        /* renamed from: S */
        void mo16428S(int i, C4941e eVar, C4941e eVar2);

        /* renamed from: V */
        void mo16429V(int i);

        /* renamed from: X */
        void mo16430X();

        @Deprecated
        /* renamed from: Z */
        void mo16431Z(int i, boolean z);

        @Deprecated
        /* renamed from: b */
        void mo16433b();

        /* renamed from: b0 */
        void mo16434b0(C4932s0 s0Var);

        /* renamed from: d0 */
        void mo16437d0(C4939c cVar);

        @Deprecated
        /* renamed from: g */
        void mo16438g();

        @Deprecated
        /* renamed from: h */
        void mo16439h();

        /* renamed from: h0 */
        void mo16440h0(boolean z);

        @Deprecated
        /* renamed from: i */
        void mo16441i();

        /* renamed from: l */
        void mo16442l(int i);

        /* renamed from: p */
        void mo16444p(List<Metadata> list);

        /* renamed from: s */
        void mo16445s(C4910k0 k0Var);

        /* renamed from: u */
        void mo16446u(int i);

        /* renamed from: w */
        void mo16447w(boolean z);

        /* renamed from: y */
        void mo16448y(int i);
    }

    /* renamed from: ga.u0$c */
    public static final class C4939c {

        /* renamed from: a */
        public final C6780f f16703a;

        public C4939c(C6780f fVar) {
            this.f16703a = fVar;
        }

        /* renamed from: a */
        public final boolean mo20607a(int i) {
            return this.f16703a.f20978a.get(i);
        }

        /* renamed from: b */
        public final boolean mo20608b(int... iArr) {
            C6780f fVar = this.f16703a;
            fVar.getClass();
            for (int i : iArr) {
                if (fVar.f20978a.get(i)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: ga.u0$d */
    public interface C4940d extends C6948i, C5319f, C5342i, C7358d, C5534b, C4938b {
    }

    /* renamed from: ga.u0$e */
    public static final class C4941e {

        /* renamed from: a */
        public final Object f16704a;

        /* renamed from: b */
        public final int f16705b;

        /* renamed from: c */
        public final Object f16706c;

        /* renamed from: d */
        public final int f16707d;

        /* renamed from: e */
        public final long f16708e;

        /* renamed from: f */
        public final long f16709f;

        /* renamed from: g */
        public final int f16710g;

        /* renamed from: h */
        public final int f16711h;

        public C4941e(Object obj, int i, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f16704a = obj;
            this.f16705b = i;
            this.f16706c = obj2;
            this.f16707d = i2;
            this.f16708e = j;
            this.f16709f = j2;
            this.f16710g = i3;
            this.f16711h = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4941e.class != obj.getClass()) {
                return false;
            }
            C4941e eVar = (C4941e) obj;
            if (this.f16705b == eVar.f16705b && this.f16707d == eVar.f16707d && this.f16708e == eVar.f16708e && this.f16709f == eVar.f16709f && this.f16710g == eVar.f16710g && this.f16711h == eVar.f16711h && C17875h.m44312w(this.f16704a, eVar.f16704a) && C17875h.m44312w(this.f16706c, eVar.f16706c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f16704a, Integer.valueOf(this.f16705b), this.f16706c, Integer.valueOf(this.f16707d), Integer.valueOf(this.f16705b), Long.valueOf(this.f16708e), Long.valueOf(this.f16709f), Integer.valueOf(this.f16710g), Integer.valueOf(this.f16711h)});
        }
    }

    /* renamed from: A */
    void mo20358A(boolean z);

    /* renamed from: B */
    int mo20359B();

    /* renamed from: C */
    void mo20360C(TextureView textureView);

    /* renamed from: D */
    int mo20361D();

    /* renamed from: E */
    long mo20362E();

    /* renamed from: F */
    int mo20450F();

    /* renamed from: G */
    void mo20363G(C4940d dVar);

    /* renamed from: H */
    int mo20364H();

    /* renamed from: I */
    C4937a mo20365I();

    /* renamed from: J */
    void mo20366J(int i);

    /* renamed from: K */
    int mo20451K();

    /* renamed from: L */
    void mo20367L(SurfaceView surfaceView);

    /* renamed from: M */
    int mo20368M();

    /* renamed from: N */
    boolean mo20369N();

    /* renamed from: O */
    long mo20370O();

    /* renamed from: a */
    void mo20380a(C4932s0 s0Var);

    /* renamed from: b */
    C4932s0 mo20382b();

    /* renamed from: c */
    void mo20384c();

    /* renamed from: d */
    boolean mo20385d();

    /* renamed from: e */
    long mo20386e();

    @Deprecated
    /* renamed from: g */
    void mo20388g(C4938b bVar);

    long getCurrentPosition();

    long getDuration();

    /* renamed from: h */
    List<Metadata> mo20391h();

    /* renamed from: i */
    boolean mo20452i();

    boolean isPlaying();

    /* renamed from: j */
    void mo20392j(SurfaceView surfaceView);

    /* renamed from: k */
    int mo20393k();

    /* renamed from: l */
    ExoPlaybackException mo20394l();

    /* renamed from: m */
    void mo20395m(boolean z);

    /* renamed from: n */
    List<C5332a> mo20396n();

    /* renamed from: o */
    int mo20397o();

    /* renamed from: p */
    boolean mo20454p(int i);

    /* renamed from: q */
    int mo20398q();

    /* renamed from: r */
    TrackGroupArray mo20399r();

    /* renamed from: s */
    C4879e1 mo20400s();

    /* renamed from: t */
    Looper mo20401t();

    /* renamed from: u */
    void mo20402u(TextureView textureView);

    /* renamed from: v */
    C6505e mo20403v();

    @Deprecated
    /* renamed from: w */
    void mo20404w(C4938b bVar);

    /* renamed from: x */
    void mo20405x(int i, long j);

    /* renamed from: y */
    void mo20406y(C4940d dVar);

    /* renamed from: z */
    boolean mo20407z();
}
