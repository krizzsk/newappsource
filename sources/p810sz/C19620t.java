package p810sz;

import com.moovit.commons.p418io.serialization.UnsupportedVersionException;
import java.io.IOException;

/* renamed from: sz.t */
public abstract class C19620t<T> implements C19589j<T> {

    /* renamed from: u */
    public final String f49803u;

    public C19620t(Class<T> cls) {
        this.f49803u = cls.getName();
    }

    /* renamed from: a */
    public abstract boolean mo19623a(int i);

    /* renamed from: b */
    public abstract T mo19624b(C19615p pVar, int i) throws IOException;

    public final T read(C19615p pVar) throws IOException {
        int l = pVar.mo51924l();
        if (mo19623a(l)) {
            return mo19624b(pVar, l);
        }
        throw new UnsupportedVersionException(this.f49803u, l);
    }
}
