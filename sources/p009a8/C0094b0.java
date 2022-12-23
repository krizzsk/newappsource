package p009a8;

import android.os.Handler;
import com.facebook.GraphRequest;
import com.facebook.internal.C2400g0;

/* renamed from: a8.b0 */
public final class C0094b0 {

    /* renamed from: a */
    public final Handler f276a;

    /* renamed from: b */
    public final GraphRequest f277b;

    /* renamed from: c */
    public final long f278c = C0115o.f338h.get();

    /* renamed from: d */
    public long f279d;

    /* renamed from: e */
    public long f280e;

    /* renamed from: f */
    public long f281f;

    public C0094b0(Handler handler, GraphRequest graphRequest) {
        this.f276a = handler;
        this.f277b = graphRequest;
        C0115o oVar = C0115o.f331a;
        C2400g0.m6342g();
    }

    /* renamed from: a */
    public final void mo201a() {
        Boolean bool;
        long j = this.f279d;
        if (j > this.f280e) {
            GraphRequest.C2280b bVar = this.f277b.f8434g;
            long j2 = this.f281f;
            if (j2 > 0 && (bVar instanceof GraphRequest.C2284f)) {
                Handler handler = this.f276a;
                if (handler == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(handler.post(new C0092a0(bVar, j, j2)));
                }
                if (bool == null) {
                    ((GraphRequest.C2284f) bVar).mo11917a();
                }
                this.f280e = this.f279d;
            }
        }
    }
}
