package com.moovit.location;

import android.animation.Animator;
import android.content.Intent;
import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.ResourceImage;
import com.moovit.location.LocationAlertFragment;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import i20.C17540b;
import i20.C17541c;
import j00.C17682a;
import java.util.TreeMap;
import o20.C18699e;
import p543hq.C17474b;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;
import p858uz.C20061g;

public final class ChooseFixedLocationActivity extends MoovitActivity implements LocationAlertFragment.C16197b {

    /* renamed from: A0 */
    public static final /* synthetic */ int f42193A0 = 0;

    /* renamed from: U */
    public final TreeMap f42194U = new TreeMap();

    /* renamed from: X */
    public Location f42195X;

    /* renamed from: Y */
    public LatLonE6 f42196Y;

    /* renamed from: Z */
    public MarkerZoomStyle f42197Z;

    /* renamed from: l0 */
    public MarkerZoomStyle f42198l0;

    /* renamed from: m0 */
    public MarkerZoomStyle f42199m0 = new MarkerZoomStyle(new ResourceImage(C19739q.ic_user_marker_halo, new String[0]));

    /* renamed from: n0 */
    public SparseArray<MarkerZoomStyle> f42200n0;

    /* renamed from: o0 */
    public SparseArray<MarkerZoomStyle> f42201o0;

    /* renamed from: p0 */
    public MapFragment f42202p0;

    /* renamed from: q0 */
    public Button f42203q0;

    /* renamed from: r0 */
    public Object f42204r0;

    /* renamed from: s0 */
    public Object f42205s0;

    /* renamed from: t0 */
    public Object f42206t0;

    /* renamed from: u0 */
    public boolean f42207u0;

    /* renamed from: v0 */
    public ViewGroup f42208v0;

    /* renamed from: w0 */
    public boolean f42209w0;

    /* renamed from: x0 */
    public LocationAlertFragment f42210x0;

    /* renamed from: y0 */
    public final C16189a f42211y0 = new C16189a();

    /* renamed from: z0 */
    public final C16190b f42212z0 = new C16190b();

    /* renamed from: com.moovit.location.ChooseFixedLocationActivity$a */
    public class C16189a extends C17682a {
        public C16189a() {
        }

        public final void onAnimationEnd(Animator animator) {
            ChooseFixedLocationActivity.this.f42208v0.setVisibility(4);
        }
    }

    /* renamed from: com.moovit.location.ChooseFixedLocationActivity$b */
    public class C16190b implements MapFragment.C16237r {
        public C16190b() {
        }

        /* renamed from: a */
        public final void mo21406a() {
            ChooseFixedLocationActivity chooseFixedLocationActivity = ChooseFixedLocationActivity.this;
            int i = ChooseFixedLocationActivity.f42193A0;
            chooseFixedLocationActivity.mo48513z2();
        }
    }

