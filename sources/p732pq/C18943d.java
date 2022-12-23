package p732pq;

import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;

/* renamed from: pq.d */
public class C18943d extends C18945f<LineDetailActivity> {
    public C18943d() {
        super(LineDetailActivity.class);
    }

    /* renamed from: E2 */
    public final TransitStop mo51464E2() {
        C15101a aVar = ((LineDetailActivity) this.f40822c).f38730Y;
        if (aVar.mo45466t2()) {
            return null;
        }
        return aVar.mo45462p2().f44551u;
    }

    /* renamed from: F2 */
    public final TransitLine mo51465F2() {
        return ((LineDetailActivity) this.f40822c).f38730Y.f38816F;
    }
}
