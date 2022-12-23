package p145k5;

import bf0.C21050d;
import com.appboy.Appboy;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKit;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import lf0.C24240p;
import mf0.C24362h;
import yb0.C13301f;

/* renamed from: k5.c */
public final /* synthetic */ class C5484c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f18007b = 0;

    /* renamed from: c */
    public final /* synthetic */ boolean f18008c;

    /* renamed from: d */
    public final /* synthetic */ Object f18009d;

    public /* synthetic */ C5484c(Appboy appboy, boolean z) {
        this.f18009d = appboy;
        this.f18008c = z;
    }

    public /* synthetic */ C5484c(boolean z, UMOAdKitError uMOAdKitError) {
        this.f18008c = z;
        this.f18009d = uMOAdKitError;
    }

    public final void run() {
        switch (this.f18007b) {
            case 0:
                ((Appboy) this.f18009d).m5404b(this.f18008c);
                return;
            default:
                boolean z = this.f18008c;
                UMOAdKitError uMOAdKitError = (UMOAdKitError) this.f18009d;
                C13301f fVar = C13301f.f33010a;
                C24362h.m61211f(uMOAdKitError, "$akError");
                UMOAdKit.f7238a.getClass();
                C24240p<? super UMOAdKit, ? super UMOAdKitError, C21050d> pVar = UMOAdKit.f7240c;
                if (pVar != null) {
                    if (z) {
                        UMOAdKit uMOAdKit = UMOAdKit.f7239b;
                        C24362h.m61208c(uMOAdKit);
                        pVar.invoke(uMOAdKit, UMOAdKitError.NONE);
                    } else {
                        UMOAdKit.f7239b = null;
                        pVar.invoke(null, uMOAdKitError);
                    }
                }
                UMOAdKitError uMOAdKitError2 = UMOAdKitError.NONE;
                C13301f.f33011b = uMOAdKitError2;
                C13301f.f33012c = uMOAdKitError2;
                return;
        }
    }
}
