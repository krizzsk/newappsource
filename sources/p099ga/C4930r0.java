package p099ga;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.common.collect.ImmutableList;
import java.util.List;
import p099ga.C4879e1;
import p100gb.C4987o;
import p252sb.C6508g;

/* renamed from: ga.r0 */
public final class C4930r0 {

    /* renamed from: t */
    public static final C4987o.C4988a f16674t = new C4987o.C4988a(new Object());

    /* renamed from: a */
    public final C4879e1 f16675a;

    /* renamed from: b */
    public final C4987o.C4988a f16676b;

    /* renamed from: c */
    public final long f16677c;

    /* renamed from: d */
    public final long f16678d;

    /* renamed from: e */
    public final int f16679e;

    /* renamed from: f */
    public final ExoPlaybackException f16680f;

    /* renamed from: g */
    public final boolean f16681g;

    /* renamed from: h */
    public final TrackGroupArray f16682h;

    /* renamed from: i */
    public final C6508g f16683i;

    /* renamed from: j */
    public final List<Metadata> f16684j;

    /* renamed from: k */
    public final C4987o.C4988a f16685k;

    /* renamed from: l */
    public final boolean f16686l;

    /* renamed from: m */
    public final int f16687m;

    /* renamed from: n */
    public final C4932s0 f16688n;

    /* renamed from: o */
    public final boolean f16689o;

    /* renamed from: p */
    public final boolean f16690p;

    /* renamed from: q */
    public volatile long f16691q;

    /* renamed from: r */
    public volatile long f16692r;

    /* renamed from: s */
    public volatile long f16693s;

    public C4930r0(C4879e1 e1Var, C4987o.C4988a aVar, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, TrackGroupArray trackGroupArray, C6508g gVar, List<Metadata> list, C4987o.C4988a aVar2, boolean z2, int i2, C4932s0 s0Var, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.f16675a = e1Var;
        this.f16676b = aVar;
        this.f16677c = j;
        this.f16678d = j2;
        this.f16679e = i;
        this.f16680f = exoPlaybackException;
        this.f16681g = z;
        this.f16682h = trackGroupArray;
        this.f16683i = gVar;
        this.f16684j = list;
        this.f16685k = aVar2;
        this.f16686l = z2;
        this.f16687m = i2;
        this.f16688n = s0Var;
        this.f16691q = j3;
        this.f16692r = j4;
        this.f16693s = j5;
        this.f16689o = z3;
        this.f16690p = z4;
    }

    /* renamed from: i */
    public static C4930r0 m12507i(C6508g gVar) {
        C4879e1.C4880a aVar = C4879e1.f16414a;
        C4987o.C4988a aVar2 = f16674t;
        return new C4930r0(aVar, aVar2, -9223372036854775807L, 0, 1, (ExoPlaybackException) null, false, TrackGroupArray.f14011e, gVar, ImmutableList.m35687D(), aVar2, false, 0, C4932s0.f16695d, 0, 0, 0, false, false);
    }

    /* renamed from: a */
    public final C4930r0 mo20593a(C4987o.C4988a aVar) {
        C4879e1 e1Var = this.f16675a;
        return new C4930r0(e1Var, this.f16676b, this.f16677c, this.f16678d, this.f16679e, this.f16680f, this.f16681g, this.f16682h, this.f16683i, this.f16684j, aVar, this.f16686l, this.f16687m, this.f16688n, this.f16691q, this.f16692r, this.f16693s, this.f16689o, this.f16690p);
    }

    /* renamed from: b */
    public final C4930r0 mo20594b(C4987o.C4988a aVar, long j, long j2, long j3, long j4, TrackGroupArray trackGroupArray, C6508g gVar, List<Metadata> list) {
        long j5 = j;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        C6508g gVar2 = gVar;
        List<Metadata> list2 = list;
        C4879e1 e1Var = this.f16675a;
        return new C4930r0(e1Var, aVar, j2, j3, this.f16679e, this.f16680f, this.f16681g, trackGroupArray2, gVar2, list2, this.f16685k, this.f16686l, this.f16687m, this.f16688n, this.f16691q, j4, j5, this.f16689o, this.f16690p);
    }

    /* renamed from: c */
    public final C4930r0 mo20595c(boolean z) {
        C4879e1 e1Var = this.f16675a;
        return new C4930r0(e1Var, this.f16676b, this.f16677c, this.f16678d, this.f16679e, this.f16680f, this.f16681g, this.f16682h, this.f16683i, this.f16684j, this.f16685k, this.f16686l, this.f16687m, this.f16688n, this.f16691q, this.f16692r, this.f16693s, z, this.f16690p);
    }

    /* renamed from: d */
    public final C4930r0 mo20596d(int i, boolean z) {
        boolean z2 = z;
        C4879e1 e1Var = this.f16675a;
        return new C4930r0(e1Var, this.f16676b, this.f16677c, this.f16678d, this.f16679e, this.f16680f, this.f16681g, this.f16682h, this.f16683i, this.f16684j, this.f16685k, z2, i, this.f16688n, this.f16691q, this.f16692r, this.f16693s, this.f16689o, this.f16690p);
    }

    /* renamed from: e */
    public final C4930r0 mo20597e(ExoPlaybackException exoPlaybackException) {
        C4879e1 e1Var = this.f16675a;
        return new C4930r0(e1Var, this.f16676b, this.f16677c, this.f16678d, this.f16679e, exoPlaybackException, this.f16681g, this.f16682h, this.f16683i, this.f16684j, this.f16685k, this.f16686l, this.f16687m, this.f16688n, this.f16691q, this.f16692r, this.f16693s, this.f16689o, this.f16690p);
    }

    /* renamed from: f */
    public final C4930r0 mo20598f(C4932s0 s0Var) {
        C4879e1 e1Var = this.f16675a;
        return new C4930r0(e1Var, this.f16676b, this.f16677c, this.f16678d, this.f16679e, this.f16680f, this.f16681g, this.f16682h, this.f16683i, this.f16684j, this.f16685k, this.f16686l, this.f16687m, s0Var, this.f16691q, this.f16692r, this.f16693s, this.f16689o, this.f16690p);
    }

    /* renamed from: g */
    public final C4930r0 mo20599g(int i) {
        C4879e1 e1Var = this.f16675a;
        return new C4930r0(e1Var, this.f16676b, this.f16677c, this.f16678d, i, this.f16680f, this.f16681g, this.f16682h, this.f16683i, this.f16684j, this.f16685k, this.f16686l, this.f16687m, this.f16688n, this.f16691q, this.f16692r, this.f16693s, this.f16689o, this.f16690p);
    }

    /* renamed from: h */
    public final C4930r0 mo20600h(C4879e1 e1Var) {
        return new C4930r0(e1Var, this.f16676b, this.f16677c, this.f16678d, this.f16679e, this.f16680f, this.f16681g, this.f16682h, this.f16683i, this.f16684j, this.f16685k, this.f16686l, this.f16687m, this.f16688n, this.f16691q, this.f16692r, this.f16693s, this.f16689o, this.f16690p);
    }
}
