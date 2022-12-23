package p290vb;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.impl.DeferrableSurfaces;
import p277ub.C6774a0;
import p290vb.C6953n;
import p695od.C18728c;

/* renamed from: vb.k */
public final /* synthetic */ class C6950k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f21691b;

    /* renamed from: c */
    public final /* synthetic */ long f21692c;

    /* renamed from: d */
    public final /* synthetic */ Object f21693d;

    /* renamed from: e */
    public final /* synthetic */ Object f21694e;

    public /* synthetic */ C6950k(Object obj, Object obj2, long j, int i) {
        this.f21691b = i;
        this.f21693d = obj;
        this.f21694e = obj2;
        this.f21692c = j;
    }

    public final void run() {
        switch (this.f21691b) {
            case 0:
                Object obj = this.f21694e;
                long j = this.f21692c;
                C6953n nVar = ((C6953n.C6954a) this.f21693d).f21703b;
                int i = C6774a0.f20959a;
                nVar.mo20410H(j, obj);
                return;
            default:
                DeferrableSurfaces.lambda$surfaceListWithTimeout$0((C18728c) this.f21693d, (CallbackToFutureAdapter.C0673a) this.f21694e, this.f21692c);
                return;
        }
    }
}
