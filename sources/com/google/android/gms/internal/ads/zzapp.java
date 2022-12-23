package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzapp extends zzaqm {
    private static final zzaqn zzi = new zzaqn();
    private final Context zzj;

    public zzapp(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2, Context context, zzalb zzalb) {
        super(zzapc, "6KajZmcYwPk97o69y3/8CosRO2vflLPmhfB/7uFZZjZTcDZPA4m8Z0FbsMb3ZORr", "ebsUU9Ppqfz4PifIRFfiICzwWhwX2B63IgcdBHgXQC8=", zzali, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaly zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzag()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzamo zzamo;
        int i;
        boolean z;
        String str;
        Boolean bool;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzamo zzamo2 = (zzamo) zza.get();
            if (zzamo2 == null || zzapf.zzg(zzamo2.zza) || zzamo2.zza.equals("E") || zzamo2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzapf.zzg((String) null)) {
                    i = 5;
                } else {
                    if (!zzapf.zzg((String) null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    if (!bool.booleanValue() || !this.zzb.zzp()) {
                        i = 3;
                    } else {
                        i = 4;
                    }
                }
                if (i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                Boolean bool2 = (Boolean) zzay.zzc().zzb(zzbhy.zzbW);
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzbV)).booleanValue()) {
                    str = zzb();
                } else {
                    str = null;
                }
                if (bool2.booleanValue() && this.zzb.zzp() && zzapf.zzg(str)) {
                    str = zzc();
                }
                zzamo zzamo3 = new zzamo((String) this.zzf.invoke((Object) null, new Object[]{this.zzj, valueOf, str}));
                if (zzapf.zzg(zzamo3.zza) || zzamo3.zza.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String zzc = zzc();
                        if (!zzapf.zzg(zzc)) {
                            zzamo3.zza = zzc;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                zza.set(zzamo3);
            }
            zzamo = (zzamo) zza.get();
        }
        synchronized (this.zze) {
            if (zzamo != null) {
                this.zze.zzu(zzamo.zza);
                this.zze.zzU(zzamo.zzb);
                this.zze.zzW(zzamo.zzc);
                this.zze.zzh(zzamo.zzd);
                this.zze.zzt(zzamo.zze);
            }
        }
    }

    public final String zzb() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byte[] zzi2 = zzapf.zzi((String) zzay.zzc().zzb(zzbhy.zzbX));
            ArrayList arrayList = new ArrayList();
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzi2)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzapf.zzi((String) zzay.zzc().zzb(zzbhy.zzbY)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            zzfvr zzf = zzfvr.zzf();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new zzaqo(zzf));
            return (String) zzf.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
        }
    }
}
