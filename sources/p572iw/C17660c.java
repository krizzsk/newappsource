package p572iw;

import android.view.View;
import android.widget.AdapterView;
import com.moovit.app.suggestedroutes.TripPlanOptionsActivity;
import com.moovit.tripplanner.TripPlannerSortType;
import v90.C13187a;

/* renamed from: iw.c */
public final /* synthetic */ class C17660c implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C13187a f45386b;

    /* renamed from: c */
    public final /* synthetic */ TripPlanOptionsActivity.C15372a f45387c;

    public /* synthetic */ C17660c(C13187a aVar, TripPlanOptionsActivity.C15372a aVar2) {
        this.f45386b = aVar;
        this.f45387c = aVar2;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C13187a aVar = this.f45386b;
        TripPlanOptionsActivity.C15372a aVar2 = this.f45387c;
        int i2 = TripPlanOptionsActivity.f39809o0;
        aVar.f32745f.mo49544c((TripPlannerSortType) aVar2.getItem(i));
    }
}
