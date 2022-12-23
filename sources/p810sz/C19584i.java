package p810sz;

import java.io.IOException;

/* renamed from: sz.i */
public interface C19584i<T> extends C19600l<T>, C19589j<T> {

    /* renamed from: a */
    public static final C19586b f49769a = new C19586b();

    /* renamed from: b */
    public static final C19588d f49770b = new C19588d();

    /* renamed from: sz.i$a */
    public class C19585a implements C19584i<Boolean> {
        public final Object read(C19615p pVar) throws IOException {
            return Boolean.valueOf(pVar.mo51919b());
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51934b(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: sz.i$b */
    public class C19586b implements C19584i<Integer> {
        public final Object read(C19615p pVar) throws IOException {
            return Integer.valueOf(pVar.mo51924l());
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51939l(((Integer) obj).intValue());
        }
    }

    /* renamed from: sz.i$c */
    public class C19587c implements C19584i<Long> {
        public final Object read(C19615p pVar) throws IOException {
            return Long.valueOf(pVar.mo51925m());
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51940m(((Long) obj).longValue());
        }
    }

    /* renamed from: sz.i$d */
    public class C19588d implements C19584i<String> {
        public final Object read(C19615p pVar) throws IOException {
            return pVar.mo51948t();
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51955t((String) obj);
        }
    }

    static {
        new C19585a();
        new C19587c();
    }
}
