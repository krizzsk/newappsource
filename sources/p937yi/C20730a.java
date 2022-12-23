package p937yi;

import java.util.ArrayList;
import p408cj.C13838a;
import p408cj.C13839b;
import p913xi.C20531d;

/* renamed from: yi.a */
public final class C20730a {

    /* renamed from: a */
    public final /* synthetic */ int f52333a;

    /* renamed from: b */
    public final C20531d f52334b;

    public /* synthetic */ C20730a(C20531d dVar, int i) {
        this.f52333a = i;
        this.f52334b = dVar;
    }

    /* renamed from: a */
    public final ArrayList mo52882a() {
        switch (this.f52333a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C20733d(this.f52334b));
                arrayList.add(new C20731b(this.f52334b));
                arrayList.add(new C20734e(this.f52334b));
                arrayList.add(new C20732c(this.f52334b));
                return arrayList;
            default:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C13839b(this.f52334b));
                arrayList2.add(new C13838a(this.f52334b));
                return arrayList2;
        }
    }
}
