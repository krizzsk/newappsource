package p531he;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: he.z */
public final class C17425z extends C17391c {

    /* renamed from: b */
    public final /* synthetic */ String f44880b;

    /* renamed from: c */
    public final /* synthetic */ ExecutorService f44881c;

    /* renamed from: d */
    public final /* synthetic */ long f44882d = 2;

    /* renamed from: e */
    public final /* synthetic */ TimeUnit f44883e;

    public C17425z(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f44880b = str;
        this.f44881c = executorService;
        this.f44883e = timeUnit;
    }

    /* renamed from: a */
    public final void mo49866a() {
        try {
            this.f44881c.shutdown();
            if (!this.f44881c.awaitTermination(this.f44882d, this.f44883e)) {
                this.f44881c.shutdownNow();
            }
        } catch (InterruptedException unused) {
            String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f44880b});
            this.f44881c.shutdownNow();
        }
    }
}
