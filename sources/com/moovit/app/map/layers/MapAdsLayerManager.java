package com.moovit.app.map.layers;

import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.C1006f;
import androidx.lifecycle.C1033p;
import b00.C13556a;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.map.MapFragment;
import java.util.EnumSet;
import kotlin.Metadata;
import mf0.C24362h;
import p130j2.C5367a;
import p593ju.C17925a;
import p862vf.C20118b;
import p873vq.C20196a;
import q00.C19047a;
import q00.C19053d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/map/layers/MapAdsLayerManager;", "", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class MapAdsLayerManager implements C1006f {

    /* renamed from: b */
    public final Context f38907b;

    /* renamed from: c */
    public final MapFragment f38908c;

    /* renamed from: d */
    public final C20196a f38909d = new C20196a();

    /* renamed from: e */
    public final boolean f38910e;

    /* renamed from: f */
    public boolean f38911f;

    /* renamed from: g */
    public final C17925a f38912g;

    /* renamed from: h */
    public final MapAdsLayerManager$mapAdsBroadcastReceiver$1 f38913h;

    public MapAdsLayerManager(MoovitAppActivity moovitAppActivity, C19047a aVar, MapFragment mapFragment) {
        C24362h.m61211f(mapFragment, "mapFragment");
        this.f38907b = moovitAppActivity;
        this.f38908c = mapFragment;
        Object b = aVar.mo51505b(C19053d.f48473l);
        C24362h.m61210e(b, "conf.get(AppSysConfig.HAS_MAP_DIRECT_ADS)");
        this.f38910e = ((Boolean) b).booleanValue();
        this.f38912g = new C17925a(this);
        this.f38913h = new MapAdsLayerManager$mapAdsBroadcastReceiver$1(this);
    }

    /* renamed from: a */
    public final void mo45500a() {
        boolean z;
        if (this.f38908c.mo48624U2()) {
            MobileAdsManager h = MobileAdsManager.m37073h();
            if (!this.f38910e || (h.f37462d && C20118b.m47697e().mo52357d("is_ads_free_version"))) {
                z = false;
            } else {
                z = true;
            }
            if (this.f38911f != z) {
                if (z) {
                    this.f38908c.mo48644n2(this.f38909d);
                } else {
                    MapFragment mapFragment = this.f38908c;
                    MapFragment.C16224f fVar = (MapFragment.C16224f) mapFragment.f42375q0.remove(this.f38909d.mo51345b());
                    if (fVar != null) {
                        if (mapFragment.f40824e) {
                            MapFragment.this.f42377r0.removeCallbacks(fVar);
                            C13556a aVar = fVar.f42402f;
                            if (aVar != null) {
                                aVar.cancel(true);
                            }
                        }
                        if (mapFragment.mo48624U2()) {
                            mapFragment.f42368n.mo48779B(fVar.f42401e);
                            fVar.f42403g.cancel(true);
                            fVar.f42404h.cancel(true);
                            fVar.f42405i = SystemClock.elapsedRealtime();
                            fVar.f42401e = null;
                        }
                    }
                }
                this.f38911f = z;
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo3607e(C1033p pVar) {
    }

    public final /* synthetic */ void onDestroy(C1033p pVar) {
    }

    public final /* synthetic */ void onPause(C1033p pVar) {
    }

    public final /* synthetic */ void onResume(C1033p pVar) {
    }

    public final void onStart(C1033p pVar) {
        this.f38908c.mo48656t2(this.f38912g);
        MobileAdsManager.m37075o(this.f38907b, this.f38913h);
    }

    public final void onStop(C1033p pVar) {
        MapFragment mapFragment = this.f38908c;
        mapFragment.f42338C.remove(this.f38912g);
        Context context = this.f38907b;
        MapAdsLayerManager$mapAdsBroadcastReceiver$1 mapAdsLayerManager$mapAdsBroadcastReceiver$1 = this.f38913h;
        EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
        C5367a.m13473a(context).mo21148d(mapAdsLayerManager$mapAdsBroadcastReceiver$1);
    }
}
