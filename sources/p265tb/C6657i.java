package p265tb;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0016g;
import p001a0.C0017h;
import p583jk.C17875h;

/* renamed from: tb.i */
public final class C6657i {

    /* renamed from: a */
    public final Uri f20668a;

    /* renamed from: b */
    public final long f20669b;

    /* renamed from: c */
    public final int f20670c;

    /* renamed from: d */
    public final byte[] f20671d;

    /* renamed from: e */
    public final Map<String, String> f20672e;

    /* renamed from: f */
    public final long f20673f;

    /* renamed from: g */
    public final long f20674g;

    /* renamed from: h */
    public final String f20675h;

    /* renamed from: i */
    public final int f20676i;

    /* renamed from: j */
    public final Object f20677j;

    public C6657i(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        boolean z;
        boolean z2;
        long j4 = j;
        byte[] bArr2 = bArr;
        long j5 = j2;
        long j6 = j3;
        boolean z3 = true;
        if (j4 + j5 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        if (j5 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17875h.m44301k(z2);
        if (j6 <= 0 && j6 != -1) {
            z3 = false;
        }
        C17875h.m44301k(z3);
        this.f20668a = uri;
        this.f20669b = j4;
        this.f20670c = i;
        this.f20671d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f20672e = Collections.unmodifiableMap(new HashMap(map));
        this.f20673f = j5;
        this.f20674g = j6;
        this.f20675h = str;
        this.f20676i = i2;
        this.f20677j = obj;
    }

    public final String toString() {
        String str;
        int i = this.f20670c;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else if (i == 3) {
            str = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        String valueOf = String.valueOf(this.f20668a);
        long j = this.f20673f;
        long j2 = this.f20674g;
        String str2 = this.f20675h;
        int i2 = this.f20676i;
        StringBuilder O = C0017h.m58O(C0016g.m25h(str2, valueOf.length() + str.length() + 70), "DataSpec[", str, " ", valueOf);
        O.append(", ");
        O.append(j);
        O.append(", ");
        C25541a.m63889t(O, j2, ", ", str2);
        O.append(", ");
        O.append(i2);
        O.append("]");
        return O.toString();
    }
}
