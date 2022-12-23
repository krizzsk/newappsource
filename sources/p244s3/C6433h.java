package p244s3;

import com.appboy.events.IEventSubscriber;
import p030bo.app.C1582g0;
import p030bo.app.C1623k6;
import p030bo.app.C1678r0;
import p030bo.app.C1706v0;

/* renamed from: s3.h */
public final /* synthetic */ class C6433h implements IEventSubscriber {

    /* renamed from: a */
    public final /* synthetic */ int f20121a;

    /* renamed from: b */
    public final /* synthetic */ Object f20122b;

    public /* synthetic */ C6433h(Object obj, int i) {
        this.f20121a = i;
        this.f20122b = obj;
    }

    public final void trigger(Object obj) {
        switch (this.f20121a) {
            case 0:
                ((C1582g0) this.f20122b).m4184a((C1678r0) obj);
                return;
            default:
                ((C1623k6) this.f20122b).m4406a((C1706v0) obj);
                return;
        }
    }
}
