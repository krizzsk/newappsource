package fd0;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import p290vb.C6950k;
import p695od.C18728c;

/* renamed from: fd0.h */
public final /* synthetic */ class C12687h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Executor f31340b;

    /* renamed from: c */
    public final /* synthetic */ C18728c f31341c;

    /* renamed from: d */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f31342d;

    /* renamed from: e */
    public final /* synthetic */ long f31343e;

    public /* synthetic */ C12687h(Executor executor, C18728c cVar, CallbackToFutureAdapter.C0673a aVar, long j) {
        this.f31340b = executor;
        this.f31341c = cVar;
        this.f31342d = aVar;
        this.f31343e = j;
    }

    public final void run() {
        this.f31340b.execute(new C6950k(this.f31341c, this.f31342d, this.f31343e, 1));
    }
}
