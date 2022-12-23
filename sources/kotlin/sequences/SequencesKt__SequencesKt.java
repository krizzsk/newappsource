package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.C23816b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C24134xb5e458c1;
import lf0.C24236l;
import mf0.C24362h;
import p583jk.C17875h;
import th0.C24992a;
import th0.C24996d;
import th0.C24999f;
import th0.C25001g;
import th0.C25003h;
import th0.C25012n;

public class SequencesKt__SequencesKt extends C17875h {

    /* renamed from: kotlin.sequences.SequencesKt__SequencesKt$a */
    public static final class C24175a implements C25003h<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterator f61403a;

        public C24175a(Iterator it) {
            this.f61403a = it;
        }

        public final Iterator<T> iterator() {
            return this.f61403a;
        }
    }

    /* renamed from: X */
    public static final <T> C25003h<T> m60537X(Iterator<? extends T> it) {
        C24362h.m61211f(it, "<this>");
        C24175a aVar = new C24175a(it);
        if (aVar instanceof C24992a) {
            return aVar;
        }
        return new C24992a(aVar);
    }

    /* renamed from: Y */
    public static final C24999f m60538Y(C25003h hVar) {
        SequencesKt__SequencesKt$flatten$1 sequencesKt__SequencesKt$flatten$1 = SequencesKt__SequencesKt$flatten$1.f61404f;
        if (!(hVar instanceof C25012n)) {
            return new C24999f(hVar, SequencesKt__SequencesKt$flatten$3.f61405f, sequencesKt__SequencesKt$flatten$1);
        }
        C25012n nVar = (C25012n) hVar;
        C24362h.m61211f(sequencesKt__SequencesKt$flatten$1, "iterator");
        return new C24999f(nVar.f63178a, nVar.f63179b, sequencesKt__SequencesKt$flatten$1);
    }

    /* renamed from: Z */
    public static final <T> C25003h<T> m60539Z(T t, C24236l<? super T, ? extends T> lVar) {
        C24362h.m61211f(lVar, "nextFunction");
        if (t == null) {
            return C24996d.f63140a;
        }
        return new C25001g(new SequencesKt__SequencesKt$generateSequence$2(t), lVar);
    }

    /* renamed from: a0 */
    public static final C25003h m60540a0(C24134xb5e458c1 deserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1) {
        C25001g gVar = new C25001g(deserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1, new SequencesKt__SequencesKt$generateSequence$1(deserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1));
        if (gVar instanceof C24992a) {
            return gVar;
        }
        return new C24992a(gVar);
    }

    /* renamed from: b0 */
    public static final <T> C25003h<T> m60541b0(T... tArr) {
        return tArr.length == 0 ? C24996d.f63140a : C23816b.m58436R0(tArr);
    }
}
