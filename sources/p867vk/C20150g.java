package p867vk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p843uk.C19950t;

/* renamed from: vk.g */
public final class C20150g {

    /* renamed from: a */
    public final List<C19950t> f51142a;

    /* renamed from: b */
    public final C20148e f51143b;

    public C20150g(ArrayList arrayList, C20148e eVar) {
        this.f51142a = arrayList;
        this.f51143b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20150g.class != obj.getClass()) {
            return false;
        }
        C20150g gVar = (C20150g) obj;
        if (!Objects.equals(this.f51142a, gVar.f51142a) || !Objects.equals(this.f51143b, gVar.f51143b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51142a, this.f51143b});
    }
}
