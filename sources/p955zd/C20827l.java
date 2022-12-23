package p955zd;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.appindexing.internal.zzz;
import java.util.concurrent.Executor;

@VisibleForTesting
/* renamed from: zd.l */
public final class C20827l {

    /* renamed from: a */
    public final zzz f52549a;

    /* renamed from: b */
    public final TaskCompletionSource<Void> f52550b = new TaskCompletionSource<>();

    /* renamed from: c */
    public final /* synthetic */ C20828m f52551c;

    public C20827l(C20828m mVar, zzz zzz) {
        this.f52551c = mVar;
        this.f52549a = zzz;
    }

    /* renamed from: a */
    public final void mo52957a() {
        boolean z;
        C20828m mVar;
        synchronized (this.f52551c.f52554d) {
            if (this.f52551c.f52555e == 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            mVar = this.f52551c;
            mVar.f52555e = 1;
        }
        mVar.f52552b.doWrite(new C20826k(this)).addOnFailureListener((Executor) this.f52551c, (OnFailureListener) new C20824i(this));
    }
}
