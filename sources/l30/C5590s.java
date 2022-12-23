package l30;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moovit.map.MapFragment;
import com.moovit.micromobility.MicroMobilityRideDetailsActivity;

/* renamed from: l30.s */
public final /* synthetic */ class C5590s implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ View f18318b;

    /* renamed from: c */
    public final /* synthetic */ View f18319c;

    /* renamed from: d */
    public final /* synthetic */ MapFragment f18320d;

    public /* synthetic */ C5590s(View view, View view2, MapFragment mapFragment) {
        this.f18318b = view;
        this.f18319c = view2;
        this.f18320d = mapFragment;
    }

    public final void onGlobalLayout() {
        View view = this.f18318b;
        View view2 = this.f18319c;
        MapFragment mapFragment = this.f18320d;
        int i = MicroMobilityRideDetailsActivity.f14839Y;
        int round = Math.round(((float) view.getHeight()) * 0.7f);
        BottomSheetBehavior.m34710e(view2).setPeekHeight(round);
        mapFragment.mo48645n3(0, 0, 0, round);
    }
}
