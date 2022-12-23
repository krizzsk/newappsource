package kotlinx.coroutines.flow.internal;

import ai0.C21000d;
import bf0.C21050d;
import ff0.C23349c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lf0.C24225a;
import lf0.C24241q;
import p389bl.C13637c;
import zh0.C25522c;
import zh0.C25523d;

/* renamed from: kotlinx.coroutines.flow.internal.b */
public final class C24213b {
    /* renamed from: a */
    public static final Object m60680a(C23349c cVar, C24225a aVar, C24241q qVar, C25523d dVar, C25522c[] cVarArr) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2((C23349c) null, aVar, qVar, dVar, cVarArr);
        C21000d dVar2 = new C21000d(cVar, cVar.getContext());
        Object G = C13637c.m34052G(dVar2, dVar2, combineKt$combineInternal$2);
        if (G == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return G;
        }
        return C21050d.f52856a;
    }
}
