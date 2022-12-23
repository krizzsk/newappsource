package p951yx;

import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.utils.CallableRunnable;
import java.util.EnumSet;
import java.util.Set;
import p977zz.C20933d;

/* renamed from: yx.a */
public final /* synthetic */ class C20784a implements CallableRunnable {

    /* renamed from: b */
    public final /* synthetic */ UserAccountManager f52445b;

    /* renamed from: c */
    public final /* synthetic */ Set f52446c;

    public /* synthetic */ C20784a(UserAccountManager userAccountManager, EnumSet enumSet) {
        this.f52445b = userAccountManager;
        this.f52446c = enumSet;
    }

    public final /* synthetic */ void onError(Throwable th) {
        C20933d.m49028c(this, th);
    }

    public final /* synthetic */ void run() {
        C20933d.m49029d(this);
    }

    public final void runSafe() {
        this.f52445b.mo46577i(this.f52446c);
    }
}
