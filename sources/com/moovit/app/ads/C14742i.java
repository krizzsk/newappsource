package com.moovit.app.ads;

import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import c00.C13717b;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.MoovitApplication;
import com.moovit.app.map.DocklessVehicleBottomSheetDialog;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.LocationDescriptor;
import java.util.List;
import l30.C5585p;

/* renamed from: com.moovit.app.ads.i */
public final /* synthetic */ class C14742i implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f37522b;

    /* renamed from: c */
    public final /* synthetic */ Object f37523c;

    /* renamed from: d */
    public final /* synthetic */ Object f37524d;

    /* renamed from: e */
    public final /* synthetic */ Object f37525e;

    public /* synthetic */ C14742i(int i, Object obj, Object obj2, Object obj3) {
        this.f37522b = i;
        this.f37524d = obj;
        this.f37525e = obj2;
        this.f37523c = obj3;
    }

    public /* synthetic */ C14742i(DocklessVehicleBottomSheetDialog docklessVehicleBottomSheetDialog, View view, View view2) {
        this.f37522b = 1;
        this.f37524d = docklessVehicleBottomSheetDialog;
        this.f37523c = view;
        this.f37525e = view2;
    }

    public final void onSuccess(Object obj) {
        int i;
        switch (this.f37522b) {
            case 0:
                C14744k kVar = (C14744k) this.f37524d;
                AdSource adSource = C14744k.f37529p;
                kVar.getClass();
                kVar.mo44748n2((MoovitApplication) ((Application) this.f37525e), (ViewGroup) ((View) this.f37523c), (String) obj);
                return;
            case 1:
                DocklessVehicleBottomSheetDialog docklessVehicleBottomSheetDialog = (DocklessVehicleBottomSheetDialog) this.f37524d;
                View view = (View) this.f37523c;
                View view2 = (View) this.f37525e;
                int i2 = DocklessVehicleBottomSheetDialog.f38877w;
                docklessVehicleBottomSheetDialog.getClass();
                if (C13717b.m34258e((List) obj)) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
                docklessVehicleBottomSheetDialog.mo45494j2(view2);
                return;
            default:
                C5585p pVar = (C5585p) this.f37524d;
                LocationDescriptor locationDescriptor = (LocationDescriptor) this.f37525e;
                pVar.f18304c.mo48646o2(locationDescriptor, locationDescriptor, (MarkerZoomStyle) obj);
                pVar.mo21412e((LatLonE6) this.f37523c, locationDescriptor.mo24310d());
                return;
        }
    }
}
