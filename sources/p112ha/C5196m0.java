package p112ha;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.C3876a;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.gms.location.places.Place;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.List;
import p041ca.C1832r;
import p099ga.C4864c0;
import p099ga.C4879e1;
import p099ga.C4883f;
import p099ga.C4901j0;
import p099ga.C4910k0;
import p099ga.C4923q;
import p099ga.C4932s0;
import p099ga.C4936u0;
import p099ga.C4948x;
import p100gb.C4978i;
import p100gb.C4983l;
import p100gb.C4986n;
import p100gb.C4987o;
import p100gb.C4995u;
import p112ha.C5199n0;
import p137ja.C5413d;
import p137ja.C5414e;
import p252sb.C6505e;
import p265tb.C6647c;
import p277ub.C6773a;
import p277ub.C6774a0;
import p277ub.C6786k;
import p277ub.C6808v;
import p290vb.C6953n;
import p290vb.C6955o;
import p583jk.C17875h;

/* renamed from: ha.m0 */
public final class C5196m0 implements C4936u0.C4940d, C3876a, C6953n, C4995u, C6647c.C6648a, C3912b {

    /* renamed from: b */
    public final C4879e1.C4881b f17271b;

    /* renamed from: c */
    public final C4879e1.C4882c f17272c;

    /* renamed from: d */
    public final C5197a f17273d;

    /* renamed from: e */
    public final SparseArray<C5199n0.C5200a> f17274e;

    /* renamed from: f */
    public C6786k<C5199n0> f17275f;

    /* renamed from: g */
    public C4936u0 f17276g;

    /* renamed from: h */
    public boolean f17277h;

    /* renamed from: ha.m0$a */
    public static final class C5197a {

        /* renamed from: a */
        public final C4879e1.C4881b f17278a;

        /* renamed from: b */
        public ImmutableList<C4987o.C4988a> f17279b = ImmutableList.m35687D();

        /* renamed from: c */
        public ImmutableMap<C4987o.C4988a, C4879e1> f17280c = ImmutableMap.m35707j();

        /* renamed from: d */
        public C4987o.C4988a f17281d;

        /* renamed from: e */
        public C4987o.C4988a f17282e;

        /* renamed from: f */
        public C4987o.C4988a f17283f;

        public C5197a(C4879e1.C4881b bVar) {
            this.f17278a = bVar;
        }

