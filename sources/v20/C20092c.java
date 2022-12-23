package v20;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.camera.camera2.internal.C0509c;
import androidx.fragment.app.FragmentActivity;
import ce0.C21100e;
import com.android.billingclient.api.C1963s;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.Strategy;
import com.jhlabs.map.Point2D;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.DataUnit;
import com.moovit.commons.utils.PointD;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.developeroptions.ExtraTileLayer;
import com.moovit.map.C16245a;
import com.moovit.map.C16281i;
import com.moovit.map.C16285j;
import com.moovit.map.MapFragment;
import com.moovit.map.MapFragmentView;
import com.moovit.map.MapOverlaysLayout;
import com.nutiteq.MapView;
import com.nutiteq.components.Envelope;
import com.nutiteq.components.MapPos;
import i00.C17526e;
import j00.C17685d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k00.C17988b;
import ma0.C12895a;
import ma0.C12897b;
import ma0.C12902c;
import na0.C12922a;
import na0.C12924c;
import na0.C12925d;
import na0.C12927e;
import na0.C12932j;
import na0.C12934k;
import na0.C12935l;
import o20.C18696b;
import o20.C18707m;
import o20.C18711q;
import o20.C18713s;
import o20.C18714t;
import o20.C18715u;
import oa0.C12964d;
import oa0.C12968f;
import oa0.C12974i;
import p028ba.C1512f;
import p054d0.C4268a1;
import p072e6.C4565c;
import p116i1.C5247f;
import p20.C18874c;
import p304x.C7109v;
import p435de.C16596f;
import p824tp.C19735m;
import p824tp.C19736n;
import p824tp.C19737o;
import p824tp.C19738p;
import p824tp.C19740r;
import p824tp.C19741s;
import p824tp.C19742t;
import p824tp.C19746x;
import p977zz.C20936e0;
import p977zz.C20941h;
import p977zz.C20962r0;
import p977zz.C20964s0;
import pa0.C12999b;
import q00.C19047a;
import q00.C19053d;
import qa0.C13043a;
import qa0.C13044b;
import ra0.C13054a;
import ra0.C13056b;
import sa0.C13089a;
import sa0.C13092c;
import sa0.C13096e;
import sa0.C13102k;
import sa0.C13104m;
import ua0.C13148d;
import ua0.C13151f;
import ua0.C13155h;
import v20.C20082a;
import va0.C13189b;
import wa0.C13229a;
import wa0.C13230b;
import xa0.C13244b;
import ya0.C13288j;
import za0.C13355b;
import za0.C13356c;
import za0.C13361f;

/* renamed from: v20.c */
public final class C20092c implements C16285j {

    /* renamed from: A */
    public final C20093a f50959A = new C20093a();

    /* renamed from: B */
    public final C20094b f50960B = new C20094b();

    /* renamed from: C */
    public final Handler f50961C = new Handler();

    /* renamed from: D */
    public C4565c f50962D = null;

    /* renamed from: E */
    public final ViewGroup f50963E;

    /* renamed from: a */
    public final C13043a f50964a;

    /* renamed from: b */
    public Rect f50965b = new Rect();

    /* renamed from: c */
    public final FragmentActivity f50966c;

    /* renamed from: d */
    public MapFragment f50967d;

    /* renamed from: e */
    public final MapFragmentView f50968e;

    /* renamed from: f */
    public final MapOverlaysLayout f50969f;

    /* renamed from: g */
    public final MapView f50970g;

    /* renamed from: h */
    public final C20082a f50971h;

    /* renamed from: i */
    public final C20096d f50972i = new C20096d();

    /* renamed from: j */
    public final C13356c f50973j;

    /* renamed from: k */
    public final C20099e f50974k;

    /* renamed from: l */
    public final C20100f f50975l;

    /* renamed from: m */
    public final C1963s f50976m;

    /* renamed from: n */
    public final C13355b f50977n;

    /* renamed from: o */
    public final C20098d f50978o;

    /* renamed from: p */
    public final C20098d f50979p;

    /* renamed from: q */
    public final ArrayList f50980q = new ArrayList();

    /* renamed from: r */
    public final IdentityHashMap<C20098d, Integer> f50981r = new IdentityHashMap<>();

    /* renamed from: s */
    public int f50982s;

    /* renamed from: t */
    public C13056b f50983t;

    /* renamed from: u */
    public boolean f50984u;

    /* renamed from: v */
    public C13056b f50985v;

    /* renamed from: w */
    public boolean f50986w;

    /* renamed from: x */
    public C12964d f50987x = null;

    /* renamed from: y */
    public MapFragment.MapFollowMode f50988y;

    /* renamed from: z */
    public boolean f50989z = false;

    /* renamed from: v20.c$a */
    public class C20093a extends C13244b {

        /* renamed from: c */
        public final C20097e f50990c;

        public C20093a() {
            this.f50990c = new C20097e();
        }

        /* renamed from: a */
        public final void mo40115a() {
        }

        /* renamed from: b */
        public final void mo40116b(double d, double d2, boolean z) {
            boolean z2;
            C20092c cVar = C20092c.this;
            MapFragment mapFragment = cVar.f50967d;
            if (mapFragment != null) {
                C20097e eVar = this.f50990c;
                if (eVar.f51001f != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    eVar.mo52349b();
                } else {
                    mapFragment.mo48628Y2(cVar.mo52343J(new MapPos(d, d2)), z);
                }
            }
        }

