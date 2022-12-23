package p876vt;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import c00.C13723g;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitType;
import com.tranzmate.R;
import java.util.List;
import p589jq.C17909a;
import p589jq.C17910b;
import p977zz.C20964s0;

/* renamed from: vt.a */
public final class C20230a {
    /* renamed from: a */
    public static View m47798a(LinearLayout linearLayout, WaitToTransitLineLeg waitToTransitLineLeg, List list) {
        TransitType.VehicleType vehicleType;
        C17909a aVar = (C17909a) linearLayout.getContext().getApplicationContext().getSystemService("accessibility_configuration");
        if (aVar == null || !aVar.mo50463a().f37353c) {
            return null;
        }
        String str = aVar.f45955f;
        if (C20964s0.m49090h(str)) {
            return null;
        }
        TransitType d = C7843b.m17877d(C7843b.m17876c(waitToTransitLineLeg.f42135f.get()));
        if (d != null) {
            vehicleType = d.f23760e;
        } else {
            vehicleType = null;
        }
        if (!TransitType.VehicleType.TRAIN.equals(vehicleType) || !C13723g.m34280a(list, new C17910b(3))) {
            return null;
        }
        View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.train_assistance_action_view, linearLayout, false);
        inflate.setTag(R.id.view_tag_param1, str);
        return inflate;
    }
}
