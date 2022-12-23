package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StartRangingParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqi> CREATOR = new zzqj();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", mo65739id = 1, type = "android.os.IBinder")
    public zzpb zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getParams", mo65739id = 2)
    public zzpy zzb;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getCallbackAsBinder", mo65739id = 3, type = "android.os.IBinder")
    public zzoy zzc;

    private zzqi() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqi) {
            zzqi zzqi = (zzqi) obj;
            if (!Objects.equal(this.zza, zzqi.zza) || !Objects.equal(this.zzb, zzqi.zzb) || !Objects.equal(this.zzc, zzqi.zzc)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzpb zzpb = this.zza;
        if (zzpb == null) {
            iBinder = null;
        } else {
            iBinder = zzpb.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinder, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzqi(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) com.google.android.gms.internal.nearby.zzpy r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 3) android.os.IBinder r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0017
        L_0x0005:
            java.lang.String r1 = "com.google.android.gms.nearby.uwb.internal.IResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.nearby.zzpb
            if (r2 == 0) goto L_0x0012
            com.google.android.gms.internal.nearby.zzpb r1 = (com.google.android.gms.internal.nearby.zzpb) r1
            goto L_0x0017
        L_0x0012:
            com.google.android.gms.internal.nearby.zzoz r1 = new com.google.android.gms.internal.nearby.zzoz
            r1.<init>(r4)
        L_0x0017:
            if (r6 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.lang.String r4 = "com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback"
            android.os.IInterface r4 = r6.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.nearby.zzoy
            if (r0 == 0) goto L_0x0028
            r0 = r4
            com.google.android.gms.internal.nearby.zzoy r0 = (com.google.android.gms.internal.nearby.zzoy) r0
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzow r0 = new com.google.android.gms.internal.nearby.zzow
            r0.<init>(r6)
        L_0x002d:
            r3.<init>()
            r3.zza = r1
            r3.zzb = r5
            r3.zzc = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzqi.<init>(android.os.IBinder, com.google.android.gms.internal.nearby.zzpy, android.os.IBinder):void");
    }

    public /* synthetic */ zzqi(zzqh zzqh) {
    }
}
