package w90;

import com.cubic.umo.pass.model.FundingSourceDTO;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.umo.UmoException;
import p299w7.C7001a;

/* renamed from: w90.d */
public final class C13226d implements C7001a<FundingSourceDTO> {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f32800a;

    public C13226d(TaskCompletionSource taskCompletionSource) {
        this.f32800a = taskCompletionSource;
    }

    public final void onError(Exception exc) {
        this.f32800a.setException(new UmoException(exc));
    }

    public final void onSuccess(Object obj) {
        this.f32800a.setResult(String.valueOf(((FundingSourceDTO) obj).f8103a));
    }
}
