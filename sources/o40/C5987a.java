package o40;

import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.Time;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m40.C5701a;
import m40.C5702b;
import p358af.C13437d;
import p824tp.C19728f;
import q00.C19047a;

/* renamed from: o40.a */
public final class C5987a extends C5989c<Boolean, Set<ServerId>> {
    public C5987a(C5702b bVar, C5701a aVar, C13752e eVar, C19728f fVar, C19047a aVar2, Time time, ServerId serverId) {
        super(bVar, aVar, eVar, fVar, aVar2, time, serverId);
    }

    public final Object then(Task task) throws Exception {
        if (task.isSuccessful()) {
            TransitStop h = this.f18505g.mo51806h().mo52152h(this.f18502d, this.f19147k);
            if (h != null) {
                List<DbEntityRef<TransitLine>> list = h.f23735g;
                HashSet hashSet = new HashSet(list.size());
                ServerId.m11394f(list, hashSet);
                return hashSet;
            }
            StringBuilder k = C13555b.m33972k("Unable to find stop id=");
            k.append(this.f19147k);
            throw new ApplicationBugException(k.toString());
        }
        throw new RuntimeException(C13437d.m33705j(C5987a.class, new StringBuilder(), " Failed!"), task.getException());
    }
}
