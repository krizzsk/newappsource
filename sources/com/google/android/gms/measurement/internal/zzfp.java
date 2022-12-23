package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzfa;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzgq;
import com.google.android.gms.internal.measurement.zzgs;
import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzr;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p241s0.C6302b;
import p241s0.C6306f;

public final class zzfp extends zzkn implements zzaf {
    @VisibleForTesting
    public final Map zza = new C6302b();
    @VisibleForTesting
    public final Map zzb = new C6302b();
    @VisibleForTesting
    public final Map zzc = new C6302b();
    @VisibleForTesting
    public final C6306f zzd = new zzfm(this, 20);
    public final zzr zze = new zzfn(this);
    /* access modifiers changed from: private */
    public final Map zzg = new C6302b();
    private final Map zzh = new C6302b();
    private final Map zzi = new C6302b();
    private final Map zzj = new C6302b();
    private final Map zzk = new C6302b();
    private final Map zzl = new C6302b();

    public zzfp(zzkz zzkz) {
        super(zzkz);
    }

    private final zzfe zzA(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return zzfe.zzg();
        }
        try {
            zzfe zzfe = (zzfe) ((zzfd) zzlb.zzl(zzfe.zze(), bArr)).zzaE();
            zzem zzj2 = this.zzs.zzay().zzj();
            String str2 = null;
            if (zzfe.zzs()) {
                l = Long.valueOf(zzfe.zzc());
            } else {
                l = null;
            }
            if (zzfe.zzr()) {
                str2 = zzfe.zzh();
            }
            zzj2.zzc("Parsed config. version, gmp_app_id", l, str2);
            return zzfe;
        } catch (zzko e) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzeo.zzn(str), e);
            return zzfe.zzg();
        } catch (RuntimeException e2) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzeo.zzn(str), e2);
            return zzfe.zzg();
        }
    }

    private final void zzB(String str, zzfd zzfd) {
        HashSet hashSet = new HashSet();
        C6302b bVar = new C6302b();
        C6302b bVar2 = new C6302b();
        C6302b bVar3 = new C6302b();
        if (zzfd != null) {
            zzow.zzc();
            if (this.zzs.zzf().zzs((String) null, zzeb.zzal)) {
                for (zzfa zzb2 : zzfd.zzg()) {
                    hashSet.add(zzb2.zzb());
                }
            }
            for (int i = 0; i < zzfd.zza(); i++) {
                zzfb zzfb = (zzfb) zzfd.zzb(i).zzby();
                if (zzfb.zzc().isEmpty()) {
                    C16759e.m42354j(this.zzs, "EventConfig contained null event name");
                } else {
                    String zzc2 = zzfb.zzc();
                    String zzb3 = zzgv.zzb(zzfb.zzc());
                    if (!TextUtils.isEmpty(zzb3)) {
                        zzfb.zzb(zzb3);
                        zzfd.zzd(i, zzfb);
                    }
                    if (zzfb.zzf() && zzfb.zzd()) {
                        bVar.put(zzc2, Boolean.TRUE);
                    }
                    if (zzfb.zzg() && zzfb.zze()) {
                        bVar2.put(zzfb.zzc(), Boolean.TRUE);
                    }
                    if (zzfb.zzh()) {
                        if (zzfb.zza() < 2 || zzfb.zza() > 65535) {
                            this.zzs.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfb.zzc(), Integer.valueOf(zzfb.zza()));
                        } else {
                            bVar3.put(zzfb.zzc(), Integer.valueOf(zzfb.zza()));
                        }
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, bVar);
        this.zzc.put(str, bVar2);
        this.zzi.put(str, bVar3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (r2 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzC(java.lang.String r13) {
        /*
            r12 = this;
            r12.zzW()
            r12.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            java.util.Map r0 = r12.zzh
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x012c
            com.google.android.gms.measurement.internal.zzkz r0 = r12.zzf
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzi()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            r0.zzg()
            r0.zzW()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.zzh()     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x008e, all -> 0x008b }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0089 }
            if (r3 != 0) goto L_0x0047
            goto L_0x00a6
        L_0x0047:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzfy r5 = r0.zzs     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzag r5 = r5.zzf()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzea r6 = com.google.android.gms.measurement.internal.zzeb.zzaw     // Catch:{ SQLiteException -> 0x0089 }
            boolean r5 = r5.zzs(r1, r6)     // Catch:{ SQLiteException -> 0x0089 }
            if (r5 == 0) goto L_0x0063
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x0089 }
            goto L_0x0064
        L_0x0063:
            r5 = r1
        L_0x0064:
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0089 }
            if (r6 == 0) goto L_0x007d
            com.google.android.gms.measurement.internal.zzfy r6 = r0.zzs     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzeo r6 = r6.zzay()     // Catch:{ SQLiteException -> 0x0089 }
            com.google.android.gms.measurement.internal.zzem r6 = r6.zzd()     // Catch:{ SQLiteException -> 0x0089 }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeo.zzn(r13)     // Catch:{ SQLiteException -> 0x0089 }
            r6.zzb(r7, r8)     // Catch:{ SQLiteException -> 0x0089 }
        L_0x007d:
            if (r3 != 0) goto L_0x0080
            goto L_0x00a6
        L_0x0080:
            com.google.android.gms.measurement.internal.zzaj r6 = new com.google.android.gms.measurement.internal.zzaj     // Catch:{ SQLiteException -> 0x0089 }
            r6.<init>(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0089 }
            r2.close()
            goto L_0x00aa
        L_0x0089:
            r3 = move-exception
            goto L_0x0091
        L_0x008b:
            r13 = move-exception
            goto L_0x0126
        L_0x008e:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0091:
            com.google.android.gms.measurement.internal.zzfy r0 = r0.zzs     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzd()     // Catch:{ all -> 0x0124 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeo.zzn(r13)     // Catch:{ all -> 0x0124 }
            r0.zzc(r4, r5, r3)     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x00a9
        L_0x00a6:
            r2.close()
        L_0x00a9:
            r6 = r1
        L_0x00aa:
            if (r6 != 0) goto L_0x00da
            java.util.Map r0 = r12.zzg
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzb
            r0.put(r13, r1)
            java.util.Map r0 = r12.zza
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzc
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzh
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzj
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzk
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzl
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzi
            r0.put(r13, r1)
            return
        L_0x00da:
            byte[] r0 = r6.zza
            com.google.android.gms.internal.measurement.zzfe r0 = r12.zzA(r13, r0)
            com.google.android.gms.internal.measurement.zzka r0 = r0.zzby()
            com.google.android.gms.internal.measurement.zzfd r0 = (com.google.android.gms.internal.measurement.zzfd) r0
            r12.zzB(r13, r0)
            java.util.Map r1 = r12.zzg
            com.google.android.gms.internal.measurement.zzke r2 = r0.zzaE()
            com.google.android.gms.internal.measurement.zzfe r2 = (com.google.android.gms.internal.measurement.zzfe) r2
            java.util.Map r2 = zzE(r2)
            r1.put(r13, r2)
            java.util.Map r1 = r12.zzh
            com.google.android.gms.internal.measurement.zzke r2 = r0.zzaE()
            com.google.android.gms.internal.measurement.zzfe r2 = (com.google.android.gms.internal.measurement.zzfe) r2
            r1.put(r13, r2)
            com.google.android.gms.internal.measurement.zzke r1 = r0.zzaE()
            com.google.android.gms.internal.measurement.zzfe r1 = (com.google.android.gms.internal.measurement.zzfe) r1
            r12.zzD(r13, r1)
            java.util.Map r1 = r12.zzj
            java.lang.String r0 = r0.zze()
            r1.put(r13, r0)
            java.util.Map r0 = r12.zzk
            java.lang.String r1 = r6.zzb
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzl
            java.lang.String r1 = r6.zzc
            r0.put(r13, r1)
            return
        L_0x0124:
            r13 = move-exception
            r1 = r2
        L_0x0126:
            if (r1 == 0) goto L_0x012b
            r1.close()
        L_0x012b:
            throw r13
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfp.zzC(java.lang.String):void");
    }

    private final void zzD(String str, zzfe zzfe) {
        if (zzfe.zza() != 0) {
            this.zzs.zzay().zzj().zzb("EES programs found", Integer.valueOf(zzfe.zza()));
            zzgs zzgs = (zzgs) zzfe.zzm().get(0);
            try {
                zzc zzc2 = new zzc();
                zzc2.zzd("internal.remoteConfig", new zzfj(this, str));
                zzc2.zzd("internal.appMetadata", new zzfk(this, str));
                zzc2.zzd("internal.logger", new zzfl(this));
                zzc2.zzc(zzgs);
                this.zzd.put(str, zzc2);
                this.zzs.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgs.zza().zza()));
                for (zzgq zzb2 : zzgs.zza().zzd()) {
                    this.zzs.zzay().zzj().zzb("EES program activity", zzb2.zzb());
                }
            } catch (zzd unused) {
                this.zzs.zzay().zzd().zzb("Failed to load EES program. appId", str);
            }
        } else {
            this.zzd.remove(str);
        }
    }

    private static final Map zzE(zzfe zzfe) {
        C6302b bVar = new C6302b();
        if (zzfe != null) {
            for (zzfi zzfi : zzfe.zzn()) {
                bVar.put(zzfi.zzb(), zzfi.zzc());
            }
        }
        return bVar;
    }

    public static /* bridge */ /* synthetic */ zzc zzd(zzfp zzfp, String str) {
        zzfp.zzW();
        Preconditions.checkNotEmpty(str);
        if (!zzfp.zzo(str)) {
            return null;
        }
        if (!zzfp.zzh.containsKey(str) || zzfp.zzh.get(str) == null) {
            zzfp.zzC(str);
        } else {
            zzfp.zzD(str, (zzfe) zzfp.zzh.get(str));
        }
        return (zzc) zzfp.zzd.snapshot().get(str);
    }

    public final String zza(String str, String str2) {
        zzg();
        zzC(str);
        Map map = (Map) this.zzg.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean zzb() {
        return false;
    }

    public final int zzc(String str, String str2) {
        Integer num;
        zzg();
        zzC(str);
        Map map = (Map) this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final zzfe zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzC(str);
        return (zzfe) this.zzh.get(str);
    }

    public final String zzf(String str) {
        zzg();
        return (String) this.zzl.get(str);
    }

    public final String zzh(String str) {
        zzg();
        return (String) this.zzk.get(str);
    }

    public final String zzi(String str) {
        zzg();
        zzC(str);
        return (String) this.zzj.get(str);
    }

    public final Set zzk(String str) {
        zzg();
        zzC(str);
        return (Set) this.zza.get(str);
    }

    public final void zzl(String str) {
        zzg();
        this.zzk.put(str, (Object) null);
    }

    public final void zzm(String str) {
        zzg();
        this.zzh.remove(str);
    }

    public final boolean zzn(String str) {
        zzg();
        zzfe zze2 = zze(str);
        if (zze2 == null) {
            return false;
        }
        return zze2.zzq();
    }

    public final boolean zzo(String str) {
        zzfe zzfe;
        if (TextUtils.isEmpty(str) || (zzfe = (zzfe) this.zzh.get(str)) == null || zzfe.zza() == 0) {
            return false;
        }
        return true;
    }

    public final boolean zzp(String str) {
        return DiskLruCache.VERSION_1.equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzq(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if ("ecommerce_purchase".equals(str2) || ProductAction.ACTION_PURCHASE.equals(str2) || ProductAction.ACTION_REFUND.equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzr(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if (zzp(str) && zzlh.zzah(str2)) {
            return true;
        }
        if (zzs(str) && zzlh.zzai(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzs(String str) {
        return DiskLruCache.VERSION_1.equals(zza(str, "measurement.upload.blacklist_public"));
    }

    public final boolean zzt(String str, byte[] bArr, String str2, String str3) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzfd zzfd = (zzfd) zzA(str, bArr).zzby();
        if (zzfd == null) {
            return false;
        }
        zzB(str, zzfd);
        zzD(str, (zzfe) zzfd.zzaE());
        this.zzh.put(str, (zzfe) zzfd.zzaE());
        this.zzj.put(str, zzfd.zze());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzg.put(str, zzE((zzfe) zzfd.zzaE()));
        this.zzf.zzi().zzB(str, new ArrayList(zzfd.zzf()));
        try {
            zzfd.zzc();
            bArr = ((zzfe) zzfd.zzaE()).zzbv();
        } catch (RuntimeException e) {
            this.zzs.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeo.zzn(str), e);
        }
        zzam zzi2 = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzi2.zzg();
        zzi2.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (zzi2.zzs.zzf().zzs((String) null, zzeb.zzaw)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (((long) zzi2.zzh().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                zzi2.zzs.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzeo.zzn(str));
            }
        } catch (SQLiteException e2) {
            zzi2.zzs.zzay().zzd().zzc("Error storing remote config. appId", zzeo.zzn(str), e2);
        }
        this.zzh.put(str, (zzfe) zzfd.zzaE());
        return true;
    }

    public final boolean zzu(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) == null || !((Set) this.zza.get(str)).contains("app_instance_id")) {
            return false;
        }
        return true;
    }

    public final boolean zzv(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) == null || (!((Set) this.zza.get(str)).contains("device_model") && !((Set) this.zza.get(str)).contains("device_info"))) {
            return false;
        }
        return true;
    }

    public final boolean zzw(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) == null || !((Set) this.zza.get(str)).contains("enhanced_user_id")) {
            return false;
        }
        return true;
    }

    public final boolean zzx(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) == null || !((Set) this.zza.get(str)).contains("google_signals")) {
            return false;
        }
        return true;
    }

    public final boolean zzy(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) == null || (!((Set) this.zza.get(str)).contains("os_version") && !((Set) this.zza.get(str)).contains("device_info"))) {
            return false;
        }
        return true;
    }

    public final boolean zzz(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) == null || !((Set) this.zza.get(str)).contains("user_id")) {
            return false;
        }
        return true;
    }
}
