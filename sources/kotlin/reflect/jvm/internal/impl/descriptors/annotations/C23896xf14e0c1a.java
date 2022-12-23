package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lf0.C24236l;
import lh0.C24307v;
import mf0.C24362h;
import zf0.C25485t;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1 */
final class C23896xf14e0c1a extends Lambda implements C24236l<C25485t, C24307v> {
    public final /* synthetic */ C23867c $this_createDeprecatedAnnotation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23896xf14e0c1a(C23867c cVar) {
        super(1);
        this.$this_createDeprecatedAnnotation = cVar;
    }

    public final Object invoke(Object obj) {
        C25485t tVar = (C25485t) obj;
        C24362h.m61211f(tVar, "module");
        return tVar.mo59460m().mo59386i(this.$this_createDeprecatedAnnotation.mo59397v(), Variance.INVARIANT);
    }
}
