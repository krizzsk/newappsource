package w90;

import com.cubic.umo.pass.model.AgencyInformation;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.umo.UmoException;
import p299w7.C7001a;

/* renamed from: w90.c */
public final class C13225c implements C7001a<AgencyInformation> {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f32799a;

    public C13225c(TaskCompletionSource taskCompletionSource) {
        this.f32799a = taskCompletionSource;
    }

    public final void onError(Exception exc) {
        this.f32799a.setException(new UmoException(exc));
    }

    public final void onSuccess(Object obj) {
        this.f32799a.setResult((AgencyInformation) obj);
    }
}
