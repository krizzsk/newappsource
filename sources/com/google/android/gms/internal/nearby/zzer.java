package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;

@SafeParcelable.Class(creator = "SetDiagnosisKeysDataMappingParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzer extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzer> CREATOR = new zzes();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getStatusCallbackAsBinder", mo65739id = 1, type = "android.os.IBinder")
    public IStatusCallback zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getDiagnosisKeysDataMapping", mo65739id = 2)
    public DiagnosisKeysDataMapping zzb;

    private zzer() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzer) {
            zzer zzer = (zzer) obj;
            if (!Objects.equal(this.zza, zzer.zza) || !Objects.equal(this.zzb, zzer.zzb)) {
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

    @SafeParcelable.Constructor
    public zzer(@SafeParcelable.Param(mo65742id = 1) IBinder iBinder, @SafeParcelable.Param(mo65742id = 2) DiagnosisKeysDataMapping diagnosisKeysDataMapping) {
        this.zza = IStatusCallback.Stub.asInterface(iBinder);
        this.zzb = diagnosisKeysDataMapping;
    }

    public /* synthetic */ zzer(zzeq zzeq) {
    }
}
