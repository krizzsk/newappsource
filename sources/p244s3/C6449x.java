package p244s3;

import com.appboy.events.IEventSubscriber;
import p030bo.app.C1531b1;
import p030bo.app.C1600i0;
import p030bo.app.C1712w;

/* renamed from: s3.x */
public final /* synthetic */ class C6449x implements IEventSubscriber {

    /* renamed from: a */
    public final /* synthetic */ C1712w f20150a;

    /* renamed from: b */
    public final /* synthetic */ C1600i0 f20151b;

    public /* synthetic */ C6449x(C1712w wVar, C1600i0 i0Var) {
        this.f20150a = wVar;
        this.f20151b = i0Var;
    }

    public final void trigger(Object obj) {
        this.f20150a.m4841a(this.f20151b, (C1531b1) obj);
    }
}
