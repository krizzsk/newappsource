package com.moovit.app.stopdetail;

import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import b00.C13556a;
import com.moovit.app.MoovitAppActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.location.C16202a;
import com.moovit.map.C16281i;
import com.moovit.map.C16285j;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitStopPathway;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o20.C18699e;
import o20.C18711q;
import p011aa.C0141e;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p453dw.C16735k;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20944i0;
import p977zz.C20975x0;
import w20.C20275b;
import w20.C20276c;

public class StopDetailMapActivity extends MoovitAppActivity {

    /* renamed from: s0 */
    public static final /* synthetic */ int f39676s0 = 0;

    /* renamed from: U */
    public TransitStop f39677U;

    /* renamed from: X */
    public MapFragment f39678X;

    /* renamed from: Y */
    public Polyline f39679Y = null;

    /* renamed from: Z */
    public Object f39680Z = null;

    /* renamed from: l0 */
    public Object f39681l0 = null;

    /* renamed from: m0 */
    public ServerId f39682m0;

    /* renamed from: n0 */
    public boolean f39683n0 = false;

    /* renamed from: o0 */
    public final ArrayList f39684o0 = new ArrayList();

    /* renamed from: p0 */
    public C13556a f39685p0 = null;

    /* renamed from: q0 */
    public final C15333a f39686q0 = new C15333a();

    /* renamed from: r0 */
    public final C15334b f39687r0 = new C15334b();

    /* renamed from: com.moovit.app.stopdetail.StopDetailMapActivity$a */
    public class C15333a implements MapFragment.C16237r {
        public C15333a() {
        }

        /* renamed from: a */
        public final void mo21406a() {
            View view;
            MapFragment mapFragment = StopDetailMapActivity.this.f39678X;
            if (mapFragment != null) {
                view = mapFragment.getView();
            } else {
                view = null;
            }
            if (view != null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15059s(view, 4);
            }
            StopDetailMapActivity.this.mo45917y2();
        }
    }

    /* renamed from: com.moovit.app.stopdetail.StopDetailMapActivity$b */
    public class C15334b extends C0141e {
        public C15334b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C20275b bVar = (C20275b) cVar;
            StopDetailMapActivity.this.f39685p0 = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C20275b bVar = (C20275b) cVar;
            C20276c cVar2 = (C20276c) gVar;
            StopDetailMapActivity stopDetailMapActivity = StopDetailMapActivity.this;
            stopDetailMapActivity.f39679Y = cVar2.f51410m;
            stopDetailMapActivity.f39682m0 = cVar2.f51411n;
            stopDetailMapActivity.f39683n0 = true;
            stopDetailMapActivity.mo45917y2();
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.stop_detail_map_activity);
        this.f39677U = (TransitStop) getIntent().getParcelableExtra("stop");
        this.f39678X = (MapFragment) getSupportFragmentManager().mo3983z(R.id.map_fragment);
        C16281i.C16282a aVar = new C16281i.C16282a(this);
        MapFragment mapFragment = this.f39678X;
        mapFragment.f42341D0 = aVar;
        C16285j jVar = mapFragment.f42368n;
        if (jVar != null) {
            jVar.mo48813u(aVar);
        }
        this.f39678X.mo48656t2(this.f39686q0);
        this.f39678X.mo48658u2(new C16735k(this, aVar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo801w(this.f39677U.f23731c);
        }
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        mo24881f2();
        C13556a aVar = this.f39685p0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39685p0 = null;
        }
        Location u1 = mo44542u1();
        if (u1 == null) {
            mo45917y2();
            return;
        }
        C20275b bVar = new C20275b(mo44548x1(), u1, this.f39677U.f23730b);
        String str = bVar.f51409w;
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f39685p0 = mo44527k2(str, bVar, requestOptions, this.f39687r0);
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        mo24880c2();
        C13556a aVar = this.f39685p0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39685p0 = null;
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: y2 */
    public final void mo45917y2() {
        boolean z;
        boolean z2;
        MarkerZoomStyle j;
        Polyline polyline;
        MapFragment mapFragment = this.f39678X;
        if (mapFragment != null && mapFragment.mo48624U2()) {
            MapFragment mapFragment2 = this.f39678X;
            Polyline polyline2 = this.f39679Y;
            if (polyline2 == null || this.f39677U == null || polyline2.mo24338U0() == 0 || this.f39680Z != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Object obj = this.f39680Z;
                if (obj != null) {
                    mapFragment2.mo48639j3(obj);
                    this.f39680Z = null;
                }
                this.f39680Z = mapFragment2.mo48662w2(this.f39679Y, C16281i.m41521q(this));
            }
            MapFragment mapFragment3 = this.f39678X;
            if (this.f39677U == null || (this.f39681l0 != null && !this.f39683n0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f39683n0 = false;
            if (z2) {
                Object obj2 = this.f39681l0;
                if (obj2 != null) {
                    mapFragment3.mo48636g3(obj2);
                }
                if (!this.f39684o0.isEmpty()) {
                    ArrayList arrayList = this.f39684o0;
                    C18711q F = mapFragment3.f42368n.mo48783F();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        mapFragment3.mo48637h3(it.next(), F);
                    }
                }
                List<TransitStopPathway> list = this.f39677U.f23739k;
                if (this.f39682m0 == null && !list.isEmpty() && (polyline = this.f39679Y) != null) {
                    LatLonE6 latLonE6 = polyline.getPoints().get(this.f39679Y.mo24338U0() - 1);
                    latLonE6.getClass();
                    float f = Float.MAX_VALUE;
                    for (TransitStopPathway next : list) {
                        if (next.mo24419c()) {
                            LatLonE6 latLonE62 = next.f23751e;
                            latLonE62.getClass();
                            float c = LatLonE6.m40174c(latLonE62, latLonE6);
                            if (c < f) {
                                this.f39682m0 = next.f23748b;
                                f = c;
                            }
                        }
                    }
                }
                SparseArray<MarkerZoomStyle> c2 = MarkerZoomStyle.m41440c(this.f39677U.f23738j);
                C16281i.m41507c(c2);
                TransitStop transitStop = this.f39677U;
                LatLonE6 latLonE63 = transitStop.f23732d;
                mapFragment3.getClass();
                this.f39681l0 = mapFragment3.mo48648p2(latLonE63, transitStop, C18699e.m45697a(c2));
                for (TransitStopPathway next2 : list) {
                    if ((next2.mo24419c() || next2.mo24420d()) && (j = C16281i.m41514j(next2.f23749c, !C20975x0.m49118e(next2.f23748b, this.f39682m0))) != null) {
                        this.f39684o0.add(mapFragment3.mo48646o2(next2.f23751e, new C20944i0(this.f39677U, next2.f23748b), j));
                    }
                }
            }
            MapFragment mapFragment4 = this.f39678X;
            Polyline polyline3 = this.f39679Y;
            if (polyline3 != null) {
                mapFragment4.mo48606B2((Rect) null, polyline3.getBounds(), true);
            } else {
                mapFragment4.mo48664z2(this.f39677U.f23732d, 17.5f);
            }
        }
    }
}
