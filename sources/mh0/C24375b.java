package mh0;

import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import oh0.C24617f;
import oh0.C24618g;

/* renamed from: mh0.b */
public final class C24375b extends TypeCheckerState.C24156a.C24157a {

    /* renamed from: a */
    public final /* synthetic */ C24373a f61712a;

    /* renamed from: b */
    public final /* synthetic */ TypeSubstitutor f61713b;

    public C24375b(C24373a aVar, TypeSubstitutor typeSubstitutor) {
        this.f61712a = aVar;
        this.f61713b = typeSubstitutor;
    }

    /* renamed from: a */
    public final C24618g mo60247a(TypeCheckerState typeCheckerState, C24617f fVar) {
        C24362h.m61211f(typeCheckerState, "state");
        C24362h.m61211f(fVar, "type");
        C24373a aVar = this.f61712a;
        C24312z e = aVar.mo42731e(this.f61713b.mo60250i((C24307v) aVar.mo42738h0(fVar), Variance.INVARIANT));
        C24362h.m61208c(e);
        return e;
    }
}
