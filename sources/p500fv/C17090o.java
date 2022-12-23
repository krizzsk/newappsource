package p500fv;

import com.moovit.metro.ReportCategoryType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: fv.o */
public final class C17090o {

    /* renamed from: c */
    public static C17090o f44263c;

    /* renamed from: a */
    public ArrayList f44264a;

    /* renamed from: b */
    public ArrayList f44265b;

    /* renamed from: c */
    public static C17090o m43019c() {
        if (f44263c == null) {
            f44263c = new C17090o();
        }
        return f44263c;
    }

    /* renamed from: a */
    public final C17076a mo49687a(ReportCategoryType reportCategoryType) {
        if (this.f44265b == null) {
            ArrayList arrayList = new ArrayList();
            this.f44265b = arrayList;
            arrayList.add(new C17085j());
            this.f44265b.add(new C17087l());
            this.f44265b.add(new C17083h());
            this.f44265b.add(new C17084i());
            this.f44265b.add(new C17095t());
            this.f44265b.add(new C17101z());
            this.f44265b.add(new C17100y());
        }
        Iterator it = this.f44265b.iterator();
        while (it.hasNext()) {
            C17076a aVar = (C17076a) it.next();
            if (aVar.mo49678a(reportCategoryType)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final ArrayList mo49688b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17076a a = mo49687a((ReportCategoryType) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final C17091p mo49689d(ReportCategoryType reportCategoryType) {
        if (this.f44264a == null) {
            ArrayList arrayList = new ArrayList();
            this.f44264a = arrayList;
            arrayList.add(new C17080e());
            this.f44264a.add(new C17079d());
            this.f44264a.add(new C17082g());
            this.f44264a.add(new C17086k());
            this.f44264a.add(new C17081f());
            this.f44264a.add(new C17078c());
            this.f44264a.add(new C17088m());
            this.f44264a.add(new C17096u());
            this.f44264a.add(new C17097v());
            this.f44264a.add(new C17099x());
            this.f44264a.add(new C17094s());
            this.f44264a.add(new C17098w());
        }
        Iterator it = this.f44264a.iterator();
        while (it.hasNext()) {
            C17091p pVar = (C17091p) it.next();
            if (pVar.mo49678a(reportCategoryType)) {
                return pVar;
            }
        }
        return null;
    }
}
