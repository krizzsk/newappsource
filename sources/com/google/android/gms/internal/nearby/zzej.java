package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RequestPreAuthorizedTemporaryExposureKeyHistoryParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzej extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzej> CREATOR = new zzek();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getStatusCallbackAsBinder", mo65739id = 1, type = "android.os.IBinder")
    public IStatusCallback zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(defaultValue = "false", getter = "getSelfReport", mo65739id = 2)
    public boolean zzb;

    private zzej() {
        this.zzb = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzej) {
            zzej zzej = (zzej) obj;
            if (!Objects.equal(this.zza, zzej.zza) || !Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(zzej.zzb))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Boolean.valueOf(this.zzb));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.zza.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzej(@SafeParcelable.Param(mo65742id = 1) IBinder iBinder, @SafeParcelable.Param(mo65742id = 2) boolean z) {
        this.zza = IStatusCallback.Stub.asInterface(iBinder);
        this.zzb = z;
    }

    public /* synthetic */ zzej(zzei zzei) {
        this.zzb = false;
    }
}
