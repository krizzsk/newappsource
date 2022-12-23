package p275u9;

import com.google.android.datatransport.Priority;
import java.util.Arrays;
import p275u9.C6751s;

/* renamed from: u9.j */
public final class C6738j extends C6751s {

    /* renamed from: a */
    public final String f20863a;

    /* renamed from: b */
    public final byte[] f20864b;

    /* renamed from: c */
    public final Priority f20865c;

    /* renamed from: u9.j$a */
    public static final class C6739a extends C6751s.C6752a {

        /* renamed from: a */
        public String f20866a;

        /* renamed from: b */
        public byte[] f20867b;

        /* renamed from: c */
        public Priority f20868c;

        /* renamed from: a */
        public final C6738j mo22915a() {
            String str;
            if (this.f20866a == null) {
                str = " backendName";
            } else {
                str = "";
            }
            if (this.f20868c == null) {
                str = C25541a.m63881k(str, " priority");
            }
            if (str.isEmpty()) {
                return new C6738j(this.f20866a, this.f20867b, this.f20868c);
            }
            throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
        }

        /* renamed from: b */
        public final C6739a mo22916b(String str) {
            if (str != null) {
                this.f20866a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        /* renamed from: c */
        public final C6739a mo22917c(Priority priority) {
            if (priority != null) {
                this.f20868c = priority;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public C6738j(String str, byte[] bArr, Priority priority) {
        this.f20863a = str;
        this.f20864b = bArr;
        this.f20865c = priority;
    }

    /* renamed from: b */
    public final String mo22910b() {
        return this.f20863a;
    }

    /* renamed from: c */
    public final byte[] mo22911c() {
        return this.f20864b;
    }

    /* renamed from: d */
    public final Priority mo22912d() {
        return this.f20865c;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6751s)) {
            return false;
        }
        C6751s sVar = (C6751s) obj;
        if (this.f20863a.equals(sVar.mo22910b())) {
            byte[] bArr2 = this.f20864b;
            if (sVar instanceof C6738j) {
                bArr = ((C6738j) sVar).f20864b;
            } else {
                bArr = sVar.mo22911c();
            }
            if (!Arrays.equals(bArr2, bArr) || !this.f20865c.equals(sVar.mo22912d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f20863a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f20864b)) * 1000003) ^ this.f20865c.hashCode();
    }
}
