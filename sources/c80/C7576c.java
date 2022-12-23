package c80;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import d80.C12603f;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: c80.c */
public final /* synthetic */ class C7576c implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ C7577d f23070b;

    /* renamed from: c */
    public final /* synthetic */ Executor f23071c;

    /* renamed from: d */
    public final /* synthetic */ String f23072d;

    /* renamed from: e */
    public final /* synthetic */ LatLonE6 f23073e;

    public /* synthetic */ C7576c(C7577d dVar, ThreadPoolExecutor threadPoolExecutor, String str, LatLonE6 latLonE6) {
        this.f23070b = dVar;
        this.f23071c = threadPoolExecutor;
        this.f23072d = str;
        this.f23073e = latLonE6;
    }

    public final Task then(Object obj) {
        C7577d dVar = this.f23070b;
        Executor executor = this.f23071c;
        String str = this.f23072d;
        LatLonE6 latLonE6 = this.f23073e;
        dVar.getClass();
        return Tasks.call(executor, new C12603f(dVar.f23152a, dVar.f23074d, dVar.f23075e, str, (LatLonE6) obj, latLonE6));
    }
}
