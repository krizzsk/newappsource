package p453dw;

import com.moovit.app.stopdetail.BaseSectionAdapter;
import com.moovit.transit.Schedule;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p977zz.C20975x0;

/* renamed from: dw.b */
public final /* synthetic */ class C16726b implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ List f43566b;

    /* renamed from: c */
    public final /* synthetic */ Schedule.C7799d f43567c;

    public /* synthetic */ C16726b(ArrayList arrayList, Schedule.C7799d dVar) {
        this.f43566b = arrayList;
        this.f43567c = dVar;
    }

    public final int compare(Object obj, Object obj2) {
        List list = this.f43566b;
        Schedule.C7799d dVar = this.f43567c;
        BaseSectionAdapter.C15327d dVar2 = (BaseSectionAdapter.C15327d) obj;
        BaseSectionAdapter.C15327d dVar3 = (BaseSectionAdapter.C15327d) obj2;
        int a = C20975x0.m49114a(list.contains(dVar2.f39647a) ^ true ? 1 : 0, list.contains(dVar3.f39647a) ^ true ? 1 : 0);
        if (a != 0) {
            return a;
        }
        return C20975x0.m49116c(dVar2.f39648b.mo24328s(dVar.f23661b), dVar3.f39648b.mo24328s(dVar.f23661b));
    }
}
