package p785ry;

import c00.C13723g;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.app.wondo.tickets.model.WondoOffer;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import j90.C12789b;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import s90.C13076d;

/* renamed from: ry.c */
public final /* synthetic */ class C19383c implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ int f49310b;

    /* renamed from: c */
    public final /* synthetic */ ServerId f49311c;

    public /* synthetic */ C19383c(int i, ServerId serverId) {
        this.f49310b = i;
        this.f49311c = serverId;
    }

    public final Task then(Object obj) {
        switch (this.f49310b) {
            case 0:
                return Tasks.forResult((WondoOffer) C13723g.m34286g((List) obj, new C19384d(0, this.f49311c)));
            default:
                ServerId serverId = this.f49311c;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                C12789b bVar = (C12789b) C13723g.m34286g(((C13076d) obj).f32348c, new C19384d(1, serverId));
                if (bVar != null) {
                    return Tasks.forResult(bVar);
                }
                return Tasks.forException(new ApplicationBugException("Couldn't find validation info of provider with id: " + serverId));
        }
    }
}
