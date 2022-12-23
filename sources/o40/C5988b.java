package o40;

import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import m40.C5701a;
import m40.C5702b;
import n40.C5863e;
import p358af.C13437d;
import p824tp.C19728f;
import p952yy.C20787c;
import q00.C19047a;

/* renamed from: o40.b */
public final class C5988b extends C5989c<Set<ServerId>, List<C20787c>> {
    public C5988b(C5702b bVar, C5701a aVar, C13752e eVar, C19728f fVar, C19047a aVar2, Time time, ServerId serverId) {
        super(bVar, aVar, eVar, fVar, aVar2, time, serverId);
    }

    public final Object then(Task task) throws Exception {
        C5988b bVar = this;
        if (task.isSuccessful()) {
            Set<ServerId> set = (Set) task.getResult();
            ArrayList arrayList = new ArrayList(set.size());
            for (ServerId a : set) {
                arrayList.add(bVar.f18500b.mo21544a(bVar.f18503e, bVar.f18504f, bVar.f18506h, a, bVar.f19147k, bVar.f18507i));
            }
            Tasks.await(Tasks.whenAll((Collection<? extends Task<?>>) arrayList));
            Iterator it = arrayList.iterator();
            long j = -1;
            while (it.hasNext()) {
                List<Time> list = ((C20787c) ((Task) it.next()).getResult()).f52458c.f23660b;
                if (!list.isEmpty()) {
                    long j2 = list.get(list.size() - 1).f23901b;
                    if (j == -1 || Long.compare(j2, j) > 0) {
                        j = j2;
                    }
                }
            }
            if (j != -1) {
                arrayList.clear();
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    C5702b bVar2 = bVar.f18500b;
                    C13752e eVar = bVar.f18503e;
                    C19728f fVar = bVar.f18504f;
                    C19047a aVar = bVar.f18506h;
                    ServerId serverId = bVar.f19147k;
                    Time time = bVar.f18507i;
                    Time time2 = new Time(j);
                    bVar2.getClass();
                    Task forResult = Tasks.forResult(Boolean.TRUE);
                    C5863e eVar2 = r8;
                    Iterator it3 = it2;
                    ThreadPoolExecutor threadPoolExecutor = bVar2.f18498c;
                    C5863e eVar3 = new C5863e(bVar2, bVar2.f18496a, eVar, fVar, aVar, (ServerId) it2.next(), serverId, time, time2, Integer.MAX_VALUE);
                    arrayList.add(forResult.continueWith(threadPoolExecutor, eVar2));
                    bVar = this;
                    it2 = it3;
                }
                Tasks.await(Tasks.whenAll((Collection<? extends Task<?>>) arrayList));
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList2.add((C20787c) ((Task) it4.next()).getResult());
            }
            return arrayList2;
        }
        throw new RuntimeException(C13437d.m33705j(C5988b.class, new StringBuilder(), " Failed!"), task.getException());
    }
}
