package p372at;

import android.content.Context;
import c00.C13732m;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.history.model.JourneyHistoryItem;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p426ct.C16490a;
import p426ct.C16491b;
import p426ct.C16492c;
import p426ct.C16495d;
import p426ct.C16496e;

/* renamed from: at.c */
public final class C13516c {

    /* renamed from: a */
    public final C13515b f33433a = new C13515b(this, 0);

    /* renamed from: b */
    public Context f33434b;

    /* renamed from: c */
    public final ServerId f33435c;

    /* renamed from: d */
    public final C13732m<HistoryItem> f33436d;

    /* renamed from: e */
    public final ArrayList f33437e = new ArrayList();

    /* renamed from: at.c$a */
    public interface C13517a {
        /* renamed from: m1 */
        void mo40411m1(C13516c cVar);
    }

    public C13516c(Context context, ServerId serverId, ArrayList arrayList) {
        this.f33434b = context;
        C21100e.m49373x(serverId, "metroId");
        this.f33435c = serverId;
        this.f33436d = new C13732m<>(new ArrayList(arrayList), 15);
    }

    /* renamed from: a */
    public final Task mo40408a(JourneyHistoryItem journeyHistoryItem) {
        List singletonList = Collections.singletonList(journeyHistoryItem);
        ExecutorService executorService = MoovitExecutors.SINGLE;
        Task continueWith = Tasks.call(executorService, new C16491b(singletonList)).continueWith(executorService, new C16492c(this.f33434b));
        Executor executor = MoovitExecutors.MAIN_THREAD;
        return continueWith.continueWith(executor, new C16490a(this.f33436d)).continueWith(executorService, new C16496e(this.f33434b, this.f33435c, this.f33436d)).addOnSuccessListener(executor, this.f33433a);
    }

    /* renamed from: b */
    public final HistoryItem mo40409b(String str) {
        for (HistoryItem next : this.f33436d.mo40647e()) {
            if (str.equals(next.getId())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final Task<Boolean> mo40410c(List<? extends HistoryItem> list) {
        Task<TResult> forResult = Tasks.forResult(list);
        Executor executor = MoovitExecutors.MAIN_THREAD;
        return forResult.continueWith(executor, new C16495d(this.f33436d)).continueWith(MoovitExecutors.SINGLE, new C16496e(this.f33434b, this.f33435c, this.f33436d)).addOnSuccessListener(executor, this.f33433a);
    }
}
