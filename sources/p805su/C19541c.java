package p805su;

import android.view.View;
import android.view.ViewTreeObserver;
import com.moovit.app.tod.bottomsheet.TodRideBottomSheet;
import com.moovit.map.MapFragment;
import o00.C18669f;

/* renamed from: su.c */
public final /* synthetic */ class C19541c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ int f49650b = 1;

    /* renamed from: c */
    public final /* synthetic */ View f49651c;

    /* renamed from: d */
    public final /* synthetic */ Object f49652d;

    /* renamed from: e */
    public final /* synthetic */ Object f49653e;

    public /* synthetic */ C19541c(TodRideBottomSheet todRideBottomSheet, TodRideBottomSheet.C15476c cVar, View view) {
        this.f49652d = todRideBottomSheet;
        this.f49653e = cVar;
        this.f49651c = view;
    }

    public /* synthetic */ C19541c(C19544f fVar, View view, MapFragment mapFragment) {
        this.f49652d = fVar;
        this.f49651c = view;
        this.f49653e = mapFragment;
    }

    public final void onGlobalLayout() {
        switch (this.f49650b) {
            case 0:
                C19544f fVar = (C19544f) this.f49652d;
                View view = this.f49651c;
                MapFragment mapFragment = (MapFragment) this.f49653e;
                int i = C19544f.f49659s;
                fVar.getClass();
                int height = view.getHeight();
                view.setTranslationY((float) height);
                fVar.f49662p.mo4593g(C18669f.m45651e(height), -1);
                if (mapFragment != null) {
                    mapFragment.mo48645n3(0, 0, 0, fVar.f49662p.getHeight() - fVar.f49662p.getTop());
                    return;
                }
                return;
            default:
                TodRideBottomSheet todRideBottomSheet = (TodRideBottomSheet) this.f49652d;
                View view2 = this.f49651c;
                int i2 = TodRideBottomSheet.f40104N;
                todRideBottomSheet.getClass();
                int peekHeight = ((TodRideBottomSheet.C15476c) this.f49653e).f40117b.getPeekHeight();
                if (peekHeight == -1) {
                    peekHeight = Math.min(todRideBottomSheet.getMeasuredHeight(), view2.getMeasuredHeight());
                }
                todRideBottomSheet.f40106G.setPeekHeight(peekHeight);
                todRideBottomSheet.f40106G.setState(todRideBottomSheet.f40108I);
                todRideBottomSheet.f40106G.setHideable(false);
                MapFragment mapFragment2 = todRideBottomSheet.f40111L;
                if (mapFragment2 != null) {
                    mapFragment2.mo48645n3(0, 0, 0, peekHeight);
                    return;
                }
                return;
        }
    }
}
