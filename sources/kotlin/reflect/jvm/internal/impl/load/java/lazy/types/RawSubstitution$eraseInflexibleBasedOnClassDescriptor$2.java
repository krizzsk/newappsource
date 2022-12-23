package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import lf0.C24236l;
import lh0.C24312z;
import mf0.C24362h;
import mg0.C24371a;
import mh0.C24378d;
import ug0.C25065b;
import zf0.C25432c;

public final class RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2 extends Lambda implements C24236l<C24378d, C24312z> {
    public final /* synthetic */ C24371a $attr;
    public final /* synthetic */ C25432c $declaration;
    public final /* synthetic */ C24312z $type;
    public final /* synthetic */ RawSubstitution this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2(C25432c cVar, C24371a aVar, RawSubstitution rawSubstitution, C24312z zVar) {
        super(1);
        this.$declaration = cVar;
        this.this$0 = rawSubstitution;
        this.$type = zVar;
        this.$attr = aVar;
    }

    public final Object invoke(Object obj) {
        C25065b bVar;
        C24378d dVar = (C24378d) obj;
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        C25432c cVar = this.$declaration;
        if (!(cVar instanceof C25432c)) {
            cVar = null;
        }
        if (cVar == null) {
            bVar = null;
        } else {
            bVar = DescriptorUtilsKt.m60285f(cVar);
        }
        if (bVar != null) {
            dVar.mo60523v(bVar);
        }
        return null;
    }
}
