package p819tk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: tk.g */
public final class C19690g {

    /* renamed from: a */
    public final Map<String, String> f49979a;

    /* renamed from: b */
    public final byte[] f49980b;

    /* renamed from: c */
    public final int f49981c;

    public C19690g(int i, HashMap hashMap, byte[] bArr) {
        this.f49979a = hashMap;
        this.f49980b = bArr;
        this.f49981c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19690g.class != obj.getClass()) {
            return false;
        }
        C19690g gVar = (C19690g) obj;
        if (this.f49981c != gVar.f49981c || !Arrays.equals(this.f49980b, gVar.f49980b) || !Objects.equals(this.f49979a, gVar.f49979a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = {this.f49979a, Integer.valueOf(this.f49981c)};
        return Arrays.hashCode(this.f49980b) + (Objects.hash(objArr) * 31);
    }
}
