package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RejectConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmg> CREATOR = new zzmh();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", mo65739id = 1, type = "android.os.IBinder")
    public zzkj zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", mo65739id = 2)
    public String zzb;
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", mo65739id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getPresenceDevice", mo65739id = 4)
    private zznv zzd;

    private zzmg() {
        this.zzc = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmg) {
            zzmg zzmg = (zzmg) obj;
            if (!Objects.equal(this.zza, zzmg.zza) || !Objects.equal(this.zzb, zzmg.zzb) || !Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzmg.zzc)) || !Objects.equal(this.zzd, zzmg.zzd)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkj zzkj = this.zza;
        if (zzkj == null) {
            iBinder = null;
        } else {
            iBinder = zzkj.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinder, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzmg(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) android.os.IBinder r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 3) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 4) com.google.android.gms.internal.nearby.zznv r6) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x0018
        L_0x0004:
            java.lang.String r0 = "com.google.android.gms.nearby.internal.connection.IResultListener"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.nearby.zzkj
            if (r1 == 0) goto L_0x0012
            r3 = r0
            com.google.android.gms.internal.nearby.zzkj r3 = (com.google.android.gms.internal.nearby.zzkj) r3
            goto L_0x0018
        L_0x0012:
            com.google.android.gms.internal.nearby.zzkh r0 = new com.google.android.gms.internal.nearby.zzkh
            r0.<init>(r3)
            r3 = r0
        L_0x0018:
            r2.<init>()
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zzd = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzmg.<init>(android.os.IBinder, java.lang.String, int, com.google.android.gms.internal.nearby.zznv):void");
    }

    public /* synthetic */ zzmg(zzmf zzmf) {
        this.zzc = 0;
    }
}
