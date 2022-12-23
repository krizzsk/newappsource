package n40;

import android.os.ConditionVariable;
import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitPattern;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TripId;
import com.moovit.util.time.Time;
import h20.C17297b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m40.C5701a;
import m40.C5702b;
import p358af.C13437d;
import p824tp.C19728f;
import q00.C19047a;

/* renamed from: n40.b */
public final class C5859b extends C5858a<C17297b, Collection<Time>> {
    public C5859b(C5702b bVar, C5701a aVar, C13752e eVar, C19728f fVar, C19047a aVar2, Time time, ServerId serverId, ServerId serverId2) {
        super(bVar, aVar, eVar, fVar, aVar2, time, serverId, serverId2);
    }

    /* renamed from: a */
    public final List mo21734a(C17297b bVar) {
        List<TransitPatternTrips> list = bVar.f44686n.get(this.f18849k);
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (TransitPatternTrips transitPatternTrips : list) {
            TransitPattern transitPattern = transitPatternTrips.f23717b;
            if (transitPattern.mo24390g(this.f18850l)) {
                int f = transitPattern.mo24389f();
                int[] d = transitPattern.mo24386d(this.f18850l);
                for (TripId b : transitPatternTrips.f23718c) {
                    Schedule b2 = transitPatternTrips.mo24403b(b);
                    if (b2 != null) {
                        for (int i : d) {
                            if (i != f - 1) {
                                arrayList.add(b2.mo24331u(i));
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final Object then(Task task) throws Exception {
        ConditionVariable conditionVariable;
        if (task.isSuccessful()) {
            C5701a aVar = this.f18501c;
            int i = this.f18508j;
            ServerId serverId = this.f18849k;
            ServerId serverId2 = this.f18850l;
            aVar.getClass();
            String a = C5701a.m14007a(i, serverId, serverId2);
            synchronized (aVar.f18494c) {
                conditionVariable = aVar.f18494c.get(a);
                if (conditionVariable == null) {
                    conditionVariable = new ConditionVariable(true);
                    aVar.f18494c.put(a, conditionVariable);
                }
            }
            conditionVariable.block();
            conditionVariable.close();
            try {
                C5701a aVar2 = this.f18501c;
                int i2 = this.f18508j;
                ServerId serverId3 = this.f18849k;
                ServerId serverId4 = this.f18850l;
                aVar2.getClass();
                Collection collection = (Collection) aVar2.f18495d.get(C5701a.m14007a(i2, serverId3, serverId4));
                if (collection == null) {
                    collection = mo21734a((C17297b) task.getResult());
                    C5701a aVar3 = this.f18501c;
                    int i3 = this.f18508j;
                    ServerId serverId5 = this.f18849k;
                    ServerId serverId6 = this.f18850l;
                    Collection unmodifiableCollection = Collections.unmodifiableCollection(collection);
                    aVar3.getClass();
                    aVar3.f18495d.put(C5701a.m14007a(i3, serverId5, serverId6), unmodifiableCollection);
                }
                return collection;
            } finally {
                this.f18501c.mo21542c(this.f18508j, this.f18849k, this.f18850l);
            }
        } else {
            throw new RuntimeException(C13437d.m33705j(C5859b.class, new StringBuilder(), " Failed!"), task.getException());
        }
    }
}
