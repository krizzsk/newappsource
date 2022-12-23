package p637lq;

import android.content.Context;
import android.content.Intent;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.linedetail.p416ui.SelectFavoriteLineStopsActivity;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import java.util.Collections;
import java.util.List;

/* renamed from: lq.a */
public class C18250a extends C18251b<LineDetailActivity> {
    public C18250a() {
        super(LineDetailActivity.class);
    }

    /* renamed from: A2 */
    public final Intent mo50665A2(boolean z) {
        List<TransitStop> list;
        List<TransitStop> list2;
        int i;
        C15101a aVar = ((LineDetailActivity) this.f40822c).f38730Y;
        ServerId serverId = null;
        if (!(aVar == null || aVar.f38816F == null)) {
            if (aVar.mo45466t2()) {
                list = Collections.emptyList();
            } else {
                list = aVar.mo45462p2().f44545o;
            }
            if (!C13717b.m34258e(list)) {
                Context requireContext = requireContext();
                TransitLine transitLine = aVar.f38816F;
                if (aVar.mo45466t2()) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = aVar.mo45462p2().f44545o;
                }
                if (!aVar.mo45466t2()) {
                    serverId = aVar.mo45462p2().f44547q;
                }
                if (aVar.mo45466t2()) {
                    i = 0;
                } else {
                    i = aVar.mo45462p2().f44552v;
                }
                int i2 = SelectFavoriteLineStopsActivity.f38796p0;
                Intent intent = new Intent(requireContext, SelectFavoriteLineStopsActivity.class);
                C21100e.m49373x(transitLine, "line");
                intent.putExtra("extra_transit_line", transitLine);
                C21100e.m49373x(list2, "stops");
                intent.putParcelableArrayListExtra("extra_transit_stops", C13717b.m34264k(list2));
                intent.putExtra("extra_nearest_stop", serverId);
                intent.putExtra("extra_selected_stop_position", i);
                intent.putExtra("extra_show_line_added_to_favorites_indication", z);
                return intent;
            }
        }
        return null;
    }

    /* renamed from: B2 */
    public final ServerId mo50666B2() {
        return ((LineDetailActivity) this.f40822c).f38729X;
    }
}
