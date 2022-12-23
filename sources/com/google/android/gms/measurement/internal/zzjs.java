package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcf;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p358af.C13437d;

@VisibleForTesting
public final class zzjs extends zzf {
    /* access modifiers changed from: private */
    public final zzjr zza;
    /* access modifiers changed from: private */
    public zzee zzb;
    private volatile Boolean zzc;
    private final zzap zzd;
    private final zzkj zze;
    private final List zzf = new ArrayList();
    private final zzap zzg;

    public zzjs(zzfy zzfy) {
        super(zzfy);
        this.zze = new zzkj(zzfy.zzav());
        this.zza = new zzjr(this);
        this.zzd = new zzjc(this, zzfy);
        this.zzg = new zzje(this, zzfy);
    }

    private final zzq zzO(boolean z) {
        Pair zza2;
        this.zzs.zzaw();
        zzef zzh = this.zzs.zzh();
        String str = null;
        if (z) {
            zzeo zzay = this.zzs.zzay();
            if (!(zzay.zzs.zzm().zzb == null || (zza2 = zzay.zzs.zzm().zzb.zza()) == null || zza2 == zzfd.zza)) {
                str = C13437d.m33706k(String.valueOf(zza2.second), ":", (String) zza2.first);
            }
        }
        return zzh.zzj(str);
    }

    /* access modifiers changed from: private */
    public final void zzP() {
        zzg();
        this.zzs.zzay().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        for (Runnable run : this.zzf) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.zzs.zzay().zzd().zzb("Task exception while flushing queue", e);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* access modifiers changed from: private */
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzap zzap = this.zzd;
        this.zzs.zzf();
        zzap.zzd(((Long) zzeb.zzI.zza((Object) null)).longValue());
    }

