package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import lh0.C24307v;
import mf0.C24362h;

public final class IntersectionTypeConstructor$makeDebugNameForIntersectionType$3 extends Lambda implements C24236l<C24307v, CharSequence> {
    public final /* synthetic */ C24236l<C24307v, Object> $getProperTypeRelatedToStringify;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntersectionTypeConstructor$makeDebugNameForIntersectionType$3(C24236l<? super C24307v, ? extends Object> lVar) {
        super(1);
        this.$getProperTypeRelatedToStringify = lVar;
    }

    public final Object invoke(Object obj) {
        C24307v vVar = (C24307v) obj;
        C24236l<C24307v, Object> lVar = this.$getProperTypeRelatedToStringify;
        C24362h.m61210e(vVar, "it");
        return lVar.invoke(vVar).toString();
    }
}
