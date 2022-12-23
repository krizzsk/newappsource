package p896wp;

import android.content.Context;
import ce0.C21100e;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.concurrent.Callable;

/* renamed from: wp.b */
public final class C20382b implements Callable<AdvertisingIdClient.Info> {

    /* renamed from: b */
    public final Context f51683b;

    public C20382b(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f51683b = context.getApplicationContext();
    }

    public final Object call() throws Exception {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f51683b) == 0) {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.f51683b);
        }
        return null;
    }
}
