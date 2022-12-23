package p453dw;

import com.moovit.app.stopdetail.BaseSectionAdapter;
import com.moovit.transit.Schedule;
import java.util.Comparator;

/* renamed from: dw.c */
public final /* synthetic */ class C16727c implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ Comparator f43568b;

    public /* synthetic */ C16727c(Schedule.C7799d dVar) {
        this.f43568b = dVar;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f43568b.compare(((BaseSectionAdapter.C15327d) obj).f39648b, ((BaseSectionAdapter.C15327d) obj2).f39648b);
    }
}
