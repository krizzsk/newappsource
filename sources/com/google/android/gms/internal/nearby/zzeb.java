package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "IsEnabledParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzeb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeb> CREATOR = new zzec();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getBooleanCallbackAsBinder", mo65739id = 2, type = "android.os.IBinder")
    public zzco zza;
    @SafeParcelable.Field(getter = "getBooleanResultListenerAsBinder", mo65739id = 1, type = "android.os.IBinder")
    private zzcp zzb;

    private zzeb() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeb) {
            zzeb zzeb = (zzeb) obj;
            if (!Objects.equal(this.zzb, zzeb.zzb) || !Objects.equal(this.zza, zzeb.zza)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zza);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzcp zzcp = this.zzb;
        if (zzcp == null) {
            iBinder = null;
        } else {
            iBinder = zzcp.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinder, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzeb(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) android.os.IBinder r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0017
        L_0x0005:
            java.lang.String r1 = "com.google.android.gms.nearby.exposurenotification.internal.IBooleanResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.nearby.zzcp
            if (r2 == 0) goto L_0x0012
            com.google.android.gms.internal.nearby.zzcp r1 = (com.google.android.gms.internal.nearby.zzcp) r1
            goto L_0x0017
        L_0x0012:
            com.google.android.gms.internal.nearby.zzcp r1 = new com.google.android.gms.internal.nearby.zzcp
            r1.<init>(r4)
        L_0x0017:
            if (r5 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.lang.String r4 = "com.google.android.gms.nearby.exposurenotification.internal.IBooleanCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.nearby.zzco
            if (r0 == 0) goto L_0x0028
            r0 = r4
            com.google.android.gms.internal.nearby.zzco r0 = (com.google.android.gms.internal.nearby.zzco) r0
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzcm r0 = new com.google.android.gms.internal.nearby.zzcm
            r0.<init>(r5)
        L_0x002d:
            r3.<init>()
            r3.zzb = r1
            r3.zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzeb.<init>(android.os.IBinder, android.os.IBinder):void");
    }

    public /* synthetic */ zzeb(zzea zzea) {
    }
}
