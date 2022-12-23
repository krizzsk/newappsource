package p011aa;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p028ba.C1507a;
import p028ba.C1519m;
import p041ca.C1815d;
import p075ea.C4614a;
import p075ea.C4617c;
import p313x9.C7180b;
import ye0.C25292a;

/* renamed from: aa.g */
public final class C0143g implements C7180b<C1519m> {

    /* renamed from: a */
    public final C25292a<Context> f409a;

    /* renamed from: b */
    public final C25292a<C1815d> f410b;

    /* renamed from: c */
    public final C25292a<SchedulerConfig> f411c;

    /* renamed from: d */
    public final C25292a<C4614a> f412d;

    public C0143g(C25292a aVar, C25292a aVar2, C0142f fVar) {
        C4617c cVar = C4617c.C4618a.f15837a;
        this.f409a = aVar;
        this.f410b = aVar2;
        this.f411c = fVar;
        this.f412d = cVar;
    }

    public final Object get() {
        C4614a aVar = this.f412d.get();
        return new C1507a(this.f409a.get(), this.f410b.get(), this.f411c.get());
    }
}
