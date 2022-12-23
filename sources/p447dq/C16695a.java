package p447dq;

import android.content.Context;
import com.usebutton.sdk.internal.api.AppActionRequest;
import k40.C5480d;
import mf0.C24362h;
import org.apache.thrift.TBase;
import p447dq.C16695a;
import p906wz.C20432d;
import p906wz.C20436g;

/* renamed from: dq.a */
public abstract class C16695a<RQ extends C16695a<RQ, RS, RO>, RS extends C20436g<RQ, RS>, RO extends TBase<?, ?>> extends C5480d<RQ, RS, RO> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16695a(Context context, Class cls, int i, int i2) {
        super(context, cls, i, i2);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* renamed from: u */
    public final void mo6590u(C20432d dVar) {
        super.mo6590u(dVar);
        dVar.mo52633b("SDK_VERSION", "1.0.0.1");
    }
}
