package p066e0;

import androidx.appcompat.widget.C0436m1;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p102h0.C5023g;
import p102h0.C5035n;

/* renamed from: e0.s */
public final /* synthetic */ class C4455s implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ List f15516b;

    /* renamed from: c */
    public final /* synthetic */ ScheduledExecutorService f15517c;

    /* renamed from: d */
    public final /* synthetic */ Executor f15518d;

    /* renamed from: e */
    public final /* synthetic */ long f15519e = InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS;

    /* renamed from: f */
    public final /* synthetic */ boolean f15520f = false;

    public /* synthetic */ C4455s(ArrayList arrayList, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f15516b = arrayList;
        this.f15517c = scheduledExecutorService;
        this.f15518d = executor;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        List list = this.f15516b;
        ScheduledExecutorService scheduledExecutorService = this.f15517c;
        Executor executor = this.f15518d;
        long j = this.f15519e;
        boolean z = this.f15520f;
        C5035n nVar = new C5035n(new ArrayList(list), false, C14226d.m35352s0());
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new C4456t(executor, nVar, aVar, j, 0), j, TimeUnit.MILLISECONDS);
        aVar.mo2696a(new C0436m1(nVar, 4), executor);
        C5023g.m12853a(nVar, new C4457u(z, aVar, schedule), executor);
        return "surfaceList";
    }
}
