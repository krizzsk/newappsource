package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;

@SafeParcelable.Class(creator = "StartParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzev extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzev> CREATOR = new zzew();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getStatusCallbackAsBinder", mo65739id = 3, type = "android.os.IBinder")
    public IStatusCallback zza;
    @SafeParcelable.Field(getter = "getExposureConfiguration", mo65739id = 4)
    private ExposureConfiguration zzb;

    private zzev() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzev) {
            zzev zzev = (zzev) obj;
            if (!Objects.equal(this.zza, zzev.zza) || !Objects.equal(this.zzb, zzev.zzb)) {
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
        SafeParcelWriter.writeIBinder(parcel, 3, this.zza.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzev(@SafeParcelable.Param(mo65742id = 3) IBinder iBinder, @SafeParcelable.Param(mo65742id = 4) ExposureConfiguration exposureConfiguration) {
        this.zza = IStatusCallback.Stub.asInterface(iBinder);
        this.zzb = exposureConfiguration;
    }

    public /* synthetic */ zzev(zzeu zzeu) {
    }
}
