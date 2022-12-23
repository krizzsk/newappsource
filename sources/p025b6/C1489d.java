package p025b6;

import android.text.TextUtils;
import java.security.MessageDigest;

/* renamed from: b6.d */
public final class C1489d<T> {

    /* renamed from: e */
    public static final C1490a f5391e = new C1490a();

    /* renamed from: a */
    public final T f5392a;

    /* renamed from: b */
    public final C1491b<T> f5393b;

    /* renamed from: c */
    public final String f5394c;

    /* renamed from: d */
    public volatile byte[] f5395d;

    /* renamed from: b6.d$a */
    public class C1490a implements C1491b<Object> {
        /* renamed from: a */
        public final void mo250a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: b6.d$b */
    public interface C1491b<T> {
        /* renamed from: a */
        void mo250a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public C1489d(String str, T t, C1491b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f5394c = str;
            this.f5392a = t;
            this.f5393b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: a */
    public static C1489d m3904a(Object obj, String str) {
        return new C1489d(str, obj, f5391e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1489d) {
            return this.f5394c.equals(((C1489d) obj).f5394c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5394c.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Option{key='");
        k.append(this.f5394c);
        k.append('\'');
        k.append('}');
        return k.toString();
    }
}
