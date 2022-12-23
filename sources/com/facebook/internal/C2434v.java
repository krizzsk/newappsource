package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.appevents.C2338j;
import com.facebook.internal.C2432u;
import com.usebutton.sdk.context.Identifiers;
import kotlin.text.C24179b;
import mf0.C24362h;
import p262t8.C6606a;

/* renamed from: com.facebook.internal.v */
public final class C2434v implements InstallReferrerStateListener {

    /* renamed from: a */
    public final /* synthetic */ InstallReferrerClient f8724a;

    /* renamed from: b */
    public final /* synthetic */ C2432u.C2433a f8725b;

    public C2434v(InstallReferrerClient installReferrerClient, C2338j.C2339a.C2340a aVar) {
        this.f8724a = installReferrerClient;
        this.f8725b = aVar;
    }

    public final void onInstallReferrerServiceDisconnected() {
    }

    public final void onInstallReferrerSetupFinished(int i) {
        if (!C6606a.m15601b(this)) {
            if (i == 0) {
                try {
                    ReferrerDetails installReferrer = this.f8724a.getInstallReferrer();
                    C24362h.m61210e(installReferrer, "{\n                      referrerClient.installReferrer\n                    }");
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null && (C24179b.m60559G(installReferrer2, "fb", false) || C24179b.m60559G(installReferrer2, Identifiers.IDENTIFIER_FACEBOOK, false))) {
                        this.f8725b.mo12488a(installReferrer2);
                    }
                    C2432u.m6384a();
                } catch (RemoteException unused) {
                }
            } else if (i == 2) {
                try {
                    C2432u.m6384a();
                } catch (Throwable th) {
                    C6606a.m15600a(this, th);
                }
            }
        }
    }
}