    /* renamed from: com.moovit.location.ChooseFixedLocationActivity$c */
    public static /* synthetic */ class C16191c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42215a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.location.LocationAlertFragment$AlertStatus[] r0 = com.moovit.location.LocationAlertFragment.AlertStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42215a = r0
                com.moovit.location.LocationAlertFragment$AlertStatus r1 = com.moovit.location.LocationAlertFragment.AlertStatus.MISSING_LOCATION_PERMISSIONS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42215a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.location.LocationAlertFragment$AlertStatus r1 = com.moovit.location.LocationAlertFragment.AlertStatus.DISABLED_LOCATION_PROVIDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42215a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.location.LocationAlertFragment$AlertStatus r1 = com.moovit.location.LocationAlertFragment.AlertStatus.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42215a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.location.LocationAlertFragment$AlertStatus r1 = com.moovit.location.LocationAlertFragment.AlertStatus.LOCATION_ACCURACY_INSUFFICIENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f42215a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.location.LocationAlertFragment$AlertStatus r1 = com.moovit.location.LocationAlertFragment.AlertStatus.TOO_FAR_FROM_TRACKED_LOCATION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.location.ChooseFixedLocationActivity.C16191c.<clinit>():void");
        }
    }

    /* renamed from: O0 */
    public final void mo48511O0(LocationAlertFragment.AlertStatus alertStatus) {
        this.f42203q0.setEnabled(alertStatus.equals(LocationAlertFragment.AlertStatus.ALL_OK));
        if (this.f42209w0) {
            mo48512y2();
        }
    }

    /* renamed from: Y1 */
    public final void mo44516Y1(Location location) {
        this.f42195X = location;
        this.f42207u0 = true;
        mo48513z2();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C19742t.choose_fixed_location_layout);
        Intent intent = getIntent();
        LatLonE6 latLonE6 = (LatLonE6) intent.getParcelableExtra("extra_entity_location_on_map");
        this.f42196Y = latLonE6;
        if (latLonE6 != null) {
            MarkerZoomStyle markerZoomStyle = (MarkerZoomStyle) intent.getParcelableExtra("extra_entity_current_marker_zoom_style");
            this.f42198l0 = markerZoomStyle;
            if (markerZoomStyle != null) {
                this.f42197Z = new MarkerZoomStyle(RecyclerView.C1119a0.FLAG_IGNORE, this.f42198l0.f42448b);
            }
            SparseArray<MarkerZoomStyle> sparseParcelableArray = intent.getExtras().getSparseParcelableArray("extra_entity_current_markers_zoom_style");
            this.f42201o0 = sparseParcelableArray;
            if (sparseParcelableArray != null) {
                this.f42200n0 = new SparseArray<>(this.f42201o0.size());
                for (int i = 0; i < this.f42201o0.size(); i++) {
                    int keyAt = this.f42201o0.keyAt(i);
                    this.f42200n0.append(keyAt, new MarkerZoomStyle(RecyclerView.C1119a0.FLAG_IGNORE, this.f42201o0.get(keyAt).f42448b));
                }
            }
            this.f42194U.put(Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(19.5f));
            this.f42194U.put(Float.valueOf(50.0f), Float.valueOf(19.0f));
            this.f42194U.put(Float.valueOf(100.0f), Float.valueOf(18.5f));
            this.f42194U.put(Float.valueOf(200.0f), Float.valueOf(17.5f));
            TreeMap treeMap = this.f42194U;
            Float valueOf = Float.valueOf(300.0f);
            Float valueOf2 = Float.valueOf(17.0f);
            treeMap.put(valueOf, valueOf2);
            this.f42194U.put(Float.valueOf(500.0f), valueOf2);
            this.f42195X = mo44542u1();
            MapFragment mapFragment = (MapFragment) getSupportFragmentManager().mo3983z(C19740r.map_fragment);
            this.f42202p0 = mapFragment;
            C20061g gVar = this.f37295D;
            C20061g gVar2 = mapFragment.f40829j;
            mapFragment.f40829j = gVar;
            mapFragment.mo46791d2(gVar2, gVar);
            this.f42202p0.mo48656t2(this.f42212z0);
            MapFragment mapFragment2 = this.f42202p0;
            MapFragment.MapFollowMode mapFollowMode = MapFragment.MapFollowMode.NONE;
            mapFragment2.mo48641l3(mapFollowMode, false);
            this.f42202p0.mo48640k3(mapFollowMode);
            this.f42202p0.mo48651q3(false);
            MapFragment mapFragment3 = this.f42202p0;
            if (mapFragment3.f42373p0) {
                mapFragment3.f42373p0 = false;
                mapFragment3.mo48659u3();
            }
            this.f42202p0.mo48649p3(false, true);
            Button button = (Button) findViewById(C19740r.done);
            this.f42203q0 = button;
            button.setOnClickListener(new C17540b(this));
            int i2 = C19740r.location_alert_fragment_container;
            this.f42208v0 = (ViewGroup) findViewById(i2);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            LocationAlertFragment locationAlertFragment = (LocationAlertFragment) supportFragmentManager.mo3983z(i2);
            this.f42210x0 = locationAlertFragment;
            if (locationAlertFragment == null) {
                LatLonE6 latLonE62 = this.f42196Y;
                int i3 = LocationAlertFragment.f42235x;
                Bundle bundle2 = new Bundle();
                C21100e.m49373x(latLonE62, "tracked location is required");
                bundle2.putParcelable("trackedLocation", latLonE62);
                LocationAlertFragment locationAlertFragment2 = new LocationAlertFragment();
                locationAlertFragment2.setArguments(bundle2);
                this.f42210x0 = locationAlertFragment2;
                C0909a aVar = new C0909a(supportFragmentManager);
                aVar.mo4041e(i2, this.f42210x0, (String) null, 1);
                aVar.mo4040d();
            }
            mo48513z2();
            return;
        }
        throw new IllegalStateException("edit stop pathway can not initiated without an entity location");
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        this.f42208v0.postDelayed(new C17541c(this), (long) 1000);
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareRealTimeAccuracyFrequentUpdates();
    }

    /* renamed from: y2 */
    public final void mo48512y2() {
        int visibility = this.f42208v0.getVisibility();
        if (!this.f42203q0.isEnabled()) {
            String str = null;
            if (visibility == 4) {
                ViewGroup viewGroup = this.f42208v0;
                viewGroup.setTranslationY((float) viewGroup.getHeight());
                this.f42208v0.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener((Animator.AnimatorListener) null);
                this.f42208v0.setVisibility(0);
            }
            int i = C16191c.f42215a[this.f42210x0.f42241s.ordinal()];
            if (i == 1) {
                str = "location_permissions_off";
            } else if (i == 2 || i == 3) {
                str = "location_services_off";
            } else if (i == 4) {
                str = "location_low_gps";
            } else if (i == 5) {
                str = "location_too_far_from_station";
            }
            if (str != null) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.ALERT_MESSAGE_BAR_SHOWN);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
                mo44545v2(aVar.mo49933a());
            }
        } else if (visibility == 0) {
            this.f42208v0.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            this.f42208v0.animate().translationY((float) this.f42208v0.getHeight()).setListener(this.f42211y0);
        }
    }

    /* renamed from: z2 */
    public final void mo48513z2() {
        LatLonE6 latLonE6;
        Float f;
        boolean z;
        Location location;
        boolean z2;
        Location location2;
        if (this.f42202p0.mo48624U2()) {
            MarkerZoomStyle markerZoomStyle = this.f42197Z;
            if (markerZoomStyle != null) {
                MarkerZoomStyle markerZoomStyle2 = this.f42198l0;
                if (this.f42204r0 == null || this.f42207u0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f42207u0 = false;
                if (z2) {
                    Object obj = this.f42205s0;
                    if (obj != null) {
                        this.f42202p0.mo48636g3(obj);
                        this.f42205s0 = null;
                    }
                    Object obj2 = this.f42206t0;
                    if (obj2 != null) {
                        this.f42202p0.mo48636g3(obj2);
                        this.f42206t0 = null;
                    }
                    this.f42197Z = markerZoomStyle;
                    this.f42198l0 = markerZoomStyle2;
                    if (this.f42204r0 == null) {
                        this.f42204r0 = this.f42202p0.mo48646o2(this.f42196Y, (Object) null, markerZoomStyle);
                    }
                    if (!(markerZoomStyle2 == null || (location2 = this.f42195X) == null)) {
                        this.f42206t0 = this.f42202p0.mo48646o2(LatLonE6.m40177j(location2), (Object) null, this.f42199m0);
                        this.f42205s0 = this.f42202p0.mo48646o2(LatLonE6.m40177j(this.f42195X), (Object) null, markerZoomStyle2);
                    }
                }
            } else {
                SparseArray<MarkerZoomStyle> sparseArray = this.f42200n0;
                SparseArray<MarkerZoomStyle> sparseArray2 = this.f42201o0;
                if (this.f42204r0 == null || this.f42207u0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f42207u0 = false;
                if (z) {
                    Object obj3 = this.f42205s0;
                    if (obj3 != null) {
                        this.f42202p0.mo48636g3(obj3);
                        this.f42205s0 = null;
                    }
                    Object obj4 = this.f42206t0;
                    if (obj4 != null) {
                        this.f42202p0.mo48636g3(obj4);
                        this.f42206t0 = null;
                    }
                    this.f42200n0 = sparseArray;
                    this.f42201o0 = sparseArray2;
                    if (sparseArray != null && this.f42204r0 == null) {
                        MapFragment mapFragment = this.f42202p0;
                        LatLonE6 latLonE62 = this.f42196Y;
                        mapFragment.getClass();
                        this.f42204r0 = mapFragment.mo48648p2(latLonE62, (Object) null, C18699e.m45697a(sparseArray));
                    }
                    if (!(sparseArray2 == null || (location = this.f42195X) == null)) {
                        this.f42206t0 = this.f42202p0.mo48646o2(LatLonE6.m40177j(location), (Object) null, this.f42199m0);
                        MapFragment mapFragment2 = this.f42202p0;
                        LatLonE6 j = LatLonE6.m40177j(this.f42195X);
                        mapFragment2.getClass();
                        this.f42205s0 = mapFragment2.mo48648p2(j, (Object) null, C18699e.m45697a(sparseArray2));
                    }
                }
            }
            Location location3 = this.f42195X;
            if (location3 != null) {
                latLonE6 = LatLonE6.m40177j(location3);
            } else {
                latLonE6 = this.f42196Y;
            }
            if (latLonE6.equals(this.f42196Y)) {
                this.f42202p0.mo48664z2(this.f42196Y, 19.0f);
                return;
            }
            LatLonE6 latLonE63 = this.f42196Y;
            latLonE63.getClass();
            float c = LatLonE6.m40174c(latLonE63, latLonE6);
            if (c > ((Float) this.f42194U.lastKey()).floatValue()) {
                f = null;
            } else {
                f = (Float) this.f42194U.floorEntry(Float.valueOf(c)).getValue();
            }
            if (f == null) {
                Rect N2 = this.f42202p0.mo48617N2((Rect) null);
                int height = this.f42208v0.getHeight();
                if (height != 0) {
                    N2.bottom += height;
                }
                this.f42202p0.mo48605A2(N2, BoxE6.m40164c(this.f42196Y, latLonE6), true);
                return;
            }
            this.f42202p0.mo48664z2(latLonE6, f.floatValue());
        }
    }
}
