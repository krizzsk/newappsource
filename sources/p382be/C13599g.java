package p382be;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.play.core.assetpacks.C14300o1;
import com.google.firebase.FirebaseNetworkException;
import p001a0.C0016g;

/* renamed from: be.g */
public final class C13599g implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ C14300o1 f33564b;

    public C13599g(C14300o1 o1Var) {
        this.f33564b = o1Var;
    }

    public final void onFailure(Exception exc) {
        long j;
        if (exc instanceof FirebaseNetworkException) {
            Logger logger = C13600h.f33565e;
            logger.mo65858v("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            C13600h hVar = (C13600h) this.f33564b.f35970d;
            int i = (int) hVar.f33567b;
            if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
                long j2 = hVar.f33567b;
                j = j2 + j2;
            } else if (i != 960) {
                j = 30;
            } else {
                j = 960;
            }
            hVar.f33567b = j;
            hVar.f33566a = (hVar.f33567b * 1000) + DefaultClock.getInstance().currentTimeMillis();
            logger.mo65858v(C0016g.m29l("Scheduling refresh for ", hVar.f33566a), new Object[0]);
            hVar.f33568c.postDelayed(hVar.f33569d, hVar.f33567b * 1000);
        }
    }
}
