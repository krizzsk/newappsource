package p554id;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzkv;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.tasks.RuntimeExecutionException;
import p627lg.C18207f;
import p627lg.C18210i;

/* renamed from: id.h */
public final class C17569h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f45187b = 0;

    /* renamed from: c */
    public final /* synthetic */ Object f45188c;

    /* renamed from: d */
    public final /* synthetic */ Object f45189d;

    public C17569h(C17570i iVar, C17576o oVar) {
        this.f45189d = iVar;
        this.f45188c = oVar;
    }

    public final void run() {
        boolean z;
        Object obj;
        switch (this.f45187b) {
            case 0:
                synchronized (((C17570i) this.f45189d).f45191b) {
                    C17563b bVar = ((C17570i) this.f45189d).f45192c;
                    if (bVar != null) {
                        C17576o oVar = (C17576o) this.f45188c;
                        synchronized (oVar.f45198a) {
                            if (oVar.f45200c) {
                                Exception exc = oVar.f45202e;
                                if (exc == null) {
                                    obj = oVar.f45201d;
                                } else {
                                    throw new RuntimeExecutionException(exc);
                                }
                            } else {
                                throw new IllegalStateException("Task is not yet complete");
                            }
                        }
                        bVar.onSuccess(obj);
                    }
                }
                return;
            default:
                C18210i iVar = (C18210i) this.f45188c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f45189d;
                int decrementAndGet = iVar.f46470b.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z);
                if (decrementAndGet == 0) {
                    iVar.mo50629c();
                    iVar.f46471c.set(false);
                }
                zzkv.zza();
                taskCompletionSource.setResult(null);
                return;
        }
    }

    public /* synthetic */ C17569h(C18207f fVar, TaskCompletionSource taskCompletionSource) {
        this.f45188c = fVar;
        this.f45189d = taskCompletionSource;
    }
}
