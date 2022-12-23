package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;

/* renamed from: androidx.camera.core.impl.a */
public final class C0572a<T> extends Config.C0564a<T> {

    /* renamed from: a */
    public final String f1951a;

    /* renamed from: b */
    public final Class<T> f1952b;

    /* renamed from: c */
    public final Object f1953c;

    public C0572a(String str, Class<T> cls, Object obj) {
        if (str != null) {
            this.f1951a = str;
            if (cls != null) {
                this.f1952b = cls;
                this.f1953c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: b */
    public final String mo2447b() {
        return this.f1951a;
    }

    /* renamed from: c */
    public final Object mo2448c() {
        return this.f1953c;
    }

    /* renamed from: d */
    public final Class<T> mo2449d() {
        return this.f1952b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Config.C0564a)) {
            return false;
        }
        Config.C0564a aVar = (Config.C0564a) obj;
        if (this.f1951a.equals(aVar.mo2447b()) && this.f1952b.equals(aVar.mo2449d())) {
            Object obj2 = this.f1953c;
            if (obj2 == null) {
                if (aVar.mo2448c() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.mo2448c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f1951a.hashCode() ^ 1000003) * 1000003) ^ this.f1952b.hashCode()) * 1000003;
        Object obj = this.f1953c;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Option{id=");
        k.append(this.f1951a);
        k.append(", valueClass=");
        k.append(this.f1952b);
        k.append(", token=");
        return C16530d.m42015h(k, this.f1953c, "}");
    }
}
