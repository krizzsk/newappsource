package p572iw;

import android.view.View;
import android.widget.AdapterView;
import com.moovit.app.suggestedroutes.TripPlanOptionsActivity;
import com.moovit.tripplanner.TripPlannerRouteType;
import java.util.List;
import v90.C13187a;

/* renamed from: iw.b */
public final /* synthetic */ class C17659b implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C13187a f45384b;

    /* renamed from: c */
    public final /* synthetic */ List f45385c;

    public /* synthetic */ C17659b(C13187a aVar, List list) {
        this.f45384b = aVar;
        this.f45385c = list;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C13187a aVar = this.f45384b;
        List list = this.f45385c;
        int i2 = TripPlanOptionsActivity.f39809o0;
        aVar.f32741b.mo49544c((TripPlannerRouteType) list.get(i));
    }
}
