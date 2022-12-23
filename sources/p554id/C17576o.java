package p554id;

/* renamed from: id.o */
public final class C17576o<ResultT> {

    /* renamed from: a */
    public final Object f45198a = new Object();

    /* renamed from: b */
    public final C17572k f45199b = new C17572k();

    /* renamed from: c */
    public boolean f45200c;

    /* renamed from: d */
    public Object f45201d;

    /* renamed from: e */
    public Exception f45202e;

    /* renamed from: a */
    public final boolean mo50028a() {
        boolean z;
        synchronized (this.f45198a) {
            z = false;
            if (this.f45200c && this.f45202e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo50029b() {
        synchronized (this.f45198a) {
            if (this.f45200c) {
                this.f45199b.mo50023b(this);
            }
        }
    }
}
