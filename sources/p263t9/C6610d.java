package p263t9;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;
import p263t9.C6615h;

/* renamed from: t9.d */
public final class C6610d extends C6615h {

    /* renamed from: a */
    public final long f20466a;

    /* renamed from: b */
    public final Integer f20467b;

    /* renamed from: c */
    public final long f20468c;

    /* renamed from: d */
    public final byte[] f20469d;

    /* renamed from: e */
    public final String f20470e;

    /* renamed from: f */
    public final long f20471f;

    /* renamed from: g */
    public final NetworkConnectionInfo f20472g;

    /* renamed from: t9.d$a */
    public static final class C6611a extends C6615h.C6616a {

        /* renamed from: a */
        public Long f20473a;

        /* renamed from: b */
        public Integer f20474b;

        /* renamed from: c */
        public Long f20475c;

        /* renamed from: d */
        public byte[] f20476d;

        /* renamed from: e */
        public String f20477e;

        /* renamed from: f */
        public Long f20478f;

        /* renamed from: g */
        public NetworkConnectionInfo f20479g;
    }

    public C6610d(long j, Integer num, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo) {
        this.f20466a = j;
        this.f20467b = num;
        this.f20468c = j2;
        this.f20469d = bArr;
        this.f20470e = str;
        this.f20471f = j3;
        this.f20472g = networkConnectionInfo;
    }

    /* renamed from: a */
    public final Integer mo22775a() {
        return this.f20467b;
    }

    /* renamed from: b */
    public final long mo22776b() {
        return this.f20466a;
    }

    /* renamed from: c */
    public final long mo22777c() {
        return this.f20468c;
    }

    /* renamed from: d */
    public final NetworkConnectionInfo mo22778d() {
        return this.f20472g;
    }

    /* renamed from: e */
    public final byte[] mo22779e() {
        return this.f20469d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6615h)) {
            return false;
        }
        C6615h hVar = (C6615h) obj;
        if (this.f20466a == hVar.mo22776b() && ((num = this.f20467b) != null ? num.equals(hVar.mo22775a()) : hVar.mo22775a() == null) && this.f20468c == hVar.mo22777c()) {
            byte[] bArr2 = this.f20469d;
            if (hVar instanceof C6610d) {
                bArr = ((C6610d) hVar).f20469d;
            } else {
                bArr = hVar.mo22779e();
            }
            if (Arrays.equals(bArr2, bArr) && ((str = this.f20470e) != null ? str.equals(hVar.mo22781f()) : hVar.mo22781f() == null) && this.f20471f == hVar.mo22782g()) {
                NetworkConnectionInfo networkConnectionInfo = this.f20472g;
                if (networkConnectionInfo == null) {
                    if (hVar.mo22778d() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(hVar.mo22778d())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final String mo22781f() {
        return this.f20470e;
    }

    /* renamed from: g */
    public final long mo22782g() {
        return this.f20471f;
    }

    public final int hashCode() {
        int i;
        int i2;
        long j = this.f20466a;
        int i3 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f20467b;
        int i4 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j2 = this.f20468c;
        int hashCode = (((((i3 ^ i) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f20469d)) * 1000003;
        String str = this.f20470e;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        long j3 = this.f20471f;
        int i5 = (((hashCode ^ i2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f20472g;
        if (networkConnectionInfo != null) {
            i4 = networkConnectionInfo.hashCode();
        }
        return i5 ^ i4;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("LogEvent{eventTimeMs=");
        k.append(this.f20466a);
        k.append(", eventCode=");
        k.append(this.f20467b);
        k.append(", eventUptimeMs=");
        k.append(this.f20468c);
        k.append(", sourceExtension=");
        k.append(Arrays.toString(this.f20469d));
        k.append(", sourceExtensionJsonProto3=");
        k.append(this.f20470e);
        k.append(", timezoneOffsetSeconds=");
        k.append(this.f20471f);
        k.append(", networkConnectionInfo=");
        k.append(this.f20472g);
        k.append("}");
        return k.toString();
    }
}