        /* renamed from: b */
        public static C4987o.C4988a m13153b(C4936u0 u0Var, ImmutableList<C4987o.C4988a> immutableList, C4987o.C4988a aVar, C4879e1.C4881b bVar) {
            Object obj;
            int i;
            C4879e1 s = u0Var.mo20400s();
            int B = u0Var.mo20359B();
            if (s.mo20464p()) {
                obj = null;
            } else {
                obj = s.mo20348l(B);
            }
            if (u0Var.mo20385d() || s.mo20464p()) {
                i = -1;
            } else {
                i = s.mo20345f(B, bVar, false).mo20466b(C4883f.m12376a(u0Var.getCurrentPosition()) - bVar.f16419e);
            }
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                C4987o.C4988a aVar2 = immutableList.get(i2);
                if (m13154c(aVar2, obj, u0Var.mo20385d(), u0Var.mo20397o(), u0Var.mo20361D(), i)) {
                    return aVar2;
                }
            }
            if (immutableList.isEmpty() && aVar != null) {
                if (m13154c(aVar, obj, u0Var.mo20385d(), u0Var.mo20397o(), u0Var.mo20361D(), i)) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: c */
        public static boolean m13154c(C4987o.C4988a aVar, Object obj, boolean z, int i, int i2, int i3) {
            if (!aVar.f16857a.equals(obj)) {
                return false;
            }
            if ((z && aVar.f16858b == i && aVar.f16859c == i2) || (!z && aVar.f16858b == -1 && aVar.f16861e == i3)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo20919a(ImmutableMap.C14370b<C4987o.C4988a, C4879e1> bVar, C4987o.C4988a aVar, C4879e1 e1Var) {
            if (aVar != null) {
                if (e1Var.mo20342b(aVar.f16857a) != -1) {
                    bVar.mo43096c(aVar, e1Var);
                    return;
                }
                C4879e1 e1Var2 = this.f17280c.get(aVar);
                if (e1Var2 != null) {
                    bVar.mo43096c(aVar, e1Var2);
                }
            }
        }

        /* renamed from: d */
        public final void mo20920d(C4879e1 e1Var) {
            ImmutableMap.C14370b bVar = new ImmutableMap.C14370b(4);
            if (this.f17279b.isEmpty()) {
                mo20919a(bVar, this.f17282e, e1Var);
                if (!C17875h.m44312w(this.f17283f, this.f17282e)) {
                    mo20919a(bVar, this.f17283f, e1Var);
                }
                if (!C17875h.m44312w(this.f17281d, this.f17282e) && !C17875h.m44312w(this.f17281d, this.f17283f)) {
                    mo20919a(bVar, this.f17281d, e1Var);
                }
            } else {
                for (int i = 0; i < this.f17279b.size(); i++) {
                    mo20919a(bVar, this.f17279b.get(i), e1Var);
                }
                if (!this.f17279b.contains(this.f17281d)) {
                    mo20919a(bVar, this.f17281d, e1Var);
                }
            }
            this.f17280c = bVar.mo43095b();
        }
    }

    public C5196m0() {
        C6808v vVar = C6773a.f20958a;
        int i = C6774a0.f20959a;
        Looper myLooper = Looper.myLooper();
        this.f17275f = new C6786k<>(myLooper == null ? Looper.getMainLooper() : myLooper, vVar, new C1832r(1));
        C4879e1.C4881b bVar = new C4879e1.C4881b();
        this.f17271b = bVar;
        this.f17272c = new C4879e1.C4882c();
        this.f17273d = new C5197a(bVar);
        this.f17274e = new SparseArray<>();
    }

    /* renamed from: A */
    public final void mo15869A(Exception exc) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_PREMISE, new C5195m(m0, exc, 1));
    }

    /* renamed from: B */
    public final /* synthetic */ void mo16508B(List list) {
    }

