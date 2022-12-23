package n40;

import android.content.Context;
import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.Time;
import java.util.Collections;
import java.util.Set;
import m40.C5701a;
import m40.C5702b;
import p358af.C13437d;
import p824tp.C19728f;
import q00.C19047a;
import u00.C19848o;

/* renamed from: n40.d */
public final class C5862d extends C5858a<Boolean, ServerId> {
    public C5862d(C5702b bVar, C5701a aVar, C13752e eVar, C19728f fVar, C19047a aVar2, Time time, ServerId serverId, ServerId serverId2) {
        super(bVar, aVar, eVar, fVar, aVar2, time, serverId, serverId2);
    }

    public final Object then(Task task) throws Exception {
        ServerId serverId;
        if (task.isSuccessful()) {
            C19848o e = this.f18505g.mo51803e();
            Context context = this.f18502d;
            ServerId serverId2 = this.f18849k;
            e.getClass();
            Set<ServerId> i = e.mo52150i(context, Collections.singleton(serverId2));
            if (i.isEmpty()) {
                serverId = null;
            } else {
                serverId = i.iterator().next();
            }
            if (serverId != null) {
                return serverId;
            }
            StringBuilder k = C13555b.m33972k("Unable to fine line group id for line id=");
            k.append(this.f18849k);
            throw new ApplicationBugException(k.toString());
        }
        throw new RuntimeException(C13437d.m33705j(C5862d.class, new StringBuilder(), " Failed!"), task.getException());
    }
}