        /* renamed from: c */
        public final void mo40117c(int i) {
            int i2;
            C20092c cVar = C20092c.this;
            if (cVar.f50967d != null) {
                int i3 = i & 32;
                if (i3 != 0) {
                    float C = cVar.mo48780C();
                    C20092c cVar2 = C20092c.this;
                    C20092c.m47617i(cVar2.f50983t, cVar2.f50984u, C);
                    C20092c cVar3 = C20092c.this;
                    C20092c.m47617i(cVar3.f50985v, cVar3.f50986w, C);
                }
                MapFragment mapFragment = C20092c.this.f50967d;
                if ((i & 1) != 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                if ((i & 4) != 0) {
                    i2 |= 4;
                }
                if ((i & 8) != 0) {
                    i2 |= 8;
                }
                if ((i & 16) != 0) {
                    i2 |= 16;
                }
                if (i3 != 0) {
                    i2 |= 32;
                }
                if ((i & 64) != 0) {
                    i2 |= 64;
                }
                mapFragment.mo48629Z2(i2);
            }
        }

        /* renamed from: d */
        public final void mo40118d() {
            FragmentActivity activity;
            MapFragment mapFragment = C20092c.this.f50967d;
            if (mapFragment != null && (activity = mapFragment.getActivity()) != null) {
                activity.runOnUiThread(new C4268a1(this, 16));
            }
        }

        /* renamed from: e */
        public final void mo40119e() {
        }

        /* renamed from: f */
        public final void mo40120f() {
        }

        /* renamed from: g */
        public final void mo40121g(C13244b.C13246b bVar) {
            boolean z;
            boolean z2;
            if (C20092c.this.f50967d != null && !bVar.f32871d) {
                ArrayList l = mo52348l(Collections.unmodifiableList(bVar.f32868a));
                if (l.isEmpty()) {
                    mo40116b(bVar.f32869b, bVar.f32870c, bVar.f32871d);
                    return;
                }
                boolean z3 = true;
                if (l.size() == 1) {
                    C12964d dVar = (C12964d) l.get(0);
                    C20092c.this.f50971h.mo52333b(dVar, false);
                    C20097e eVar = this.f50990c;
                    if (eVar.f51001f != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C13089a aVar = ((C13096e) C20092c.this.f50970g.getMapRenderer()).f32417I;
                        synchronized (aVar) {
                            z2 = !aVar.f32376a.isEmpty();
                        }
                        if (z2) {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        C20092c cVar = C20092c.this;
                        MapFragment mapFragment = cVar.f50967d;
                        cVar.f50971h.getClass();
                        mapFragment.mo48631b3(((C20082a.C20088f) dVar.f32126f).f50952a);
                        C20092c.this.f50970g.mo24885e(dVar);
                        if (dVar.f32121a != null) {
                            C20092c.this.f50967d.mo48663x2(C20092c.this.mo52343J(dVar.f32096g));
                        }
                    }
                }
            }
        }

        /* renamed from: h */
        public final void mo40122h(C13244b.C13246b bVar) {
            Iterator it = mo52348l(Collections.unmodifiableList(bVar.f32868a)).iterator();
            while (it.hasNext()) {
                C20092c.this.f50971h.mo52333b((C12964d) it.next(), false);
            }
        }

        /* renamed from: j */
        public final void mo40124j(C13244b.C13246b bVar) {
            ArrayList l = mo52348l(Collections.unmodifiableList(bVar.f32868a));
            if (l.size() == 1) {
                C20092c.this.f50971h.mo52333b((C12964d) l.get(0), true);
            }
        }

        /* renamed from: k */
        public final void mo40125k(C13244b.C13246b bVar) {
            boolean z;
            float f;
            boolean z2;
            MapPos mapPos;
            Envelope envelope;
            ArrayList arrayList;
            C20097e eVar;
            ArrayList arrayList2;
            int i;
            double d;
            Envelope envelope2;
            MapPos mapPos2;
            ArrayList l = mo52348l(Collections.unmodifiableList(bVar.f32868a));
            if (l.size() > 1) {
                if (this.f50990c.f51001f != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    float C = C20092c.this.mo48780C();
                    MapFragment mapFragment = C20092c.this.f50967d;
                    if (Float.isNaN(mapFragment.f42387w0)) {
                        f = mapFragment.f42368n.getMaxZoom();
                    } else {
                        f = mapFragment.f42387w0;
                    }
                    if (C >= f) {
                        Iterator it = l.iterator();
                        while (it.hasNext()) {
                            C20092c.this.f50971h.mo52333b((C12964d) it.next(), false);
                        }
                        Iterator it2 = l.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((C12964d) it2.next()).f32121a != null) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                z2 = false;
                                break;
                            }
                        }
                        if (!z2) {
                            C20097e eVar2 = this.f50990c;
                            if (C20092c.this.f50967d != null) {
                                ArrayList arrayList3 = new ArrayList(l.size());
                                Iterator it3 = l.iterator();
                                while (it3.hasNext()) {
                                    C12974i iVar = (C12974i) it3.next();
                                    if (iVar instanceof C12964d) {
                                        C12964d dVar = (C12964d) iVar;
                                        C13044b bVar2 = dVar.f32123c.f32170a;
                                        MapPos mapPos3 = dVar.f32096g;
                                        MapPos c = bVar2.mo39930c(mapPos3.f24175b, mapPos3.f24176c);
                                        mapPos2 = dVar.f32123c.f32172c.f32012j.mo39963E(c.f24175b, c.f24176c, 0.0d);
                                    } else {
                                        mapPos2 = null;
                                    }
                                    if (mapPos2 != null) {
                                        arrayList3.add(mapPos2);
                                    }
                                }
                                Iterator it4 = arrayList3.iterator();
                                double d2 = 0.0d;
                                double d3 = 0.0d;
                                while (it4.hasNext()) {
                                    MapPos mapPos4 = (MapPos) it4.next();
                                    d2 += mapPos4.f24175b;
                                    d3 += mapPos4.f24176c;
                                }
                                MapPos mapPos5 = new MapPos(d2 / ((double) arrayList3.size()), d3 / ((double) arrayList3.size()));
                                ArrayList arrayList4 = new ArrayList(l.size());
                                Iterator it5 = l.iterator();
                                while (it5.hasNext()) {
                                    C12974i iVar2 = (C12974i) it5.next();
                                    if (iVar2 instanceof C12964d) {
                                        C12964d dVar2 = (C12964d) iVar2;
                                        C13044b bVar3 = dVar2.f32123c.f32170a;
                                        MapPos mapPos6 = dVar2.f32096g;
                                        MapPos c2 = bVar3.mo39930c(mapPos6.f24175b, mapPos6.f24176c);
                                        MapPos E = dVar2.f32123c.f32172c.f32012j.mo39963E(c2.f24175b, c2.f24176c, 0.0d);
                                        C13148d dVar3 = (C13148d) ((C12964d.C12965a) dVar2.f32125e).f32128b;
                                        float f2 = dVar3.f32642b;
                                        float f3 = dVar3.f32643c;
                                        C12935l lVar = dVar3.f32686g;
                                        float f4 = lVar.f32062d / 3949.9998f;
                                        float f5 = lVar.f32063e / 3949.9998f;
                                        double d4 = E.f24175b - ((double) ((0.5f - (f2 / 2.0f)) * f4));
                                        double d5 = E.f24176c - ((double) (((f3 / 2.0f) + 0.5f) * f5));
                                        envelope2 = new Envelope(d4, d4 + ((double) f4), d5, d5 + ((double) f5));
                                    } else {
                                        envelope2 = null;
                                    }
                                    if (envelope2 != null) {
                                        arrayList4.add(envelope2);
                                    }
                                }
                                int i2 = 0;
                                double d6 = 0.0d;
                                while (i2 < arrayList4.size()) {
                                    Envelope envelope3 = (Envelope) arrayList4.get(i2);
                                    MapPos mapPos7 = (MapPos) arrayList3.get(i2);
                                    i2++;
                                    int i3 = i2;
                                    while (i3 < arrayList4.size()) {
                                        Envelope envelope4 = (Envelope) arrayList4.get(i3);
                                        if (!envelope3.mo24914c(envelope4)) {
                                            i = i2;
                                            eVar = eVar2;
                                            d = d6;
                                            arrayList = arrayList3;
                                            arrayList2 = arrayList4;
                                            envelope = envelope3;
                                            mapPos = mapPos7;
                                        } else {
                                            MapPos mapPos8 = (MapPos) arrayList3.get(i3);
                                            i = i2;
                                            arrayList2 = arrayList4;
                                            eVar = eVar2;
                                            d = d6;
                                            arrayList = arrayList3;
                                            envelope = envelope3;
                                            mapPos = mapPos7;
                                            Envelope envelope5 = envelope;
                                            double min = Math.min(C20097e.m47679a(mapPos5.f24175b, mapPos7.f24175b, envelope3.minX, envelope3.maxX, mapPos8.f24175b, envelope4.minX, envelope4.maxX), C20097e.m47679a(mapPos5.f24176c, mapPos.f24176c, envelope5.minY, envelope5.maxY, mapPos8.f24176c, envelope4.minY, envelope4.maxY));
                                            if (min > d) {
                                                d6 = min;
                                                i3++;
                                                i2 = i;
                                                arrayList4 = arrayList2;
                                                eVar2 = eVar;
                                                arrayList3 = arrayList;
                                                envelope3 = envelope;
                                                mapPos7 = mapPos;
                                            }
                                        }
                                        d6 = d;
                                        i3++;
                                        i2 = i;
                                        arrayList4 = arrayList2;
                                        eVar2 = eVar;
                                        arrayList3 = arrayList;
                                        envelope3 = envelope;
                                        mapPos7 = mapPos;
                                    }
                                    int i4 = i2;
                                    double d7 = d6;
                                }
                                C20097e eVar3 = eVar2;
                                ArrayList arrayList5 = arrayList3;
                                if (!Double.isInfinite(d6)) {
                                    C20097e eVar4 = eVar3;
                                    float C2 = C20092c.this.mo48780C();
                                    float C3 = C20092c.this.mo48780C() + ((float) d6);
                                    C12927e constraints = C20092c.this.f50970g.getConstraints();
                                    C12934k kVar = constraints.f32016a;
                                    if (C3 <= kVar.f32058b) {
                                        eVar4.f51003h = null;
                                        if (arrayList5.size() == 2) {
                                            C20092c cVar = C20092c.this;
                                            cVar.f50967d.mo48664z2(cVar.mo52344K(mapPos5.f24175b, mapPos5.f24176c), C3);
                                        } else {
                                            MapFragment mapFragment2 = C20092c.this.f50967d;
                                            Iterator it6 = arrayList5.iterator();
                                            double d8 = -1.7976931348623157E308d;
                                            double d9 = Double.MAX_VALUE;
                                            double d11 = Double.MAX_VALUE;
                                            double d12 = -1.7976931348623157E308d;
                                            while (it6.hasNext()) {
                                                MapPos mapPos9 = (MapPos) it6.next();
                                                d9 = Math.min(d9, mapPos9.f24175b);
                                                d8 = Math.max(d8, mapPos9.f24175b);
                                                d11 = Math.min(d11, mapPos9.f24176c);
                                                d12 = Math.max(d12, mapPos9.f24176c);
                                            }
                                            BoxE6 g = BoxE6.m40167g(C20092c.this.mo52344K(d9, d11), C20092c.this.mo52344K(d8, d12));
                                            Rect rect = new Rect();
                                            Rect R2 = C20092c.this.f50967d.mo48621R2();
                                            int width = R2.width();
                                            int height = R2.height();
                                            int i5 = width / 5;
                                            rect.left += i5;
                                            int i6 = height / 5;
                                            rect.top += i6;
                                            rect.bottom += i6;
                                            rect.right += i5;
                                            mapFragment2.getClass();
                                            mapFragment2.mo48607C2(new C16245a.C16251f(mapFragment2, g, rect, new C16245a.C16249d(Strategy.TTL_SECONDS_DEFAULT)), true);
                                        }
                                    } else {
                                        constraints.f32016a = new C12934k(C13288j.m33427b(kVar.f32057a, BitmapDescriptorFactory.HUE_RED, 24.0f), C13288j.m33427b(C3, BitmapDescriptorFactory.HUE_RED, 24.0f));
                                        eVar4.f51003h = kVar;
                                        eVar4.f51001f = C20092c.this.mo48800o();
                                        eVar4.f51002g = C2;
                                        ArrayList arrayList6 = new ArrayList();
                                        int width2 = C20092c.this.f50970g.getWidth();
                                        int height2 = C20092c.this.f50970g.getHeight();
                                        arrayList6.add(C20092c.this.f50970g.mo24884d(0.0d, 0.0d));
                                        double d13 = (double) width2;
                                        arrayList6.add(C20092c.this.f50970g.mo24884d(d13, 0.0d));
                                        double d14 = (double) height2;
                                        arrayList6.add(C20092c.this.f50970g.mo24884d(d13, d14));
                                        arrayList6.add(C20092c.this.f50970g.mo24884d(0.0d, d14));
                                        eVar4.f51004i = new C12968f(arrayList6, (ArrayList) null, new C13155h(eVar4.f50996a), (C20082a.C20088f) null);
                                        C20092c cVar2 = C20092c.this;
                                        cVar2.mo52345L(cVar2.mo52344K(mapPos5.f24175b, mapPos5.f24176c), Strategy.TTL_SECONDS_DEFAULT, eVar4.f50998c);
                                        C20092c.this.mo52347N(C3, Strategy.TTL_SECONDS_DEFAULT, eVar4.f50997b);
                                        C20092c.this.f50970g.getOptions().f32049p = false;
                                        C13355b bVar4 = C20092c.this.f50977n;
                                        C12968f fVar = eVar4.f51004i;
                                        bVar4.getClass();
                                        bVar4.mo40235b(Collections.singletonList(fVar));
                                        MapFragment mapFragment3 = C20092c.this.f50967d;
                                        mapFragment3.f42371o0 = false;
                                        mapFragment3.f42386w.setVisibility(4);
                                    }
                                }
                            }
                        }
                        return;
                    }
                }
            }
            boolean z3 = false;
            C20097e eVar5 = this.f50990c;
            if (eVar5.f51001f != null) {
                z3 = true;
            }
            if (z3) {
                eVar5.mo52349b();
            }
        }

