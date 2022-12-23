package p924xt;

import com.moovit.app.stopdetail.BaseSectionAdapter;
import java.util.Comparator;
import java.util.List;
import p977zz.C20975x0;

/* renamed from: xt.j */
public final /* synthetic */ class C20602j implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f52113b;

    /* renamed from: c */
    public final /* synthetic */ Object f52114c;

    public /* synthetic */ C20602j(Object obj, int i) {
        this.f52113b = i;
        this.f52114c = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f52113b) {
            case 0:
                return ((Comparator) this.f52114c).compare(((C20595f) obj).f52087a, ((C20595f) obj2).f52087a);
            default:
                List list = (List) this.f52114c;
                return C20975x0.m49114a(list.contains(((BaseSectionAdapter.C15327d) obj).f39647a) ^ true ? 1 : 0, list.contains(((BaseSectionAdapter.C15327d) obj2).f39647a) ^ true ? 1 : 0);
        }
    }
}
