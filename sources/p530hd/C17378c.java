package p530hd;

import android.app.PendingIntent;
import java.util.List;
import p001a0.C0017h;

/* renamed from: hd.c */
public final class C17378c extends C17376a {

    /* renamed from: a */
    public final int f44764a;

    /* renamed from: b */
    public final int f44765b;

    /* renamed from: c */
    public final int f44766c;

    /* renamed from: d */
    public final long f44767d;

    /* renamed from: e */
    public final long f44768e;

    /* renamed from: f */
    public final List f44769f;

    /* renamed from: g */
    public final List f44770g;

    /* renamed from: h */
    public final PendingIntent f44771h;

    /* renamed from: i */
    public final List f44772i;

    public C17378c(int i, int i2, int i3, long j, long j2, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f44764a = i;
        this.f44765b = i2;
        this.f44766c = i3;
        this.f44767d = j;
        this.f44768e = j2;
        this.f44769f = list;
        this.f44770g = list2;
        this.f44771h = pendingIntent;
        this.f44772i = list3;
    }

    /* renamed from: a */
    public final long mo49842a() {
        return this.f44767d;
    }

    /* renamed from: b */
    public final int mo49843b() {
        return this.f44766c;
    }

    @Deprecated
    /* renamed from: c */
    public final PendingIntent mo49844c() {
        return this.f44771h;
    }

    /* renamed from: d */
    public final int mo49845d() {
        return this.f44764a;
    }

    /* renamed from: e */
    public final int mo49846e() {
        return this.f44765b;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17376a) {
            C17376a aVar = (C17376a) obj;
            if (this.f44764a == aVar.mo49845d() && this.f44765b == aVar.mo49846e() && this.f44766c == aVar.mo49843b() && this.f44767d == aVar.mo49842a() && this.f44768e == aVar.mo49847f() && ((list = this.f44769f) != null ? list.equals(aVar.mo49849h()) : aVar.mo49849h() == null) && ((list2 = this.f44770g) != null ? list2.equals(aVar.mo49848g()) : aVar.mo49848g() == null) && ((pendingIntent = this.f44771h) != null ? pendingIntent.equals(aVar.mo49844c()) : aVar.mo49844c() == null) && ((list3 = this.f44772i) != null ? list3.equals(aVar.mo49850i()) : aVar.mo49850i() == null)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final long mo49847f() {
        return this.f44768e;
    }

    /* renamed from: g */
    public final List mo49848g() {
        return this.f44770g;
    }

    /* renamed from: h */
    public final List mo49849h() {
        return this.f44769f;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.f44764a;
        int i5 = this.f44765b;
        int i6 = this.f44766c;
        long j = this.f44767d;
        long j2 = this.f44768e;
        int i7 = (((((((((i4 ^ 1000003) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List list = this.f44769f;
        int i8 = 0;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i9 = (i7 ^ i) * 1000003;
        List list2 = this.f44770g;
        if (list2 == null) {
            i2 = 0;
        } else {
            i2 = list2.hashCode();
        }
        int i11 = (i9 ^ i2) * 1000003;
        PendingIntent pendingIntent = this.f44771h;
        if (pendingIntent == null) {
            i3 = 0;
        } else {
            i3 = pendingIntent.hashCode();
        }
        int i12 = (i11 ^ i3) * 1000003;
        List list3 = this.f44772i;
        if (list3 != null) {
            i8 = list3.hashCode();
        }
        return i12 ^ i8;
    }

    /* renamed from: i */
    public final List mo49850i() {
        return this.f44772i;
    }

    public final String toString() {
        int i = this.f44764a;
        int i2 = this.f44765b;
        int i3 = this.f44766c;
        long j = this.f44767d;
        long j2 = this.f44768e;
        String valueOf = String.valueOf(this.f44769f);
        String valueOf2 = String.valueOf(this.f44770g);
        String valueOf3 = String.valueOf(this.f44771h);
        String valueOf4 = String.valueOf(this.f44772i);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + valueOf3.length() + valueOf4.length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        C0017h.m61R(sb, valueOf, ", languagesNullable=", valueOf2, ", resolutionIntent=");
        return C13715c.m34246l(sb, valueOf3, ", splitFileIntents=", valueOf4, "}");
    }
}
