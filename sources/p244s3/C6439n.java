package p244s3;

import android.location.Location;
import p030bo.app.C1634m1;
import p988j$.util.function.Consumer;

/* renamed from: s3.n */
public final /* synthetic */ class C6439n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C1634m1 f20133a;

    public /* synthetic */ C6439n(C1634m1 m1Var) {
        this.f20133a = m1Var;
    }

    public final void accept(Object obj) {
        this.f20133a.m4471a((Location) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