    /* renamed from: C */
    public final void mo20408C(Format format, C5414e eVar) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_SUBLOCALITY, new C5181f(m0, format, eVar));
    }

    /* renamed from: D */
    public final void mo15870D(long j) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_NEIGHBORHOOD, new C5211y(m0, j));
    }

    /* renamed from: E */
    public final void mo15994E(int i, C4987o.C4988a aVar) {
        C5199n0.C5200a l0 = mo20916l0(i, aVar);
        mo20918n0(l0, 1035, new C4948x(l0, 2));
    }

    /* renamed from: F */
    public final void mo20409F(Exception exc) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, 1038, new C5190j0(m0, exc, 1));
    }

    /* renamed from: G */
    public final void mo20587G(int i, C4987o.C4988a aVar, C4983l lVar) {
        C5199n0.C5200a l0 = mo20916l0(i, aVar);
        mo20918n0(l0, 1004, new C5204r(l0, lVar, 1));
    }

    /* renamed from: H */
    public final void mo20410H(long j, Object obj) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_SUBLOCALITY_LEVEL_5, new C5183g(m0, obj, j));
    }

    /* renamed from: I */
    public final void mo16509I(int i, int i2) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_SYNTHETIC_GEOCODE, new C5171a(m0, i, i2));
    }

    /* renamed from: J */
    public final void mo20411J(int i, long j) {
        C5199n0.C5200a k0 = mo20915k0(this.f17273d.f17282e);
        mo20918n0(k0, Place.TYPE_SUBLOCALITY_LEVEL_4, new C5185h(i, j, k0));
    }

    /* renamed from: K */
    public final void mo16423K(ExoPlaybackException exoPlaybackException) {
        C5199n0.C5200a aVar;
        C4986n nVar = exoPlaybackException.mediaPeriodId;
        if (nVar != null) {
            aVar = mo20915k0(new C4987o.C4988a(nVar));
        } else {
            aVar = mo20913i0();
        }
        mo20918n0(aVar, 11, new C4864c0(2, aVar, exoPlaybackException));
    }

    /* renamed from: L */
    public final void mo16424L(boolean z) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 4, new C5207u(i0, z));
    }

    /* renamed from: M */
    public final void mo16425M(int i, boolean z) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 6, new C5194l0(i0, z, i));
    }

    /* renamed from: N */
    public final void mo16510N(float f) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_ROOM, new C5193l(m0, f));
    }

    /* renamed from: O */
    public final void mo15871O(C5413d dVar) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_INTERSECTION, new C5191k(m0, dVar));
    }

    /* renamed from: P */
    public final void mo16426P(C4901j0 j0Var, int i) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 1, new C5201o(i0, j0Var, i));
    }

    /* renamed from: Q */
    public final void mo16427Q(TrackGroupArray trackGroupArray, C6505e eVar) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 2, new C5212z(i0, trackGroupArray, eVar));
    }

    /* renamed from: R */
    public final void mo15995R(int i, C4987o.C4988a aVar) {
        C5199n0.C5200a l0 = mo20916l0(i, aVar);
        mo20918n0(l0, 1031, new C5209w(l0, 1));
    }

    /* renamed from: S */
    public final void mo16428S(int i, C4936u0.C4941e eVar, C4936u0.C4941e eVar2) {
        if (i == 1) {
            this.f17277h = false;
        }
        C5197a aVar = this.f17273d;
        C4936u0 u0Var = this.f17276g;
        u0Var.getClass();
        aVar.f17281d = C5197a.m13153b(u0Var, aVar.f17279b, aVar.f17282e, aVar.f17278a);
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 12, new C5206t(i, eVar, eVar2, i0));
    }

    /* renamed from: T */
    public final void mo20588T(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar, IOException iOException, boolean z) {
        C5199n0.C5200a l0 = mo20916l0(i, aVar);
        mo20918n0(l0, Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3, new C5176c0(l0, iVar, lVar, iOException, z));
    }

    /* renamed from: U */
    public final /* synthetic */ void mo16511U() {
    }

    /* renamed from: V */
    public final void mo16429V(int i) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 9, new C5173b(i0, i));
    }

    /* renamed from: W */
    public final void mo15872W(Format format, C5414e eVar) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_NATURAL_FEATURE, new C5187i(m0, format, eVar));
    }

    /* renamed from: X */
    public final /* synthetic */ void mo16430X() {
    }

    /* renamed from: Y */
    public final /* synthetic */ void mo16512Y() {
    }

    /* renamed from: Z */
    public final void mo16431Z(int i, boolean z) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, -1, new C5175c(i0, z, i));
    }

    /* renamed from: a */
    public final void mo20412a(String str) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, 1024, new C5177d(m0, str, 0));
    }

    /* renamed from: a0 */
    public final void mo15873a0(Exception exc) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, 1037, new C5208v(m0, exc, 0));
    }

    /* renamed from: b */
    public final /* synthetic */ void mo16433b() {
    }

    /* renamed from: b0 */
    public final void mo16434b0(C4932s0 s0Var) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 13, new C5188i0(i0, s0Var, 1));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo16513c() {
    }

    /* renamed from: c0 */
    public final void mo20590c0(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar) {
        C5199n0.C5200a l0 = mo20916l0(i, aVar);
        mo20918n0(l0, 1000, new C5198n(l0, iVar, lVar, 0));
    }

    /* renamed from: d */
    public final void mo16514d(boolean z) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_POSTAL_TOWN, new C5174b0(m0, z));
    }

    /* renamed from: d0 */
    public final /* synthetic */ void mo16437d0(C4936u0.C4939c cVar) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo15875e() {
    }

    /* renamed from: e0 */
    public final void mo15996e0(int i, C4987o.C4988a aVar) {
        C5199n0.C5200a l0 = mo20916l0(i, aVar);
        mo20918n0(l0, 1034, new C4923q(l0, 1));
    }

    /* renamed from: f */
    public final /* synthetic */ void mo15997f() {
    }

    /* renamed from: f0 */
    public final void mo15876f0(int i, long j, long j2) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_POLITICAL, new C5205s(m0, i, j, j2, 1));
    }

    /* renamed from: g */
    public final void mo16438g() {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, -1, new C5184g0(i0, 0));
    }

    /* renamed from: g0 */
    public final void mo15998g0(int i, C4987o.C4988a aVar, int i2) {
        C5199n0.C5200a l0 = mo20916l0(i, aVar);
        mo20918n0(l0, Place.TYPE_TRANSIT_STATION, new C5178d0(l0, i2));
    }

    /* renamed from: h */
    public final /* synthetic */ void mo16439h() {
    }

    /* renamed from: h0 */
    public final void mo16440h0(boolean z) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 8, new C5210x(i0, z));
    }

    /* renamed from: i */
    public final /* synthetic */ void mo16441i() {
    }

    /* renamed from: i0 */
    public final C5199n0.C5200a mo20913i0() {
        return mo20915k0(this.f17273d.f17281d);
    }

    /* renamed from: j */
    public final void mo16515j(C6955o oVar) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_SUBPREMISE, new C5188i0(m0, oVar, 0));
    }

    /* renamed from: j0 */
    public final C5199n0.C5200a mo20914j0(C4879e1 e1Var, int i, C4987o.C4988a aVar) {
        C4987o.C4988a aVar2;
        boolean z;
        long j;
        C4879e1 e1Var2 = e1Var;
        int i2 = i;
        if (e1Var.mo20464p()) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = false;
        if (!e1Var2.equals(this.f17276g.mo20400s()) || i2 != this.f17276g.mo20393k()) {
            z = false;
        } else {
            z = true;
        }
        long j2 = 0;
        if (aVar2 != null && aVar2.mo20688a()) {
            if (z && this.f17276g.mo20397o() == aVar2.f16858b && this.f17276g.mo20361D() == aVar2.f16859c) {
                z2 = true;
            }
            if (z2) {
                j2 = this.f17276g.getCurrentPosition();
            }
        } else if (z) {
            j = this.f17276g.mo20362E();
            return new C5199n0.C5200a(elapsedRealtime, e1Var, i, aVar2, j, this.f17276g.mo20400s(), this.f17276g.mo20393k(), this.f17273d.f17281d, this.f17276g.getCurrentPosition(), this.f17276g.mo20386e());
        } else if (!e1Var.mo20464p()) {
            j2 = C4883f.m12377b(e1Var2.mo20462m(i2, this.f17272c).f16436m);
        }
        j = j2;
        return new C5199n0.C5200a(elapsedRealtime, e1Var, i, aVar2, j, this.f17276g.mo20400s(), this.f17276g.mo20393k(), this.f17273d.f17281d, this.f17276g.getCurrentPosition(), this.f17276g.mo20386e());
    }

    /* renamed from: k */
    public final /* synthetic */ void mo20415k() {
    }

    /* renamed from: k0 */
    public final C5199n0.C5200a mo20915k0(C4987o.C4988a aVar) {
        C4879e1 e1Var;
        boolean z;
        this.f17276g.getClass();
        if (aVar == null) {
            e1Var = null;
        } else {
            e1Var = this.f17273d.f17280c.get(aVar);
        }
        if (aVar != null && e1Var != null) {
            return mo20914j0(e1Var, e1Var.mo20346g(aVar.f16857a, this.f17271b).f16417c, aVar);
        }
        int k = this.f17276g.mo20393k();
        C4879e1 s = this.f17276g.mo20400s();
        if (k < s.mo20463o()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            s = C4879e1.f16414a;
        }
        return mo20914j0(s, k, (C4987o.C4988a) null);
    }

    /* renamed from: l */
    public final void mo16442l(int i) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 7, new C5186h0(i0, i));
    }

    /* renamed from: l0 */
    public final C5199n0.C5200a mo20916l0(int i, C4987o.C4988a aVar) {
        this.f17276g.getClass();
        boolean z = false;
        if (aVar != null) {
            if (this.f17273d.f17280c.get(aVar) != null) {
                z = true;
            }
            if (z) {
                return mo20915k0(aVar);
            }
            return mo20914j0(C4879e1.f16414a, i, aVar);
        }
        C4879e1 s = this.f17276g.mo20400s();
        if (i < s.mo20463o()) {
            z = true;
        }
        if (!z) {
            s = C4879e1.f16414a;
        }
        return mo20914j0(s, i, (C4987o.C4988a) null);
    }

    /* renamed from: m */
    public final void mo20416m(C5413d dVar) {
        C5199n0.C5200a k0 = mo20915k0(this.f17273d.f17282e);
        mo20918n0(k0, Place.TYPE_SUBLOCALITY_LEVEL_3, new C5204r(k0, dVar, 0));
    }

    /* renamed from: m0 */
    public final C5199n0.C5200a mo20917m0() {
        return mo20915k0(this.f17273d.f17283f);
    }

    /* renamed from: n */
    public final void mo15999n(int i, C4987o.C4988a aVar, Exception exc) {
        C5199n0.C5200a l0 = mo20916l0(i, aVar);
        mo20918n0(l0, 1032, new C5208v(l0, exc, 1));
    }

    /* renamed from: n0 */
    public final void mo20918n0(C5199n0.C5200a aVar, int i, C6786k.C6787a<C5199n0> aVar2) {
        this.f17274e.put(i, aVar);
        C6786k<C5199n0> kVar = this.f17275f;
        kVar.mo22959b(i, aVar2);
        kVar.mo22958a();
    }

    /* renamed from: o */
    public final void mo20591o(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar) {
        C5199n0.C5200a l0 = mo20916l0(i, aVar);
        mo20918n0(l0, 1002, new C5198n(l0, iVar, lVar, 1));
    }

    public final void onAudioDecoderInitialized(String str, long j, long j2) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_LOCALITY, new C5202p(m0, str, j2, j));
    }

    public final void onDroppedFrames(int i, long j) {
        C5199n0.C5200a k0 = mo20915k0(this.f17273d.f17282e);
        mo20918n0(k0, Place.TYPE_SUBLOCALITY_LEVEL_1, new C5192k0(i, j, k0));
    }

    public final void onVideoDecoderInitialized(String str, long j, long j2) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_STREET_ADDRESS, new C5172a0(m0, str, j2, j));
    }

    public final /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }

    /* renamed from: p */
    public final void mo16444p(List<Metadata> list) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 3, new C5195m(i0, list, 0));
    }

    /* renamed from: q */
    public final void mo20424q(C5413d dVar) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_ROUTE, new C5177d(m0, dVar, 1));
    }

    /* renamed from: r */
    public final void mo20592r(int i, C4987o.C4988a aVar, C4978i iVar, C4983l lVar) {
        C5199n0.C5200a l0 = mo20916l0(i, aVar);
        mo20918n0(l0, 1001, new C5180e0(l0, iVar, lVar));
    }

    /* renamed from: s */
    public final void mo16445s(C4910k0 k0Var) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 15, new C5203q(i0, k0Var));
    }

    /* renamed from: t */
    public final void mo15878t(C5413d dVar) {
        C5199n0.C5200a k0 = mo20915k0(this.f17273d.f17282e);
        mo20918n0(k0, Place.TYPE_POST_BOX, new C5190j0(k0, dVar, 0));
    }

    /* renamed from: u */
    public final void mo16446u(int i) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 5, new C5179e(i0, i, 1));
    }

    /* renamed from: v */
    public final void mo15879v(String str) {
        C5199n0.C5200a m0 = mo20917m0();
        mo20918n0(m0, Place.TYPE_POINT_OF_INTEREST, new C5208v(m0, str, 2));
    }

    /* renamed from: w */
    public final void mo16447w(boolean z) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 10, new C5189j(i0, z));
    }

    /* renamed from: x */
    public final void mo16519x(Metadata metadata) {
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 1007, new C4864c0(1, i0, metadata));
    }

    /* renamed from: y */
    public final void mo16448y(int i) {
        C5197a aVar = this.f17273d;
        C4936u0 u0Var = this.f17276g;
        u0Var.getClass();
        aVar.f17281d = C5197a.m13153b(u0Var, aVar.f17279b, aVar.f17282e, aVar.f17278a);
        aVar.mo20920d(u0Var.mo20400s());
        C5199n0.C5200a i0 = mo20913i0();
        mo20918n0(i0, 0, new C5179e(i0, i, 0));
    }

    /* renamed from: z */
    public final void mo16000z(int i, C4987o.C4988a aVar) {
        C5199n0.C5200a l0 = mo20916l0(i, aVar);
        mo20918n0(l0, 1033, new C5184g0(l0, 1));
    }
}
