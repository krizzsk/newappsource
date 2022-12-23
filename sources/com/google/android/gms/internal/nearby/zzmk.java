package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import java.util.Arrays;

@SafeParcelable.Class(creator = "SendConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmk> CREATOR = new zzml();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", mo65739id = 1, type = "android.os.IBinder")
    public zzkj zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getConnectionEventListenerAsBinder", mo65739id = 2, type = "android.os.IBinder")
    public zzjs zzb;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getConnectionResponseListenerAsBinder", mo65739id = 3, type = "android.os.IBinder")
    public zzjy zzc;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getName", mo65739id = 4)
    public String zzd;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", mo65739id = 5)
    public String zze;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getHandshakeData", mo65739id = 6)
    public byte[] zzf;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getConnectionLifecycleListenerAsBinder", mo65739id = 7, type = "android.os.IBinder")
    public zzjv zzg;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getEndpointInfo", mo65739id = 8)
    public byte[] zzh;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getOptions", mo65739id = 9)
    public ConnectionOptions zzi;
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", mo65739id = 10)
    private final int zzj;
    @SafeParcelable.Field(getter = "getPresenceDevice", mo65739id = 11)
    private zznv zzk;
    @SafeParcelable.Field(getter = "getLocalDeviceInfo", mo65739id = 12)
    private byte[] zzl;
    @SafeParcelable.Field(getter = "getServiceId", mo65739id = 13)
    private String zzm;

    private zzmk() {
        this.zzj = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmk) {
            zzmk zzmk = (zzmk) obj;
            if (!Objects.equal(this.zza, zzmk.zza) || !Objects.equal(this.zzb, zzmk.zzb) || !Objects.equal(this.zzc, zzmk.zzc) || !Objects.equal(this.zzd, zzmk.zzd) || !Objects.equal(this.zze, zzmk.zze) || !Arrays.equals(this.zzf, zzmk.zzf) || !Objects.equal(this.zzg, zzmk.zzg) || !Arrays.equals(this.zzh, zzmk.zzh) || !Objects.equal(this.zzi, zzmk.zzi) || !Objects.equal(Integer.valueOf(this.zzj), Integer.valueOf(zzmk.zzj)) || !Objects.equal(this.zzk, zzmk.zzk) || !Arrays.equals(this.zzl, zzmk.zzl) || !Objects.equal(this.zzm, zzmk.zzm)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, Integer.valueOf(Arrays.hashCode(this.zzf)), this.zzg, Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi, Integer.valueOf(this.zzj), this.zzk, Integer.valueOf(Arrays.hashCode(this.zzl)), this.zzm);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        IBinder iBinder3;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkj zzkj = this.zza;
        IBinder iBinder4 = null;
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
        zzjy zzjy = this.zzc;
        if (zzjy == null) {
            iBinder3 = null;
        } else {
            iBinder3 = zzjy.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, iBinder3, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeByteArray(parcel, 6, this.zzf, false);
        zzjv zzjv = this.zzg;
        if (zzjv != null) {
            iBinder4 = zzjv.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 7, iBinder4, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i, false);
        SafeParcelWriter.writeInt(parcel, 10, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeByteArray(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzm, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzmk(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) android.os.IBinder r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) android.os.IBinder r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 3) android.os.IBinder r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 4) java.lang.String r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 5) java.lang.String r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 6) byte[] r14, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 7) android.os.IBinder r15, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 8) byte[] r16, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 9) com.google.android.gms.nearby.connection.ConnectionOptions r17, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 10) int r18, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 11) com.google.android.gms.internal.nearby.zznv r19, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 12) byte[] r20, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 13) java.lang.String r21) {
        /*
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r15
            r5 = 0
            if (r1 != 0) goto L_0x000a
            r6 = r5
            goto L_0x001c
        L_0x000a:
            java.lang.String r6 = "com.google.android.gms.nearby.internal.connection.IResultListener"
            android.os.IInterface r6 = r9.queryLocalInterface(r6)
            boolean r7 = r6 instanceof com.google.android.gms.internal.nearby.zzkj
            if (r7 == 0) goto L_0x0017
            com.google.android.gms.internal.nearby.zzkj r6 = (com.google.android.gms.internal.nearby.zzkj) r6
            goto L_0x001c
        L_0x0017:
            com.google.android.gms.internal.nearby.zzkh r6 = new com.google.android.gms.internal.nearby.zzkh
            r6.<init>(r9)
        L_0x001c:
            if (r2 != 0) goto L_0x0020
            r1 = r5
            goto L_0x0032
        L_0x0020:
            java.lang.String r1 = "com.google.android.gms.nearby.internal.connection.IConnectionEventListener"
            android.os.IInterface r1 = r10.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.nearby.zzjs
            if (r7 == 0) goto L_0x002d
            com.google.android.gms.internal.nearby.zzjs r1 = (com.google.android.gms.internal.nearby.zzjs) r1
            goto L_0x0032
        L_0x002d:
            com.google.android.gms.internal.nearby.zzjq r1 = new com.google.android.gms.internal.nearby.zzjq
            r1.<init>(r10)
        L_0x0032:
            if (r3 != 0) goto L_0x0036
            r2 = r5
            goto L_0x0048
        L_0x0036:
            java.lang.String r2 = "com.google.android.gms.nearby.internal.connection.IConnectionResponseListener"
            android.os.IInterface r2 = r11.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.nearby.zzjy
            if (r7 == 0) goto L_0x0043
            com.google.android.gms.internal.nearby.zzjy r2 = (com.google.android.gms.internal.nearby.zzjy) r2
            goto L_0x0048
        L_0x0043:
            com.google.android.gms.internal.nearby.zzjw r2 = new com.google.android.gms.internal.nearby.zzjw
            r2.<init>(r11)
        L_0x0048:
            if (r4 != 0) goto L_0x004b
            goto L_0x005e
        L_0x004b:
            java.lang.String r3 = "com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener"
            android.os.IInterface r3 = r15.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.nearby.zzjv
            if (r5 == 0) goto L_0x0059
            r5 = r3
            com.google.android.gms.internal.nearby.zzjv r5 = (com.google.android.gms.internal.nearby.zzjv) r5
            goto L_0x005e
        L_0x0059:
            com.google.android.gms.internal.nearby.zzjt r5 = new com.google.android.gms.internal.nearby.zzjt
            r5.<init>(r15)
        L_0x005e:
            r8.<init>()
            r0.zza = r6
            r0.zzb = r1
            r0.zzc = r2
            r1 = r12
            r0.zzd = r1
            r1 = r13
            r0.zze = r1
            r1 = r14
            r0.zzf = r1
            r0.zzg = r5
            r1 = r16
            r0.zzh = r1
            r1 = r17
            r0.zzi = r1
            r1 = r18
            r0.zzj = r1
            r1 = r19
            r0.zzk = r1
            r1 = r20
            r0.zzl = r1
            r1 = r21
            r0.zzm = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzmk.<init>(android.os.IBinder, android.os.IBinder, android.os.IBinder, java.lang.String, java.lang.String, byte[], android.os.IBinder, byte[], com.google.android.gms.nearby.connection.ConnectionOptions, int, com.google.android.gms.internal.nearby.zznv, byte[], java.lang.String):void");
    }

    public /* synthetic */ zzmk(zzmj zzmj) {
        this.zzj = 0;
    }
}
