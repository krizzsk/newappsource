package p244s3;

import com.appboy.events.IEventSubscriber;
import p030bo.app.C1521a;
import p030bo.app.C1582g0;
import p030bo.app.C1633m0;
import p030bo.app.C1669q0;
import p030bo.app.C1729y;

/* renamed from: s3.d */
public final /* synthetic */ class C6429d implements IEventSubscriber {

    /* renamed from: a */
    public final /* synthetic */ int f20115a;

    /* renamed from: b */
    public final /* synthetic */ Object f20116b;

    public /* synthetic */ C6429d(Object obj, int i) {
        this.f20115a = i;
        this.f20116b = obj;
    }

    public final void trigger(Object obj) {
        switch (this.f20115a) {
            case 0:
                ((C1582g0) this.f20116b).m4181a((C1633m0) obj);
                return;
            case 1:
                ((C1582g0) this.f20116b).m4183a((C1669q0) obj);
                return;
            default:
                ((C1729y) this.f20116b).m4910a((C1521a) obj);
                return;
        }
    }
}
