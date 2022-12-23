package com.google.android.gms.internal.p986firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import p743qd.C19107d;
import p909xe.C20469f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws */
public final class zzws {
    private final Context zza;
    private zzxm zzb;
    private final String zzc;
    private final C19107d zzd;
    private boolean zze = false;
    private String zzf;

    public zzws(Context context, C19107d dVar, String str) {
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzd = (C19107d) Preconditions.checkNotNull(dVar);
        this.zzc = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        String str2;
        if (this.zze) {
            str = String.valueOf(this.zzc).concat("/FirebaseUI-Android");
        } else {
            str = String.valueOf(this.zzc).concat("/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            Context context = this.zza;
            this.zzb = new zzxm(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzwt.zza());
        uRLConnection.setRequestProperty("X-Client-Version", str);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        C19107d dVar = this.zzd;
        dVar.mo51535a();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", dVar.f48570c.f48582b);
        C20469f fVar = (C20469f) FirebaseAuth.getInstance(this.zzd).f36392l.get();
        if (fVar != null) {
            try {
                str2 = (String) Tasks.await(fVar.mo43361a());
            } catch (InterruptedException | ExecutionException e) {
                "Unable to get heartbeats: ".concat(String.valueOf(e.getMessage()));
            }
            uRLConnection.setRequestProperty("X-Firebase-Client", str2);
            this.zzf = null;
        }
        str2 = null;
        uRLConnection.setRequestProperty("X-Firebase-Client", str2);
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zzc(String str) {
        this.zzf = str;
    }
}
