package p263t9;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;

/* renamed from: t9.e */
public final class C6612e extends C6617i {

    /* renamed from: a */
    public final long f20480a;

    /* renamed from: b */
    public final long f20481b;

    /* renamed from: c */
    public final ClientInfo f20482c;

    /* renamed from: d */
    public final Integer f20483d;

    /* renamed from: e */
    public final String f20484e;

    /* renamed from: f */
    public final List<C6615h> f20485f;

    /* renamed from: g */
    public final QosTier f20486g;

    public C6612e() {
        throw null;
    }

    public C6612e(long j, long j2, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.f20480a = j;
        this.f20481b = j2;
        this.f20482c = clientInfo;
        this.f20483d = num;
        this.f20484e = str;
        this.f20485f = list;
        this.f20486g = qosTier;
    }

    /* renamed from: a */
    public final ClientInfo mo22785a() {
        return this.f20482c;
    }

    /* renamed from: b */
    public final List<C6615h> mo22786b() {
        return this.f20485f;
    }

    /* renamed from: c */
    public final Integer mo22787c() {
        return this.f20483d;
    }

    /* renamed from: d */
    public final String mo22788d() {
        return this.f20484e;
    }

    /* renamed from: e */
    public final QosTier mo22789e() {
        return this.f20486g;
    }

    public final boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<C6615h> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6617i)) {
            return false;
        }
        C6617i iVar = (C6617i) obj;
        if (this.f20480a == iVar.mo22791f() && this.f20481b == iVar.mo22792g() && ((clientInfo = this.f20482c) != null ? clientInfo.equals(iVar.mo22785a()) : iVar.mo22785a() == null) && ((num = this.f20483d) != null ? num.equals(iVar.mo22787c()) : iVar.mo22787c() == null) && ((str = this.f20484e) != null ? str.equals(iVar.mo22788d()) : iVar.mo22788d() == null) && ((list = this.f20485f) != null ? list.equals(iVar.mo22786b()) : iVar.mo22786b() == null)) {
            QosTier qosTier = this.f20486g;
            if (qosTier == null) {
                if (iVar.mo22789e() == null) {
                    return true;
                }
            } else if (qosTier.equals(iVar.mo22789e())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final long mo22791f() {
        return this.f20480a;
    }

    /* renamed from: g */
    public final long mo22792g() {
        return this.f20481b;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        long j = this.f20480a;
        long j2 = this.f20481b;
        int i5 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.f20482c;
        int i6 = 0;
        if (clientInfo == null) {
            i = 0;
        } else {
            i = clientInfo.hashCode();
        }
        int i7 = (i5 ^ i) * 1000003;
        Integer num = this.f20483d;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        String str = this.f20484e;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        List<C6615h> list = this.f20485f;
        if (list == null) {
            i4 = 0;
        } else {
            i4 = list.hashCode();
        }
        int i11 = (i9 ^ i4) * 1000003;
        QosTier qosTier = this.f20486g;
        if (qosTier != null) {
            i6 = qosTier.hashCode();
        }
        return i11 ^ i6;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("LogRequest{requestTimeMs=");
        k.append(this.f20480a);
        k.append(", requestUptimeMs=");
        k.append(this.f20481b);
        k.append(", clientInfo=");
        k.append(this.f20482c);
        k.append(", logSource=");
        k.append(this.f20483d);
        k.append(", logSourceName=");
        k.append(this.f20484e);
        k.append(", logEvents=");
        k.append(this.f20485f);
        k.append(", qosTier=");
        k.append(this.f20486g);
        k.append("}");
        return k.toString();
    }
}
