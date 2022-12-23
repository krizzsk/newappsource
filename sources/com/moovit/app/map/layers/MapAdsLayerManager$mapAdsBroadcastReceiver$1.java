package com.moovit.app.map.layers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"com/moovit/app/map/layers/MapAdsLayerManager$mapAdsBroadcastReceiver$1", "Landroid/content/BroadcastReceiver;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class MapAdsLayerManager$mapAdsBroadcastReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ MapAdsLayerManager f38914a;

    public MapAdsLayerManager$mapAdsBroadcastReceiver$1(MapAdsLayerManager mapAdsLayerManager) {
        this.f38914a = mapAdsLayerManager;
    }

    public final void onReceive(Context context, Intent intent) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(intent, "intent");
        this.f38914a.mo45500a();
    }
}
