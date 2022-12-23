package p244s3;

import com.appboy.events.IEventSubscriber;
import p030bo.app.C1582g0;
import p030bo.app.C1649o0;
import p030bo.app.C1723x0;
import p030bo.app.C1729y;
import p030bo.app.C1734y0;

/* renamed from: s3.a */
public final /* synthetic */ class C6426a implements IEventSubscriber {

    /* renamed from: a */
    public final /* synthetic */ int f20109a;

    /* renamed from: b */
    public final /* synthetic */ Object f20110b;

    public /* synthetic */ C6426a(Object obj, int i) {
        this.f20109a = i;
        this.f20110b = obj;
    }

    public final void trigger(Object obj) {
        switch (this.f20109a) {
            case 0:
                ((C1582g0) this.f20110b).m4185a((C1723x0) obj);
                return;
            case 1:
                ((C1582g0) this.f20110b).m4186a((C1734y0) obj);
                return;
            default:
                ((C1729y) this.f20110b).m4911a((C1649o0) obj);
                return;
        }
    }
}
