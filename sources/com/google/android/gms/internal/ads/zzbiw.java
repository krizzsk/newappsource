package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.List;
import p253t.C6512d;
import p253t.C6516g;
import p253t.C6520j;
import p253t.C6522k;

public final class zzbiw {
    private C6522k zza;
    private C6516g zzb;
    private C6520j zzc;
    private zzbiu zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, SQLiteDatabase.OPEN_FULLMUTEX);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzgqi.zza(context));
                }
            }
        }
        return false;
    }

    public final C6522k zza() {
        C6516g gVar = this.zzb;
        C6522k kVar = null;
        if (gVar != null) {
            if (this.zza == null) {
                C6512d dVar = new C6512d();
                try {
                    if (gVar.f20315a.mo6f(dVar)) {
                        kVar = new C6522k(gVar.f20315a, dVar, gVar.f20316b);
                    }
                } catch (RemoteException unused) {
                }
            }
            return this.zza;
        }
        this.zza = kVar;
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza2;
        if (this.zzb == null && (zza2 = zzgqi.zza(activity)) != null) {
            zzgqj zzgqj = new zzgqj(this, (byte[]) null);
            this.zzc = zzgqj;
            C6516g.m15440a(activity, zza2, zzgqj);
        }
    }

    public final void zzc(C6516g gVar) {
        this.zzb = gVar;
        gVar.getClass();
        try {
            gVar.f20315a.mo7q(0);
        } catch (RemoteException unused) {
        }
        zzbiu zzbiu = this.zzd;
        if (zzbiu != null) {
            zzbiu.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbiu zzbiu) {
        this.zzd = zzbiu;
    }

    public final void zzf(Activity activity) {
        C6520j jVar = this.zzc;
        if (jVar != null) {
            activity.unbindService(jVar);
            this.zzb = null;
            this.zza = null;
            this.zzc = null;
        }
    }
}
