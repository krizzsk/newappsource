package p988j$.time.format;

import java.util.ArrayList;

/* renamed from: j$.time.format.f */
final class C25801f implements C25802g {

    /* renamed from: a */
    private final C25802g[] f64348a;

    /* renamed from: b */
    private final boolean f64349b;

    C25801f(ArrayList arrayList, boolean z) {
        this((C25802g[]) arrayList.toArray(new C25802g[arrayList.size()]), z);
    }

    C25801f(C25802g[] gVarArr, boolean z) {
        this.f64348a = gVarArr;
        this.f64349b = z;
    }

    /* renamed from: a */
    public final boolean mo83675a(C25814s sVar, StringBuilder sb) {
        int length = sb.length();
        if (this.f64349b) {
            sVar.mo83714g();
        }
        try {
            for (C25802g a : this.f64348a) {
                if (!a.mo83675a(sVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (this.f64349b) {
                sVar.mo83708a();
            }
            return true;
        } finally {
            if (this.f64349b) {
                sVar.mo83708a();
            }
        }
    }

    /* renamed from: b */
    public final C25801f mo83677b() {
        return !this.f64349b ? this : new C25801f(this.f64348a, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f64348a != null) {
            sb.append(this.f64349b ? "[" : "(");
            for (C25802g append : this.f64348a) {
                sb.append(append);
            }
            sb.append(this.f64349b ? "]" : ")");
        }
        return sb.toString();
    }
}
