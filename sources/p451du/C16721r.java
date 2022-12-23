package p451du;

import c00.C13722f;
import com.moovit.app.linedetail.p416ui.LineTripPatternActivity;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.transit.TransitType;
import com.moovit.util.time.Time;
import java.util.List;
import p664mu.C18437c;
import p664mu.C18457m;
import p977zz.C20975x0;
import s60.C19438d;
import y20.C20693b;

/* renamed from: du.r */
public final /* synthetic */ class C16721r implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f43556b;

    /* renamed from: c */
    public final /* synthetic */ Object f43557c;

    public /* synthetic */ C16721r(Object obj, int i) {
        this.f43556b = i;
        this.f43557c = obj;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f43556b) {
            case 0:
                LineTripPatternActivity lineTripPatternActivity = (LineTripPatternActivity) this.f43557c;
                int i = LineTripPatternActivity.f38762E0;
                lineTripPatternActivity.getClass();
                return ((DbEntityRef) obj).getServerId().equals(lineTripPatternActivity.f38777r0);
            case 1:
                return C20975x0.m49118e(((Time) obj).f23904e, ((Time) this.f43557c).f23904e);
            case 2:
                C18437c cVar = C18437c.f47002b;
                return C20975x0.m49118e(((C18437c.C18438a) obj).f47005b, (ServerId) this.f43557c);
            case 3:
                int i2 = C18457m.f47044i;
                return ((List) this.f43557c).contains(((TransitType) obj).f23760e);
            case 4:
                return !((C20693b) this.f43557c).f52266b.contains((String) obj);
            default:
                return ((C19438d) this.f43557c).f49444p.contains(((PaymentProfile) obj).f42828b);
        }
    }
}
