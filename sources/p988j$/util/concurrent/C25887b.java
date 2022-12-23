package p988j$.util.concurrent;

/* renamed from: j$.util.concurrent.b */
abstract class C25887b extends C25902q {

    /* renamed from: i */
    final ConcurrentHashMap f64545i;

    /* renamed from: j */
    C25898m f64546j;

    C25887b(C25898m[] mVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i, 0, i2);
        this.f64545i = concurrentHashMap;
        mo83979d();
    }

    public final boolean hasMoreElements() {
        return this.f64566b != null;
    }

    public final boolean hasNext() {
        return this.f64566b != null;
    }

    public final void remove() {
        C25898m mVar = this.f64546j;
        if (mVar != null) {
            this.f64546j = null;
            this.f64545i.replaceNode(mVar.f64558b, null, (Object) null);
            return;
        }
        throw new IllegalStateException();
    }
}
