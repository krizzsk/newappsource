package p244s3;

import com.appboy.events.IEventSubscriber;
import java.util.concurrent.Semaphore;
import p030bo.app.C1582g0;

/* renamed from: s3.g */
public final /* synthetic */ class C6432g implements IEventSubscriber {

    /* renamed from: a */
    public final /* synthetic */ C1582g0 f20119a;

    /* renamed from: b */
    public final /* synthetic */ Semaphore f20120b;

    public /* synthetic */ C6432g(C1582g0 g0Var, Semaphore semaphore) {
        this.f20119a = g0Var;
        this.f20120b = semaphore;
    }

    public final void trigger(Object obj) {
        this.f20119a.m4188a(this.f20120b, (Throwable) obj);
    }
}
