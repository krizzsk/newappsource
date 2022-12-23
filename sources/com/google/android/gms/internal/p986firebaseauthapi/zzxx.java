package com.google.android.gms.internal.p986firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.auth.PhoneAuthCredential;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p358af.C13437d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxx */
final class zzxx {
    /* access modifiers changed from: private */
    public static final Logger zza = new Logger("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final HashMap zzd = new HashMap();

    public zzxx(Context context) {
        this.zzb = (Context) Preconditions.checkNotNull(context);
        zzf.zza();
        this.zzc = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }

    @VisibleForTesting
    public static String zzb(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static void zze(zzxx zzxx, String str) {
        zzxw zzxw = (zzxw) zzxx.zzd.get(str);
        if (zzxw != null && !zzag.zzd(zzxw.zzd) && !zzag.zzd(zzxw.zze) && !zzxw.zzb.isEmpty()) {
            for (zzwc zzo : zzxw.zzb) {
                zzo.zzo(new PhoneAuthCredential(zzxw.zzd, zzxw.zze, (String) null, (String) null, (String) null, false, true));
            }
            zzxw.zzh = true;
        }
    }

    private static String zzm(String str, String str2) {
        String k = C13437d.m33706k(str, " ", str2);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(k.getBytes(zzo.zzc));
            String substring = Base64.encodeToString(Arrays.copyOf(instance.digest(), 9), 3).substring(0, 11);
            Logger logger = zza;
            logger.mo65850d("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e) {
            zza.mo65852e("NoSuchAlgorithm: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void zzn(String str) {
        zzxw zzxw = (zzxw) this.zzd.get(str);
        if (zzxw != null && !zzxw.zzh && !zzag.zzd(zzxw.zzd)) {
            zza.mo65859w("Timed out waiting for SMS.", new Object[0]);
            for (zzwc zza2 : zzxw.zzb) {
                zza2.zza(zzxw.zzd);
            }
            zzxw.zzi = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzo */
    public final void zzh(String str) {
        zzxw zzxw = (zzxw) this.zzd.get(str);
        if (zzxw != null) {
            if (!zzxw.zzi) {
                zzn(str);
            }
            zzj(str);
        }
    }

    public final String zzc() {
        Signature[] signatureArr;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                signatureArr = Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 64).signatures;
            } else {
                signatureArr = Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 134217728).signingInfo.getApkContentsSigners();
            }
            String zzm = zzm(packageName, signatureArr[0].toCharsString());
            if (zzm != null) {
                return zzm;
            }
            zza.mo65852e("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.mo65852e("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    public final void zzi(zzwc zzwc, String str) {
        zzxw zzxw = (zzxw) this.zzd.get(str);
        if (zzxw != null) {
            zzxw.zzb.add(zzwc);
            if (zzxw.zzg) {
                zzwc.zzb(zzxw.zzd);
            }
            if (zzxw.zzh) {
                zzwc.zzo(new PhoneAuthCredential(zzxw.zzd, zzxw.zze, (String) null, (String) null, (String) null, false, true));
            }
            if (zzxw.zzi) {
                zzwc.zza(zzxw.zzd);
            }
        }
    }

    public final void zzj(String str) {
        zzxw zzxw = (zzxw) this.zzd.get(str);
        if (zzxw != null) {
            ScheduledFuture scheduledFuture = zzxw.zzf;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                zzxw.zzf.cancel(false);
            }
            zzxw.zzb.clear();
            this.zzd.remove(str);
        }
    }

    public final void zzk(String str, zzwc zzwc, long j, boolean z) {
        this.zzd.put(str, new zzxw(j, z));
        zzi(zzwc, str);
        zzxw zzxw = (zzxw) this.zzd.get(str);
        long j2 = zzxw.zza;
        if (j2 <= 0) {
            zza.mo65859w("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzxw.zzf = this.zzc.schedule(new zzxs(this, str), j2, TimeUnit.SECONDS);
        if (!zzxw.zzc) {
            zza.mo65859w("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzxv zzxv = new zzxv(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
        zzb.zza(this.zzb.getApplicationContext(), zzxv, intentFilter);
        SmsRetriever.getClient(this.zzb).startSmsRetriever().addOnFailureListener(new zzxt(this));
    }

    public final boolean zzl(String str) {
        return this.zzd.get(str) != null;
    }
}
