package n40;

import android.os.ConditionVariable;
import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.Time;
import h20.C17296a;
import h20.C17297b;
import java.io.IOException;
import java.net.HttpURLConnection;
import m40.C5701a;
import m40.C5702b;
import p358af.C13437d;
import p824tp.C19728f;
import q00.C19047a;
import zendesk.support.Constants;

/* renamed from: n40.c */
public final class C5860c extends C5858a<ServerId, C17297b> {

    /* renamed from: n40.c$a */
    public static class C5861a extends C17296a {
        public C5861a(C13752e eVar, C19728f fVar, C19047a aVar, ServerId serverId, Time time) {
            super(eVar, fVar, aVar, serverId, time, false);
        }

        /* renamed from: t */
        public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
            super.mo20116t(httpURLConnection);
            httpURLConnection.addRequestProperty(Constants.STANDARD_CACHING_HEADER, "only-if-cached");
        }
    }

    public C5860c(C5702b bVar, C5701a aVar, C13752e eVar, C19728f fVar, C19047a aVar2, Time time, ServerId serverId, ServerId serverId2) {
        super(bVar, aVar, eVar, fVar, aVar2, time, serverId, serverId2);
    }

    public final Object then(Task task) throws Exception {
        ConditionVariable conditionVariable;
        if (task.isSuccessful()) {
            ServerId serverId = (ServerId) task.getResult();
            C5701a aVar = this.f18501c;
            int i = this.f18508j;
            aVar.getClass();
            String b = C5701a.m14008b(i, serverId);
            synchronized (aVar.f18492a) {
                conditionVariable = aVar.f18492a.get(b);
                if (conditionVariable == null) {
                    conditionVariable = new ConditionVariable(true);
                    aVar.f18492a.put(b, conditionVariable);
                }
            }
            conditionVariable.block();
            conditionVariable.close();
            try {
                C5701a aVar2 = this.f18501c;
                int i2 = this.f18508j;
                aVar2.getClass();
                C17297b bVar = (C17297b) aVar2.f18493b.get(C5701a.m14008b(i2, serverId));
                if (bVar == null) {
                    bVar = (C17297b) new C5861a(this.f18503e, this.f18504f, this.f18506h, serverId, this.f18507i).mo52626J();
                    C5701a aVar3 = this.f18501c;
                    int i3 = this.f18508j;
                    aVar3.getClass();
                    aVar3.f18493b.put(C5701a.m14008b(i3, serverId), bVar);
                }
                return bVar;
            } finally {
                this.f18501c.mo21543d(this.f18508j, serverId);
            }
        } else {
            throw new RuntimeException(C13437d.m33705j(C5860c.class, new StringBuilder(), " Failed!"), task.getException());
        }
    }
}
