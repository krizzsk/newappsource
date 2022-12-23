package w90;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.umo.UmoException;
import p299w7.C7001a;

/* renamed from: w90.f */
public final class C13228f implements C7001a<Void> {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f32802a;

    public C13228f(TaskCompletionSource taskCompletionSource) {
        this.f32802a = taskCompletionSource;
    }

    public final void onError(Exception exc) {
        this.f32802a.setException(new UmoException(exc));
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        this.f32802a.setResult(Boolean.TRUE);
    }
}
