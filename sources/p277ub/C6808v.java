package p277ub;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: ub.v */
public final class C6808v implements C6773a {
    /* renamed from: a */
    public final long mo22942a() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    public final C6809w mo22943b(Looper looper, Handler.Callback callback) {
        return new C6809w(new Handler(looper, callback));
    }

    /* renamed from: c */
    public final void mo22944c() {
    }

    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
