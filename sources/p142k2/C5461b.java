package p142k2;

import android.text.TextUtils;
import p229r1.C6232b;

/* renamed from: k2.b */
public class C5461b {

    /* renamed from: a */
    public String f17981a;

    /* renamed from: b */
    public int f17982b;

    /* renamed from: c */
    public int f17983c;

    public C5461b(String str, int i, int i2) {
        this.f17981a = str;
        this.f17982b = i;
        this.f17983c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5461b)) {
            return false;
        }
        C5461b bVar = (C5461b) obj;
        if (this.f17982b < 0 || bVar.f17982b < 0) {
            if (!TextUtils.equals(this.f17981a, bVar.f17981a) || this.f17983c != bVar.f17983c) {
                return false;
            }
            return true;
        } else if (TextUtils.equals(this.f17981a, bVar.f17981a) && this.f17982b == bVar.f17982b && this.f17983c == bVar.f17983c) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return C6232b.m14817b(this.f17981a, Integer.valueOf(this.f17983c));
    }
}
