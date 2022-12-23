package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzbe;
import com.google.android.gms.location.zzbf;

@SafeParcelable.Class(creator = "DeviceOrientationRequestUpdateDataCreator")
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestUpdateData.OPERATION_ADD", mo65739id = 1)
    public final int zza;
    @SafeParcelable.Field(defaultValueUnchecked = "null", mo65739id = 2)
    public final zzh zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getDeviceOrientationListenerBinder", mo65739id = 3, type = "android.os.IBinder")
    public final zzbf zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", mo65739id = 4, type = "android.os.IBinder")
    public final zzai zzd;

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) zzh zzh, @SafeParcelable.Param(mo65742id = 3) IBinder iBinder, @SafeParcelable.Param(mo65742id = 4) IBinder iBinder2) {
        zzbf zzbf;
        this.zza = i;
        this.zzb = zzh;
        zzai zzai = null;
        if (iBinder == null) {
            zzbf = null;
        } else {
            zzbf = zzbe.zzb(iBinder);
        }
        this.zzc = zzbf;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzai = (zzai) queryLocalInterface;
            } else {
                zzai = new zzag(iBinder2);
            }
        }
        this.zzd = zzai;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        zzbf zzbf = this.zzc;
        IBinder iBinder2 = null;
        if (zzbf == null) {
            iBinder = null;
        } else {
            iBinder = zzbf.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, iBinder, false);
        zzai zzai = this.zzd;
        if (zzai != null) {
            iBinder2 = zzai.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 4, iBinder2, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
