package fd0;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.impl.DeferrableSurfaces;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: fd0.g */
public final /* synthetic */ class C12686g implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ List f31335b;

    /* renamed from: c */
    public final /* synthetic */ ScheduledExecutorService f31336c;

    /* renamed from: d */
    public final /* synthetic */ Executor f31337d;

    /* renamed from: e */
    public final /* synthetic */ long f31338e;

    /* renamed from: f */
    public final /* synthetic */ boolean f31339f;

    public /* synthetic */ C12686g(ArrayList arrayList, ScheduledExecutorService scheduledExecutorService, Executor executor, long j, boolean z) {
        this.f31335b = arrayList;
        this.f31336c = scheduledExecutorService;
        this.f31337d = executor;
        this.f31338e = j;
        this.f31339f = z;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return DeferrableSurfaces.lambda$surfaceListWithTimeout$3(this.f31335b, this.f31336c, this.f31337d, this.f31338e, this.f31339f, aVar);
    }
}
