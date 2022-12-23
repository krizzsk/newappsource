package p955zd;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.icing.zzar;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.internal.zzz;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

@VisibleForTesting
/* renamed from: zd.m */
public final class C20828m implements OnCompleteListener<Void>, Executor {

    /* renamed from: b */
    public final GoogleApi<?> f52552b;

    /* renamed from: c */
    public final zzar f52553c;

    /* renamed from: d */
    public final ArrayDeque f52554d = new ArrayDeque();

    /* renamed from: e */
    public int f52555e = 0;

    public C20828m(C20823h hVar) {
        this.f52552b = hVar;
        this.f52553c = new zzar(hVar.getLooper());
    }

    /* renamed from: a */
    public final Task<Void> mo52958a(zzz zzz) {
        boolean isEmpty;
        C20827l lVar = new C20827l(this, zzz);
        Task<Void> task = lVar.f52550b.getTask();
        task.addOnCompleteListener((Executor) this, (OnCompleteListener<Void>) this);
        synchronized (this.f52554d) {
            isEmpty = this.f52554d.isEmpty();
            this.f52554d.add(lVar);
        }
        if (isEmpty) {
            lVar.mo52957a();
        }
        return task;
    }

    public final void execute(Runnable runnable) {
        this.f52553c.post(runnable);
    }

    public final void onComplete(Task<Void> task) {
        C20827l lVar;
        boolean z;
        synchronized (this.f52554d) {
            if (this.f52555e == 2) {
                lVar = (C20827l) this.f52554d.peek();
                if (lVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z);
            } else {
                lVar = null;
            }
            this.f52555e = 0;
        }
        if (lVar != null) {
            lVar.mo52957a();
        }
    }
}
