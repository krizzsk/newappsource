package p810sz;

import com.moovit.commons.p418io.serialization.UnsupportedVersionException;
import java.io.IOException;

/* renamed from: sz.s */
public abstract class C19619s<T> implements C19584i<T> {

    /* renamed from: u */
    public final String f49801u;

    /* renamed from: v */
    public final int f49802v;

    public C19619s(int i, Class cls) {
        this.f49801u = cls.getName();
        this.f49802v = i;
    }

    /* renamed from: a */
    public abstract boolean mo177a(int i);

    /* renamed from: b */
    public abstract T mo178b(C19615p pVar, int i) throws IOException;

    /* renamed from: c */
    public abstract void mo179c(T t, C19616q qVar) throws IOException;

    public final T read(C19615p pVar) throws IOException {
        int l = pVar.mo51924l();
        if (mo177a(l)) {
            return mo178b(pVar, l);
        }
        throw new UnsupportedVersionException(this.f49801u, l);
    }

    public final void write(T t, C19616q qVar) throws IOException {
        qVar.mo51939l(this.f49802v);
        mo179c(t, qVar);
    }
}
