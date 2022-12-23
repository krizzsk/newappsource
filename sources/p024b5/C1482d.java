package p024b5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: b5.d */
public final class C1482d {

    /* renamed from: c */
    public static final C1482d f5381c = new C1482d("COMPOSITION");

    /* renamed from: a */
    public final List<String> f5382a;

    /* renamed from: b */
    public C1483e f5383b;

    public C1482d(String... strArr) {
        this.f5382a = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public final boolean mo5834a(int i, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i >= this.f5382a.size()) {
            return false;
        }
        if (i == this.f5382a.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f5382a.get(i);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z) {
                if (i != this.f5382a.size() - 2) {
                    return false;
                }
                List<String> list = this.f5382a;
                if (!list.get(list.size() - 1).equals("**")) {
                    return false;
                }
            }
            if (z3) {
                return true;
            }
            return false;
        }
        if (z || !this.f5382a.get(i + 1).equals(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (i != this.f5382a.size() - 2) {
                if (i != this.f5382a.size() - 3) {
                    return false;
                }
                List<String> list2 = this.f5382a;
                if (list2.get(list2.size() - 1).equals("**")) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f5382a.size() - 1) {
                return false;
            }
            return this.f5382a.get(i2).equals(str);
        }
    }

    /* renamed from: b */
    public final int mo5835b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!this.f5382a.get(i).equals("**")) {
            return 1;
        }
        if (i != this.f5382a.size() - 1 && this.f5382a.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: c */
    public final boolean mo5836c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.f5382a.size()) {
            return false;
        }
        if (this.f5382a.get(i).equals(str) || this.f5382a.get(i).equals("**") || this.f5382a.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo5837d(int i, String str) {
        if (!"__container".equals(str) && i >= this.f5382a.size() - 1 && !this.f5382a.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    public final String toString() {
        boolean z;
        StringBuilder k = C13555b.m33972k("KeyPath{keys=");
        k.append(this.f5382a);
        k.append(",resolved=");
        if (this.f5383b != null) {
            z = true;
        } else {
            z = false;
        }
        return C13715c.m34247m(k, z, '}');
    }

    public C1482d(C1482d dVar) {
        this.f5382a = new ArrayList(dVar.f5382a);
        this.f5383b = dVar.f5383b;
    }
}
