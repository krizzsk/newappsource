package gc0;

import ac0.C7557a;
import ce0.C21100e;
import com.bumptech.glide.load.engine.GlideException;
import p043ch.qos.logback.classic.Logger;
import p260t6.C6601f;
import p273u6.C6720j;

/* renamed from: gc0.c */
public final class C12727c implements C6601f<Object> {

    /* renamed from: b */
    public final /* synthetic */ C12724b f31449b;

    public C12727c(C12724b bVar) {
        this.f31449b = bVar;
    }

    /* renamed from: f */
    public final boolean mo22747f(GlideException glideException, Object obj) {
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("VPAID_PLAYER: Loading Image Failed");
        J0.append(this.f31449b.f31446w);
        J0.append(": ");
        J0.append(obj);
        J0.append("...");
        logger.mo6667d(J0.toString());
        return false;
    }

    /* renamed from: g */
    public final void mo22748g(Object obj, Object obj2, C6720j jVar) {
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("VPAID_PLAYER: Loading Image Success");
        J0.append(this.f31449b.f31446w);
        J0.append(": ");
        J0.append(obj2);
        J0.append("...");
        logger.mo6666c(J0.toString());
    }
}
