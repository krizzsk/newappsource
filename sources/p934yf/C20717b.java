package p934yf;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: yf.b */
public final class C20717b {

    /* renamed from: a */
    public final Handler f52312a;

    /* renamed from: b */
    public final Executor f52313b;

    public C20717b(Executor executor) {
        this.f52313b = executor;
        if (executor == null) {
            this.f52312a = new Handler(Looper.getMainLooper());
        } else {
            this.f52312a = null;
        }
    }
}
