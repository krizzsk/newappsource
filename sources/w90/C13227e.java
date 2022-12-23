package w90;

import com.cubic.umo.pass.model.FundingSourceDTO;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.umo.UmoException;
import p299w7.C7001a;

/* renamed from: w90.e */
public final class C13227e implements C7001a<FundingSourceDTO> {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f32801a;

    public C13227e(TaskCompletionSource taskCompletionSource) {
        this.f32801a = taskCompletionSource;
    }

    public final void onError(Exception exc) {
        this.f32801a.setException(new UmoException(exc));
    }

    public final void onSuccess(Object obj) {
        FundingSourceDTO fundingSourceDTO = (FundingSourceDTO) obj;
        if (fundingSourceDTO == null) {
            this.f32801a.setException(new UmoException("Credit card not attached"));
        } else {
            this.f32801a.setResult(fundingSourceDTO);
        }
    }
}
