package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzie;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C14459a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p358af.C13436c;
import p743qd.C19107d;
import p812td.C19667a;

public final class FirebaseAnalytics {

    /* renamed from: b */
    public static volatile FirebaseAnalytics f36332b;

    /* renamed from: a */
    public final zzee f36333a;

    public FirebaseAnalytics(zzee zzee) {
        Preconditions.checkNotNull(zzee);
        this.f36333a = zzee;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f36332b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f36332b == null) {
                    f36332b = new FirebaseAnalytics(zzee.zzg(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f36332b;
    }

    @Keep
    public static zzie getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzee zzg = zzee.zzg(context, (String) null, (String) null, (String) null, bundle);
        if (zzg == null) {
            return null;
        }
        return new C19667a(zzg);
    }

    /* renamed from: a */
    public final void mo43247a(Bundle bundle, String str) {
        this.f36333a.zzx(str, bundle);
    }

    /* renamed from: b */
    public final void mo43248b(String str, String str2) {
        this.f36333a.zzN((String) null, str, str2, false);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = C14459a.f36530m;
            C19107d d = C19107d.m46265d();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            return (String) Tasks.await(((C14459a) d.mo51536b(C13436c.class)).getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f36333a.zzG(activity, str, str2);
    }
}
