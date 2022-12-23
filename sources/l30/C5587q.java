package l30;

import aa0.C7540l;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import b00.C13556a;
import c70.C13752e;
import c70.C13756i;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.micromobility.MicroMobilityRideActivity;
import com.moovit.micromobility.MicroMobilityRideDetailsActivity;
import com.moovit.micromobility.ride.C4193a;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.util.CurrencyAmount;
import p543hq.C17474b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import t30.C6577q;
import t30.C6578r;

/* renamed from: l30.q */
public abstract class C5587q extends C7540l {

    /* renamed from: d */
    public final C5588a f18310d = new C5588a();

    /* renamed from: e */
    public Context f18311e = null;

    /* renamed from: f */
    public MicroMobilityRide f18312f = null;

    /* renamed from: g */
    public C4193a f18313g = null;

    /* renamed from: h */
    public C13556a f18314h = null;

    /* renamed from: l30.q$a */
    public class C5588a extends C20438i<C6577q, C6578r> {
        public C5588a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C6577q qVar = (C6577q) cVar;
            C5587q qVar2 = C5587q.this;
            qVar2.f18314h = null;
            if (qVar2.f18311e != null && qVar2.f18312f != null) {
                qVar2.mo23802c();
            }
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            ServerId serverId = ((C6577q) cVar).f20393w;
            C4193a aVar = ((C6578r) gVar).f20394m;
            C5587q qVar = C5587q.this;
            MicroMobilityRide microMobilityRide = qVar.f18312f;
            if (microMobilityRide != null && microMobilityRide.f14986d.equals(serverId)) {
                qVar.f18313g = aVar;
                MicroMobilityRideActivity.C4128c cVar2 = (MicroMobilityRideActivity.C4128c) qVar;
                MicroMobilityRideActivity microMobilityRideActivity = MicroMobilityRideActivity.this;
                MenuItem menuItem = microMobilityRideActivity.f14829m0;
                if (menuItem != null) {
                    menuItem.setVisible(aVar.f15006a);
                }
                CurrencyAmount currencyAmount = aVar.f15008c;
                View findViewById = microMobilityRideActivity.findViewById(C5597z.divider_bottom);
                ListItemView listItemView = (ListItemView) microMobilityRideActivity.findViewById(C5597z.price);
                if (currencyAmount != null) {
                    listItemView.setTitle(C5570c0.total_label);
                    listItemView.setAccessoryText((CharSequence) currencyAmount.toString());
                    UiUtils.m40238F(0, listItemView, findViewById);
                } else {
                    UiUtils.m40238F(8, listItemView, findViewById);
                }
                MicroMobilityRide.Status status = aVar.f15007b;
                if (!status.equals(qVar.f18312f.f14991i.f15007b)) {
                    C5577i.m13786a().mo21404f();
                    MicroMobilityRide microMobilityRide2 = qVar.f18312f;
                    MicroMobilityRideActivity microMobilityRideActivity2 = MicroMobilityRideActivity.this;
                    int i = MicroMobilityRideActivity.f14823n0;
                    microMobilityRideActivity2.getClass();
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.STATUS_CHANGED);
                    aVar2.mo49939g(AnalyticsAttributeKey.STATUS, C25541a.m63893x(status));
                    microMobilityRideActivity2.mo44545v2(aVar2.mo49933a());
                    int i2 = MicroMobilityRideActivity.C4129d.f14833a[status.ordinal()];
                    if (i2 == 5 || i2 == 6 || i2 == 7) {
                        ServerId serverId2 = microMobilityRide2.f14986d;
                        int i3 = MicroMobilityRideDetailsActivity.f14839Y;
                        Intent intent = new Intent(microMobilityRideActivity2, MicroMobilityRideDetailsActivity.class);
                        intent.putExtra("rideId", serverId2);
                        microMobilityRideActivity2.startActivity(intent);
                        microMobilityRideActivity2.finish();
                    }
                }
            }
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C6577q qVar = (C6577q) cVar;
            MicroMobilityRide microMobilityRide = C5587q.this.f18312f;
            return true;
        }
    }

    public C5587q() {
        super(20000);
    }

    /* renamed from: a */
    public final void mo19433a() {
        MicroMobilityRide microMobilityRide;
        Context context = this.f18311e;
        if (context != null && (microMobilityRide = this.f18312f) != null) {
            ServerId serverId = microMobilityRide.f14986d;
            C13756i iVar = (C13756i) context.getSystemService("request_manager");
            C13752e b = iVar.mo40679b();
            if (b != null) {
                C6577q qVar = new C6577q(serverId, b);
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C6577q.class, sb, "_");
                sb.append(qVar.f20393w);
                String sb2 = sb.toString();
                RequestOptions c = iVar.mo40680c();
                c.f42909f = true;
                this.f18314h = iVar.mo40684g(sb2, qVar, c, this.f18310d);
                return;
            }
            mo23802c();
        }
    }

    /* renamed from: b */
    public final void mo21414b() {
        C13556a aVar = this.f18314h;
        if (aVar != null) {
            aVar.cancel(true);
            this.f18314h = null;
        }
    }
}
