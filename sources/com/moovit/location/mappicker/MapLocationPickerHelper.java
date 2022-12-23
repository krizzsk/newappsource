package com.moovit.location.mappicker;

import android.content.Context;
import androidx.lifecycle.C1006f;
import androidx.lifecycle.C1033p;
import b00.C13556a;
import ce0.C21100e;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.C16277g;
import com.moovit.map.MapFragment;
import com.moovit.transit.LocationDescriptor;
import j20.C17706c;
import j20.C17707d;
import j20.C17708e;
import java.util.concurrent.ExecutorService;
import p376ax.C13540b;
import p543hq.C17474b;
import p824tp.C19728f;
import p824tp.C19746x;
import p977zz.C20975x0;

public final class MapLocationPickerHelper implements C1006f {

    /* renamed from: b */
    public final Context f42290b;

    /* renamed from: c */
    public final MapFragment f42291c;

    /* renamed from: d */
    public final C16277g f42292d;

    /* renamed from: e */
    public final C16213d f42293e = new C16213d();

    /* renamed from: f */
    public C16211b f42294f = null;

    /* renamed from: g */
    public C16212c f42295g;

    /* renamed from: h */
    public LatLonE6 f42296h = null;

    /* renamed from: i */
    public boolean f42297i = false;

    /* renamed from: com.moovit.location.mappicker.MapLocationPickerHelper$a */
    public static class C16210a implements MapFragment.C16237r {

        /* renamed from: a */
        public final MapFragment f42298a;

        /* renamed from: b */
        public final LocationDescriptor f42299b;

        public C16210a(MapFragment mapFragment, LocationDescriptor locationDescriptor) {
            C21100e.m49373x(mapFragment, "mapFragment");
            this.f42298a = mapFragment;
            this.f42299b = locationDescriptor;
        }

        /* renamed from: a */
        public final void mo21406a() {
            if (LocationDescriptor.LocationType.CURRENT.equals(this.f42299b.f23647b)) {
                this.f42298a.mo48641l3(MapFragment.MapFollowMode.LOCATION, false);
            } else if (this.f42299b.mo24310d() != null) {
                this.f42298a.mo48663x2(this.f42299b.mo24310d());
            }
        }
    }

    /* renamed from: com.moovit.location.mappicker.MapLocationPickerHelper$b */
    public class C16211b implements OnCompleteListener<C17707d>, C13556a {

        /* renamed from: b */
        public final LocationDescriptor f42300b;

        /* renamed from: c */
        public boolean f42301c = false;

        public C16211b(LocationDescriptor locationDescriptor) {
            this.f42300b = locationDescriptor;
        }

        public final boolean cancel(boolean z) {
            this.f42301c = true;
            return true;
        }

        public final void onComplete(Task<C17707d> task) {
            if (!this.f42301c && !MapLocationPickerHelper.this.f42297i) {
                if (!task.isSuccessful() || task.getResult() == null) {
                    if (LocationDescriptor.SourceType.TAP_ON_MAP.equals(this.f42300b.f23648c)) {
                        this.f42300b.f23651f = MapLocationPickerHelper.this.f42290b.getString(C19746x.map_tapped_location);
                    }
                    MapLocationPickerHelper.m41327a(MapLocationPickerHelper.this, this.f42300b);
                    return;
                }
                C17707d result = task.getResult();
                int i = result.f45452c;
                if (i == 0) {
                    MapLocationPickerHelper.m41327a(MapLocationPickerHelper.this, result.f45450a);
                } else if (i == 1) {
                    LocationDescriptor locationDescriptor = result.f45454e;
                    if (locationDescriptor != null) {
                        MapLocationPickerHelper.m41327a(MapLocationPickerHelper.this, locationDescriptor);
                    } else {
                        MapLocationPickerHelper.m41327a(MapLocationPickerHelper.this, result.f45450a);
                    }
                } else if (i == 2) {
                    LocationDescriptor locationDescriptor2 = result.f45454e;
                    if (locationDescriptor2 != null) {
                        locationDescriptor2.mo24317n(result.f45450a.mo24310d());
                        MapLocationPickerHelper.m41327a(MapLocationPickerHelper.this, result.f45454e);
                        return;
                    }
                    result.f45450a.f23651f = MapLocationPickerHelper.this.f42290b.getString(C19746x.map_tapped_location);
                    MapLocationPickerHelper.m41327a(MapLocationPickerHelper.this, result.f45450a);
                }
            }
        }
    }

