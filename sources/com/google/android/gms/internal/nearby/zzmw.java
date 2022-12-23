package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

@SafeParcelable.Class(creator = "StartDiscoveryParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmw> CREATOR = new zzmx();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", mo65739id = 1, type = "android.os.IBinder")
    public zzkj zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getServiceId", mo65739id = 3)
    public String zzb;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getDurationMillis", mo65739id = 4)
    public long zzc;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getOptions", mo65739id = 5)
    public DiscoveryOptions zzd;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getDiscoveryListenerAsBinder", mo65739id = 6, type = "android.os.IBinder")
    public zzkc zze;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", mo65739id = 2, type = "android.os.IBinder")
    private zzjz zzf;

    private zzmw() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmw) {
            zzmw zzmw = (zzmw) obj;
            if (!Objects.equal(this.zza, zzmw.zza) || !Objects.equal(this.zzf, zzmw.zzf) || !Objects.equal(this.zzb, zzmw.zzb) || !Objects.equal(Long.valueOf(this.zzc), Long.valueOf(zzmw.zzc)) || !Objects.equal(this.zzd, zzmw.zzd) || !Objects.equal(this.zze, zzmw.zze)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzf, this.zzb, Long.valueOf(this.zzc), this.zzd, this.zze);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkj zzkj = this.zza;
        IBinder iBinder3 = null;
        if (zzkj == null) {
            iBinder = null;
        } else {
            iBinder = zzkj.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinder, false);
        zzjz zzjz = this.zzf;
        if (zzjz == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zzjz.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder2, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        zzkc zzkc = this.zze;
        if (zzkc != null) {
            iBinder3 = zzkc.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinder3, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzmw(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) android.os.IBinder r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 3) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 4) long r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 5) com.google.android.gms.nearby.connection.DiscoveryOptions r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 6) android.os.IBinder r10) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0017
        L_0x0005:
            java.lang.String r1 = "com.google.android.gms.nearby.internal.connection.IResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.nearby.zzkj
            if (r2 == 0) goto L_0x0012
            com.google.android.gms.internal.nearby.zzkj r1 = (com.google.android.gms.internal.nearby.zzkj) r1
            goto L_0x0017
        L_0x0012:
            com.google.android.gms.internal.nearby.zzkh r1 = new com.google.android.gms.internal.nearby.zzkh
            r1.<init>(r4)
        L_0x0017:
            if (r5 != 0) goto L_0x001b
            r4 = r0
            goto L_0x002d
        L_0x001b:
            java.lang.String r4 = "com.google.android.gms.nearby.internal.connection.IDiscoveryCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r2 = r4 instanceof com.google.android.gms.internal.nearby.zzjz
            if (r2 == 0) goto L_0x0028
            com.google.android.gms.internal.nearby.zzjz r4 = (com.google.android.gms.internal.nearby.zzjz) r4
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzjz r4 = new com.google.android.gms.internal.nearby.zzjz
            r4.<init>(r5)
        L_0x002d:
            if (r10 != 0) goto L_0x0030
            goto L_0x0043
        L_0x0030:
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IDiscoveryListener"
            android.os.IInterface r5 = r10.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.nearby.zzkc
            if (r0 == 0) goto L_0x003e
            r0 = r5
            com.google.android.gms.internal.nearby.zzkc r0 = (com.google.android.gms.internal.nearby.zzkc) r0
            goto L_0x0043
        L_0x003e:
            com.google.android.gms.internal.nearby.zzka r0 = new com.google.android.gms.internal.nearby.zzka
            r0.<init>(r10)
        L_0x0043:
            r3.<init>()
            r3.zza = r1
            r3.zzf = r4
            r3.zzb = r6
            r3.zzc = r7
            r3.zzd = r9
            r3.zze = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzmw.<init>(android.os.IBinder, android.os.IBinder, java.lang.String, long, com.google.android.gms.nearby.connection.DiscoveryOptions, android.os.IBinder):void");
    }

    public /* synthetic */ zzmw(zzmv zzmv) {
    }
}
