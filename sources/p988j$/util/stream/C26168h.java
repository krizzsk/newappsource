package p988j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.h */
public final /* synthetic */ class C26168h implements BaseStream {

    /* renamed from: a */
    final /* synthetic */ C26173i f64924a;

    private /* synthetic */ C26168h(C26173i iVar) {
        this.f64924a = iVar;
    }

    /* renamed from: w */
    public static /* synthetic */ BaseStream m65431w(C26173i iVar) {
        if (iVar == null) {
            return null;
        }
        return iVar instanceof C26163g ? ((C26163g) iVar).f64921a : new C26168h(iVar);
    }

    public final /* synthetic */ void close() {
        this.f64924a.close();
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f64924a.isParallel();
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f64924a.iterator();
    }

    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return m65431w(this.f64924a.onClose(runnable));
    }

    public final /* synthetic */ BaseStream parallel() {
        return m65431w(this.f64924a.parallel());
    }

    public final /* synthetic */ BaseStream sequential() {
        return m65431w(this.f64924a.sequential());
    }

    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f64924a.spliterator());
    }

    public final /* synthetic */ BaseStream unordered() {
        return m65431w(this.f64924a.unordered());
    }
}
