package p593ju;

import android.content.Context;
import android.widget.PopupWindow;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.map.layers.MapLayersManager;
import p001a0.C0017h;
import p269u2.C6677a;
import p543hq.C17474b;

/* renamed from: ju.c */
public final /* synthetic */ class C17927c implements PopupWindow.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ MapLayersManager f45990b;

    /* renamed from: c */
    public final /* synthetic */ Context f45991c;

    public /* synthetic */ C17927c(MapLayersManager mapLayersManager, Context context) {
        this.f45990b = mapLayersManager;
        this.f45991c = context;
    }

    public final void onDismiss() {
        MapLayersManager mapLayersManager = this.f45990b;
        Context context = this.f45991c;
        C6677a aVar = mapLayersManager.f38918e;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.POPUP;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "map_layers_filter");
        aVar2.mo49942j(AnalyticsAttributeKey.AVAILABLE_MAP_SETTINGS, C0017h.m46C(mapLayersManager.f38923j & mapLayersManager.f38922i, false));
        aVar2.mo49942j(AnalyticsAttributeKey.SET_MAP_SETTINGS, C0017h.m46C(mapLayersManager.f38923j & mapLayersManager.f38922i & mapLayersManager.f38919f.mo50470a(), false));
        aVar.mo22850h(analyticsFlowKey, aVar2.mo49933a());
        mapLayersManager.f38918e.mo22847b(context, analyticsFlowKey, false);
    }
}
