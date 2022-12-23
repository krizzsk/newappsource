package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import lh0.C24306u0;
import mf0.C24362h;
import p389bl.C13637c;
import zf0.C25437e;
import zf0.C25448i0;

public final class AbstractTypeAliasDescriptor$isInner$1 extends Lambda implements C24236l<C24306u0, Boolean> {
    public final /* synthetic */ AbstractTypeAliasDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor$isInner$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        super(1);
        this.this$0 = abstractTypeAliasDescriptor;
    }

    public final Object invoke(Object obj) {
        boolean z;
        C24306u0 u0Var = (C24306u0) obj;
        C24362h.m61210e(u0Var, "type");
        boolean z2 = false;
        if (!C13637c.m34082y(u0Var)) {
            AbstractTypeAliasDescriptor abstractTypeAliasDescriptor = this.this$0;
            C25437e o = u0Var.mo60411O0().mo53460o();
            if (!(o instanceof C25448i0) || C24362h.m61206a(((C25448i0) o).mo53399b(), abstractTypeAliasDescriptor)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
