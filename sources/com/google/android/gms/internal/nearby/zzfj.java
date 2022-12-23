package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "AcceptConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzfj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfj> CREATOR = new zzfk();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", mo65739id = 1, type = "android.os.IBinder")
    public zzkj zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getConnectionEventListenerAsBinder", mo65739id = 2, type = "android.os.IBinder")
    public zzjs zzb;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", mo65739id = 3)
    public String zzc;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getHandshakeData", mo65739id = 4)
    public byte[] zzd;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getPayloadListenerAsBinder", mo65739id = 5, type = "android.os.IBinder")
    public zzkg zze;
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", mo65739id = 6)
    private final int zzf;
    @SafeParcelable.Field(getter = "getPresenceDevice", mo65739id = 7)
    private zznv zzg;

    private zzfj() {
        this.zzf = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfj) {
            zzfj zzfj = (zzfj) obj;
            if (!Objects.equal(this.zza, zzfj.zza) || !Objects.equal(this.zzb, zzfj.zzb) || !Objects.equal(this.zzc, zzfj.zzc) || !Arrays.equals(this.zzd, zzfj.zzd) || !Objects.equal(this.zze, zzfj.zze) || !Objects.equal(Integer.valueOf(this.zzf), Integer.valueOf(zzfj.zzf)) || !Objects.equal(this.zzg, zzfj.zzg)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, Integer.valueOf(Arrays.hashCode(this.zzd)), this.zze, Integer.valueOf(this.zzf), this.zzg);
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
        zzjs zzjs = this.zzb;
        if (zzjs == null) {
            iBinder2 = null;
        } else {
            iBinder2 = zzjs.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder2, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        zzkg zzkg = this.zze;
        if (zzkg != null) {
            iBinder3 = zzkg.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, iBinder3, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzfj(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) android.os.IBinder r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 3) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 4) byte[] r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 5) android.os.IBinder r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 6) int r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 7) com.google.android.gms.internal.nearby.zznv r10) {
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
            java.lang.String r4 = "com.google.android.gms.nearby.internal.connection.IConnectionEventListener"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r2 = r4 instanceof com.google.android.gms.internal.nearby.zzjs
            if (r2 == 0) goto L_0x0028
            com.google.android.gms.internal.nearby.zzjs r4 = (com.google.android.gms.internal.nearby.zzjs) r4
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzjq r4 = new com.google.android.gms.internal.nearby.zzjq
            r4.<init>(r5)
        L_0x002d:
            if (r8 != 0) goto L_0x0030
            goto L_0x0043
        L_0x0030:
            java.lang.String r5 = "com.google.android.gms.nearby.internal.connection.IPayloadListener"
            android.os.IInterface r5 = r8.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.nearby.zzkg
            if (r0 == 0) goto L_0x003e
            r0 = r5
            com.google.android.gms.internal.nearby.zzkg r0 = (com.google.android.gms.internal.nearby.zzkg) r0
            goto L_0x0043
        L_0x003e:
            com.google.android.gms.internal.nearby.zzke r0 = new com.google.android.gms.internal.nearby.zzke
            r0.<init>(r8)
        L_0x0043:
            r3.<init>()
            r3.zza = r1
            r3.zzb = r4
            r3.zzc = r6
            r3.zzd = r7
            r3.zze = r0
            r3.zzf = r9
            r3.zzg = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzfj.<init>(android.os.IBinder, android.os.IBinder, java.lang.String, byte[], android.os.IBinder, int, com.google.android.gms.internal.nearby.zznv):void");
    }

    public /* synthetic */ zzfj(zzfi zzfi) {
        this.zzf = 0;
    }
}
