package p100gb;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C3997b;
import java.io.IOException;
import p099ga.C4862b1;
import p100gb.C4984m;
import p100gb.C4987o;
import p265tb.C6658j;
import p277ub.C6774a0;

/* renamed from: gb.j */
public final class C4979j implements C4984m, C4984m.C4985a {

    /* renamed from: b */
    public final C4987o.C4988a f16830b;

    /* renamed from: c */
    public final long f16831c;

    /* renamed from: d */
    public final C6658j f16832d;

    /* renamed from: e */
    public C4987o f16833e;

    /* renamed from: f */
    public C4984m f16834f;

    /* renamed from: g */
    public C4984m.C4985a f16835g;

    /* renamed from: h */
    public long f16836h = -9223372036854775807L;

    public C4979j(C4987o.C4988a aVar, C6658j jVar, long j) {
        this.f16830b = aVar;
        this.f16832d = jVar;
        this.f16831c = j;
    }

    /* renamed from: a */
    public final void mo20498a(C4964c0 c0Var) {
        C4984m mVar = (C4984m) c0Var;
        C4984m.C4985a aVar = this.f16835g;
        int i = C6774a0.f20959a;
        aVar.mo20498a(this);
    }

    /* renamed from: b */
    public final long mo20652b() {
        C4984m mVar = this.f16834f;
        int i = C6774a0.f20959a;
        return mVar.mo20652b();
    }

    /* renamed from: c */
    public final void mo20653c(C4984m.C4985a aVar, long j) {
        this.f16835g = aVar;
        C4984m mVar = this.f16834f;
        if (mVar != null) {
            long j2 = this.f16831c;
            long j3 = this.f16836h;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            mVar.mo20653c(this, j2);
        }
    }

    /* renamed from: d */
    public final long mo20654d(C3997b[] bVarArr, boolean[] zArr, C4961b0[] b0VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f16836h;
        if (j3 == -9223372036854775807L || j != this.f16831c) {
            j2 = j;
        } else {
            this.f16836h = -9223372036854775807L;
            j2 = j3;
        }
        C4984m mVar = this.f16834f;
        int i = C6774a0.f20959a;
        return mVar.mo20654d(bVarArr, zArr, b0VarArr, zArr2, j2);
    }

    /* renamed from: e */
    public final void mo20506e(C4984m mVar) {
        C4984m.C4985a aVar = this.f16835g;
        int i = C6774a0.f20959a;
        aVar.mo20506e(this);
    }

    /* renamed from: f */
    public final long mo20655f(long j) {
        C4984m mVar = this.f16834f;
        int i = C6774a0.f20959a;
        return mVar.mo20655f(j);
    }

    /* renamed from: g */
    public final long mo20656g(long j, C4862b1 b1Var) {
        C4984m mVar = this.f16834f;
        int i = C6774a0.f20959a;
        return mVar.mo20656g(j, b1Var);
    }

    /* renamed from: h */
    public final boolean mo20657h() {
        C4984m mVar = this.f16834f;
        return mVar != null && mVar.mo20657h();
    }

    /* renamed from: i */
    public final long mo20658i() {
        C4984m mVar = this.f16834f;
        int i = C6774a0.f20959a;
        return mVar.mo20658i();
    }

    /* renamed from: j */
    public final long mo20681j(long j) {
        long j2 = this.f16836h;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    /* renamed from: l */
    public final void mo20660l() throws IOException {
        try {
            C4984m mVar = this.f16834f;
            if (mVar != null) {
                mVar.mo20660l();
                return;
            }
            C4987o oVar = this.f16833e;
            if (oVar != null) {
                oVar.mo20685k();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: m */
    public final boolean mo20661m(long j) {
        C4984m mVar = this.f16834f;
        return mVar != null && mVar.mo20661m(j);
    }

    /* renamed from: o */
    public final TrackGroupArray mo20662o() {
        C4984m mVar = this.f16834f;
        int i = C6774a0.f20959a;
        return mVar.mo20662o();
    }

    /* renamed from: q */
    public final long mo20663q() {
        C4984m mVar = this.f16834f;
        int i = C6774a0.f20959a;
        return mVar.mo20663q();
    }

    /* renamed from: r */
    public final void mo20664r(long j, boolean z) {
        C4984m mVar = this.f16834f;
        int i = C6774a0.f20959a;
        mVar.mo20664r(j, z);
    }

    /* renamed from: s */
    public final void mo20665s(long j) {
        C4984m mVar = this.f16834f;
        int i = C6774a0.f20959a;
        mVar.mo20665s(j);
    }
}
