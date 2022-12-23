package p099ga;

import com.google.android.exoplayer2.C3873a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import p099ga.C4943v0;
import p100gb.C4961b0;
import p277ub.C6791m;

/* renamed from: ga.x0 */
public interface C4949x0 extends C4943v0.C4945b {

    /* renamed from: ga.x0$a */
    public interface C4950a {
        /* renamed from: a */
        void mo20474a();

        /* renamed from: b */
        void mo20475b(long j);
    }

    /* renamed from: d */
    boolean mo15932d();

    /* renamed from: e */
    void mo15813e();

    /* renamed from: f */
    C3873a mo15814f();

    /* renamed from: g */
    C4961b0 mo15815g();

    String getName();

    int getState();

    /* renamed from: h */
    boolean mo15817h();

    /* renamed from: i */
    void mo15818i();

    boolean isReady();

    /* renamed from: k */
    void mo15820k() throws IOException;

    /* renamed from: l */
    boolean mo15821l();

    /* renamed from: m */
    int mo15822m();

    /* renamed from: o */
    void mo15823o(float f, float f2) throws ExoPlaybackException;

    /* renamed from: q */
    void mo16049q(long j, long j2) throws ExoPlaybackException;

    /* renamed from: r */
    void mo15825r(C4954z0 z0Var, Format[] formatArr, C4961b0 b0Var, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException;

    void reset();

    /* renamed from: s */
    long mo15827s();

    void setIndex(int i);

    void start() throws ExoPlaybackException;

    void stop();

    /* renamed from: t */
    void mo15831t(long j) throws ExoPlaybackException;

    /* renamed from: u */
    void mo15832u(Format[] formatArr, C4961b0 b0Var, long j, long j2) throws ExoPlaybackException;

    /* renamed from: v */
    C6791m mo15833v();
}
