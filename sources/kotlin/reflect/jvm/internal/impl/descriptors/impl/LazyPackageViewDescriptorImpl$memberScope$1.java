package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import cf0.C21136j;
import cg0.C21176i0;
import eh0.C23301b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24225a;
import zf0.C25486u;

public final class LazyPackageViewDescriptorImpl$memberScope$1 extends Lambda implements C24225a<MemberScope> {
    public final /* synthetic */ LazyPackageViewDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$memberScope$1(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.this$0 = lazyPackageViewDescriptorImpl;
    }

    public final Object invoke() {
        if (this.this$0.isEmpty()) {
            return MemberScope.C24119a.f61217b;
        }
        List<C25486u> m0 = this.this$0.mo59446m0();
        ArrayList arrayList = new ArrayList(C21136j.m49436X(m0, 10));
        for (C25486u o : m0) {
            arrayList.add(o.mo53528o());
        }
        LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.this$0;
        ArrayList y0 = C23825c.m58528y0(new C21176i0(lazyPackageViewDescriptorImpl.f60454d, lazyPackageViewDescriptorImpl.f60455e), arrayList);
        StringBuilder k = C13555b.m33972k("package view scope for ");
        k.append(this.this$0.f60455e);
        k.append(" in ");
        k.append(this.this$0.f60454d.getName());
        return C23301b.C23302a.m57389a(k.toString(), y0);
    }
}
