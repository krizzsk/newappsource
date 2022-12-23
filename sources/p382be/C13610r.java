package p382be;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import p743qd.C19107d;

/* renamed from: be.r */
public final class C13610r {

    /* renamed from: a */
    public final C13600h f33578a;

    public C13610r(C19107d dVar) {
        dVar.mo51535a();
        Context context = dVar.f48568a;
        this.f33578a = new C13600h(dVar);
        BackgroundDetector.initialize((Application) context.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new C13609q(this));
    }
}
