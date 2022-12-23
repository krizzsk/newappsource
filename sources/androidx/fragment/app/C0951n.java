package androidx.fragment.app;

import android.content.res.Configuration;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.SurfaceRequest;
import p229r1.C6231a;

/* renamed from: androidx.fragment.app.n */
public final /* synthetic */ class C0951n implements C6231a {

    /* renamed from: a */
    public final /* synthetic */ int f3824a;

    /* renamed from: b */
    public final /* synthetic */ Object f3825b;

    public /* synthetic */ C0951n(Object obj, int i) {
        this.f3824a = i;
        this.f3825b = obj;
    }

    public final void accept(Object obj) {
        switch (this.f3824a) {
            case 0:
                ((FragmentActivity) this.f3825b).lambda$init$1((Configuration) obj);
                return;
            default:
                ((CallbackToFutureAdapter.C0673a) this.f3825b).mo2697b((SurfaceRequest.Result) obj);
                return;
        }
    }
}
