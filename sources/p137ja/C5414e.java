package p137ja;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import p583jk.C17875h;

/* renamed from: ja.e */
public final class C5414e {

    /* renamed from: a */
    public final String f17772a;

    /* renamed from: b */
    public final Format f17773b;

    /* renamed from: c */
    public final Format f17774c;

    /* renamed from: d */
    public final int f17775d;

    /* renamed from: e */
    public final int f17776e;

    public C5414e(String str, Format format, Format format2, int i, int i2) {
        boolean z;
        if (i == 0 || i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        if (!TextUtils.isEmpty(str)) {
            this.f17772a = str;
            format.getClass();
            this.f17773b = format;
            format2.getClass();
            this.f17774c = format2;
            this.f17775d = i;
            this.f17776e = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5414e.class != obj.getClass()) {
            return false;
        }
        C5414e eVar = (C5414e) obj;
        if (this.f17775d != eVar.f17775d || this.f17776e != eVar.f17776e || !this.f17772a.equals(eVar.f17772a) || !this.f17773b.equals(eVar.f17773b) || !this.f17774c.equals(eVar.f17774c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = C13715c.m34238d(this.f17772a, (((this.f17775d + 527) * 31) + this.f17776e) * 31, 31);
        return this.f17774c.hashCode() + ((this.f17773b.hashCode() + d) * 31);
    }
}
