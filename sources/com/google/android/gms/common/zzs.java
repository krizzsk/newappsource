package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field(getter = "getCallingPackage", mo65739id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getCallingCertificateBinder", mo65739id = 2, type = "android.os.IBinder")
    private final zzj zzb;
    @SafeParcelable.Field(getter = "getAllowTestKeys", mo65739id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", mo65739id = 4)
    private final boolean zzd;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) IBinder iBinder, @SafeParcelable.Param(mo65742id = 3) boolean z, @SafeParcelable.Param(mo65742id = 4) boolean z2) {
        byte[] bArr;
        this.zza = str;
        zzk zzk = null;
        if (iBinder != null) {
            try {
                IObjectWrapper zzd2 = zzy.zzg(iBinder).zzd();
                if (zzd2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) ObjectWrapper.unwrap(zzd2);
                }
                if (bArr != null) {
                    zzk = new zzk(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.zzb = zzk;
        this.zzc = z;
        this.zzd = z2;
    }

    public zzs(String str, zzj zzj, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zzj;
        this.zzc = z;
        this.zzd = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        zzj zzj = this.zzb;
        if (zzj == null) {
            zzj = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
