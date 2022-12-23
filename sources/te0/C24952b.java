package te0;

import java.util.concurrent.ThreadFactory;
import je0.C23712e;
import p565io.reactivex.internal.schedulers.RxThreadFactory;

/* renamed from: te0.b */
public final class C24952b extends C23712e {

    /* renamed from: b */
    public static final RxThreadFactory f63073b = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* renamed from: a */
    public final ThreadFactory f63074a = f63073b;

    /* renamed from: a */
    public final C23712e.C23714b mo58928a() {
        return new C24953c(this.f63074a);
    }
}
