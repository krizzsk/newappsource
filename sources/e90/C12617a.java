package e90;

import androidx.recyclerview.widget.RecyclerView;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStep;
import java.util.Collections;
import java.util.Map;
import p977zz.C20975x0;
import z70.C13337m;

/* renamed from: e90.a */
public final /* synthetic */ class C12617a implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ C12618b f31179b;

    /* renamed from: c */
    public final /* synthetic */ String f31180c;

    public /* synthetic */ C12617a(C12618b bVar, String str) {
        this.f31179b = bVar;
        this.f31180c = str;
    }

    public final void onFailure(Exception exc) {
        C12618b bVar = this.f31179b;
        String str = this.f31180c;
        int i = C12618b.f31181w;
        Map<AnalyticsAttributeKey, String> singletonMap = Collections.singletonMap(AnalyticsAttributeKey.TYPE, ((PurchaseStationSelectionStep) bVar.f32728o).f23423e);
        C13337m mVar = bVar.f31183q;
        if (C20975x0.m49118e(mVar.f33107a, str)) {
            mVar.f33108b = -2;
            mVar.f33109c = singletonMap;
        }
        bVar.f31186t.setVisibility(4);
        RecyclerView recyclerView = bVar.f31187u;
        recyclerView.mo4627l0(C13751d.m34340a(exc, recyclerView.getContext()));
    }
}
