package com.moovit.map.walking;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import b00.C13556a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.MoovitActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageSet;
import com.moovit.location.C16202a;
import com.moovit.map.C16281i;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.DistanceUtils;
import java.util.WeakHashMap;
import o20.C18699e;
import p011aa.C0141e;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20964s0;
import w20.C20274a;
import w20.C20275b;
import w20.C20276c;

public final class MapWalkingDirectionsActivity extends MoovitActivity {

    /* renamed from: p0 */
    public static final /* synthetic */ int f42571p0 = 0;

    /* renamed from: U */
    public final C16291a f42572U = new C16291a();

    /* renamed from: X */
    public final C16292b f42573X = new C16292b();

    /* renamed from: Y */
    public LocationDescriptor f42574Y;

    /* renamed from: Z */
    public LocationDescriptor f42575Z;

    /* renamed from: l0 */
    public ImageSet f42576l0;

    /* renamed from: m0 */
    public MapFragment f42577m0;

    /* renamed from: n0 */
    public Polyline f42578n0 = null;

    /* renamed from: o0 */
    public C13556a f42579o0 = null;

    /* renamed from: com.moovit.map.walking.MapWalkingDirectionsActivity$a */
    public class C16291a implements MapFragment.C16237r {
        public C16291a() {
        }

        /* renamed from: a */
        public final void mo21406a() {
            View view;
            MapFragment mapFragment = MapWalkingDirectionsActivity.this.f42577m0;
            if (mapFragment != null) {
                view = mapFragment.getView();
            } else {
                view = null;
            }
            if (view != null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15059s(view, 4);
            }
            MapWalkingDirectionsActivity.this.mo48828z2();
        }
    }

