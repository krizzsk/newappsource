package p988j$.util.stream;

import java.util.Iterator;
import java.util.stream.BaseStream;
import p988j$.util.C25865M;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.g */
public final /* synthetic */ class C26163g implements C26173i {

    /* renamed from: a */
    final /* synthetic */ BaseStream f64921a;

    private /* synthetic */ C26163g(BaseStream baseStream) {
        this.f64921a = baseStream;
    }

    /* renamed from: w */
    public static /* synthetic */ C26173i m65417w(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C26168h ? ((C26168h) baseStream).f64924a : new C26163g(baseStream);
    }

    public final /* synthetic */ void close() {
        this.f64921a.close();
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f64921a.isParallel();
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f64921a.iterator();
    }

    public final /* synthetic */ C26173i onClose(Runnable runnable) {
        return m65417w(this.f64921a.onClose(runnable));
    }

    public final /* synthetic */ C26173i parallel() {
        return m65417w(this.f64921a.parallel());
    }

    public final /* synthetic */ C26173i sequential() {
        return m65417w(this.f64921a.sequential());
    }

    public final /* synthetic */ Spliterator spliterator() {
        return C25865M.m64692d(this.f64921a.spliterator());
    }

    public final /* synthetic */ C26173i unordered() {
        return m65417w(this.f64921a.unordered());
    }
}
