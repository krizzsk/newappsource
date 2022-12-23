package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetStatusParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzcc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcc> CREATOR = new zzcd();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getLongCallbackAsBinder", mo65739id = 1, type = "android.os.IBinder")
    public zzdp zza;

    private zzcc() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcc) {
            return Objects.equal(this.zza, ((zzcc) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcc(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) android.os.IBinder r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x0018
        L_0x0004:
            java.lang.String r0 = "com.google.android.gms.nearby.exposurenotification.internal.ILongCallback"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.nearby.zzdp
            if (r1 == 0) goto L_0x0012
            r3 = r0
            com.google.android.gms.internal.nearby.zzdp r3 = (com.google.android.gms.internal.nearby.zzdp) r3
            goto L_0x0018
        L_0x0012:
            com.google.android.gms.internal.nearby.zzdn r0 = new com.google.android.gms.internal.nearby.zzdn
            r0.<init>(r3)
            r3 = r0
        L_0x0018:
            r2.<init>()
            r2.zza = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzcc.<init>(android.os.IBinder):void");
    }

    public /* synthetic */ zzcc(zzcb zzcb) {
    }
}