    private final void zzR(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        int size = this.zzf.size();
        this.zzs.zzf();
        if (((long) size) >= 1000) {
            C16530d.m42018k(this.zzs, "Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(60000);
        zzr();
    }

    private final boolean zzS() {
        this.zzs.zzaw();
        return true;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzjs zzjs, ComponentName componentName) {
        zzjs.zzg();
        if (zzjs.zzb != null) {
            zzjs.zzb = null;
            zzjs.zzs.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjs.zzg();
            zzjs.zzr();
        }
    }

    public final void zzA(zzaw zzaw, String str) {
        Preconditions.checkNotNull(zzaw);
        zzg();
        zza();
        zzS();
        zzR(new zzjh(this, true, zzO(true), this.zzs.zzi().zzo(zzaw), zzaw, str));
    }

    public final void zzB(zzcf zzcf, zzaw zzaw, String str) {
        zzg();
        zza();
        if (this.zzs.zzv().zzo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            C16759e.m42354j(this.zzs, "Not bundling data. Service unavailable or out of date");
            this.zzs.zzv().zzS(zzcf, new byte[0]);
            return;
        }
        zzR(new zzjd(this, zzaw, str, zzcf));
    }

    public final void zzC() {
        zzg();
        zza();
        zzq zzO = zzO(false);
        zzS();
        this.zzs.zzi().zzj();
        zzR(new zziw(this, zzO));
    }

    @VisibleForTesting
    public final void zzD(zzee zzee, AbstractSafeParcelable abstractSafeParcelable, zzq zzq) {
        int i;
        zzg();
        zza();
        zzS();
        this.zzs.zzf();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List zzi = this.zzs.zzi().zzi(100);
            if (zzi != null) {
                arrayList.addAll(zzi);
                i = zzi.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        zzee.zzk((zzaw) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e) {
                        this.zzs.zzay().zzd().zzb("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlc) {
                    try {
                        zzee.zzt((zzlc) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e2) {
                        this.zzs.zzay().zzd().zzb("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzee.zzn((zzac) abstractSafeParcelable2, zzq);
                    } catch (RemoteException e3) {
                        this.zzs.zzay().zzd().zzb("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    C16530d.m42018k(this.zzs, "Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    public final void zzE(zzac zzac) {
        Preconditions.checkNotNull(zzac);
        zzg();
        zza();
        this.zzs.zzaw();
        zzR(new zzji(this, true, zzO(true), this.zzs.zzi().zzn(zzac), new zzac(zzac), zzac));
    }

    public final void zzF(boolean z) {
        zzg();
        zza();
        if (z) {
            zzS();
            this.zzs.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zzjg(this, zzO(false)));
        }
    }

    public final void zzG(zzik zzik) {
        zzg();
        zza();
        zzR(new zzja(this, zzik));
    }

    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zzjb(this, zzO(false), bundle));
    }

    public final void zzI() {
        zzg();
        zza();
        zzR(new zzjf(this, zzO(true)));
    }

    @VisibleForTesting
    public final void zzJ(zzee zzee) {
        zzg();
        Preconditions.checkNotNull(zzee);
        this.zzb = zzee;
        zzQ();
        zzP();
    }

    public final void zzK(zzlc zzlc) {
        zzg();
        zza();
        zzS();
        zzR(new zziu(this, zzO(true), this.zzs.zzi().zzp(zzlc), zzlc));
    }

    public final boolean zzL() {
        zzg();
        zza();
        if (this.zzb != null) {
            return true;
        }
        return false;
    }

    public final boolean zzM() {
        zzg();
        zza();
        if (!zzN() || this.zzs.zzv().zzm() >= ((Integer) zzeb.zzaf.zza((Object) null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzN() {
        /*
            r6 = this;
            r6.zzg()
            r6.zza()
            java.lang.Boolean r0 = r6.zzc
            if (r0 != 0) goto L_0x0110
            r6.zzg()
            r6.zza()
            com.google.android.gms.measurement.internal.zzfy r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzfd r0 = r0.zzm()
            r0.zzg()
            android.content.SharedPreferences r1 = r0.zza()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0029
            r0 = 0
            goto L_0x0035
        L_0x0029:
            android.content.SharedPreferences r0 = r0.zza()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0035:
            r1 = 1
            if (r0 == 0) goto L_0x0040
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x0040
            goto L_0x010a
        L_0x0040:
            com.google.android.gms.measurement.internal.zzfy r4 = r6.zzs
            r4.zzaw()
            com.google.android.gms.measurement.internal.zzfy r4 = r6.zzs
            com.google.android.gms.measurement.internal.zzef r4 = r4.zzh()
            int r4 = r4.zzh()
            if (r4 != r1) goto L_0x0053
            goto L_0x00d9
        L_0x0053:
            com.google.android.gms.measurement.internal.zzfy r4 = r6.zzs
            java.lang.String r5 = "Checking service availability"
            p358af.C13437d.m33710p(r4, r5)
            com.google.android.gms.measurement.internal.zzfy r4 = r6.zzs
            com.google.android.gms.measurement.internal.zzlh r4 = r4.zzv()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.zzo(r5)
            if (r4 == 0) goto L_0x00d2
            if (r4 == r1) goto L_0x00ca
            r5 = 2
            if (r4 == r5) goto L_0x00a5
            r0 = 3
            if (r4 == r0) goto L_0x009d
            r0 = 9
            if (r4 == r0) goto L_0x0095
            r0 = 18
            if (r4 == r0) goto L_0x008d
            com.google.android.gms.measurement.internal.zzfy r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzeo r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzk()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.zzb(r4, r1)
            goto L_0x00c8
        L_0x008d:
            com.google.android.gms.measurement.internal.zzfy r0 = r6.zzs
            java.lang.String r3 = "Service updating"
            p379.C16759e.m42354j(r0, r3)
            goto L_0x00d9
        L_0x0095:
            com.google.android.gms.measurement.internal.zzfy r0 = r6.zzs
            java.lang.String r1 = "Service invalid"
            p379.C16759e.m42354j(r0, r1)
            goto L_0x00c8
        L_0x009d:
            com.google.android.gms.measurement.internal.zzfy r0 = r6.zzs
            java.lang.String r1 = "Service disabled"
            p379.C16759e.m42354j(r0, r1)
            goto L_0x00c8
        L_0x00a5:
            com.google.android.gms.measurement.internal.zzfy r4 = r6.zzs
            com.google.android.gms.measurement.internal.zzeo r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzem r4 = r4.zzc()
            java.lang.String r5 = "Service container out of date"
            r4.zza(r5)
            com.google.android.gms.measurement.internal.zzfy r4 = r6.zzs
            com.google.android.gms.measurement.internal.zzlh r4 = r4.zzv()
            int r4 = r4.zzm()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00c3
            goto L_0x00da
        L_0x00c3:
            if (r0 != 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r1 = 0
        L_0x00c7:
            r3 = r1
        L_0x00c8:
            r1 = 0
            goto L_0x00da
        L_0x00ca:
            com.google.android.gms.measurement.internal.zzfy r0 = r6.zzs
            java.lang.String r4 = "Service missing"
            p358af.C13437d.m33710p(r0, r4)
            goto L_0x00da
        L_0x00d2:
            com.google.android.gms.measurement.internal.zzfy r0 = r6.zzs
            java.lang.String r3 = "Service available"
            p358af.C13437d.m33710p(r0, r3)
        L_0x00d9:
            r3 = 1
        L_0x00da:
            if (r3 != 0) goto L_0x00f0
            com.google.android.gms.measurement.internal.zzfy r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzag r0 = r0.zzf()
            boolean r0 = r0.zzx()
            if (r0 == 0) goto L_0x00f0
            com.google.android.gms.measurement.internal.zzfy r0 = r6.zzs
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            p379.C16530d.m42018k(r0, r1)
            goto L_0x0109
        L_0x00f0:
            if (r1 == 0) goto L_0x0109
            com.google.android.gms.measurement.internal.zzfy r0 = r6.zzs
            com.google.android.gms.measurement.internal.zzfd r0 = r0.zzm()
            r0.zzg()
            android.content.SharedPreferences r0 = r0.zza()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0109:
            r1 = r3
        L_0x010a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.zzc = r0
        L_0x0110:
            java.lang.Boolean r0 = r6.zzc
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjs.zzN():boolean");
    }

    public final boolean zzf() {
        return false;
    }

    public final Boolean zzj() {
        return this.zzc;
    }

    public final void zzq() {
        zzg();
        zza();
        zzq zzO = zzO(true);
        this.zzs.zzi().zzk();
        zzR(new zziz(this, zzO));
    }

    public final void zzr() {
        zzg();
        zza();
        if (!zzL()) {
            if (zzN()) {
                this.zza.zzc();
            } else if (!this.zzs.zzf().zzx()) {
                this.zzs.zzaw();
                List<ResolveInfo> queryIntentServices = this.zzs.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzs.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), SQLiteDatabase.OPEN_FULLMUTEX);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    C16530d.m42018k(this.zzs, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context zzau = this.zzs.zzau();
                this.zzs.zzaw();
                intent.setComponent(new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
                this.zza.zzb(intent);
            }
        }
    }

    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzs.zzau(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzt(zzcf zzcf) {
        zzg();
        zza();
        zzR(new zziy(this, zzO(false), zzcf));
    }

    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzix(this, atomicReference, zzO(false)));
    }

    public final void zzv(zzcf zzcf, String str, String str2) {
        zzg();
        zza();
        zzR(new zzjk(this, str, str2, zzO(false), zzcf));
    }

    public final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjj(this, atomicReference, (String) null, str2, str3, zzO(false)));
    }

    public final void zzx(AtomicReference atomicReference, boolean z) {
        zzg();
        zza();
        zzR(new zziv(this, atomicReference, zzO(false), z));
    }

    public final void zzy(zzcf zzcf, String str, String str2, boolean z) {
        zzg();
        zza();
        zzR(new zzit(this, str, str2, zzO(false), z, zzcf));
    }

    public final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        zzg();
        zza();
        zzR(new zzjl(this, atomicReference, (String) null, str2, str3, zzO(false), z));
    }
}