    /* renamed from: com.moovit.map.walking.MapWalkingDirectionsActivity$b */
    public class C16292b extends C0141e {
        public C16292b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C20275b bVar = (C20275b) cVar;
            MapWalkingDirectionsActivity.this.f42579o0 = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C20275b bVar = (C20275b) cVar;
            MapWalkingDirectionsActivity mapWalkingDirectionsActivity = MapWalkingDirectionsActivity.this;
            mapWalkingDirectionsActivity.f42578n0 = ((C20276c) gVar).f51410m;
            mapWalkingDirectionsActivity.mo48828z2();
        }
    }

    /* renamed from: y2 */
    public static Intent m41577y2(Context context, LocationDescriptor locationDescriptor, Image image) {
        ImageSet imageSet = new ImageSet(image);
        Intent intent = new Intent(context, MapWalkingDirectionsActivity.class);
        intent.putExtra(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (Parcelable) null);
        intent.putExtra("destination", locationDescriptor);
        intent.putExtra("destinationMapImageSet", imageSet);
        return intent;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C19742t.map_walking_directions_activity);
        Intent intent = getIntent();
        LocationDescriptor locationDescriptor = (LocationDescriptor) intent.getParcelableExtra(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f42574Y = locationDescriptor;
        if (locationDescriptor == null) {
            this.f42574Y = LocationDescriptor.m17772m(this);
        }
        this.f42575Z = (LocationDescriptor) intent.getParcelableExtra("destination");
        this.f42576l0 = (ImageSet) intent.getParcelableExtra("destinationMapImageSet");
        setSupportActionBar((Toolbar) findViewById(C19740r.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo791m(true);
        }
        MapFragment mapFragment = (MapFragment) mo44529n1(C19740r.map_fragment);
        this.f42577m0 = mapFragment;
        mapFragment.mo48656t2(this.f42572U);
        this.f42577m0.mo48658u2(new C20274a(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: h2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19426h2() {
        /*
            r8 = this;
            r8.mo24881f2()
            com.moovit.commons.geo.Polyline r0 = r8.f42578n0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001e
            com.moovit.transit.LocationDescriptor r0 = r8.f42574Y
            com.moovit.transit.LocationDescriptor$LocationType r3 = com.moovit.transit.LocationDescriptor.LocationType.CURRENT
            boolean r0 = r0.mo24316j(r3)
            if (r0 != 0) goto L_0x001e
            com.moovit.transit.LocationDescriptor r0 = r8.f42575Z
            boolean r0 = r0.mo24316j(r3)
            if (r0 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r0 = 0
            goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            if (r0 == 0) goto L_0x007f
            java.util.HashSet r0 = p824tp.C19728f.f50164e
            java.lang.String r0 = "metro_context"
            java.lang.Object r0 = r8.getSystemService(r0)
            tp.f r0 = (p824tp.C19728f) r0
            java.util.concurrent.ExecutorService r3 = com.moovit.MoovitExecutors.f37327IO
            j20.e r4 = new j20.e
            com.moovit.transit.LocationDescriptor r5 = r8.f42574Y
            r4.<init>(r8, r0, r5, r2)
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.call(r3, r4)
            java.util.concurrent.ExecutorService r5 = com.moovit.MoovitExecutors.COMPUTATION
            j20.c r6 = new j20.c
            r6.<init>()
            com.google.android.gms.tasks.Task r4 = r4.continueWith(r5, r6)
            ff.m r6 = new ff.m
            r7 = 9
            r6.<init>(r8, r7)
            com.google.android.gms.tasks.Task r4 = r4.addOnSuccessListener((android.app.Activity) r8, r6)
            j20.e r6 = new j20.e
            com.moovit.transit.LocationDescriptor r7 = r8.f42575Z
            r6.<init>(r8, r0, r7, r2)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.call(r3, r6)
            j20.c r3 = new j20.c
            r3.<init>()
            com.google.android.gms.tasks.Task r0 = r0.continueWith(r5, r3)
            yq.a r3 = new yq.a
            r5 = 4
            r3.<init>(r8, r5)
            com.google.android.gms.tasks.Task r0 = r0.addOnSuccessListener((android.app.Activity) r8, r3)
            r3 = 2
            com.google.android.gms.tasks.Task[] r3 = new com.google.android.gms.tasks.Task[r3]
            r3[r1] = r4
            r3[r2] = r0
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.whenAll((com.google.android.gms.tasks.Task<?>[]) r3)
            sq.h r1 = new sq.h
            r1.<init>(r8, r5)
            r0.addOnCompleteListener((android.app.Activity) r8, r1)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.map.walking.MapWalkingDirectionsActivity.mo19426h2():void");
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        mo24880c2();
        C13556a aVar = this.f42579o0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f42579o0 = null;
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: z2 */
    public final void mo48828z2() {
        String str;
        MapFragment mapFragment = this.f42577m0;
        if (mapFragment != null && mapFragment.mo48624U2()) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                LocationDescriptor locationDescriptor = this.f42575Z;
                Polyline polyline = this.f42578n0;
                String string = getString(C19746x.string_list_delimiter_dot);
                if (polyline != null) {
                    str = DistanceUtils.m17934a((int) DistanceUtils.m17936c(this, polyline.mo24339Z0()), this);
                } else {
                    str = null;
                }
                supportActionBar.mo799u(C20964s0.m49099q(string, str, locationDescriptor.mo24313f()));
            }
            LatLonE6 j = LatLonE6.m40177j(mo44542u1());
            if (j != null) {
                LocationDescriptor locationDescriptor2 = this.f42574Y;
                LocationDescriptor.LocationType locationType = LocationDescriptor.LocationType.CURRENT;
                if (locationDescriptor2.mo24316j(locationType)) {
                    this.f42574Y.mo24317n(j);
                }
                if (this.f42575Z.mo24316j(locationType)) {
                    this.f42575Z.mo24317n(j);
                }
            }
            this.f42577m0.mo48609E2();
            Polyline polyline2 = this.f42578n0;
            if (polyline2 != null) {
                this.f42577m0.mo48662w2(polyline2, C16281i.m41521q(this));
            }
            if (this.f42575Z.mo24310d() != null) {
                SparseArray<MarkerZoomStyle> c = MarkerZoomStyle.m41440c(this.f42576l0);
                C16281i.m41507c(c);
                MapFragment mapFragment2 = this.f42577m0;
                LocationDescriptor locationDescriptor3 = this.f42575Z;
                mapFragment2.getClass();
                mapFragment2.mo48648p2(locationDescriptor3, locationDescriptor3, C18699e.m45697a(c));
            }
            MapFragment mapFragment3 = this.f42577m0;
            Polyline polyline3 = this.f42578n0;
            if (polyline3 != null) {
                mapFragment3.mo48606B2((Rect) null, polyline3.getBounds(), true);
            } else {
                mapFragment3.mo48664z2(this.f42575Z.mo24310d(), 17.5f);
            }
        }
    }
}
