package aa0;

import ce0.C21100e;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.MoovitActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: aa0.c */
public final class C7526c implements Callable<C7525b<?>>, OnSuccessListener<C7525b<?>> {

    /* renamed from: b */
    public final WeakReference<MoovitActivity> f23002b;

    /* renamed from: c */
    public final C7524a<?>[] f23003c;

    public C7526c(MoovitActivity moovitActivity, C7524a<?>[] aVarArr) {
        C21100e.m49373x(moovitActivity, "activity");
        this.f23002b = new WeakReference<>(moovitActivity);
        this.f23003c = (C7524a[]) aVarArr;
    }

    public final Object call() throws Exception {
        boolean z;
        MoovitActivity moovitActivity = this.f23002b.get();
        if (moovitActivity == null) {
            return null;
        }
        for (C7524a<?> aVar : this.f23003c) {
            C7525b bVar = new C7525b(aVar);
            T a = aVar.mo23790a(moovitActivity);
            bVar.f23001b = a;
            if (a != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return bVar;
            }
        }
        return null;
    }

    public final void onSuccess(Object obj) {
        MoovitActivity moovitActivity;
        C7525b bVar = (C7525b) obj;
        if (bVar != null && (moovitActivity = this.f23002b.get()) != null && moovitActivity.f37299H) {
            bVar.f23000a.mo23791b(moovitActivity, bVar.f23001b);
        }
    }
}
