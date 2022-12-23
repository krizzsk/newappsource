package p426ct;

import aa0.C7537i;
import android.content.Context;
import android.content.SharedPreferences;
import c00.C13732m;
import ce0.C21100e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.network.model.ServerId;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.List;
import p567iq.C17635b;
import p922xr.C20563b;
import p977zz.C20944i0;

/* renamed from: ct.e */
public final class C16496e implements Continuation<C20944i0<Boolean, C13732m<HistoryItem>>, Boolean> {

    /* renamed from: b */
    public final Context f43082b;

    /* renamed from: c */
    public final ServerId f43083c;

    /* renamed from: d */
    public final C13732m<HistoryItem> f43084d;

    public C16496e(Context context, ServerId serverId, C13732m<HistoryItem> mVar) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f43082b = context;
        C21100e.m49373x(serverId, "metroId");
        this.f43083c = serverId;
        C21100e.m49373x(mVar, "items");
        this.f43084d = mVar;
    }

    public final Object then(Task task) throws Exception {
        boolean c;
        if (task.isSuccessful()) {
            Boolean bool = (Boolean) ((C20944i0) task.getResult()).f52692a;
            if (!Boolean.TRUE.equals(bool)) {
                return bool;
            }
            C20563b bVar = (C20563b) C17635b.m43779f(this.f43082b).f50175e.mo51794a(C20563b.class);
            Context context = this.f43082b;
            ServerId serverId = this.f43083c;
            List<HistoryItem> e = this.f43084d.mo40647e();
            synchronized (bVar) {
                C7537i<HistoryItem> d = bVar.mo52776d(context, serverId);
                d.mo51499b();
                d.f48432b.clear();
                d.mo51499b();
                d.f48432b.addAll(e);
                c = d.mo51500c();
                if (c) {
                    SharedPreferences.Editor edit = context.getSharedPreferences("history_dal", 0).edit();
                    edit.putLong("last_modified_" + serverId, System.currentTimeMillis()).apply();
                }
            }
            return Boolean.valueOf(c);
        }
        throw new RuntimeException("Dependency task failed!", task.getException());
    }
}
