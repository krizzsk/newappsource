package p810sz;

import java.io.IOException;

/* renamed from: sz.u */
public abstract class C19621u<T> implements C19600l<T> {

    /* renamed from: u */
    public final int f49804u;

    public C19621u(int i) {
        this.f49804u = i;
    }

    /* renamed from: a */
    public abstract void mo19622a(T t, C19616q qVar) throws IOException;

    public final void write(T t, C19616q qVar) throws IOException {
        qVar.mo51939l(this.f49804u);
        mo19622a(t, qVar);
    }
}
