package p909xe;

import java.util.ArrayList;
import java.util.List;

/* renamed from: xe.a */
public final class C20464a extends C20471h {

    /* renamed from: a */
    public final String f51833a;

    /* renamed from: b */
    public final List<String> f51834b;

    public C20464a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f51833a = str;
            this.f51834b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    /* renamed from: a */
    public final List<String> mo52653a() {
        return this.f51834b;
    }

    /* renamed from: b */
    public final String mo52654b() {
        return this.f51833a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20471h)) {
            return false;
        }
        C20471h hVar = (C20471h) obj;
        if (!this.f51833a.equals(hVar.mo52654b()) || !this.f51834b.equals(hVar.mo52653a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f51833a.hashCode() ^ 1000003) * 1000003) ^ this.f51834b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("HeartBeatResult{userAgent=");
        k.append(this.f51833a);
        k.append(", usedDates=");
        k.append(this.f51834b);
        k.append("}");
        return k.toString();
    }
}