    /* renamed from: com.moovit.location.mappicker.MapLocationPickerHelper$c */
    public interface C16212c {
        /* renamed from: r0 */
        void mo40439r0();
    }

    /* renamed from: com.moovit.location.mappicker.MapLocationPickerHelper$d */
    public class C16213d extends MapFragment.C16236q {

        /* renamed from: a */
        public boolean f42303a = false;

        public C16213d() {
        }

        /* renamed from: c */
        public final void mo48515c(int i) {
            if (MapFragment.C16236q.m41429a(i, 1) && !this.f42303a) {
                MapLocationPickerHelper mapLocationPickerHelper = MapLocationPickerHelper.this;
                C16211b bVar = mapLocationPickerHelper.f42294f;
                if (bVar != null) {
                    bVar.f42301c = true;
                    mapLocationPickerHelper.f42294f = null;
                }
                this.f42303a = true;
            }
            if (!MapFragment.C16236q.m41430b(i) && this.f42303a) {
                MapLocationPickerHelper mapLocationPickerHelper2 = MapLocationPickerHelper.this;
                LatLonE6 L2 = mapLocationPickerHelper2.f42291c.mo48615L2();
                LocationDescriptor l = LocationDescriptor.m17771l(L2);
                if (!C20975x0.m49118e(mapLocationPickerHelper2.f42296h, L2)) {
                    mapLocationPickerHelper2.f42296h = L2;
                    C16211b bVar2 = mapLocationPickerHelper2.f42294f;
                    if (bVar2 != null) {
                        bVar2.f42301c = true;
                        mapLocationPickerHelper2.f42294f = null;
                    }
                    MapFragment mapFragment = mapLocationPickerHelper2.f42291c;
                    mapFragment.mo48656t2(new C16210a(mapFragment, l));
                    C16212c cVar = mapLocationPickerHelper2.f42295g;
                    if (cVar != null) {
                        cVar.mo40439r0();
                    }
                    C16211b bVar3 = new C16211b(l);
                    mapLocationPickerHelper2.f42294f = bVar3;
                    ExecutorService executorService = MoovitExecutors.f37327IO;
                    Context context = mapLocationPickerHelper2.f42290b;
                    Tasks.call(executorService, new C17708e(context, C19728f.m47195a(context), l, true)).continueWith(MoovitExecutors.COMPUTATION, new C17706c()).addOnCompleteListener(bVar3);
                }
                this.f42303a = false;
            }
        }
    }

    public MapLocationPickerHelper(MapFragment mapFragment, int i) {
        C21100e.m49373x(mapFragment, "mapFragment");
        this.f42291c = mapFragment;
        Context requireContext = mapFragment.requireContext();
        this.f42290b = requireContext;
        this.f42292d = new C16277g(requireContext, mapFragment, i);
    }

    /* renamed from: a */
    public static void m41327a(MapLocationPickerHelper mapLocationPickerHelper, LocationDescriptor locationDescriptor) {
        C16212c cVar = mapLocationPickerHelper.f42295g;
        if (cVar != null) {
            C13540b bVar = (C13540b) cVar;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.MAP_MOVED);
            aVar.mo49945m(AnalyticsAttributeKey.TYPE, bVar.mo40427u2());
            bVar.mo46797j2(aVar.mo49933a());
            bVar.mo40430x2(locationDescriptor);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo3607e(C1033p pVar) {
    }

    public final void onDestroy(C1033p pVar) {
        this.f42297i = true;
        C16211b bVar = this.f42294f;
        if (bVar != null) {
            bVar.f42301c = true;
            this.f42294f = null;
        }
    }

    public final /* synthetic */ void onPause(C1033p pVar) {
    }

    public final /* synthetic */ void onResume(C1033p pVar) {
    }

    public final void onStart(C1033p pVar) {
        this.f42291c.mo48654s2(this.f42293e);
        this.f42292d.mo48762a();
    }

    public final void onStop(C1033p pVar) {
        this.f42291c.mo48635f3(this.f42293e);
        this.f42292d.mo48763b(true);
    }
}
