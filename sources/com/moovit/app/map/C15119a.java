package com.moovit.app.map;

import android.view.View;
import com.google.android.exoplayer2.p052ui.C4054t;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.DistanceUtils;

/* renamed from: com.moovit.app.map.a */
public final /* synthetic */ class C15119a implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ DocklessVehicleBottomSheetDialog f38897b;

    /* renamed from: c */
    public final /* synthetic */ ListItemView f38898c;

    /* renamed from: d */
    public final /* synthetic */ View f38899d;

    /* renamed from: e */
    public final /* synthetic */ int f38900e;

    /* renamed from: f */
    public final /* synthetic */ LatLonE6 f38901f;

    public /* synthetic */ C15119a(DocklessVehicleBottomSheetDialog docklessVehicleBottomSheetDialog, ListItemView listItemView, View view, int i, LatLonE6 latLonE6) {
        this.f38897b = docklessVehicleBottomSheetDialog;
        this.f38898c = listItemView;
        this.f38899d = view;
        this.f38900e = i;
        this.f38901f = latLonE6;
    }

    public final void onSuccess(Object obj) {
        DocklessVehicleBottomSheetDialog docklessVehicleBottomSheetDialog = this.f38897b;
        ListItemView listItemView = this.f38898c;
        View view = this.f38899d;
        int i = this.f38900e;
        LatLonE6 latLonE6 = this.f38901f;
        String str = (String) obj;
        int i2 = DocklessVehicleBottomSheetDialog.f38877w;
        docklessVehicleBottomSheetDialog.getClass();
        if (str != null) {
            listItemView.setText((CharSequence) str);
            listItemView.setAccessoryText((CharSequence) DistanceUtils.m17934a((int) DistanceUtils.m17936c(view.getContext(), (float) i), view.getContext()));
            listItemView.setOnClickListener(new C4054t(6, docklessVehicleBottomSheetDialog, latLonE6));
            listItemView.setVisibility(0);
        }
    }
}
