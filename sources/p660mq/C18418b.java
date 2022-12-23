package p660mq;

import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lmq/b;", "Lmq/c;", "Lcom/moovit/app/linedetail/ui/LineDetailActivity;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
/* renamed from: mq.b */
public final class C18418b extends C18419c<LineDetailActivity> {
    public C18418b() {
        super(LineDetailActivity.class);
    }

    /* renamed from: E2 */
    public final ServerId mo50872E2() {
        TransitLine transitLine;
        LineDetailActivity lineDetailActivity = (LineDetailActivity) this.f40822c;
        if (lineDetailActivity == null || (transitLine = lineDetailActivity.f38730Y.f38816F) == null) {
            return null;
        }
        return transitLine.f23687c;
    }

    /* renamed from: F2 */
    public final ServerId mo50873F2() {
        TransitStop transitStop;
        LineDetailActivity lineDetailActivity = (LineDetailActivity) this.f40822c;
        if (lineDetailActivity == null) {
            return null;
        }
        C15101a aVar = lineDetailActivity.f38730Y;
        if (aVar.mo45466t2()) {
            transitStop = null;
        } else {
            transitStop = aVar.mo45462p2().f44551u;
        }
        if (transitStop != null) {
            return transitStop.f23730b;
        }
        return null;
    }
}
