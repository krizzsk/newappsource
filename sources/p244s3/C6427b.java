package p244s3;

import com.appboy.events.IEventSubscriber;
import p030bo.app.C1582g0;
import p030bo.app.C1625l0;
import p030bo.app.C1699u0;
import p030bo.app.C1729y;

/* renamed from: s3.b */
public final /* synthetic */ class C6427b implements IEventSubscriber {

    /* renamed from: a */
    public final /* synthetic */ int f20111a;

    /* renamed from: b */
    public final /* synthetic */ Object f20112b;

    public /* synthetic */ C6427b(Object obj, int i) {
        this.f20111a = i;
        this.f20112b = obj;
    }

    public final void trigger(Object obj) {
        switch (this.f20111a) {
            case 0:
                ((C1582g0) this.f20112b).m4180a((C1625l0) obj);
                return;
            default:
                ((C1729y) this.f20112b).m4914a((C1699u0) obj);
                return;
        }
    }
}
