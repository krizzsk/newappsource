package p037c5;

import java.util.ArrayList;
import java.util.List;
import p120i5.C5280a;
import p332z4.C7456a;
import p332z4.C7471j;
import p332z4.C7472k;

/* renamed from: c5.e */
public final class C1784e implements C1792m {

    /* renamed from: b */
    public final List f6255b;

    public /* synthetic */ C1784e(List list) {
        this.f6255b = list;
    }

    /* renamed from: e */
    public final boolean mo6603e() {
        return this.f6255b.size() == 1 && ((C5280a) this.f6255b.get(0)).mo21082c();
    }

    /* renamed from: i */
    public final C7456a mo6602i() {
        if (((C5280a) this.f6255b.get(0)).mo21082c()) {
            return new C7472k(this.f6255b);
        }
        return new C7471j(this.f6255b);
    }

    /* renamed from: j */
    public final List mo6604j() {
        return this.f6255b;
    }

    public /* synthetic */ C1784e() {
        this.f6255b = new ArrayList();
    }
}
