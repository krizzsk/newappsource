package p946ys;

import ce0.C21100e;
import com.moovit.util.Text;
import p583jk.C17884p;

/* renamed from: ys.a */
public final class C20760a {

    /* renamed from: a */
    public final long f52377a;

    /* renamed from: b */
    public final String f52378b;

    /* renamed from: c */
    public final Text f52379c;

    /* renamed from: d */
    public final int f52380d;

    /* renamed from: e */
    public final int f52381e;

    public C20760a(long j, String str, Text text, int i, int i2) {
        this.f52377a = j;
        C21100e.m49373x(str, "title");
        this.f52378b = str;
        this.f52379c = text;
        this.f52381e = i2;
        this.f52380d = i;
    }

    /* renamed from: a */
    public final Long mo52895a() {
        return Long.valueOf(this.f52377a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C20760a) && this.f52377a == ((C20760a) obj).f52377a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C17884p.m44334E(this.f52377a);
    }
}
