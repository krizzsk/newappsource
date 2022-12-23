package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "SendPayloadParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmo> CREATOR = new zzmp();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", mo65739id = 1, type = "android.os.IBinder")
    public zzkj zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getRemoteEndpointIds", mo65739id = 2)
    public String[] zzb;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getPayload", mo65739id = 3)
    public zzmb zzc;
    @SafeParcelable.Field(getter = "getSendReliably", mo65739id = 4)
    private boolean zzd;
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", mo65739id = 5)
    private final int zze;
    @SafeParcelable.Field(getter = "getPresenceDevice", mo65739id = 6)
    private zznv zzf;

    private zzmo() {
        this.zze = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmo) {
            zzmo zzmo = (zzmo) obj;
            if (!Objects.equal(this.zza, zzmo.zza) || !Arrays.equals(this.zzb, zzmo.zzb) || !Objects.equal(this.zzc, zzmo.zzc) || !Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(zzmo.zzd)) || !Objects.equal(Integer.valueOf(this.zze), Integer.valueOf(zzmo.zze)) || !Objects.equal(this.zzf, zzmo.zzf)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(Arrays.hashCode(this.zzb)), this.zzc, Boolean.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf);
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
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzmo(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) android.os.IBinder r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) java.lang.String[] r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 3) com.google.android.gms.internal.nearby.zzmb r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 4) boolean r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 5) int r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 6) com.google.android.gms.internal.nearby.zznv r8) {
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
            r2.zze = r7
            r2.zzf = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzmo.<init>(android.os.IBinder, java.lang.String[], com.google.android.gms.internal.nearby.zzmb, boolean, int, com.google.android.gms.internal.nearby.zznv):void");
    }

    public /* synthetic */ zzmo(zzmn zzmn) {
        this.zze = 0;
    }
}
