package com.moovit.location.mappicker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import b00.C13556a;
import c00.C13717b;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.view.list.ImageOrTextSubtitleListItemView;
import com.moovit.location.C16202a;
import com.moovit.location.mappicker.MarkerProvider;
import com.moovit.map.C16277g;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.map.items.MapItem;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import g30.C4776h;
import i30.C5267c;
import i30.C5269e;
import j20.C17706c;
import j20.C17707d;
import j20.C17708e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import k20.C17998b;
import o20.C18699e;
import p054d0.C4268a1;
import p241s0.C6302b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p304x.C7073m;
import p501fw.C17102a;
import p543hq.C17474b;
import p808sx.C19566b;
import p824tp.C19728f;
import p824tp.C19735m;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p858uz.C20061g;

public final class MapLocationPickerActivity extends MoovitActivity implements MapFragment.C16238s, MapFragment.C16232m, MapFragment.C16233n {

    /* renamed from: q0 */
    public static final /* synthetic */ int f42272q0 = 0;

    /* renamed from: U */
    public final C6302b f42273U = new C6302b();

    /* renamed from: X */
    public MarkerProvider.C16214a f42274X = null;

    /* renamed from: Y */
    public ImageOrTextSubtitleListItemView f42275Y;

    /* renamed from: Z */
    public C16277g f42276Z;

    /* renamed from: l0 */
    public C16208c f42277l0 = null;

    /* renamed from: m0 */
    public C13556a f42278m0 = null;

    /* renamed from: n0 */
    public C16217a f42279n0 = null;

    /* renamed from: o0 */
    public C16207b f42280o0 = null;

    /* renamed from: p0 */
    public final C17474b.C17475a f42281p0;

    /* renamed from: com.moovit.location.mappicker.MapLocationPickerActivity$a */
    public static class C16206a implements MapFragment.C16237r {

        /* renamed from: a */
        public final MapFragment f42282a;

        /* renamed from: b */
        public final LocationDescriptor f42283b;

        public C16206a(MapFragment mapFragment, LocationDescriptor locationDescriptor) {
            C21100e.m49373x(mapFragment, "mapFragment");
            this.f42282a = mapFragment;
            C21100e.m49373x(locationDescriptor, "descriptor");
            this.f42283b = locationDescriptor;
        }

        /* renamed from: a */
        public final void mo21406a() {
            if (LocationDescriptor.LocationType.CURRENT.equals(this.f42283b.f23647b)) {
                MapFragment mapFragment = this.f42282a;
                MapFragment.MapFollowMode mapFollowMode = mapFragment.f42356O;
                MapFragment.MapFollowMode mapFollowMode2 = MapFragment.MapFollowMode.LOCATION;
                if (mapFollowMode != mapFollowMode2) {
                    mapFragment.mo48641l3(mapFollowMode2, false);
                } else {
                    mapFragment.mo48664z2(this.f42283b.mo24310d(), this.f42282a.mo48616M2());
                }
            } else {
                this.f42282a.mo48663x2(this.f42283b.mo24310d());
            }
        }
    }

    /* renamed from: com.moovit.location.mappicker.MapLocationPickerActivity$b */
    public class C16207b implements OnCompleteListener<C17707d>, C13556a {

        /* renamed from: b */
        public final LocationDescriptor f42284b;

        /* renamed from: c */
        public boolean f42285c = false;

        public C16207b(LocationDescriptor locationDescriptor) {
            C21100e.m49373x(locationDescriptor, "descriptor");
            this.f42284b = locationDescriptor;
        }

        public final boolean cancel(boolean z) {
            this.f42285c = true;
            return true;
        }

