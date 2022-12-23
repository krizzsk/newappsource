package com.moovit.location;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.Button;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.MoovitActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.C16277g;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import i20.C17542d;
import i20.C17543e;
import o20.C18699e;
import p824tp.C19740r;
import p824tp.C19742t;
import p858uz.C20061g;

public final class ChooseLocationActivity extends MoovitActivity {

    /* renamed from: r0 */
    public static final /* synthetic */ int f42216r0 = 0;

    /* renamed from: U */
    public LatLonE6 f42217U;

    /* renamed from: X */
    public LatLonE6 f42218X;

    /* renamed from: Y */
    public MarkerZoomStyle f42219Y;

    /* renamed from: Z */
    public SparseArray<MarkerZoomStyle> f42220Z;

    /* renamed from: l0 */
    public MapFragment f42221l0;

    /* renamed from: m0 */
    public AddressFragment f42222m0;

    /* renamed from: n0 */
    public Button f42223n0;

    /* renamed from: o0 */
    public Object f42224o0;

    /* renamed from: p0 */
    public final C16192a f42225p0 = new C16192a();

    /* renamed from: q0 */
    public final C16193b f42226q0 = new C16193b();

    /* renamed from: com.moovit.location.ChooseLocationActivity$a */
    public class C16192a implements MapFragment.C16237r {
        public C16192a() {
        }

        /* renamed from: a */
        public final void mo21406a() {
            ChooseLocationActivity chooseLocationActivity = ChooseLocationActivity.this;
            int i = ChooseLocationActivity.f42216r0;
            chooseLocationActivity.mo48514y2();
        }
    }

    /* renamed from: com.moovit.location.ChooseLocationActivity$b */
    public class C16193b extends MapFragment.C16236q {

        /* renamed from: a */
        public boolean f42228a;

        /* renamed from: b */
        public boolean f42229b;

        public C16193b() {
        }

        /* renamed from: c */
        public final void mo48515c(int i) {
            boolean a = MapFragment.C16236q.m41429a(i, 1);
            boolean b = MapFragment.C16236q.m41430b(i);
            if (b && a) {
                this.f42228a = true;
            } else if (b) {
            } else {
                if (this.f42228a || this.f42229b) {
                    ChooseLocationActivity chooseLocationActivity = ChooseLocationActivity.this;
                    LatLonE6 L2 = chooseLocationActivity.f42221l0.mo48615L2();
                    AddressFragment addressFragment = chooseLocationActivity.f42222m0;
                    addressFragment.f42188q = L2;
                    addressFragment.mo48497m2();
                    chooseLocationActivity.f42223n0.setEnabled(true);
                    this.f42228a = false;
                    this.f42229b = false;
                }
            }
        }
    }

    /* renamed from: Y1 */
    public final void mo44516Y1(Location location) {
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        this.f42221l0.mo48635f3(this.f42226q0);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C19742t.choose_location_layout);
        Intent intent = getIntent();
        LatLonE6 latLonE6 = (LatLonE6) intent.getParcelableExtra("extra_entity_location_on_map");
        this.f42218X = latLonE6;
        if (latLonE6 != null) {
            this.f42219Y = (MarkerZoomStyle) intent.getParcelableExtra("extra_entity_marker_zoom_style");
            this.f42220Z = intent.getExtras().getSparseParcelableArray("extra_entity_markers_zoom_style");
            if (bundle == null) {
                this.f42217U = this.f42218X;
            } else {
                this.f42218X = (LatLonE6) bundle.getParcelable("extra_entity_location_on_map");
                this.f42219Y = (MarkerZoomStyle) bundle.getParcelable("extra_entity_marker_zoom_style");
                this.f42220Z = bundle.getSparseParcelableArray("extra_entity_markers_zoom_style");
            }
            MapFragment mapFragment = (MapFragment) getSupportFragmentManager().mo3983z(C19740r.map_fragment);
            this.f42221l0 = mapFragment;
            C20061g gVar = this.f37295D;
            C20061g gVar2 = mapFragment.f40829j;
            mapFragment.f40829j = gVar;
            mapFragment.mo46791d2(gVar2, gVar);
            this.f42221l0.mo48656t2(this.f42225p0);
            MapFragment mapFragment2 = this.f42221l0;
            MapFragment.MapFollowMode mapFollowMode = MapFragment.MapFollowMode.NONE;
            mapFragment2.mo48641l3(mapFollowMode, false);
            this.f42221l0.mo48640k3(mapFollowMode);
            new C16277g(this, this.f42221l0, C19742t.choose_location_map_center, BitmapDescriptorFactory.HUE_RED).mo48762a();
            AddressFragment addressFragment = (AddressFragment) getSupportFragmentManager().mo3983z(C19740r.address_fragment);
            this.f42222m0 = addressFragment;
            addressFragment.f42188q = this.f42217U;
            addressFragment.mo48497m2();
            Button button = (Button) findViewById(C19740r.done);
            this.f42223n0 = button;
            button.setOnClickListener(new C17543e(this));
            findViewById(C19740r.use_user_location).setOnClickListener(new C17542d(this));
            mo48514y2();
            return;
        }
        throw new IllegalStateException("edit stop pathway can not initiated without am editable transit stop pathway");
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        this.f42221l0.mo48654s2(this.f42226q0);
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("extra_entity_location_on_map", this.f42217U);
        bundle.putParcelable("extra_entity_marker_zoom_style", this.f42219Y);
        bundle.putSparseParcelableArray("extra_entity_markers_zoom_style", this.f42220Z);
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareRealTimeAccuracyFrequentUpdates();
    }

    /* renamed from: y2 */
    public final void mo48514y2() {
        if (this.f42221l0.mo48624U2()) {
            MarkerZoomStyle markerZoomStyle = this.f42219Y;
            boolean z = false;
            if (markerZoomStyle != null) {
                Object obj = this.f42224o0;
                if (obj == null) {
                    z = true;
                }
                if (z) {
                    if (obj != null) {
                        this.f42221l0.mo48636g3(obj);
                        this.f42224o0 = null;
                    }
                    this.f42219Y = markerZoomStyle;
                    this.f42224o0 = this.f42221l0.mo48646o2(this.f42217U, (Object) null, markerZoomStyle);
                }
            } else {
                SparseArray<MarkerZoomStyle> sparseArray = this.f42220Z;
                Object obj2 = this.f42224o0;
                if (obj2 == null) {
                    z = true;
                }
                if (z) {
                    if (obj2 != null) {
                        this.f42221l0.mo48636g3(obj2);
                        this.f42224o0 = null;
                    }
                    this.f42220Z = sparseArray;
                    if (sparseArray != null) {
                        MapFragment mapFragment = this.f42221l0;
                        LatLonE6 latLonE6 = this.f42217U;
                        mapFragment.getClass();
                        this.f42224o0 = mapFragment.mo48648p2(latLonE6, (Object) null, C18699e.m45697a(sparseArray));
                    }
                }
            }
            LatLonE6 latLonE62 = this.f42222m0.f42188q;
            if (latLonE62 != null) {
                this.f42221l0.mo48664z2(latLonE62, 19.5f);
            }
        }
    }
}
