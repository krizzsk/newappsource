package com.google.android.gms.internal.nearby;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p090g1.C4732a;

@TargetApi(19)
public final class zzkp {
    private static final WeakHashMap zza = new WeakHashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final NfcAdapter zzd;
    /* access modifiers changed from: private */
    public boolean zze = true;
    private boolean zzf;
    private boolean zzg;

    private zzkp(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        this.zzb = applicationContext;
        WeakReference weakReference = new WeakReference(activity);
        this.zzc = weakReference;
        this.zzd = NfcAdapter.getDefaultAdapter(applicationContext);
        activity.getApplication().registerActivityLifecycleCallbacks(new zzko(this, weakReference));
    }

    public static synchronized zzkp zza(Activity activity) {
        zzkp zzkp;
        synchronized (zzkp.class) {
            WeakHashMap weakHashMap = zza;
            if (!weakHashMap.containsKey(activity)) {
                weakHashMap.put(activity, new zzkp(activity));
            }
            zzkp = (zzkp) weakHashMap.get(activity);
        }
        return zzkp;
    }

    public static /* synthetic */ void zzb(zzkp zzkp, Tag tag) {
        Intent intent = new Intent("android.nfc.action.TAG_DISCOVERED");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("android.nfc.extra.TAG", tag);
        zzkp.zzb.sendBroadcast(intent);
    }

    /* access modifiers changed from: private */
    public final void zzg() {
        NfcAdapter nfcAdapter;
        Activity activity;
        if (!this.zze || !this.zzf) {
            if (this.zzg) {
                Activity activity2 = (Activity) this.zzc.get();
                if (activity2 != null) {
                    this.zzd.disableReaderMode(activity2);
                }
                this.zzg = false;
            }
        } else if (!this.zzg && this.zzb.getPackageManager().hasSystemFeature("android.hardware.nfc") && C4732a.checkSelfPermission(this.zzb, "android.permission.NFC") == 0 && (nfcAdapter = this.zzd) != null && nfcAdapter.isEnabled() && (activity = (Activity) this.zzc.get()) != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("presence", 100);
            this.zzd.enableReaderMode(activity, new zzkn(this), 385, bundle);
            this.zzg = true;
        }
    }

    public final void zze() {
        this.zzf = true;
        zzg();
    }

    public final void zzf() {
        this.zzf = false;
        zzg();
    }
}
