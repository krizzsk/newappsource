package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final /* synthetic */ class SequencesKt___SequencesKt$flatMap$1 extends FunctionReferenceImpl implements C24236l<Iterable<Object>, Iterator<Object>> {

    /* renamed from: b */
    public static final SequencesKt___SequencesKt$flatMap$1 f61407b = new SequencesKt___SequencesKt$flatMap$1();

    public SequencesKt___SequencesKt$flatMap$1() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    public final Object invoke(Object obj) {
        Iterable iterable = (Iterable) obj;
        C24362h.m61211f(iterable, "p0");
        return iterable.iterator();
    }
}
