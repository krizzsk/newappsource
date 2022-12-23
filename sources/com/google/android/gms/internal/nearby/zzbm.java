package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetExposureInformationParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzbm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbm> CREATOR = new zzbn();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getExposureInformationListCallbackAsBinder", mo65739id = 2, type = "android.os.IBinder")
    public zzdb zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getToken", mo65739id = 3)
    public String zzb;
    @SafeParcelable.Field(getter = "getExposureInformationResultListenerAsBinder", mo65739id = 1, type = "android.os.IBinder")
    private zzdc zzc;

    private zzbm() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbm) {
            zzbm zzbm = (zzbm) obj;
            if (!Objects.equal(this.zzc, zzbm.zzc) || !Objects.equal(this.zza, zzbm.zza) || !Objects.equal(this.zzb, zzbm.zzb)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzc, this.zza, this.zzb);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzdc zzdc = this.zzc;
        if (zzdc == null) {
            iBinder = null;
        } else {
            iBinder = zzdc.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, iBinder, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zza.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbm(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) android.os.IBinder r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) android.os.IBinder r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 3) java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0017
        L_0x0005:
            java.lang.String r1 = "com.google.android.gms.nearby.exposurenotification.internal.IExposureInformationResultListener"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.nearby.zzdc
            if (r2 == 0) goto L_0x0012
            com.google.android.gms.internal.nearby.zzdc r1 = (com.google.android.gms.internal.nearby.zzdc) r1
            goto L_0x0017
        L_0x0012:
            com.google.android.gms.internal.nearby.zzdc r1 = new com.google.android.gms.internal.nearby.zzdc
            r1.<init>(r4)
        L_0x0017:
            if (r5 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.lang.String r4 = "com.google.android.gms.nearby.exposurenotification.internal.IExposureInformationListCallback"
            android.os.IInterface r4 = r5.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.nearby.zzdb
            if (r0 == 0) goto L_0x0028
            r0 = r4
            com.google.android.gms.internal.nearby.zzdb r0 = (com.google.android.gms.internal.nearby.zzdb) r0
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.nearby.zzcz r0 = new com.google.android.gms.internal.nearby.zzcz
            r0.<init>(r5)
        L_0x002d:
            r3.<init>()
            r3.zzc = r1
            r3.zza = r0
            r3.zzb = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzbm.<init>(android.os.IBinder, android.os.IBinder, java.lang.String):void");
    }

    public /* synthetic */ zzbm(zzbl zzbl) {
    }
}
