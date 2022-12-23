package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import ce0.C21100e;
import cg0.C21183m;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

public final class LazyPackageViewDescriptorImpl$empty$2 extends Lambda implements C24225a<Boolean> {
    public final /* synthetic */ LazyPackageViewDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$empty$2(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.this$0 = lazyPackageViewDescriptorImpl;
    }

    public final Object invoke() {
        C23909c cVar = this.this$0.f60454d;
        cVar.mo59457W();
        return Boolean.valueOf(C21100e.m49354n0((C21183m) cVar.f60522l.getValue(), this.this$0.f60455e));
    }
}
