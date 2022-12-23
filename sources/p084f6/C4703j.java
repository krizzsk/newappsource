package p084f6;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p025b6.C1487b;
import p311x6.C7172i;
import p311x6.C7176l;
import p322y6.C7333a;
import p322y6.C7341d;
import p584jl.C17885a;

/* renamed from: f6.j */
public final class C4703j {

    /* renamed from: a */
    public final C7172i<C1487b, String> f15978a = new C7172i<>(1000);

    /* renamed from: b */
    public final C7333a.C7336c f15979b = C7333a.m16961a(10, new C4704a());

    /* renamed from: f6.j$a */
    public class C4704a implements C7333a.C7335b<C4705b> {
        public final Object create() {
            try {
                return new C4705b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: f6.j$b */
    public static final class C4705b implements C7333a.C7337d {

        /* renamed from: b */
        public final MessageDigest f15980b;

        /* renamed from: c */
        public final C7341d.C7342a f15981c = new C7341d.C7342a();

        public C4705b(MessageDigest messageDigest) {
            this.f15980b = messageDigest;
        }

        /* renamed from: f */
        public final C7341d.C7342a mo10927f() {
            return this.f15981c;
        }
    }

    /* renamed from: a */
    public final String mo20215a(C1487b bVar) {
        String a;
        synchronized (this.f15978a) {
            a = this.f15978a.mo23471a(bVar);
        }
        if (a == null) {
            Object b = this.f15979b.mo22237b();
            C17885a.m44458r(b);
            C4705b bVar2 = (C4705b) b;
            try {
                bVar.mo5841a(bVar2.f15980b);
                byte[] digest = bVar2.f15980b.digest();
                char[] cArr = C7176l.f22266b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b2 = digest[i] & 255;
                        int i2 = i * 2;
                        char[] cArr2 = C7176l.f22265a;
                        cArr[i2] = cArr2[b2 >>> 4];
                        cArr[i2 + 1] = cArr2[b2 & 15];
                    }
                    a = new String(cArr);
                }
                this.f15979b.mo22236a(bVar2);
            } catch (Throwable th) {
                this.f15979b.mo22236a(bVar2);
                throw th;
            }
        }
        synchronized (this.f15978a) {
            this.f15978a.mo23472d(bVar, a);
        }
        return a;
    }
}
