package p810sz;

import java.io.IOException;

/* renamed from: sz.l */
public interface C19600l<T> {

    /* renamed from: l */
    public static final C19601a f49782l = new C19601a();

    /* renamed from: m */
    public static final C19602b f49783m = new C19602b();

    /* renamed from: n */
    public static final C19603c f49784n = new C19603c();

    /* renamed from: o */
    public static final C19604d f49785o = new C19604d();

    /* renamed from: p */
    public static final C19605e f49786p = new C19605e();

    /* renamed from: q */
    public static final C19606f f49787q = new C19606f();

    /* renamed from: r */
    public static final C19607g f49788r = new C19607g();

    /* renamed from: s */
    public static final C19608h f49789s = new C19608h();

    /* renamed from: t */
    public static final C19609i f49790t = new C19609i();

    /* renamed from: sz.l$a */
    public class C19601a implements C19600l<Boolean> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51934b(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: sz.l$b */
    public class C19602b implements C19600l<Byte> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51935c(((Byte) obj).byteValue());
        }
    }

    /* renamed from: sz.l$c */
    public class C19603c implements C19600l<Short> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51941r(((Short) obj).shortValue());
        }
    }

    /* renamed from: sz.l$d */
    public class C19604d implements C19600l<Integer> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51939l(((Integer) obj).intValue());
        }
    }

    /* renamed from: sz.l$e */
    public class C19605e implements C19600l<Long> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51940m(((Long) obj).longValue());
        }
    }

    /* renamed from: sz.l$f */
    public class C19606f implements C19600l<Float> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51938j(((Float) obj).floatValue());
        }
    }

    /* renamed from: sz.l$g */
    public class C19607g implements C19600l<Double> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51937i(((Double) obj).doubleValue());
        }
    }

    /* renamed from: sz.l$h */
    public class C19608h implements C19600l<Character> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51937i((double) ((Character) obj).charValue());
        }
    }

    /* renamed from: sz.l$i */
    public class C19609i implements C19600l<String> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51955t((String) obj);
        }
    }

    void write(T t, C19616q qVar) throws IOException;
}