        /* renamed from: l */
        public final ArrayList mo52348l(List list) {
            C18696b bVar;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C12974i iVar = (C12974i) it.next();
                C20092c cVar = C20092c.this;
                if (iVar != cVar.f50987x && (((bVar = (C18696b) cVar.f50976m.f6792b) == null || ((C20098d) bVar).f50956a != iVar.f32123c) && (iVar instanceof C12964d))) {
                    arrayList.add((C12964d) iVar);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: v20.c$b */
    public class C20094b implements C16245a.C16252g<Void> {
        public C20094b() {
        }

        /* renamed from: a */
        public final Object mo48716a(C16245a.C16253h hVar) {
            C20092c.this.mo52347N(hVar.f42465c, hVar.f42454a, hVar.f42455b);
            return null;
        }

        /* renamed from: b */
        public final Object mo48717b(C16245a.C16247b bVar) {
            C20092c.this.mo52345L(bVar.f42456c, bVar.f42454a, bVar.f42455b);
            return null;
        }

        /* renamed from: c */
        public final Object mo48718c(C16245a.C16251f fVar) {
            C20092c.this.mo52346M(fVar.f42462a, fVar.f42463b, fVar.f42464c);
            return null;
        }

        /* renamed from: d */
        public final Object mo48719d(C16245a.C16248c cVar) {
            LatLonE6 latLonE6;
            float f;
            int i = cVar.f42457a;
            if (i == -2) {
                Iterator it = cVar.mo48714c().iterator();
                while (it.hasNext()) {
                    ((C16245a) it.next()).mo48712b(this);
                }
            } else {
                if (i == -1) {
                    C16245a.C16247b bVar = cVar.f42458b;
                    if (bVar == null) {
                        latLonE6 = null;
                    } else {
                        latLonE6 = bVar.f42456c;
                    }
                    C16245a.C16253h hVar = cVar.f42459c;
                    if (hVar == null) {
                        f = C20092c.this.mo48780C();
                    } else {
                        f = hVar.f42465c;
                    }
                    C20092c cVar2 = C20092c.this;
                    MapFragment mapFragment = cVar2.f50967d;
                    LatLonE6 o = cVar2.mo48800o();
                    float C = C20092c.this.mo48780C();
                    mapFragment.getClass();
                    i = MapFragment.m41339J2(o, latLonE6, C, f);
                }
                C20095c cVar3 = new C20095c(i);
                Iterator it2 = cVar.mo48714c().iterator();
                while (it2.hasNext()) {
                    ((C16245a) it2.next()).mo48712b(cVar3);
                }
            }
            return null;
        }

        /* renamed from: e */
        public final Object mo48720e(C16245a.C16250e eVar) {
            C20092c cVar = C20092c.this;
            float f = eVar.f42461c;
            int i = eVar.f42454a;
            Interpolator interpolator = eVar.f42455b;
            C13096e eVar2 = (C13096e) cVar.f50970g.getMapRenderer();
            eVar2.mo39988x();
            eVar2.mo39989y();
            if (i > 0) {
                eVar2.f32417I.mo39951a(1, i, f, interpolator);
                return null;
            }
            eVar2.f32417I.mo39953c(1);
            eVar2.mo39960B(f);
            return null;
        }
    }

    /* renamed from: v20.c$c */
    public class C20095c implements C16245a.C16252g<Void> {

        /* renamed from: a */
        public final int f50993a;

        public C20095c(int i) {
            this.f50993a = i;
        }

        /* renamed from: a */
        public final Object mo48716a(C16245a.C16253h hVar) {
            C20092c.this.mo52347N(hVar.f42465c, this.f50993a, hVar.f42455b);
            return null;
        }

        /* renamed from: b */
        public final Object mo48717b(C16245a.C16247b bVar) {
            C20092c.this.mo52345L(bVar.f42456c, this.f50993a, bVar.f42455b);
            return null;
        }

        /* renamed from: c */
        public final Object mo48718c(C16245a.C16251f fVar) {
            C20092c.this.mo52346M(fVar.f42462a, fVar.f42463b, new C16245a.C16249d(this.f50993a));
            return null;
        }

        /* renamed from: d */
        public final Object mo48719d(C16245a.C16248c cVar) {
            Iterator it = cVar.mo48714c().iterator();
            while (it.hasNext()) {
                ((C16245a) it.next()).mo48712b(this);
            }
            return null;
        }

        /* renamed from: e */
        public final Object mo48720e(C16245a.C16250e eVar) {
            C20092c cVar = C20092c.this;
            float f = eVar.f42461c;
            int i = this.f50993a;
            Interpolator interpolator = eVar.f42455b;
            C13096e eVar2 = (C13096e) cVar.f50970g.getMapRenderer();
            eVar2.mo39988x();
            eVar2.mo39989y();
            if (i > 0) {
                eVar2.f32417I.mo39951a(1, i, f, interpolator);
                return null;
            }
            eVar2.f32417I.mo39953c(1);
            eVar2.mo39960B(f);
            return null;
        }
    }

    /* renamed from: v20.c$d */
    public class C20096d implements C18874c.C18876b {
        public C20096d() {
        }

        /* renamed from: i */
        public final PointD mo51343i(int i, LatLonE6 latLonE6) {
            MapPos b = C20092c.this.f50964a.mo39929b(latLonE6.mo46926o(), latLonE6.mo46922k());
            MapPos g = C20092c.this.f50970g.mo24887g(b.f24175b, b.f24176c);
            double pow = Math.pow(2.0d, ((double) i) - ((double) C20092c.this.f50970g.getZoom()));
            return new PointD(g.f24175b * pow, pow * g.f24176c);
        }
    }

    /* renamed from: v20.c$e */
    public class C20097e {

        /* renamed from: a */
        public final C13151f f50996a;

        /* renamed from: b */
        public final AccelerateInterpolator f50997b;

        /* renamed from: c */
        public final LinearInterpolator f50998c;

        /* renamed from: d */
        public final C17526e f50999d;

        /* renamed from: e */
        public final C17526e f51000e;

        /* renamed from: f */
        public LatLonE6 f51001f = null;

        /* renamed from: g */
        public float f51002g;

        /* renamed from: h */
        public C12934k f51003h;

        /* renamed from: i */
        public C12968f f51004i;

        public C20097e() {
            C13151f.C13152a aVar = new C13151f.C13152a();
            aVar.f32694a = Integer.MAX_VALUE;
            aVar.f32695b = null;
            this.f50996a = new C13151f(aVar);
            AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
            this.f50997b = accelerateInterpolator;
            LinearInterpolator linearInterpolator = C17685d.f45436a;
            this.f50998c = linearInterpolator;
            this.f50999d = new C17526e(accelerateInterpolator);
            this.f51000e = new C17526e(linearInterpolator);
        }

        /* renamed from: a */
        public static double m47679a(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
            double d8;
            double d9;
            double d11 = d2 - d;
            double d12 = d - d5;
            if (d3 >= d7 || d4 <= d7) {
                int i = (d3 > d6 ? 1 : (d3 == d6 ? 0 : -1));
                if (i < 0 && d4 > d6) {
                    d9 = d4 - d2;
                    d8 = d5 - d6;
                } else if (d3 >= d6 && d4 <= d7) {
                    return Double.POSITIVE_INFINITY;
                } else {
                    if (i > 0 || d4 < d7) {
                        return 0.0d;
                    }
                    return Double.POSITIVE_INFINITY;
                }
            } else {
                d9 = d2 - d3;
                d8 = d7 - d5;
            }
            double abs = (d9 + d8) / Math.abs(d11 + d12);
            int i2 = C20936e0.f52684d;
            return Math.log(abs) / C20936e0.f52681a;
        }

        /* renamed from: b */
        public final void mo52349b() {
            C20092c.this.mo52345L(this.f51001f, Strategy.TTL_SECONDS_DEFAULT, this.f51000e);
            C20092c.this.mo52347N(this.f51002g, Strategy.TTL_SECONDS_DEFAULT, this.f50999d);
            MapFragment mapFragment = C20092c.this.f50967d;
            mapFragment.f42371o0 = true;
            mapFragment.f42386w.setVisibility(0);
            C20092c.this.f50961C.postDelayed(new C0509c(15, this, this.f51003h), 300);
            this.f51001f = null;
            this.f51003h = null;
        }
    }

    /* JADX WARNING: type inference failed for: r10v14, types: [pa0.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v16, types: [pa0.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v21, types: [pa0.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v26, types: [pa0.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v29, types: [pa0.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v31, types: [pa0.a, java.lang.Object] */
    public C20092c(MapFragment mapFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, C19047a aVar) {
        C19047a.C19049b bVar;
        C13043a aVar2 = new C13043a();
        this.f50964a = aVar2;
        C21100e.m49373x(mapFragment, "owner");
        this.f50967d = mapFragment;
        FragmentActivity activity = mapFragment.getActivity();
        this.f50966c = activity;
        MapFragmentView mapFragmentView = (MapFragmentView) layoutInflater.inflate(C19742t.nutiteq_map_fragment, viewGroup, false);
        this.f50968e = mapFragmentView;
        this.f50969f = mapFragmentView.getOverlaysLayout();
        MapView mapView = (MapView) mapFragmentView.getMapView();
        this.f50970g = mapView;
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        C20082a aVar3 = new C20082a(this, displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        this.f50971h = aVar3;
        this.f50963E = (ViewGroup) mapFragmentView.findViewById(C19740r.temp_label_parent);
        this.f50978o = new C20098d(aVar2, aVar3);
        this.f50979p = new C20098d(aVar2, aVar3);
        C13356c cVar = new C13356c(aVar2);
        this.f50973j = cVar;
        cVar.f33139g = false;
        C12925d dVar = cVar.f32172c;
        if (dVar != null) {
            dVar.f32012j.mo39976m();
        }
        this.f50974k = new C20099e(aVar2, aVar3);
        this.f50975l = new C20100f(aVar2, aVar3);
        this.f50976m = new C1963s((Object) new C20100f(aVar2, aVar3), (Object) new C20098d(aVar2, aVar3));
        this.f50977n = new C13355b(aVar2);
        Resources resources = activity.getResources();
        mapView.setSaveEnabled(true);
        mapView.setComponents(new C12925d(activity));
        C12932j options = mapView.getOptions();
        int a = C5247f.m13262a(resources, C19737o.map_background_color);
        options.getClass();
        options.f32036c = new C12924c(a);
        options.f32034a = resources.getBoolean(C19736n.map_preload_adjacent_tiles);
        options.f32035b = (float) Math.tan((double) ((C13288j.m33427b((float) resources.getInteger(C19741s.map_preload_fov), 120.0f, 160.0f) * 0.017453292f) / 2.0f));
        options.f32039f = false;
        options.f32038e = resources.getBoolean(C19736n.map_tile_fading);
        options.f32046m = resources.getBoolean(C19736n.map_kinetic_panning);
        options.f32047n = resources.getBoolean(C19736n.map_kinetic_rotation);
        options.f32040g = resources.getBoolean(C19736n.map_double_tap_zoom_in);
        options.f32052s = resources.getBoolean(C19736n.map_double_tap_sets_center);
        options.f32041h = resources.getBoolean(C19736n.map_two_finger_tap_zoom_out);
        options.f32053t = resources.getBoolean(C19736n.map_rotate_around_center);
        options.f32042i = resources.getBoolean(C19736n.map_general_panning_mode);
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        int i = displayMetrics2.widthPixels * displayMetrics2.heightPixels * 4 * 2;
        C12902c cVar2 = options.f32054u.f32004b;
        synchronized (cVar2) {
            cVar2.f31924a = i;
            cVar2.f31927d.mo40147e();
        }
        DisplayMetrics displayMetrics3 = activity.getResources().getDisplayMetrics();
        int i2 = displayMetrics3.widthPixels * displayMetrics3.heightPixels * 3;
        C12895a aVar4 = options.f32054u.f32005c;
        synchronized (aVar4) {
            aVar4.f31909a = i2;
            aVar4.f31911c.mo40147e();
        }
        Formatter.formatShortFileSize(activity, (long) i);
        Formatter.formatShortFileSize(activity, (long) i2);
        if (resources.getBoolean(C19736n.map_persistent_caching_enabled)) {
            int integer = resources.getInteger(C19741s.map_persistent_cache_size);
            C12897b bVar2 = options.f32054u.f32006d;
            if (bVar2.f31917d != integer) {
                DataUnit.formatSize((long) integer);
                bVar2.f31917d = integer;
            }
        }
        options.f32054u.f32007e.mo40067d(resources.getInteger(C19741s.map_raster_task_pool_size));
        options.f32045l = ((float) resources.getInteger(C19741s.map_tile_zoom_level_bias)) / 100.0f;
        options.f32048o = resources.getInteger(C19741s.map_preview_zoom_offset);
        C12927e constraints = mapView.getConstraints();
        constraints.getClass();
        float b = C13288j.m33427b(90.0f, 30.0f, 90.0f);
        float b2 = C13288j.m33427b(90.0f, 30.0f, 90.0f);
        constraints.f32017b = new C12934k(b, b2);
        constraints.f32018c = new C12934k(b * 0.017453292f, b2 * 0.017453292f);
        constraints.f32019d = resources.getBoolean(C19736n.map_rotatable);
        constraints.f32016a = new C12934k(C13288j.m33427b(((float) resources.getInteger(C19741s.map_min_zoom)) / 100.0f, BitmapDescriptorFactory.HUE_RED, 24.0f), C13288j.m33427b(((float) resources.getInteger(C19741s.map_max_zoom)) / 100.0f, BitmapDescriptorFactory.HUE_RED, 24.0f));
        C12999b layers = mapView.getLayers();
        if (UiUtils.m40253l(activity)) {
            bVar = C19053d.f48469h;
        } else {
            bVar = C19053d.f48468g;
        }
        C13056b G = mo52340G((C18707m) aVar.mo51505b(bVar));
        this.f50983t = mo52340G((C18707m) aVar.mo51505b(C19053d.f48470i));
        this.f50985v = mo52340G((C18707m) aVar.mo51505b(C19053d.f48471j));
        ArrayList arrayList = new ArrayList();
        if (G != null) {
            arrayList.add(G);
        }
        C13056b bVar3 = this.f50983t;
        if (bVar3 != null) {
            arrayList.add(bVar3);
        }
        C13056b bVar4 = this.f50985v;
        if (bVar4 != null) {
            arrayList.add(bVar4);
        }
        this.f50982s = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            layers.mo39885b((C13056b) it.next());
        }
        layers.mo39885b(this.f50974k.f50956a);
        layers.mo39885b(this.f50975l.f50956a);
        layers.mo39885b(((C20100f) ((C18696b) this.f50976m.f6791a)).f50956a);
        layers.mo39885b(((C20098d) ((C18696b) this.f50976m.f6792b)).f50956a);
        layers.mo39885b(this.f50977n);
        layers.mo39885b(this.f50978o.f50956a);
        layers.mo39885b(this.f50979p.f50956a);
        layers.mo39885b(this.f50973j);
        this.f50980q.add(0);
        this.f50980q.add(1000);
        String string = this.f50966c.getString(C19746x.open_street_map_link_name);
        String string2 = this.f50966c.getString(C19746x.open_street_map_copyright_link);
        FormatTextView formatTextView = (FormatTextView) this.f50969f.findViewById(C19740r.map_legal_contributors);
        formatTextView.setArguments(string);
        int f = C20941h.m49043f(C19735m.colorOnSurfaceEmphasisHigh, this.f50966c);
        C7109v vVar = new C7109v(13, this, string2);
        String str = C20964s0.f52718a;
        C20964s0.m49104v(formatTextView, string, new C20962r0(vVar, true, f), new Object[0]);
        C13244b bVar5 = this.f50959A;
        if (options.f32055v != bVar5) {
            options.f32055v = bVar5;
            C12932j.C12933a aVar5 = new C12932j.C12933a(bVar5);
            C13189b bVar6 = options.f32054u.f32007e;
            synchronized (bVar6) {
                bVar6.f32756f = aVar5;
            }
            C13189b bVar7 = options.f32054u.f32008f;
            synchronized (bVar7) {
                bVar7.f32756f = aVar5;
            }
        }
    }

    /* renamed from: i */
    public static void m47617i(C13056b bVar, boolean z, float f) {
        boolean z2;
        if (bVar != null) {
            if (!z || f < ((float) bVar.f32287d) || f > ((float) bVar.f32288e)) {
                z2 = false;
            } else {
                z2 = true;
            }
            bVar.mo39883a(z2);
        }
    }

    /* renamed from: A */
    public final void mo48778A(boolean z) {
        this.f50986w = z;
        m47617i(this.f50985v, z, mo48780C());
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [pa0.a, java.lang.Object] */
    /* renamed from: B */
    public final void mo48779B(C18696b<C18713s> bVar) {
        if (bVar == null) {
            C16596f.m42113a().mo49364c(new NullPointerException("Attempting to destroy null marker layer"));
        } else if (bVar == this.f50978o) {
            throw new IllegalArgumentException("Trying to destroy the stops layer");
        } else if (bVar != this.f50979p) {
            C20098d dVar = (C20098d) bVar;
            Integer remove = this.f50981r.remove(dVar);
            C21100e.m49371w(remove);
            if (this.f50980q.remove(Integer.valueOf(remove.intValue()))) {
                this.f50970g.getLayers().mo39890g(dVar.f50956a);
                return;
            }
            throw new ApplicationBugException();
        } else {
            throw new IllegalArgumentException("Trying to destroy the user marker layer");
        }
    }

    /* renamed from: C */
    public final float mo48780C() {
        return this.f50970g.getZoom();
    }

    /* renamed from: D */
    public final void mo48781D(MapFragment.MapFollowMode mapFollowMode) {
        float f;
        boolean z;
        this.f50988y = mapFollowMode;
        Resources resources = this.f50966c.getResources();
        C12932j options = this.f50970g.getOptions();
        if (mapFollowMode.isFollowLocation()) {
            f = resources.getDimension(C19738p.map_panning_threshold_when_following_location);
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        options.f32051r = f;
        boolean z2 = false;
        if (!resources.getBoolean(C19736n.map_double_tap_sets_center) || mapFollowMode.isFollowLocation()) {
            z = false;
        } else {
            z = true;
        }
        options.f32052s = z;
        if (resources.getBoolean(C19736n.map_rotate_around_center) || mapFollowMode.isFollowLocation()) {
            z2 = true;
        }
        options.f32053t = z2;
        if (this.f50987x != null) {
            Location O1 = this.f50967d.mo46780O1();
            C12964d dVar = this.f50987x;
            C13148d H = mo52341H(this.f50988y, O1);
            dVar.getClass();
            C13155h<?> hVar = new C13155h<>(H);
            if (!hVar.equals(dVar.f32124d)) {
                dVar.f32124d = hVar;
                dVar.mo39856f();
            }
        }
    }

    /* renamed from: E */
    public final void mo48782E(boolean z) {
        ((C13096e) this.f50970g.getMapRenderer()).mo39983q(z);
    }

    /* renamed from: F */
    public final C18711q mo48783F() {
        return this.f50979p;
    }

    /* renamed from: G */
    public final C13056b mo52340G(C18707m mVar) {
        if (mVar == null) {
            return null;
        }
        String str = mVar.f47615a;
        int i = mVar.f47617c;
        int i2 = mVar.f47618d;
        String str2 = mVar.f47616b;
        return new C13056b(this.f50964a, i, i2, (str + str2).hashCode(), str, str2);
    }

    /* renamed from: H */
    public final C13148d mo52341H(MapFragment.MapFollowMode mapFollowMode, Location location) {
        int i;
        int i2;
        boolean z = this.f50967d.f42357P;
        if (!C16281i.m41522r(location)) {
            i = mapFollowMode.getOfflineUserMarkerResId();
        } else if (z) {
            i = mapFollowMode.getRotatableUserMarkerResId();
        } else {
            i = mapFollowMode.getUserMarkerResId();
        }
        Bitmap a = C17988b.m44610a(i, this.f50966c);
        WeakHashMap<Point, Bitmap> weakHashMap = C13148d.f32684h;
        C13148d.C13149a aVar = new C13148d.C13149a();
        aVar.f32688g = a;
        aVar.f32646c = BitmapDescriptorFactory.HUE_RED;
        aVar.f32647d = BitmapDescriptorFactory.HUE_RED;
        aVar.f32689h = -1.0f;
        aVar.f32694a = -1;
        aVar.f32695b = null;
        if (z) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        aVar.f32649f = i2;
        aVar.f32695b = null;
        aVar.f32695b = new C13148d(aVar);
        return aVar.f32695b;
    }

    /* renamed from: I */
    public final MapPos mo52342I(LatLonE6 latLonE6) {
        return this.f50964a.mo39929b(latLonE6.mo46926o(), latLonE6.mo46922k());
    }

    /* renamed from: J */
    public final LatLonE6 mo52343J(MapPos mapPos) {
        MapPos mapPos2;
        C13043a aVar = this.f50964a;
        double d = mapPos.f24175b;
        double d2 = mapPos.f24176c;
        if (aVar.f32265a.toString().equals("Null")) {
            mapPos2 = new MapPos(d, d2);
        } else {
            Point2D.Double doubleR = (Point2D.Double) aVar.f32270f.get();
            doubleR.f36952x = d;
            doubleR.f36953y = d2;
            Point2D.Double doubleR2 = (Point2D.Double) aVar.f32271g.get();
            aVar.f32265a.inverseTransform(doubleR, doubleR2);
            mapPos2 = new MapPos(doubleR2.f36952x, doubleR2.f36953y);
        }
        return LatLonE6.m40176g(mapPos2.f24176c, mapPos2.f24175b);
    }

    /* renamed from: K */
    public final LatLonE6 mo52344K(double d, double d2) {
        return mo52343J(this.f50970g.mo24884d(d, d2));
    }

    /* renamed from: L */
    public final void mo52345L(LatLonE6 latLonE6, int i, Interpolator interpolator) {
        MapView mapView = this.f50970g;
        MapPos I = mo52342I(latLonE6);
        MapPos c = mapView.f24163o.f32009g.mo39887d().mo39930c(I.f24175b, I.f24176c);
        ((C13096e) mapView.getMapRenderer()).mo39982p(c.f24175b, c.f24176c, i, interpolator);
    }

    /* renamed from: M */
    public final void mo52346M(BoxE6 boxE6, Rect rect, MapFragment.C16223e eVar) {
        Rect a = this.f50968e.mo48685a(this.f50965b);
        a.left += rect.left;
        a.right -= rect.right;
        a.top += rect.top;
        a.bottom -= rect.bottom;
        boxE6.getClass();
        MapPos I = mo52342I(new LatLonE6(boxE6.f40964b, boxE6.f40966d));
        MapPos I2 = mo52342I(new LatLonE6(boxE6.f40965c, boxE6.f40967e));
        this.f50970g.mo24886f(new C12922a(I.f24175b, I2.f24176c, I2.f24175b, I.f24176c), a, new C1512f(4, this, eVar));
    }

    /* renamed from: N */
    public final void mo52347N(float f, int i, Interpolator interpolator) {
        ((C13096e) this.f50970g.getMapRenderer()).mo39986t(f, i, interpolator);
    }

    /* renamed from: a */
    public final Polylon mo48784a(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        double d = (double) i;
        double d2 = (double) i2;
        double d3 = (double) i3;
        double d4 = (double) i4;
        return Polylon.m40193b(mo52344K(d, d2), mo52344K(d3, d2), mo52344K(d3, d4), mo52344K(d, d4));
    }

    /* renamed from: b */
    public final C18874c.C18876b mo48785b() {
        return this.f50972i;
    }

    /* renamed from: c */
    public final void mo48786c(List<ExtraTileLayer> list) {
        int i;
        C12999b layers = this.f50970g.getLayers();
        List<C13054a> e = layers.mo39888e();
        int size = e.size();
        while (true) {
            int i2 = size - 1;
            if (size <= this.f50982s) {
                break;
            }
            layers.mo39890g(e.get(i2));
            size = i2;
        }
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            ExtraTileLayer extraTileLayer = list.get(i3);
            int i4 = extraTileLayer.f41464c;
            int i5 = extraTileLayer.f41465d;
            String str = extraTileLayer.f41466e;
            String str2 = extraTileLayer.f41467f;
            C13056b bVar = new C13056b(this.f50964a, i4, i5, (str + str2).hashCode(), str, str2);
            bVar.f32303n = extraTileLayer.f41468g;
            layers.mo39884a(this.f50982s + i3, bVar);
        }
    }

    /* renamed from: d */
    public final void mo48787d(LatLonE6 latLonE6, float f) {
        mo52345L(latLonE6, 0, (Interpolator) null);
        mo52347N(f, 0, (Interpolator) null);
    }

    /* renamed from: e */
    public final void mo48788e(Object obj) {
        this.f50970g.mo24885e((C12974i) obj);
    }

    /* renamed from: f */
    public final void mo48789f(C16245a aVar) {
        aVar.mo48712b(this.f50960B);
    }

    /* renamed from: g */
    public final void mo48790g(int i, float f, float f2, int i2) {
        MapFragmentView mapFragmentView = this.f50968e;
        mapFragmentView.f42433i = f;
        mapFragmentView.f42434j = f2;
        mapFragmentView.f42435k = i;
        mapFragmentView.f42436l = i2;
        mapFragmentView.requestLayout();
    }

    public final float getMaxZoom() {
        return this.f50970g.getConstraints().f32016a.f32058b;
    }

    public final MapFragmentView getView() {
        return this.f50968e;
    }

    /* renamed from: h */
    public final BoxE6 mo48793h() {
        mo48782E(true);
        try {
            double width = (double) this.f50970g.getWidth();
            double height = (double) this.f50970g.getHeight();
            double hypot = (Math.hypot(width, height) * 2.0d) / C20936e0.f52682b;
            double z = ((((double) mo48818z()) * 3.141592653589793d) / 180.0d) + 0.7853981633974483d;
            double cos = Math.cos(z) * hypot;
            double sin = hypot * Math.sin(z);
            LatLonE6 K = mo52344K((width + cos) / 2.0d, (height + sin) / 2.0d);
            LatLonE6 K2 = mo52344K((width - cos) / 2.0d, (height - sin) / 2.0d);
            return new BoxE6(Math.min(K.f40980b, K2.f40980b), Math.max(K.f40980b, K2.f40980b), Math.min(K.f40981c, K2.f40981c), Math.max(K.f40981c, K2.f40981c));
        } finally {
            mo48782E(false);
        }
    }

    public final boolean isReady() {
        return this.f50989z;
    }

    /* renamed from: j */
    public final void mo48795j() {
    }

    /* renamed from: k */
    public final void mo48796k(float f) {
        C12964d dVar = this.f50987x;
        if (dVar != null && f != dVar.f32097h) {
            dVar.f32097h = f;
            C13361f<?> fVar = dVar.f32123c;
            if (fVar != null) {
                fVar.mo40238e(dVar);
            }
        }
    }

    /* renamed from: l */
    public final void mo48797l(boolean z) {
        this.f50970g.getOptions().f32049p = z;
    }

    /* renamed from: m */
    public final void mo48798m(boolean z) {
        this.f50984u = z;
        m47617i(this.f50983t, z, mo48780C());
    }

    /* renamed from: n */
    public final C1963s mo48799n() {
        return this.f50976m;
    }

    /* renamed from: o */
    public final LatLonE6 mo48800o() {
        return mo52344K((double) (((float) this.f50970g.getWidth()) / 2.0f), (double) (((float) this.f50970g.getHeight()) / 2.0f));
    }

    public final void onDestroy() {
        C12925d components = this.f50970g.getComponents();
        if (components != null) {
            components.f32007e.mo40068e();
            components.f32008f.mo40068e();
        }
        this.f50967d = null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onLowMemory() {
        /*
            r5 = this;
            com.nutiteq.MapView r0 = r5.f50970g
            na0.d r0 = r0.getComponents()
            if (r0 == 0) goto L_0x0038
            ma0.c r1 = r0.f32004b
            monitor-enter(r1)
            int r2 = r1.f31924a     // Catch:{ all -> 0x0035 }
            monitor-enter(r1)     // Catch:{ all -> 0x0035 }
            r3 = 0
            r1.f31924a = r3     // Catch:{ all -> 0x0032 }
            ma0.c$a r4 = r1.f31927d     // Catch:{ all -> 0x0032 }
            r4.mo40147e()     // Catch:{ all -> 0x0032 }
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            r1.f31924a = r2     // Catch:{ all -> 0x0035 }
            monitor-exit(r1)
            ma0.a r0 = r0.f32005c
            monitor-enter(r0)
            int r1 = r0.f31909a     // Catch:{ all -> 0x002f }
            monitor-enter(r0)     // Catch:{ all -> 0x002f }
            r0.f31909a = r3     // Catch:{ all -> 0x002c }
            ma0.a$a r2 = r0.f31911c     // Catch:{ all -> 0x002c }
            r2.mo40147e()     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            r0.f31909a = r1     // Catch:{ all -> 0x002f }
            monitor-exit(r0)
            goto L_0x0038
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0032:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v20.C20092c.onLowMemory():void");
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void onSaveInstanceState(Bundle bundle) {
    }

    /* JADX INFO: finally extract failed */
    public final void onStart() {
        MapView mapView = this.f50970g;
        C12999b bVar = mapView.f24163o.f32009g;
        bVar.f32174a.lock();
        try {
            bVar.mo39889f();
            for (C13361f<C12974i> fVar : bVar.f32178e) {
                fVar.getClass();
            }
            bVar.f32174a.unlock();
            C13096e eVar = (C13096e) mapView.getMapRenderer();
            synchronized (eVar) {
                eVar.f32424L0 = false;
                C13230b bVar2 = eVar.f32412F0;
                if (!bVar2.f32836r.isAlive()) {
                    bVar2.f32836r = new C13229a(bVar2, bVar2.f32822d);
                }
                if (!eVar.f32414G0.isAlive()) {
                    C13104m mVar = new C13104m(eVar, eVar.f32474y0);
                    eVar.f32414G0 = mVar;
                    mVar.start();
                }
                if (!eVar.f32416H0.isAlive()) {
                    C13102k kVar = new C13102k(eVar, eVar.f32474y0, eVar.f32438c);
                    eVar.f32416H0 = kVar;
                    kVar.start();
                }
                if (!eVar.f32418I0.isAlive()) {
                    C13092c cVar = new C13092c(eVar, eVar.f32474y0);
                    eVar.f32418I0 = cVar;
                    cVar.start();
                }
                C13104m mVar2 = eVar.f32414G0;
                synchronized (mVar2) {
                    mVar2.f32551s = true;
                    mVar2.notify();
                }
                C13102k kVar2 = eVar.f32416H0;
                synchronized (kVar2) {
                    kVar2.f32508k = true;
                    kVar2.notify();
                }
                C13092c cVar2 = eVar.f32418I0;
                synchronized (cVar2) {
                    cVar2.f32390d = true;
                    cVar2.notify();
                }
                eVar.mo39966c(0);
                eVar.mo39976m();
            }
        } catch (Throwable th) {
            bVar.f32174a.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onStop() {
        /*
            r6 = this;
            com.nutiteq.MapView r0 = r6.f50970g
            na0.d r1 = r0.f24163o
            va0.b r1 = r1.f32007e
            r1.mo40065b()
            na0.d r1 = r0.f24163o
            pa0.b r1 = r1.f32009g
            java.util.concurrent.locks.ReentrantLock r2 = r1.f32174a
            r2.lock()
            r1.mo39889f()     // Catch:{ all -> 0x00cd }
            java.util.List<za0.f<oa0.i>> r2 = r1.f32178e     // Catch:{ all -> 0x00cd }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00cd }
        L_0x001b:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00cd }
            if (r3 == 0) goto L_0x002b
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00cd }
            za0.f r3 = (za0.C13361f) r3     // Catch:{ all -> 0x00cd }
            r3.getClass()     // Catch:{ all -> 0x00cd }
            goto L_0x001b
        L_0x002b:
            java.util.concurrent.locks.ReentrantLock r1 = r1.f32174a
            r1.unlock()
            na0.d r1 = r0.f24163o
            ma0.a r1 = r1.f32005c
            monitor-enter(r1)
            int r2 = r1.f31909a     // Catch:{ all -> 0x00ca }
            monitor-enter(r1)     // Catch:{ all -> 0x00ca }
            r3 = 0
            r1.f31909a = r3     // Catch:{ all -> 0x00c7 }
            ma0.a$a r4 = r1.f31911c     // Catch:{ all -> 0x00c7 }
            r4.mo40147e()     // Catch:{ all -> 0x00c7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00ca }
            r1.f31909a = r2     // Catch:{ all -> 0x00ca }
            monitor-exit(r1)
            na0.d r1 = r0.f24163o
            ma0.c r1 = r1.f32004b
            monitor-enter(r1)
            int r2 = r1.f31924a     // Catch:{ all -> 0x00c4 }
            monitor-enter(r1)     // Catch:{ all -> 0x00c4 }
            r1.f31924a = r3     // Catch:{ all -> 0x00c1 }
            ma0.c$a r3 = r1.f31927d     // Catch:{ all -> 0x00c1 }
            r3.mo40147e()     // Catch:{ all -> 0x00c1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
            r1.f31924a = r2     // Catch:{ all -> 0x00c4 }
            monitor-exit(r1)
            na0.d r1 = r0.f24163o
            ma0.b r1 = r1.f32006d
            java.util.concurrent.ExecutorService r2 = r1.f31916c
            ma0.b$c r3 = new ma0.b$c
            c00.r<nz.b<java.lang.Long>> r4 = r1.f31915b
            java.io.File r5 = r1.f31914a
            int r1 = r1.f31917d
            r3.<init>(r4, r5, r1)
            r2.submit(r3)
            sa0.f r0 = r0.getMapRenderer()
            sa0.e r0 = (sa0.C13096e) r0
            monitor-enter(r0)
            r1 = 1
            r0.f32424L0 = r1     // Catch:{ all -> 0x00be }
            sa0.c r2 = r0.f32418I0     // Catch:{ all -> 0x00be }
            monitor-enter(r2)     // Catch:{ all -> 0x00be }
            r2.f32391e = r1     // Catch:{ all -> 0x00bb }
            r2.notify()     // Catch:{ all -> 0x00bb }
            monitor-exit(r2)     // Catch:{ all -> 0x00bb }
            sa0.k r2 = r0.f32416H0     // Catch:{ all -> 0x00be }
            monitor-enter(r2)     // Catch:{ all -> 0x00be }
            r2.f32509l = r1     // Catch:{ all -> 0x00b8 }
            r2.notify()     // Catch:{ all -> 0x00b8 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b8 }
            sa0.m r2 = r0.f32414G0     // Catch:{ all -> 0x00be }
            monitor-enter(r2)     // Catch:{ all -> 0x00be }
            r2.f32552t = r1     // Catch:{ all -> 0x00b5 }
            r2.notify()     // Catch:{ all -> 0x00b5 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
            sa0.c r1 = r0.f32418I0     // Catch:{ all -> 0x00be }
            r1.getClass()     // Catch:{ all -> 0x00be }
            r2 = 0
            r1.join()     // Catch:{ InterruptedException -> 0x009d }
            r1.f32389c = r2     // Catch:{ all -> 0x00be }
            r1.f32388b = r2     // Catch:{ all -> 0x00be }
        L_0x009d:
            sa0.k r1 = r0.f32416H0     // Catch:{ all -> 0x00be }
            r1.mo40002i()     // Catch:{ all -> 0x00be }
            sa0.m r1 = r0.f32414G0     // Catch:{ all -> 0x00be }
            r1.getClass()     // Catch:{ all -> 0x00be }
            r1.join()     // Catch:{ InterruptedException -> 0x00ae }
            r1.f32534b = r2     // Catch:{ all -> 0x00be }
            r1.f32535c = r2     // Catch:{ all -> 0x00be }
        L_0x00ae:
            wa0.b r1 = r0.f32412F0     // Catch:{ all -> 0x00be }
            r1.mo40102d()     // Catch:{ all -> 0x00be }
            monitor-exit(r0)
            return
        L_0x00b5:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00b8:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b8 }
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00bb:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00bb }
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00be:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
            throw r0     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00cd:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r1.f32174a
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v20.C20092c.onStop():void");
    }

    /* renamed from: p */
    public final C18696b<C18713s> mo48808p() {
        return this.f50978o;
    }

    /* renamed from: q */
    public final void mo48809q(int i, int i2, int i3, int i4) {
        this.f50968e.mo48686b(i, i2, i3, i4);
    }

    /* renamed from: r */
    public final void mo48810r(Location location) {
        LatLonE6 latLonE6;
        LatLonE6 j = LatLonE6.m40177j(location);
        if (j != null) {
            if (this.f50987x == null) {
                if (location == null) {
                    latLonE6 = new LatLonE6(0, 0);
                } else {
                    latLonE6 = LatLonE6.m40177j(location);
                }
                MapFragment.MapFollowMode mapFollowMode = this.f50988y;
                if (mapFollowMode == null) {
                    mapFollowMode = MapFragment.MapFollowMode.NONE;
                }
                this.f50987x = new C12964d(mo52342I(latLonE6), mo52341H(mapFollowMode, location));
            }
            C12964d dVar = this.f50987x;
            if (dVar.f32123c == null) {
                C13356c cVar = this.f50973j;
                cVar.getClass();
                cVar.mo40235b(Collections.singletonList(dVar));
            }
            C12964d dVar2 = this.f50987x;
            MapPos I = mo52342I(j);
            if (!I.equals(dVar2.f32096g)) {
                dVar2.f32096g = I;
                C13361f<?> fVar = dVar2.f32123c;
                if (fVar != null) {
                    fVar.mo40238e(dVar2);
                }
            }
            this.f50967d.mo48627X2(j);
            return;
        }
        C12964d dVar3 = this.f50987x;
        if (dVar3 != null) {
            C13356c cVar2 = this.f50973j;
            cVar2.getClass();
            cVar2.mo40239g(Collections.singletonList(dVar3));
            this.f50967d.mo48627X2((LatLonE6) null);
        }
    }

    /* renamed from: s */
    public final C18696b<C18714t> mo48811s() {
        return this.f50974k;
    }

    /* renamed from: t */
    public final void mo48812t(boolean z) {
        this.f50970g.getOptions().f32050q = z;
    }

    /* renamed from: u */
    public final void mo48813u(C4565c cVar) {
        if (this.f50962D != cVar) {
            this.f50962D = cVar;
            C13096e eVar = (C13096e) this.f50970g.getMapRenderer();
            eVar.f32452n0 = null;
            eVar.mo39976m();
        }
    }

    /* renamed from: v */
    public final MapOverlaysLayout mo48814v() {
        return this.f50969f;
    }

    /* renamed from: w */
    public final C18696b<C18715u> mo48815w() {
        return this.f50975l;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [pa0.a, java.lang.Object] */
    /* renamed from: x */
    public final C18711q mo48816x(int i) {
        int i2;
        if (i < -1000 || i > 2000 || i == 0) {
            throw new IllegalArgumentException("zIndex must be in the range [-1000, 2000] and not 0");
        }
        C20098d dVar = new C20098d(this.f50964a, this.f50971h);
        this.f50981r.put(dVar, Integer.valueOf(i));
        int binarySearch = Collections.binarySearch(this.f50980q, Integer.valueOf(i));
        if (binarySearch >= 0) {
            i2 = binarySearch + 1;
        } else {
            i2 = (-binarySearch) - 1;
        }
        this.f50980q.add(i2, Integer.valueOf(i));
        C12999b layers = this.f50970g.getLayers();
        layers.mo39884a(Collections.unmodifiableList(layers.f32175b).indexOf(this.f50979p.f50956a) + (i2 - Collections.binarySearch(this.f50980q, 0)), dVar.f50956a);
        return dVar;
    }

    /* renamed from: y */
    public final void mo48817y(boolean z) {
        this.f50970g.setRequestDisallowInterceptTouchEvent(z);
    }

    /* renamed from: z */
    public final float mo48818z() {
        return this.f50970g.getRotation();
    }
}
