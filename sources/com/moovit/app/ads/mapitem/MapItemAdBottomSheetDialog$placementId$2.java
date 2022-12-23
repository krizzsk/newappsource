package com.moovit.app.ads.mapitem;

import com.moovit.app.ads.MapAdSource;
import com.moovit.app.ads.MobileAdsManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p862vf.C20118b;

@Metadata(mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class MapItemAdBottomSheetDialog$placementId$2 extends Lambda implements C24225a<String> {

    /* renamed from: f */
    public static final MapItemAdBottomSheetDialog$placementId$2 f37553f = new MapItemAdBottomSheetDialog$placementId$2();

    public MapItemAdBottomSheetDialog$placementId$2() {
        super(0);
    }

    public final Object invoke() {
        MobileAdsManager.m37073h();
        String f = C20118b.m47697e().mo52358f(MapAdSource.STATIONS.adUnitIdKey);
        if ("na".equals(f)) {
            return "";
        }
        return f;
    }
}
