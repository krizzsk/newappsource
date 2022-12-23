package p453dw;

import com.moovit.app.stopdetail.BaseSectionAdapter;
import com.moovit.transit.Schedule;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p977zz.C20975x0;

/* renamed from: dw.a */
public final /* synthetic */ class C16725a implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ List f43564b;

    /* renamed from: c */
    public final /* synthetic */ Comparator f43565c;

    public /* synthetic */ C16725a(ArrayList arrayList, Schedule.C7799d dVar) {
        this.f43564b = arrayList;
        this.f43565c = dVar;
    }

    public final int compare(Object obj, Object obj2) {
        List list = this.f43564b;
        Comparator comparator = this.f43565c;
        BaseSectionAdapter.C15327d dVar = (BaseSectionAdapter.C15327d) obj;
        BaseSectionAdapter.C15327d dVar2 = (BaseSectionAdapter.C15327d) obj2;
        int a = C20975x0.m49114a(list.contains(dVar.f39647a) ^ true ? 1 : 0, list.contains(dVar2.f39647a) ^ true ? 1 : 0);
        if (a == 0) {
            return comparator.compare(dVar.f39648b, dVar2.f39648b);
        }
        return a;
    }
}
