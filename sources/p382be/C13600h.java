package p382be;

import android.os.HandlerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p986firebaseauthapi.zzg;
import com.google.android.play.core.assetpacks.C14300o1;
import p743qd.C19107d;

/* renamed from: be.h */
public final class C13600h {

    /* renamed from: e */
    public static final Logger f33565e = new Logger("TokenRefresher", "FirebaseAuth:");
    @VisibleForTesting

    /* renamed from: a */
    public volatile long f33566a;
    @VisibleForTesting

    /* renamed from: b */
    public volatile long f33567b;
    @VisibleForTesting

    /* renamed from: c */
    public final zzg f33568c;
    @VisibleForTesting

    /* renamed from: d */
    public final C14300o1 f33569d;

    public C13600h(C19107d dVar) {
        f33565e.mo65858v("Initializing TokenRefresher", new Object[0]);
        C19107d dVar2 = (C19107d) Preconditions.checkNotNull(dVar);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        this.f33568c = new zzg(handlerThread.getLooper());
        dVar2.mo51535a();
        this.f33569d = new C14300o1(this, dVar2.f48569b);
    }
}
