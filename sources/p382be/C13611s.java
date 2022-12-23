package p382be;

import android.os.Looper;
import com.google.android.gms.internal.p986firebaseauthapi.zzg;
import java.util.concurrent.Executor;

/* renamed from: be.s */
public final class C13611s implements Executor {

    /* renamed from: c */
    public static final C13611s f33579c = new C13611s();

    /* renamed from: b */
    public final zzg f33580b = new zzg(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f33580b.post(runnable);
    }
}
