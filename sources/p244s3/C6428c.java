package p244s3;

import com.appboy.events.IEventSubscriber;
import p030bo.app.C1523a1;
import p030bo.app.C1555d1;
import p030bo.app.C1582g0;

/* renamed from: s3.c */
public final /* synthetic */ class C6428c implements IEventSubscriber {

    /* renamed from: a */
    public final /* synthetic */ int f20113a;

    /* renamed from: b */
    public final /* synthetic */ C1582g0 f20114b;

    public /* synthetic */ C6428c(C1582g0 g0Var, int i) {
        this.f20113a = i;
        this.f20114b = g0Var;
    }

    public final void trigger(Object obj) {
        switch (this.f20113a) {
            case 0:
                this.f20114b.m4176a((C1555d1) obj);
                return;
            default:
                this.f20114b.m4175a((C1523a1) obj);
                return;
        }
    }
}
