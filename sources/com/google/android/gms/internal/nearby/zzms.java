package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import java.util.Arrays;

@SafeParcelable.Class(creator = "StartAdvertisingParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzms extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzms> CREATOR = new zzmt();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", mo65739id = 1, type = "android.os.IBinder")
    public zzkm zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getCallbackAsBinder", mo65739id = 2, type = "android.os.IBinder")
    public zzjp zzb;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getName", mo65739id = 3)
    public String zzc;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getServiceId", mo65739id = 4)
    public String zzd;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getDurationMillis", mo65739id = 5)
    public long zze;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getOptions", mo65739id = 6)
    public AdvertisingOptions zzf;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getConnectionLifecycleListenerAsBinder", mo65739id = 7, type = "android.os.IBinder")
    public zzjv zzg;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getEndpointInfo", mo65739id = 8)
    public byte[] zzh;

    private zzms() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzms) {
            zzms zzms = (zzms) obj;
            if (!Objects.equal(this.zza, zzms.zza) || !Objects.equal(this.zzb, zzms.zzb) || !Objects.equal(this.zzc, zzms.zzc) || !Objects.equal(this.zzd, zzms.zzd) || !Objects.equal(Long.valueOf(this.zze), Long.valueOf(zzms.zze)) || !Objects.equal(this.zzf, zzms.zzf) || !Objects.equal(this.zzg, zzms.zzg) || !Arrays.equals(this.zzh, zzms.zzh)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, Long.valueOf(this.zze), this.zzf, this.zzg, Integer.valueOf(Arrays.hashCode(this.zzh)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkm zzkm = this.zza;
        IBinder iBinder3 = null;
        if (zzkm == null) {
            iBinder = null;
        } else {
            iBinder = zzkm.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinder, false);
        zzjp zzjp = this.zzb;
        if (zzjp == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zzjp.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder2, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        zzjv zzjv = this.zzg;
        if (zzjv != null) {
            iBinder3 = zzjv.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 7, iBinder3, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzms(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) android.os.IBinder r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 3) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 4) java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 5) long r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 6) com.google.android.gms.nearby.connection.AdvertisingOptions r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 7) android.os.IBinder r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 8) byte[] r12) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0017
        L_0x0005:
            java.lang.String r1 = "com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.nearby.zzkm
            if (r2 == 0) goto L_0x0012
            com.google.android.gms.internal.nearby.zzkm r1 = (com.google.android.gms.internal.nearby.zzkm) r1
            goto L_0x0017
        L_0x0012:
            com.google.android.gms.internal.nearby.zzkk r1 = new com.google.android.gms.internal.nearby.zzkk
            r1.<init>(r4)
        L_0x0017:
            if (r5 != 0) goto L_0x001b
            r4 = r0
            goto L_0x002d
        L_0x001b:
            java.lang.String r4 = "com.google.android.gms.nearby.internal.connection.IAdvertisingCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r2 = r4 instanceof com.google.android.gms.internal.nearby.zzjp
            if (r2 == 0) goto L_0x0028
            com.google.android.gms.internal.nearby.zzjp r4 = (com.google.android.gms.internal.nearby.zzjp) r4
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzjn r4 = new com.google.android.gms.internal.nearby.zzjn
            r4.<init>(r5)
        L_0x002d:
            if (r11 != 0) goto L_0x0030
            goto L_0x0043
        L_0x0030:
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener"
            android.os.IInterface r5 = r11.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.nearby.zzjv
            if (r0 == 0) goto L_0x003e
            r0 = r5
            com.google.android.gms.internal.nearby.zzjv r0 = (com.google.android.gms.internal.nearby.zzjv) r0
            goto L_0x0043
        L_0x003e:
            com.google.android.gms.internal.nearby.zzjt r0 = new com.google.android.gms.internal.nearby.zzjt
            r0.<init>(r11)
        L_0x0043:
            r3.<init>()
            r3.zza = r1
            r3.zzb = r4
            r3.zzc = r6
            r3.zzd = r7
            r3.zze = r8
            r3.zzf = r10
            r3.zzg = r0
            r3.zzh = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzms.<init>(android.os.IBinder, android.os.IBinder, java.lang.String, java.lang.String, long, com.google.android.gms.nearby.connection.AdvertisingOptions, android.os.IBinder, byte[]):void");
    }

    public /* synthetic */ zzms(zzmr zzmr) {
    }
}
