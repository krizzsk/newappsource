package p853uu;

import c00.C13723g;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.network.model.ServerId;
import java.util.Collections;
import java.util.List;
import p394br.C13661g;

/* renamed from: uu.a */
public final class C19991a implements SuccessContinuation<List<MotActivation>, List<MotActivation>> {

    /* renamed from: b */
    public final ServerId f50827b;

    public C19991a(ServerId serverId) {
        this.f50827b = serverId;
    }

    public final Task then(Object obj) throws Exception {
        List list = (List) obj;
        if (list == null) {
            throw new IllegalStateException("MOT activation may not be null!");
        } else if (this.f50827b == null) {
            return Tasks.forResult(list);
        } else {
            MotActivation motActivation = (MotActivation) C13723g.m34286g(list, new C13661g(this, 2));
            if (motActivation != null) {
                list = Collections.singletonList(motActivation);
            }
            return Tasks.forResult(list);
        }
    }
}
