package i80;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.security.ProviderInstaller;

/* renamed from: i80.b */
public final class C12760b implements ProviderInstaller.ProviderInstallListener {

    /* renamed from: a */
    public final /* synthetic */ Context f31527a;

    public C12760b(Context context) {
        this.f31527a = context;
    }

    public final void onProviderInstallFailed(int i, Intent intent) {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        if (instance.isUserResolvableError(i)) {
            instance.showErrorNotification(this.f31527a, i);
        }
    }

    public final void onProviderInstalled() {
    }
}
