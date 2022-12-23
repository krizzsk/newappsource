package zb0;

import ac0.C7557a;
import com.cubic.umo.p045ad.types.AKRequestPayload;
import java.util.TimerTask;
import mf0.C24362h;
import yb0.C13304h;
import zb0.C13370d;

/* renamed from: zb0.e */
public final class C13373e extends TimerTask {

    /* renamed from: b */
    public final /* synthetic */ C13370d f33203b;

    /* renamed from: c */
    public final /* synthetic */ String f33204c;

    public C13373e(C13370d dVar, String str) {
        this.f33203b = dVar;
        this.f33204c = str;
    }

    public final void run() {
        this.f33203b.f33199o++;
        C7557a.f23040a.mo6672i("WRAPPER_RETRY: Wrapper Retry Timer EXPIRED. Retrying Wrapper Req...");
        C13370d.C13371a aVar = this.f33203b.f33186b;
        if (aVar != null) {
            String str = this.f33204c;
            C24362h.m61211f(str, "wrapperUrl");
            ((C13304h) aVar).mo40210b(str, (AKRequestPayload) null, true);
        }
    }
}
