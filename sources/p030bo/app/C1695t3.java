package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p244s3.C6448w;
import p304x.C7087p;
import p316y.C7229u;

/* renamed from: bo.app.t3 */
public class C1695t3 implements C1526a4 {

    /* renamed from: d */
    public static final String f6007d = AppboyLogger.getBrazeLogTag(C1695t3.class);

    /* renamed from: a */
    public final C1526a4 f6008a;

    /* renamed from: b */
    public final ThreadPoolExecutor f6009b;

    /* renamed from: c */
    public boolean f6010c = false;

    public C1695t3(C1526a4 a4Var, ThreadPoolExecutor threadPoolExecutor) {
        this.f6008a = a4Var;
        this.f6009b = threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m4761b(C1594h2 h2Var) {
        this.f6008a.mo5895a(h2Var);
    }

    @Deprecated
    /* renamed from: a */
    public void mo5895a(C1594h2 h2Var) {
        if (this.f6010c) {
            String str = f6007d;
            AppboyLogger.m5459w(str, "Storage provider is closed. Not adding event: " + h2Var);
            return;
        }
        this.f6009b.execute(new C7229u(6, this, h2Var));
    }

    public synchronized void close() {
        AppboyLogger.m5459w(f6007d, "Setting this provider and internal storage provider to closed. Cancelling all queued storage provider work.");
        this.f6010c = true;
        this.f6008a.close();
        this.f6009b.shutdownNow();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m4763b(List list) {
        this.f6008a.mo5896a((List<C1594h2>) list);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Collection m4760b() {
        return this.f6008a.mo5894a();
    }

    /* renamed from: a */
    public void mo5896a(List<C1594h2> list) {
        if (this.f6010c) {
            String str = f6007d;
            AppboyLogger.m5459w(str, "Storage provider is closed. Not deleting events: " + list);
            return;
        }
        this.f6009b.execute(new C7087p(6, this, list));
    }

    /* renamed from: a */
    public synchronized Collection<C1594h2> mo5894a() {
        if (this.f6010c) {
            AppboyLogger.m5459w(f6007d, "Storage provider is closed. Not getting all events.");
            return null;
        }
        try {
            return (Collection) this.f6009b.submit(new C6448w(this, 0)).get();
        } catch (Exception e) {
            throw new RuntimeException("Error while trying to asynchronously get all events.", e);
        }
    }
}
