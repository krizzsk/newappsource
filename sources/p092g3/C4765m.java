package p092g3;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C1420a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p081f3.C4656h;

/* renamed from: g3.m */
public final class C4765m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1420a f16082b;

    /* renamed from: c */
    public final /* synthetic */ String f16083c;

    /* renamed from: d */
    public final /* synthetic */ C4766n f16084d;

    public C4765m(C4766n nVar, C1420a aVar, String str) {
        this.f16084d = nVar;
        this.f16082b = aVar;
        this.f16083c = str;
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        try {
            ListenableWorker.C1379a aVar = (ListenableWorker.C1379a) this.f16082b.get();
            if (aVar == null) {
                C4656h c = C4656h.m11960c();
                int i = C4766n.f16085u;
                String.format("%s returned a null result. Treating it as a failure.", new Object[]{this.f16084d.f16090f.f19084c});
                c.mo20177b(new Throwable[0]);
            } else {
                C4656h c2 = C4656h.m11960c();
                int i2 = C4766n.f16085u;
                String.format("%s returned a %s result.", new Object[]{this.f16084d.f16090f.f19084c, aVar});
                c2.mo20176a(new Throwable[0]);
                this.f16084d.f16093i = aVar;
            }
        } catch (CancellationException e) {
            C4656h c3 = C4656h.m11960c();
            int i3 = C4766n.f16085u;
            String.format("%s was cancelled", new Object[]{this.f16083c});
            c3.mo20178d(e);
        } catch (InterruptedException | ExecutionException e2) {
            C4656h c4 = C4656h.m11960c();
            int i4 = C4766n.f16085u;
            String.format("%s failed because it threw an exception/error", new Object[]{this.f16083c});
            c4.mo20177b(e2);
        } catch (Throwable th) {
            this.f16084d.mo20285c();
            throw th;
        }
        this.f16084d.mo20285c();
    }
}
