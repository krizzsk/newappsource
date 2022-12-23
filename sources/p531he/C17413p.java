package p531he;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.common.C14450d;
import java.util.concurrent.Callable;

/* renamed from: he.p */
public final class C17413p implements Callable<Void> {

    /* renamed from: b */
    public final /* synthetic */ long f44842b;

    /* renamed from: c */
    public final /* synthetic */ C14450d f44843c;

    public C17413p(C14450d dVar, long j) {
        this.f44843c = dVar;
        this.f44842b = j;
    }

    public final Object call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f44842b);
        this.f44843c.f36490k.mo5859n(bundle);
        return null;
    }
}