        public final void onComplete(Task<C17707d> task) {
            if (!this.f42285c) {
                MapLocationPickerActivity mapLocationPickerActivity = MapLocationPickerActivity.this;
                if (!mapLocationPickerActivity.f37292A && !mapLocationPickerActivity.isFinishing()) {
                    if (!task.isSuccessful() || task.getResult() == null) {
                        if (LocationDescriptor.SourceType.TAP_ON_MAP.equals(this.f42284b.f23648c)) {
                            this.f42284b.f23651f = MapLocationPickerActivity.this.getString(C19746x.map_tapped_location);
                        }
                        MapLocationPickerActivity.m41310y2(MapLocationPickerActivity.this, this.f42284b);
                        return;
                    }
                    C17707d result = task.getResult();
                    int i = result.f45452c;
                    if (i == 0) {
                        MapLocationPickerActivity.m41310y2(MapLocationPickerActivity.this, result.f45450a);
                    } else if (i == 1) {
                        LocationDescriptor locationDescriptor = result.f45454e;
                        if (locationDescriptor != null) {
                            MapLocationPickerActivity.m41310y2(MapLocationPickerActivity.this, locationDescriptor);
                        } else {
                            MapLocationPickerActivity.m41310y2(MapLocationPickerActivity.this, result.f45450a);
                        }
                    } else if (i == 2) {
                        LocationDescriptor locationDescriptor2 = result.f45454e;
                        if (locationDescriptor2 != null) {
                            locationDescriptor2.mo24317n(result.f45450a.mo24310d());
                            MapLocationPickerActivity.m41310y2(MapLocationPickerActivity.this, result.f45454e);
                            return;
                        }
                        result.f45450a.f23651f = MapLocationPickerActivity.this.getString(C19746x.map_tapped_location);
                        MapLocationPickerActivity.m41310y2(MapLocationPickerActivity.this, result.f45450a);
                    }
                }
            }
        }
    }

    /* renamed from: com.moovit.location.mappicker.MapLocationPickerActivity$c */
    public static class C16208c implements Runnable {

        /* renamed from: b */
        public final View f42287b;

        public C16208c(View view) {
            C21100e.m49373x(view, "hint");
            this.f42287b = view;
        }

        public final void run() {
            View view = this.f42287b;
            view.setTranslationY((float) (-view.getMeasuredHeight()));
            C6382p0 a = C6333d0.m15013a(this.f42287b);
            a.mo22499i(BitmapDescriptorFactory.HUE_RED);
            a.mo22501k(new C7073m(this, 12));
        }
    }

    /* renamed from: com.moovit.location.mappicker.MapLocationPickerActivity$d */
    public class C16209d extends MapFragment.C16236q {

        /* renamed from: a */
        public boolean f42288a = false;

        public C16209d() {
        }

        /* renamed from: c */
        public final void mo48515c(int i) {
            if (MapFragment.C16236q.m41429a(i, 1) && !this.f42288a) {
                MapLocationPickerActivity mapLocationPickerActivity = MapLocationPickerActivity.this;
                int i2 = MapLocationPickerActivity.f42272q0;
                C16207b bVar = mapLocationPickerActivity.f42280o0;
                if (bVar != null) {
                    bVar.f42285c = true;
                    mapLocationPickerActivity.f42280o0 = null;
                }
                mapLocationPickerActivity.mo48580z2();
                mapLocationPickerActivity.mo48578F2((MarkerProvider.C16214a) null);
                this.f42288a = true;
            }
            if (!MapFragment.C16236q.m41430b(i) && this.f42288a) {
                MapLocationPickerActivity mapLocationPickerActivity2 = MapLocationPickerActivity.this;
                int i3 = MapLocationPickerActivity.f42272q0;
                mapLocationPickerActivity2.getClass();
                mapLocationPickerActivity2.mo44545v2(new C17474b(AnalyticsEventKey.MAP_MOVED));
                LocationDescriptor l = LocationDescriptor.m17771l(mapLocationPickerActivity2.mo48574B2().mo48615L2());
                mapLocationPickerActivity2.f42281p0.mo49939g(AnalyticsAttributeKey.ADDRESS_TYPE, "address");
                mapLocationPickerActivity2.mo48575C2(l);
                this.f42288a = false;
            }
        }
    }

