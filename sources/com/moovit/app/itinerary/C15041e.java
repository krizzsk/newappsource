package com.moovit.app.itinerary;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.moovit.map.MapFragment;
import com.moovit.map.collections.category.types.BicycleStationMetadata;
import p504fz.C17132d;

/* renamed from: com.moovit.app.itinerary.e */
public final /* synthetic */ class C15041e implements MapFragment.C16238s {
    /* renamed from: L0 */
    public final void mo23897L0(MapFragment mapFragment, Object obj) {
        if (obj instanceof BicycleStationMetadata) {
            BicycleStationMetadata bicycleStationMetadata = (BicycleStationMetadata) obj;
            FragmentManager parentFragmentManager = mapFragment.getParentFragmentManager();
            if (bicycleStationMetadata.f42480i) {
                int i = C17132d.f44361h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("metadata", bicycleStationMetadata);
                bundle.putBoolean("showNavigationButton", false);
                bundle.putBoolean("showMapSettingHint", false);
                C17132d dVar = new C17132d();
                dVar.setArguments(bundle);
                dVar.show(parentFragmentManager, "bicycle_station_dialog");
            }
        }
    }
}
