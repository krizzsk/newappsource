package p732pq;

import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import com.moovit.app.actions.notifydriver.NotifyDriverLineSelectionActivity;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.util.time.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import n10.C18509f;
import p824tp.C19728f;
import p906wz.C20430b;
import p906wz.C20431c;
import p952yy.C20787c;
import p952yy.C20789d;
import p952yy.C20791e;

/* renamed from: pq.o */
public final class C18955o extends C20430b<C20789d, C20791e> {

    /* renamed from: d */
    public final /* synthetic */ NotifyDriverLineSelectionActivity f48264d;

    public C18955o(NotifyDriverLineSelectionActivity notifyDriverLineSelectionActivity) {
        this.f48264d = notifyDriverLineSelectionActivity;
    }

    /* renamed from: b */
    public final void mo21077b(C20431c cVar, ArrayList arrayList, ArrayList arrayList2) {
        Time time;
        C20789d dVar = (C20789d) cVar;
        if (arrayList2.isEmpty()) {
            NotifyDriverLineSelectionActivity notifyDriverLineSelectionActivity = this.f48264d;
            int i = NotifyDriverLineSelectionActivity.f37425r0;
            notifyDriverLineSelectionActivity.getClass();
            Time time2 = new Time(TimeUnit.MINUTES.toMillis(notifyDriverLineSelectionActivity.f37434p0) + System.currentTimeMillis());
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C20787c cVar2 = ((C20791e) it.next()).f52474m;
                TransitLine transitLine = (TransitLine) notifyDriverLineSelectionActivity.f37431m0.get(cVar2.f52456a);
                if (transitLine != null) {
                    Schedule schedule = cVar2.f52458c;
                    int z = schedule.mo24334z(time2);
                    if (z >= 0) {
                        time = schedule.mo24331u(z - 1);
                    } else {
                        time = schedule.mo24331u((-z) - 2);
                    }
                    if (time != null) {
                        arrayList3.add(new NotifyDriverLineSelectionActivity.C14721d(transitLine, schedule));
                    }
                }
            }
            if (C13717b.m34258e(arrayList3)) {
                notifyDriverLineSelectionActivity.f37432n0.mo4627l0(notifyDriverLineSelectionActivity.f37428Y);
                notifyDriverLineSelectionActivity.f37427X.setVisibility(8);
            } else {
                Collections.sort(arrayList3, new C18954n(new C18509f(arrayList3.size()), 0));
                notifyDriverLineSelectionActivity.f37427X.setVisibility(0);
                RecyclerView.Adapter adapter = notifyDriverLineSelectionActivity.f37432n0.getAdapter();
                if (adapter instanceof NotifyDriverLineSelectionActivity.C14720c) {
                    ((NotifyDriverLineSelectionActivity.C14720c) adapter).mo39637k(arrayList3);
                } else {
                    NotifyDriverLineSelectionActivity.C14720c cVar3 = new NotifyDriverLineSelectionActivity.C14720c((C19728f) notifyDriverLineSelectionActivity.mo44537r1("METRO_CONTEXT"), notifyDriverLineSelectionActivity);
                    cVar3.mo39637k(arrayList3);
                    notifyDriverLineSelectionActivity.f37432n0.mo4627l0(cVar3);
                }
            }
        } else if (this.f48264d.f37427X.getVisibility() != 0) {
            NotifyDriverLineSelectionActivity notifyDriverLineSelectionActivity2 = this.f48264d;
            notifyDriverLineSelectionActivity2.f37432n0.mo4627l0(notifyDriverLineSelectionActivity2.f37428Y);
            notifyDriverLineSelectionActivity2.f37427X.setVisibility(8);
        }
        this.f48264d.f37426U.mo23802c();
    }
}