    public MapLocationPickerActivity() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "ok_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.ADDRESS_TYPE, AdError.UNDEFINED_DOMAIN);
        this.f42281p0 = aVar;
    }

    /* renamed from: A2 */
    public static Intent m41309A2(Context context, List list) {
        Intent intent = new Intent(context, MapLocationPickerActivity.class);
        intent.putExtra("show_transit_stop_map_items", true);
        if (list != null) {
            intent.putExtra("marker_providers", C13717b.m34264k(list));
        }
        return intent;
    }

    /* renamed from: y2 */
    public static void m41310y2(MapLocationPickerActivity mapLocationPickerActivity, LocationDescriptor locationDescriptor) {
        mapLocationPickerActivity.f42275Y.setTag(locationDescriptor);
        mapLocationPickerActivity.f42275Y.setIcon(locationDescriptor.f23655j);
        mapLocationPickerActivity.f42275Y.setTitleThemeTextAppearance(C19735m.textAppearanceBodyStrong);
        mapLocationPickerActivity.f42275Y.setTitleThemeTextColor(C19735m.colorOnSurface);
        mapLocationPickerActivity.f42275Y.setTitle((CharSequence) locationDescriptor.f23651f);
        mapLocationPickerActivity.f42275Y.setSubtitleItems(locationDescriptor.f23652g);
    }

    /* renamed from: B2 */
    public final MapFragment mo48574B2() {
        return (MapFragment) mo44529n1(C19740r.map_fragment);
    }

    /* renamed from: C2 */
    public final void mo48575C2(LocationDescriptor locationDescriptor) {
        C16207b bVar = this.f42280o0;
        if (bVar != null) {
            bVar.f42285c = true;
            this.f42280o0 = null;
        }
        mo48577E2(locationDescriptor);
        C16207b bVar2 = new C16207b(locationDescriptor);
        this.f42280o0 = bVar2;
        ExecutorService executorService = MoovitExecutors.f37327IO;
        HashSet hashSet = C19728f.f50164e;
        Tasks.call(executorService, new C17708e(this, (C19728f) getSystemService("metro_context"), locationDescriptor, true)).continueWith(MoovitExecutors.COMPUTATION, new C17706c()).addOnCompleteListener((Activity) this, bVar2);
    }

    /* renamed from: D2 */
    public final void mo48576D2(MarkerProvider.C16214a aVar, boolean z) {
        SparseArray<MarkerZoomStyle> sparseArray;
        MapFragment B2 = mo48574B2();
        Object remove = this.f42273U.remove(aVar);
        if (remove != null) {
            B2.mo48636g3(remove);
        }
        LocationDescriptor locationDescriptor = aVar.f42305a;
        if (z) {
            sparseArray = aVar.f42307c;
        } else {
            sparseArray = aVar.f42306b;
        }
        B2.getClass();
        this.f42273U.put(aVar, B2.mo48648p2(locationDescriptor, aVar, C18699e.m45697a(sparseArray)));
    }

    /* renamed from: E2 */
    public final void mo48577E2(LocationDescriptor locationDescriptor) {
        this.f42275Y.setTag(locationDescriptor);
        this.f42275Y.setIcon(C19739q.ic_poi_location_24_on_surface_emphasis_high);
        this.f42275Y.setTitleThemeTextAppearance(C19735m.textAppearanceBody);
        this.f42275Y.setTitleThemeTextColor(C19735m.colorOnSurface);
        this.f42275Y.setTitle(C19746x.locating);
        this.f42275Y.setSubtitle((CharSequence) null);
        MapFragment B2 = mo48574B2();
        B2.mo48656t2(new C16206a(B2, locationDescriptor));
    }

    /* renamed from: F2 */
    public final void mo48578F2(MarkerProvider.C16214a aVar) {
        MarkerProvider.C16214a aVar2 = this.f42274X;
        if (aVar2 != null) {
            mo48576D2(aVar2, false);
            this.f42274X = null;
        }
        if (aVar != null) {
            mo48576D2(aVar, true);
            this.f42274X = aVar;
        }
    }

    /* renamed from: L0 */
    public final void mo23897L0(MapFragment mapFragment, Object obj) {
        MarkerProvider.C16214a aVar = (MarkerProvider.C16214a) obj;
        if (aVar != null) {
            mo48580z2();
            mo48574B2().mo48641l3(MapFragment.MapFollowMode.NONE, false);
            aVar.f42305a.getClass();
            this.f42281p0.mo49939g(AnalyticsAttributeKey.ADDRESS_TYPE, aVar.f42308d);
            mo48578F2(aVar);
            mo48575C2(aVar.f42305a);
        }
    }

    /* renamed from: T1 */
    public final void mo19422T1() {
        super.mo19422T1();
        C16207b bVar = this.f42280o0;
        if (bVar != null) {
            bVar.f42285c = true;
            this.f42280o0 = null;
        }
        C16217a aVar = this.f42279n0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f42279n0 = null;
        }
    }

    /* renamed from: d */
    public final void mo48579d(MapItem mapItem) {
        if (mapItem.f42549b == MapItem.Type.STOP) {
            mo48580z2();
            mo48574B2().mo48641l3(MapFragment.MapFollowMode.NONE, false);
            LocationDescriptor l = LocationDescriptor.m17771l(mapItem.f42551d);
            mo48577E2(l);
            C13556a aVar = this.f42278m0;
            if (aVar != null) {
                aVar.cancel(true);
                this.f42278m0 = null;
            }
            ServerId serverId = mapItem.f42550c;
            C13752e x1 = mo44548x1();
            C4776h hVar = C19728f.m47195a(x1.f33852a).f50165a;
            C5269e d = C16759e.m42348d(hVar, "metroInfo");
            d.mo21066a(MetroEntityType.TRANSIT_STOP, serverId);
            C5267c cVar = new C5267c(x1, "MapLocationPickerActivity", hVar, d);
            this.f42278m0 = mo44528l2(cVar.mo21061O(), cVar, new C17998b(this, mapItem, l));
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C19742t.map_location_picker_activity);
        this.f42275Y = (ImageOrTextSubtitleListItemView) findViewById(C19740r.location);
        findViewById(C19740r.done).setOnClickListener(new C17102a(this, 13));
        MapFragment B2 = mo48574B2();
        B2.mo48654s2(new C16209d());
        B2.f42342E.add(this);
        B2.mo48658u2(this);
        B2.f42350I.add(this);
        if (getIntent().getBooleanExtra("show_transit_stop_map_items", false)) {
            List asList = Arrays.asList(new MapItem.Type[]{MapItem.Type.STOP});
            B2.f42354M.clear();
            B2.f42354M.addAll(asList);
            B2.mo48633d3();
        }
        this.f42276Z = new C16277g(this, B2, C19742t.map_location_picker_pin);
        C16217a aVar = this.f42279n0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f42279n0 = null;
        }
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("marker_providers");
        if (parcelableArrayListExtra != null) {
            C16217a aVar2 = new C16217a(this, mo44548x1(), parcelableArrayListExtra);
            this.f42279n0 = aVar2;
            aVar2.execute(new Void[0]);
        }
        C16208c cVar = new C16208c(findViewById(C19740r.hint));
        this.f42277l0 = cVar;
        cVar.f42287b.postDelayed(cVar, 7000);
        LatLonE6 j = LatLonE6.m40177j(mo44542u1());
        if (j != null) {
            LocationDescriptor m = LocationDescriptor.m17772m(this);
            m.mo24317n(j);
            this.f42281p0.mo49939g(AnalyticsAttributeKey.ADDRESS_TYPE, "current_location");
            mo48575C2(m);
            return;
        }
        HashSet hashSet = C19728f.f50164e;
        LatLonE6 latLonE6 = ((C19728f) getSystemService("metro_context")).f50165a.f16139n;
        MapFragment B22 = mo48574B2();
        B22.mo48656t2(new C19566b(this, B22, latLonE6, 1));
    }

    /* renamed from: h */
    public final void mo23898h(MapFragment.MapFollowMode mapFollowMode) {
        LatLonE6 j;
        if (MapFragment.MapFollowMode.LOCATION.equals(mapFollowMode) && (j = LatLonE6.m40177j(mo44542u1())) != null) {
            LocationDescriptor m = LocationDescriptor.m17772m(this);
            m.mo24317n(j);
            this.f42281p0.mo49939g(AnalyticsAttributeKey.ADDRESS_TYPE, "current_location");
            mo48575C2(m);
        }
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        this.f42276Z.mo48762a();
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        this.f42276Z.mo48763b(false);
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareRealTimeAccuracyFrequentUpdates();
    }

    /* renamed from: z2 */
    public final void mo48580z2() {
        C16208c cVar = this.f42277l0;
        if (cVar != null) {
            cVar.f42287b.removeCallbacks(cVar);
            C6382p0 a = C6333d0.m15013a(cVar.f42287b);
            a.mo22499i((float) (-cVar.f42287b.getMeasuredHeight()));
            a.mo22500j(new C4268a1(cVar, 15));
            this.f42277l0 = null;
        }
    }
}
