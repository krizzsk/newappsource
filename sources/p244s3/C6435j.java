package p244s3;

import com.appboy.events.IEventSubscriber;
import p030bo.app.C1582g0;
import p030bo.app.C1626l1;
import p030bo.app.C1678r0;
import p030bo.app.C1685s0;

/* renamed from: s3.j */
public final /* synthetic */ class C6435j implements IEventSubscriber {

    /* renamed from: a */
    public final /* synthetic */ int f20124a;

    /* renamed from: b */
    public final /* synthetic */ Object f20125b;

    public /* synthetic */ C6435j(Object obj, int i) {
        this.f20124a = i;
        this.f20125b = obj;
    }

    public final void trigger(Object obj) {
        switch (this.f20124a) {
            case 0:
                ((C1582g0) this.f20125b).m4190b((C1685s0) obj);
                return;
            default:
                ((C1626l1) this.f20125b).m4432a((C1678r0) obj);
                return;
        }
    }
}
