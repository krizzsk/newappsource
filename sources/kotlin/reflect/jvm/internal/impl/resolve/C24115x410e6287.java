package kotlin.reflect.jvm.internal.impl.resolve;

import bf0.C21050d;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import rh0.C24823d;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1 */
public final class C24115x410e6287 extends Lambda implements C24236l<H, C21050d> {
    public final /* synthetic */ C24823d<H> $conflictedHandles;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24115x410e6287(C24823d<H> dVar) {
        super(1);
        this.$conflictedHandles = dVar;
    }

    public final Object invoke(Object obj) {
        C24823d<H> dVar = this.$conflictedHandles;
        C24362h.m61210e(obj, "it");
        dVar.add(obj);
        return C21050d.f52856a;
    }
}
