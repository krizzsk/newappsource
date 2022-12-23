package p660mq;

import com.moovit.app.linedetail.p416ui.LineTripPatternActivity;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lmq/d;", "Lmq/c;", "Lcom/moovit/app/linedetail/ui/LineTripPatternActivity;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
/* renamed from: mq.d */
public final class C18420d extends C18419c<LineTripPatternActivity> {
    public C18420d() {
        super(LineTripPatternActivity.class);
    }

    /* renamed from: E2 */
    public final ServerId mo50872E2() {
        TransitLine B2;
        LineTripPatternActivity lineTripPatternActivity = (LineTripPatternActivity) this.f40822c;
        if (lineTripPatternActivity == null || (B2 = lineTripPatternActivity.mo45436B2()) == null) {
            return null;
        }
        return B2.f23687c;
    }

    /* renamed from: F2 */
    public final ServerId mo50873F2() {
        TransitStop C2;
        LineTripPatternActivity lineTripPatternActivity = (LineTripPatternActivity) this.f40822c;
        if (lineTripPatternActivity == null || (C2 = lineTripPatternActivity.mo45437C2()) == null) {
            return null;
        }
        return C2.f23730b;
    }
}
