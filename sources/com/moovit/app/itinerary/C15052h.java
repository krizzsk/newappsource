package com.moovit.app.itinerary;

import a00.C13382a;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.moovit.app.map.layers.MapLayersManager;
import com.moovit.map.MapFragment;
import com.moovit.map.MapOverlaysLayout;
import com.tranzmate.R;
import p039c7.C1800c;

/* renamed from: com.moovit.app.itinerary.h */
public final /* synthetic */ class C15052h implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ int f38590a;

    /* renamed from: b */
    public final /* synthetic */ Object f38591b;

    public /* synthetic */ C15052h(Object obj, int i) {
        this.f38590a = i;
        this.f38591b = obj;
    }

    /* renamed from: a */
    public final void mo21406a() {
        switch (this.f38590a) {
            case 0:
                int i = ItineraryStepsBaseActivity.f38497x0;
                C13382a.m33673i(((MapFragment) this.f38591b).getView());
                return;
            default:
                MapLayersManager mapLayersManager = (MapLayersManager) this.f38591b;
                MapOverlaysLayout mapOverlaysLayout = mapLayersManager.f38917d.f42386w;
                if (mapLayersManager.f38925l == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(mapOverlaysLayout.getContext()).inflate(R.layout.map_layers_settings_button, mapOverlaysLayout, false);
                    mapLayersManager.f38925l = imageView;
                    imageView.setOnClickListener(new C1800c(mapLayersManager, 14));
                }
                if (mapLayersManager.f38925l.getParent() == null) {
                    mapOverlaysLayout.addView(mapLayersManager.f38925l);
                }
                mapLayersManager.mo45503d();
                mapLayersManager.mo45502c();
                return;
        }
    }
}
