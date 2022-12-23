package p808sx;

import android.view.View;
import android.view.ViewTreeObserver;
import com.moovit.app.tripplanner.C15584c;
import com.moovit.app.tripplanner.TripPlannerActivity;
import com.moovit.map.MapFragment;
import com.tranzmate.R;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p977zz.C20943i;

/* renamed from: sx.c */
public final class C19567c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ TripPlannerActivity f49741b;

    public C19567c(TripPlannerActivity tripPlannerActivity) {
        this.f49741b = tripPlannerActivity;
    }

    public final void onGlobalLayout() {
        View view;
        int height;
        MapFragment mapFragment;
        C15584c cVar = (C15584c) this.f49741b.getSupportFragmentManager().mo3923A("trip_plan_search_button_fragment_tag");
        if (cVar != null && (view = cVar.getView()) != null && (height = view.getHeight()) != 0 && (mapFragment = (MapFragment) this.f49741b.getSupportFragmentManager().mo3923A("trip_plan_map_fragment_tag")) != null) {
            ViewTreeObserver viewTreeObserver = this.f49741b.findViewById(R.id.fragments_container).getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                if (C20943i.m49051d(16)) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
            mapFragment.mo48645n3(0, height, 0, 0);
            if (mapFragment.mo48624U2()) {
                TripPlannerActivity tripPlannerActivity = this.f49741b;
                tripPlannerActivity.mo46522L2(tripPlannerActivity.mo46519D2().mo46532s2());
            }
            float dimension = this.f49741b.getResources().getDimension(R.dimen.elevation_4);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6342i.m15102s(view, dimension);
        }
    }
}
