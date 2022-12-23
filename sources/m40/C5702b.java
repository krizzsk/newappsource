package m40;

import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.Time;
import java.util.concurrent.ThreadPoolExecutor;
import n40.C5863e;
import p172m9.C5720b;
import p824tp.C19728f;
import p952yy.C20787c;
import q00.C19047a;

/* renamed from: m40.b */
public final class C5702b {

    /* renamed from: a */
    public final C5701a f18496a = new C5701a();

    /* renamed from: b */
    public final ThreadPoolExecutor f18497b = C5720b.m14033A(2, "af-stop");

    /* renamed from: c */
    public final ThreadPoolExecutor f18498c = C5720b.m14033A(3, "af-line");

    /* renamed from: d */
    public final ThreadPoolExecutor f18499d = C5720b.m14033A(5, "af-arrivals");

    /* renamed from: a */
    public final Task<C20787c> mo21544a(C13752e eVar, C19728f fVar, C19047a aVar, ServerId serverId, ServerId serverId2, Time time) {
        return Tasks.forResult(Boolean.TRUE).continueWith(this.f18498c, new C5863e(this, this.f18496a, eVar, fVar, aVar, serverId, serverId2, time, (Time) null, 2));
    }
}
