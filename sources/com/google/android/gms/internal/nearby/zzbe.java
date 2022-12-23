package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.DailySummariesConfig;

@SafeParcelable.Class(creator = "GetDailySummariesParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getDailySummaryListCallbackAsBinder", mo65739id = 1, type = "android.os.IBinder")
    public zzcs zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getDailySummariesConfig", mo65739id = 2)
    public DailySummariesConfig zzb;

    private zzbe() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbe = (zzbe) obj;
            if (!Objects.equal(this.zza, zzbe.zza) || !Objects.equal(this.zzb, zzbe.zzb)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.zza.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbe(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 1) android.os.IBinder r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(mo65742id = 2) com.google.android.gms.nearby.exposurenotification.DailySummariesConfig r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x0018
        L_0x0004:
            java.lang.String r0 = "com.google.android.gms.nearby.exposurenotification.internal.IDailySummaryListCallback"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.nearby.zzcs
            if (r1 == 0) goto L_0x0012
            r3 = r0
            com.google.android.gms.internal.nearby.zzcs r3 = (com.google.android.gms.internal.nearby.zzcs) r3
            goto L_0x0018
        L_0x0012:
            com.google.android.gms.internal.nearby.zzcq r0 = new com.google.android.gms.internal.nearby.zzcq
            r0.<init>(r3)
            r3 = r0
        L_0x0018:
            r2.<init>()
            r2.zza = r3
            r2.zzb = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzbe.<init>(android.os.IBinder, com.google.android.gms.nearby.exposurenotification.DailySummariesConfig):void");
    }

    public /* synthetic */ zzbe(zzbd zzbd) {
    }
}
