package p066e0;

import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import p102h0.C5018c;

/* renamed from: e0.u */
public final class C4457u implements C5018c<List<Surface>> {

    /* renamed from: a */
    public final /* synthetic */ boolean f15526a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f15527b;

    /* renamed from: c */
    public final /* synthetic */ ScheduledFuture f15528c;

    public C4457u(boolean z, CallbackToFutureAdapter.C0673a aVar, ScheduledFuture scheduledFuture) {
        this.f15526a = z;
        this.f15527b = aVar;
        this.f15528c = scheduledFuture;
    }

    public final void onFailure(Throwable th) {
        this.f15527b.mo2697b(Collections.unmodifiableList(Collections.emptyList()));
        this.f15528c.cancel(true);
    }

    public final void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList((List) obj);
        if (this.f15526a) {
            arrayList.removeAll(Collections.singleton((Object) null));
        }
        this.f15527b.mo2697b(arrayList);
        this.f15528c.cancel(true);
    }
}
