package p810sz;

import java.io.IOException;

/* renamed from: sz.j */
public interface C19589j<T> {

    /* renamed from: c */
    public static final C19590a f49771c = new C19590a();

    /* renamed from: d */
    public static final C19591b f49772d = new C19591b();

    /* renamed from: e */
    public static final C19592c f49773e = new C19592c();

    /* renamed from: f */
    public static final C19593d f49774f = new C19593d();

    /* renamed from: g */
    public static final C19594e f49775g = new C19594e();

    /* renamed from: h */
    public static final C19595f f49776h = new C19595f();

    /* renamed from: i */
    public static final C19596g f49777i = new C19596g();

    /* renamed from: j */
    public static final C19597h f49778j = new C19597h();

    /* renamed from: k */
    public static final C19598i f49779k = new C19598i();

    /* renamed from: sz.j$a */
    public class C19590a implements C19589j<Boolean> {
        public final Object read(C19615p pVar) throws IOException {
            return Boolean.valueOf(pVar.mo51919b());
        }
    }

    /* renamed from: sz.j$b */
    public class C19591b implements C19589j<Byte> {
        public final Object read(C19615p pVar) throws IOException {
            return Byte.valueOf(pVar.mo51920c());
        }
    }

    /* renamed from: sz.j$c */
    public class C19592c implements C19589j<Short> {
        public final Object read(C19615p pVar) throws IOException {
            return Short.valueOf(pVar.mo51926r());
        }
    }

    /* renamed from: sz.j$d */
    public class C19593d implements C19589j<Integer> {
        public final Object read(C19615p pVar) throws IOException {
            return Integer.valueOf(pVar.mo51924l());
        }
    }

    /* renamed from: sz.j$e */
    public class C19594e implements C19589j<Long> {
        public final Object read(C19615p pVar) throws IOException {
            return Long.valueOf(pVar.mo51925m());
        }
    }

    /* renamed from: sz.j$f */
    public class C19595f implements C19589j<Float> {
        public final Object read(C19615p pVar) throws IOException {
            return Float.valueOf(pVar.mo51923j());
        }
    }

    /* renamed from: sz.j$g */
    public class C19596g implements C19589j<Double> {
        public final Object read(C19615p pVar) throws IOException {
            return Double.valueOf(pVar.mo51922i());
        }
    }

    /* renamed from: sz.j$h */
    public class C19597h implements C19589j<Character> {
        public final Object read(C19615p pVar) throws IOException {
            return Character.valueOf(pVar.mo51921e());
        }
    }

    /* renamed from: sz.j$i */
    public class C19598i implements C19589j<String> {
        public final Object read(C19615p pVar) throws IOException {
            return pVar.mo51948t();
        }
    }

    T read(C19615p pVar) throws IOException;
}
